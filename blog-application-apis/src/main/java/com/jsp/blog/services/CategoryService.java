package com.jsp.blog.services;

import com.jsp.blog.payloads.CategoryDto;
import java.util.List;

public interface CategoryService {
	
	
	//Crate
	CategoryDto createCategory(CategoryDto categoryDto);
	
	
	//Update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	
	//Single Category
	CategoryDto getSingleCategory(Integer categoryId);
	
	
	//All Category
	List<CategoryDto> getCategories();
	
	//Delete Category
	
	void  deleteCategory(Integer categoryId);

}
