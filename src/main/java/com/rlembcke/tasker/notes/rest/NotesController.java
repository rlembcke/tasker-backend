package com.rlembcke.tasker.notes.rest;

import com.rlembcke.tasker.notes.data.model.NotebookDto;
import com.rlembcke.tasker.notes.service.NotesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
public class NotesController {

    @Resource
    private NotesService notesService;

    @GetMapping("notebooks")
    public List<NotebookDto> getNotebooks() {
        return notesService.getNotesByUser();
    }


    @PutMapping("notebooks")
    public NotebookDto updateNotebook(@RequestBody NotebookDto notebookDto) {
        return notesService.updateNotebook(notebookDto);
    }


    @PostMapping("notebooks")
    public NotebookDto createNotebook(@RequestBody NotebookDto notebookDto) {
        return notesService.createNotebook(notebookDto);
    }


    @DeleteMapping("notebooks/{id}")
    public void deleteNotebook(@PathVariable Long id) {
        notesService.deleteNotebook(id);
    }


}
