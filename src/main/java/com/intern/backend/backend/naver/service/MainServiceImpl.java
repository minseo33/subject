package com.intern.backend.backend.naver.service;

import java.util.List;

import com.intern.backend.backend.naver.dto.Category;

public class MainServiceImpl {
	
	private MainServiceImpl mapper;

	public List<Category> selectMainCategory() {
	
			return mapper.selectMainCategory();
	}
}
