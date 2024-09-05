package com.jsp.blog.payloads;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	
	private int id;
	
    @NotEmpty
    @Size(min = 4, message= "Username must be min of 4 characters !!")
	private String name;
	
    @NotEmpty(message = "Email address can not be empty")
	private String email;
	
	@NotEmpty
	@Size(min = 3,max=20, message="Password must be min of 3 chars and max 0f 20 chars")
	private String password;
	
	@NotEmpty
	@Size(min=10, message = "About must be min of 10 characters")
	private String about;

}
