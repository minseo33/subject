package com.intern.backend.backend.endpoint.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class RestController {
	
	// @Controller + @ResponseBody 를 사용
	@GetMapping("/restControllerExample") // fetch()로 인해 도달
	public String restExample() {
		return "RestController 예제입니다."; /*@ResponseBody는 return 타입에 맞는 데이터를 반환 */
	}
}


/*
*	@RestController
*	단순히 객체만을 반환하고 객체 데이터는
* 	JSON 또는 XML 형식으로 HTTP 응답에 담아서 전송
*/

/* Controller에서 데이터를 반환을위해 @ResponseBody 사용
*	@Controller + @ResponseBody로 사용 가능
*	정확이는 @Controller에 @ResponseBody가 추가된 것
*	RestController는 JSON 형태로 객체 데이터를 반환하는 것이 주 목적
*/

// spring4.0버전에서 추가