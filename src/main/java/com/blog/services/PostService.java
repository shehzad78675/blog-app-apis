package com.blog.services;

import java.util.List;

import com.blog.payloads.PostDto;
import com.blog.payloads.PostResponse;

public interface PostService {

	public PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	public PostDto updatePost(PostDto postDto, Integer postId);
	public void deletePost(Integer postId);
	public PostDto getPostById(Integer postId);
	public PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy);
	public List<PostDto> getPostByCategory(Integer categoryId);
	public List<PostDto> getPostByUser(Integer userId);
}
