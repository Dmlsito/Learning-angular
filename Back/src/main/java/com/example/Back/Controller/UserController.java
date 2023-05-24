package com.example.Back.Controller;

import com.example.Back.Entity.User;
import com.example.Back.Model.dao.UserDao;
import com.example.Back.api.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;
    @Autowired
    private UserDao userDao;

    @GetMapping("/getAll")
    public List<User> queryAllUsers(){
        return userService.queryAllUser();
    }

    @PostMapping("/add")
    public ResponseEntity<?> insertUser(@RequestBody User user) {
        int idUser = userService.insertUser(user);
        Optional<User> newUser = userDao.getReferenceById(idUser);
        return new ResponseEntity<>(newUser, HttpStatus.resolve(200));
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getUser(@PathVariable Integer id) {
        Optional<User> newUser = userService.queryUser(id);
        return new ResponseEntity<>(newUser, HttpStatus.resolve(200));

    }

}
