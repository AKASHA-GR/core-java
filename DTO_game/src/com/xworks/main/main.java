package com.xworks.main;

import com.xworks.dto.UserDTO;
import com.xworks.entity.User;

public class Main {

    public static void main(String[] args) {

        // Entity object
        User user = new User(
                1,
                "Akash",
                "abc123",
                "akash@gmail.com"
        );

        // DTO object
        UserDTO dto = new UserDTO();

        dto.setName(user.getName());
        dto.setEmail(user.getEmail());

        // Print DTO data
        System.out.println(dto);
    }
}.0

