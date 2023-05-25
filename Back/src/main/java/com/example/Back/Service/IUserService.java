package com.example.Back.Service;

import com.example.Back.Entity.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    Optional<User> queryUser (Integer id);
    List<User> queryAllUser();
    int insertUser(User user);
    int updateUser(User user);
    Optional<Integer> deleteUser(Integer id);
}
