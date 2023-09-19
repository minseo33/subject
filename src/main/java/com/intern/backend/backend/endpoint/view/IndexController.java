package com.intern.backend.backend.endpoint.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	
	/* model을 선언하여 view로 데이터를 내려줌*/
	/* 서버에서 greeting 이라는 변수에 Hello, OT {본인 이름} 이라는 데이터를 내려 주세요. */
    @GetMapping
    public String index(Model model){
    	model.addAttribute("greeting", "Hello, OT 이민서");
        return "index"; /*@Controller는 index.html 파일을 반환 */
    }
    
}

/*
json : key 와 value값으로 구성
.addAttribute() : 데이터 담을 때 addAttribute()메소드
greeting => key값 
내려주고자하는 데이터 => value값
*/

/*
 * @Contorller
 * Model 객체를 만들어 데이터를 담고 View를 찾는 것 /View를 반환
 */

// spring 2.5버전에서 추가
