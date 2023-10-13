package com.intern.backend.backend.naver.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.intern.backend.backend.naver.dao.MainMapper;
import com.intern.backend.backend.naver.dto.Category;
import com.intern.backend.backend.naver.dto.MediaNews;
import com.intern.backend.backend.naver.dto.Member;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MainService {
	
	private final MainMapper mainMapper;

	public List<Category> selectMainCategory() {
		return mainMapper.selectMainCategory();
	}
	
	public List<MediaNews> selectNewsContents() {
		return mainMapper.selectNewsContents();
	}
	
	public Member selectUserInfo(Map<String, String> map) {
		return mainMapper.selectUserInfo(map);
	}
	

	

}
