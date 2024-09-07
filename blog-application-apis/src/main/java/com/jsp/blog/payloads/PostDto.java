package com.jsp.blog.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.jsp.blog.entities.Comment;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
public class PostDto {
	
	private Integer postId;
	
	@NotEmpty
	@Size(min=5, message= "Title must be min of 5 characters")
	private String title;
	
	@NotEmpty
	@Size(min=10, message="Content must be min of 10 characters" )
	
	private String content;
	
	private String imageName;
	
	private Date addedDate;
	
	private UserDto user;
	
	private CategoryDto category;
	
	private Set<CommentDto> comments = new HashSet<>();

}
