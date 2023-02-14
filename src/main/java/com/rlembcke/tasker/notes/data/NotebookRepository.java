package com.rlembcke.tasker.notes.data;

import com.rlembcke.tasker.notes.data.entity.Notebook;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NotebookRepository extends CrudRepository<Notebook, Long> {

    List<Notebook> findByName(String name);

    Notebook findById(long id);
}