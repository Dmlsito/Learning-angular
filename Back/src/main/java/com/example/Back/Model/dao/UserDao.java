package com.example.Back.Model.dao;

import com.example.Back.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {


}
