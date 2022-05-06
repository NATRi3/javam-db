package ru.sber.school.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sber.school.dao.UserMapper;
import ru.sber.school.model.UserDto;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public UserDto getUserInfo(Long id) {
        return userMapper.getUserInfo(id);
    }
}
