package com.jsp.blog.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.blog.entities.Category;
import com.jsp.blog.exceptions.ResourceNotFoundException;
import com.jsp.blog.payloads.CategoryDto;
import com.jsp.blog.repositories.CategoryRepo;
import com.jsp.blog.services.CategoryService;


@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private CategoryRepo categoryRepo;

	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		Category category = this.modelMapper.map(categoryDto, Category.class);
		
		Category savedCategory = this.categoryRepo.save(category);
		return this.modelMapper.map(savedCategory, CategoryDto.class);
	}

	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {
		Category category = this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("category", "id", categoryId));
		
		category.setCategoryTitle(categoryDto.getCategoryTitle());;
		category.setCategoryDescription(categoryDto.getCategoryDescription());
		
		Category updatedCategory = this.categoryRepo.save(category);
		return this.modelMapper.map(updatedCategory, CategoryDto.class);
		
	}

	@Override
	public CategoryDto getSingleCategory(Integer categoryId) {
		Category category = this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("category", "id", categoryId));
		
		
		return this.modelMapper.map(category, CategoryDto.class);
	}

	@Override
	public List<CategoryDto> getCategories() {
		List<Category> categories = this.categoryRepo.findAll();
		
		 return categories.stream().map(category-> this.modelMapper.map(category, CategoryDto.class)).collect(Collectors.toList());
	
	}

	@Override
	public void deleteCategory(Integer categoryId) {
		Category category = this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("category", "id", categoryId));
		
		this.categoryRepo.delete(category);
		
	}

}
