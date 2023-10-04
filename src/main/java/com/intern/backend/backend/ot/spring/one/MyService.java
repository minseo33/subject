package com.intern.backend.backend.ot.spring.one;

import com.intern.backend.backend.ot.spring.one.domain.User;
import com.intern.backend.backend.ot.spring.one.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

// [특징-1] 빈 사용
@Service
public class MyService {
    private final MyBean myBean;
    private final UserRepository userRepository;

    public MyService(MyBean myBean, UserRepository userRepository) {
        this.myBean = myBean;
        this.userRepository = userRepository;
    }

    /**
     * my bean 에 있는 프린트 기능을 사용하기 위해 주입 받은 MyBean 을 사용할 수 있다.
     * @param name
     */
    public void myPrint(String name) {
        // [특징-1]
        System.out.println(name + myBean.print());
    }

    /**
     * 사용자 생성
     */
    @Transactional(rollbackOn = Exception.class)
    public void saveUser(Integer age) throws Exception {
        User user = User.builder()
                		.name("tester").age(20).build();
        userRepository.save(user);

        user = User.builder()
                .name("tester2").age(age).build();
        if(user.getAge() == 24){
            throw new Exception("error");
        }
        userRepository.save(user);
    }

    /**
     * 사용자 조회
     * @return
     */
    public List<User> getUsers() {
        return userRepository.findAll();
    }


    /*
    [특징-5] 트랜잭션 관리 : 어노테이션을 사용하여 메서드가 트랜잭션 내에서 실행 되도록 설정
    @Transactional
    public User createUser(User user) {
        // 사용자 생성 로직
        return userRepository.save(user);
    }
    */
}
