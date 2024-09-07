package com.jsp.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{
	
	

}
