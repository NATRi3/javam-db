package ru.sber.school.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.school.model.UserDto;
import ru.sber.school.service.UserService;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/id")
    public UserDto getUserInfo(Long id) {
        return userService.getUserInfo(id);
    }


}
