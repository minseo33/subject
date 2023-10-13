package com.intern.backend.backend.naver.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MediaNews extends MediaCmpny{
	
	private String medianews_id; //기사 고유값
	private String medianews_title; //제목
	private String medianews_content; //내용
	private String medianews_date; //업로드시각
	private String medianews_image; // 이미지
	private String medianews_url; //URL
	private int medianews_number; //재생 수
	private String mediaCmpny_id; //언론사 고유값
	private String category_uptab; //상위 카테고리
	private String category_downtab; //하위 카테고리
}
