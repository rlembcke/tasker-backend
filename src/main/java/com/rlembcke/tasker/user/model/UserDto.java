package com.rlembcke.tasker.user.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class UserDto {

    private String id;
    private String username;
    private String name;
    private String lastName;
    private String email;
    private Date created;

}
