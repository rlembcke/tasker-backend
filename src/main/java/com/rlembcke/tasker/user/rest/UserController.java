package com.rlembcke.tasker.user.rest;

import com.rlembcke.tasker.user.model.UserDto;
import com.rlembcke.tasker.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("users")
    public List<UserDto> getUsers() {
        return userService.getAllUsers();
    }

}
