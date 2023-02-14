package com.rlembcke.tasker.notes.service;

import com.rlembcke.tasker.notes.data.NotebookRepository;
import com.rlembcke.tasker.notes.data.entity.Notebook;
import com.rlembcke.tasker.notes.data.model.NotebookDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class NotesService {

    @Resource
    private NotebookRepository notebookRepository;

    public NotebookDto createNotebook(NotebookDto notebookDto) {
        Notebook notebook = new Notebook();
        BeanUtils.copyProperties(notebookDto, notebook);
        return entityToDto(notebookRepository.save(notebook));
    }

    public NotebookDto updateNotebook(NotebookDto notebookDto) {
        Notebook notebook = notebookRepository.findById(notebookDto.getId()).orElse(null);
        BeanUtils.copyProperties(notebookDto, notebook);
        return entityToDto(notebookRepository.save(notebook));
    }

    public void deleteNotebook(Long id) {
        Notebook notebook = notebookRepository.findById(id).orElse(null);
        if (notebook != null) {
            notebookRepository.deleteById(notebook.getId());
        }
    }

    public List<NotebookDto> getNotesByUser() {
        List<NotebookDto> response = new ArrayList<>();
        for (Notebook notebook : notebookRepository.findAll()) {
            response.add(entityToDto(notebook));
        }

        return response;
    }

    private NotebookDto entityToDto(Notebook notebook) {
        NotebookDto notebookDto = new NotebookDto();
        BeanUtils.copyProperties(notebook, notebookDto);
        return notebookDto;
    }


}
