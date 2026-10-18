package ru.kutorov.MySecurity2DbThemeleaf.service;

import ru.kutorov.MySecurity2DbThemeleaf.dto.UserDto;
import ru.kutorov.MySecurity2DbThemeleaf.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
