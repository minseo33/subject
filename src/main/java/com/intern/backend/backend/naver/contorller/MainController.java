package com.intern.backend.backend.naver.contorller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.intern.backend.backend.naver.dto.Category;
import com.intern.backend.backend.naver.dto.MediaNews;
import com.intern.backend.backend.naver.service.MainService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/naver")
public class MainController {
	
	private final MainService mainService;
	
	@GetMapping
	public String main(Model model) {
//		ctg1, ctg2, ctg3로 묶인 것들을 뽑기위한 방법
//		현재 쿼리는 ctg1쪽 영역만 가져오도록 설정 
		List<Category> categoryList = mainService.selectMainCategory(); //selectMainCategory데이터를 가져옵니다.
		
		List<Category> ctg1GroupList = categoryList.stream()
											.filter(category -> category.getCategory_downtab() == null)
											.collect(Collectors.toList()); 
		// 뉴스스탠드, 언론사편집, 엔터, 스포츠, 경제 탭을 설정할수 있도록 받아옵니다. 
		
		List<Category> ctg1SubList = categoryList.stream()
											.filter(category -> category.getCategory_downtab() != null)
											.collect(Collectors.toList());
		
											
		List<MediaNews> mediaNewsList = mainService.selectNewsContents(); 
		// 언론사별 기사 1건씩 등록 -> 각 언론사마다 기사 1건을 가져오는 리스트 받아옵니다. 
		
		model.addAttribute("categoryList", categoryList);
		model.addAttribute("ctg1GroupList", ctg1GroupList);
		model.addAttribute("ctg1SubList", ctg1SubList);
		model.addAttribute("newsContents", mediaNewsList);
		
		return "naver/index";
	}
}
