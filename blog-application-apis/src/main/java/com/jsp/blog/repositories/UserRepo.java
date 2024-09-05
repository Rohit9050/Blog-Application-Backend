package com.jsp.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
