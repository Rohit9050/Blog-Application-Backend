package com.jsp.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.blog.entities.Category;
import com.jsp.blog.entities.Post;
import com.jsp.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
	
	
	//Custom Methods Created inside Repository
	List<Post> findByUser(User user);
	
	List<Post> findByCategory(Category category);
	
	List<Post> findByTitleContaining(String title);

}
