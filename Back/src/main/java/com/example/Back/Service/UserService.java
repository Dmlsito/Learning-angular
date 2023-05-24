package com.example.Back.Service;


import com.example.Back.Entity.User;
import com.example.Back.Model.dao.UserDao;
import com.example.Back.api.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("UserService")
@Lazy
public class UserService implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Optional<User> queryUser(Integer id) {
       Optional<User> newUser = userDao.findById(id);
       return newUser;
    }

    @Override
    public List<User> queryAllUser() {
        List<User> listAllUser = userDao.findAll();
        return listAllUser;
    }

    @Override
    public int insertUser(User user) {
       userDao.saveAndFlush(user);
       return user.getIdUser();
    }

    @Override
    public int updateUser(User user) {
        return insertUser(user);
    }

    @Override
    public int deleteUser(User user) {
       userDao.deleteById(user.getIdUser());
       return user.getIdUser();

    }







}
