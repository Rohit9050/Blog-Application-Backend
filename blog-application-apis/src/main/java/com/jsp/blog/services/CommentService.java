package com.jsp.blog.services;

import com.jsp.blog.payloads.CommentDto;

public interface CommentService {
	
	CommentDto createComment(CommentDto commentDto, Integer postId);
    void deleteComment(Integer commentId);
}
