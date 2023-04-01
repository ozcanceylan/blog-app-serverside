package com.springboot.blog.payload.mapper;

import org.modelmapper.ModelMapper;

import com.springboot.blog.entity.Category;
import com.springboot.blog.entity.Comment;
import com.springboot.blog.entity.Post;
import com.springboot.blog.payload.dto.CategoryDto;
import com.springboot.blog.payload.dto.CommentDto;
import com.springboot.blog.payload.dto.PostDto;


public class Mapper {
	private static  ModelMapper mapper = new ModelMapper();
	
	// 			POST MAPPER
	public static PostDto mapToDto(Post post) {
		return mapper.map(post, PostDto.class);
	}
	public static Post mapToEntity(PostDto postDto) {
		return mapper.map(postDto, Post.class);
	}
	
	// 			COMMENT MAPPER
	public static CommentDto mapToDto(Comment comment) {
		return mapper.map(comment, CommentDto.class);
	}
	
	public static Comment mapToEntity(CommentDto commentDto) {
		return mapper.map(commentDto, Comment.class);
	}
	
	//		   CATEGORY MAPPER
	public static CategoryDto mapToDto(Category category) {
		return mapper.map(category, CategoryDto.class);
	}
	
	public static Category mapToEntity(CategoryDto categoryDto) {
		return mapper.map(categoryDto, Category.class);
	}
}
