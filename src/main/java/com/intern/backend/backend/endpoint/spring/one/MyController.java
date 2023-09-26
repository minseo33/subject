package com.intern.backend.backend.endpoint.spring.one;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping
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
    }
}
