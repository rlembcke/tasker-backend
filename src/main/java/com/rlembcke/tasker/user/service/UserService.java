package com.rlembcke.tasker.user.service;

import com.rlembcke.tasker.user.model.UserDto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public List<UserDto> getAllUsers() {
        return jdbcTemplate.query("select id, username, name, last_name, email, created from tasker.user LIMIT 20",
                (rs, i) -> UserDto.builder()
                        .id(rs.getString("id"))
                        .username(rs.getString("username"))
                        .name(rs.getString("name"))
                        .lastName(rs.getString("last_name"))
                        .email(rs.getString("email"))
                        .created(rs.getDate("created"))
                        .build());
    }

}
