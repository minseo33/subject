package com.intern.backend.backend.naver.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.intern.backend.backend.naver.dto.Category;
import com.intern.backend.backend.naver.dto.MediaNews;
import com.intern.backend.backend.naver.dto.Member;

@Mapper
public interface MainMapper {
	public List<Category> selectMainCategory();  //카테고리 조회 //데이터 가져옵니다
	
	public List<MediaNews> selectNewsContents(); //언론사별 기사 조회 //데이터 가져옵니다
	
	public Member selectUserInfo(Map<String, String> map);
	
	


}
