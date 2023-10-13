package com.intern.backend.backend.naver.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Category extends CategoryGroup {

	private String code;
	private String group_cg;
	private String category_uptab; //카테고리 상위 탭
	private String category_downtab; //카테고리 하위 탭
}
