package com.jsp.blog.services;

import java.util.List;

import com.jsp.blog.entities.Post;
import com.jsp.blog.payloads.PostDto;
import com.jsp.blog.payloads.PostResponse;

public interface PostService {

	// create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

	// update
	PostDto updatePost(PostDto postDto, Integer postId);

	// delete
	void deletePost(Integer postId);

	// Get Single Post
	PostDto getPost(Integer postId);

	// Get All Post
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy,String sortDir );

	// Get All Post By Catgeory

	List<PostDto> getPostByCatgeory(Integer categoryId);

	// Get All Post By User

	List<PostDto> getPostByUser(Integer userId);

	// Search Post

	List<PostDto> searchPosts(String keyword);

}
