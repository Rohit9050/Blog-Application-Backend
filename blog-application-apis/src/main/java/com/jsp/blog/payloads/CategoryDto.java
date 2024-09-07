package com.jsp.blog.payloads;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	
	private int categoryId;
	
	@NotEmpty
	@Size(min=10, message= "Category Title must be min of 4 characters")
	private String categoryTitle;
	
	@NotEmpty
	@Size(min=10, message= "Category Description must be min of 10 characters")
	private String categoryDescription;

}
