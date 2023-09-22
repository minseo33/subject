package com.intern.backend.backend.endpoint.spring.one;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ManyToOne;

import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intern.backend.backend.endpoint.spring.one.domain.Hobby;
import com.intern.backend.backend.endpoint.spring.one.domain.Student;
import com.intern.backend.backend.endpoint.spring.one.domain.User;

@RestController
@RequestMapping("/test/user")
public class MyController {
    private final MyService myService;
    /*
    * [특징-2] MyController 에 MyService 를 주입하여 의존성 관리를 자동으로 처리함
    * */
    public MyController(MyService myService) {
        this.myService = myService;
    }

    /**
     * 사용자 생성
     * 편의상 GET 사용 사용은 post 사용
     * @return
     */
    @GetMapping()
    public String saveUser(@Param("age") Integer age){
        if(age == null){
            age = 30;
        }
        try {
            myService.saveUser(age);
        }catch (Exception e){
            return "생성에 실패 했습니다.";
        }
        return "생성에 성공했습니다.";

    }
    
    @GetMapping("/list")
    public List<User> getUsers(){
        return myService.getUsers();
    } //list 실행해보기
    
    /*
     * 학생 등록 API
     */
    @GetMapping("/INSERT-STUDENT-INFO")
    public String insertStudentInfo() {
    	
    	try {
			myService.saveStudent(); // service의 학생등록으로 넘어감
		} catch (Exception e) { 
			return "생성에 실패했습니다."; // 실행중 error 발생 시 return
		}
    	return "생성에 성공했습니다."; // 실행 성공시 return
    	
    }
    
    /*
     * 취미 등록 API
     */
    @GetMapping("/INSERT-HOBBY-INFO")
    public String insertHobbyInfo() {
    	
    	try {
			myService.savehobby(); //servie의 취미등록으로 넘어감
		} catch (Exception e) {
			return "생성에 실패했습니다.";
		}
    	
    	return "생성에 성공했습니다.";
    	
    }
    
    // 3번문제
    
    //test용으로 호출
    @GetMapping("/test")
    public void create() {
    	myService.test();
    }
    
    @GetMapping("/test1")
    public void create1() {
    	myService.test1();
    }
    
    @GetMapping("/test2")
    public void create2() {
    	myService.test2();
    }
    
}

/* @Param
	다수의 변수를 전달할 때는 전달되는 변수들에 @Param 어노테이션을 붙여주어 각 변수를 구분할 때 사용
	다수의 변수를 전달할때는 반드시 써주는게 좋음
	** 원하는 명으로 mapper에서 사용 가능 #{age}
*/

/*
 * select 
*	a.name as name, 
*	b.name as hobby
*	from 
*	tb_student a 
*	left outer join 
*	tb_hobby b 
*	on a.seq = b.student_seq;
*/


