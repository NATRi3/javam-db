package ru.sber.school.dao;

import org.apache.ibatis.annotations.Mapper;
import ru.sber.school.model.UserDto;

@Mapper
public interface UserMapper {

    UserDto getUserInfo(Long id);

}
