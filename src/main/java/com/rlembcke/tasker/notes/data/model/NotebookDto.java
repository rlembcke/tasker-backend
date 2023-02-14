package com.rlembcke.tasker.notes.data.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NotebookDto {

    private Long id;
    private String name;
    private LocalDateTime created;
    private String createdBy;

}
