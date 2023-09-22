package com.intern.backend.backend.endpoint.spring.one;

import java.util.Iterator;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

import com.intern.backend.backend.endpoint.spring.one.domain.Hobby;
import com.intern.backend.backend.endpoint.spring.one.domain.Student;
import com.intern.backend.backend.endpoint.spring.one.domain.User;
import com.intern.backend.backend.endpoint.spring.one.domain.repository.HobbyRepository;
import com.intern.backend.backend.endpoint.spring.one.domain.repository.StudentRepository;
import com.intern.backend.backend.endpoint.spring.one.domain.repository.UserRepository;

// [특징-1] 빈 사용
@Service
public class MyService {
    private final MyBean myBean;
    
    private final UserRepository userRepository;
    private final StudentRepository studentRepository;
    private final HobbyRepository hobbyRepository; //선언 왜 해줌?
// 도구를 만들었는데 final을 선언하지 않으면 변경될수 있음 -> 필드주입
    public MyService(MyBean myBean, UserRepository userRepository, StudentRepository studentRepository, HobbyRepository hobbyRepository) {
        this.myBean = myBean;
        this.userRepository = userRepository;
		this.studentRepository = studentRepository;
		this.hobbyRepository = hobbyRepository;
    }
    // 사용하기 위해 재정의 / 더 공부 

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

        // 두 번 실행되서 데이터 2개씩 저장
        
        user = User.builder()
                .name("tester2").age(age).build();
        if(user.getAge() == 24){
            throw new Exception("error");
        }
        userRepository.save(user);
    }
    
    /*
     * 학생 등록
     */
    @Transactional(rollbackOn = Exception.class)//롤백?
    //괄호안에명시는 그냥 자체인듯. / 근데 트랜잭션을 실행하면 {}안에 있는
    //데이터가 쌒이며 save만나면 저장
    //근데 다른 테이블 데이터 오류나면 취소를 위한 rollback
    public void saveStudent() throws Exception { //Controller에서 타고옴
    	Student student = Student.builder()
    							//.name(null) 널 허용 안한다했기 때문
    							.name("이민서1")
    							.age(25)
    							.build(); 
    	studentRepository.save(student); //위의 student 객체를 전달받아 db 저장
    	
/*
    	student = Student.builder()
				.name("null")
				.age(25)
				.build();
		studentRepository.save(student);
*/
    	
    	// 다른 테이블에 데이터를 넣는 로직구현
    }
    
    /*
     * 취미 등록
     */
    @Transactional(rollbackOn = Exception.class)
    public void savehobby() throws Exception { //Controller에서 타고옴
    	Hobby hobby = Hobby.builder()
    					   .name("축구")
    					   .build();
    	hobbyRepository.save(hobby);

//    	hobby = Hobby.builder()
//				.name("농구")
//				.build();
//    	hobbyRepository.save(hobby); 
    	
    	// 이 둘이 사실 같은 기능인가?
//    	hobby.setName("농구");
//    	hobbyRepository.save(hobby);

    	hobby = Hobby.builder()
				.name("야구")
				.build();
    	hobbyRepository.save(hobby);
    	
    	
    	
    	hobby = Hobby.builder()
				.name("발야구")
				.build();
    	hobbyRepository.save(hobby);
    	
    	hobby = Hobby.builder()
				.name("볼링")
				.build();
    	hobbyRepository.save(hobby);
    	
    	hobby = Hobby.builder()
				.name("탁구")
				.build();
    	hobbyRepository.save(hobby);
    	
    	
    	
    	
    	hobby = Hobby.builder()
				.name("사구")
				.build();
    	hobbyRepository.save(hobby);
    	
    	hobby = Hobby.builder()
				.name("삼구")
				.build();
    	hobbyRepository.save(hobby);
    	
    	hobby = Hobby.builder()
				.name("호구")
				.build();
    	hobbyRepository.save(hobby);
    	
    	

    }
    
    //test
    public void test() {
    	Student student = Student.builder()
    			.name("이민서")
    			.age(25)
    			.build();
//빌더 패턴을 이용한 
    	//학생저장
    	studentRepository.save(student);//db담음 //등록
    	
    	
    	//취미저장
    	for (int i = 1; i < 4; i++) { //1부터 3까지 고정값 취미
    		Hobby hobby = Hobby.builder()
    				.student(student)
    				.name("야구"+i) //취미명 unique로 설정되어있어서 
    				.build();
			hobbyRepository.save(hobby);
		}
    }
    
    //test
    public void test1() {
    	Student student = Student.builder().name("이민서1").age(25).build();

    	//학생저장
    	studentRepository.save(student);
    	
    	
    	//취미저장
    	for (int i = 1; i < 4; i++) {
    		Hobby hobby = Hobby.builder().student(student).name("축구"+i).build();
			hobbyRepository.save(hobby);
		}
    }
    
    //test
    public void test2() {
    	Student student = Student.builder().name("이민서2").age(25).build();

    	//학생저장
    	studentRepository.save(student);
    	
    	
    	//취미저장
    	for (int i = 1; i < 4; i++) {
    		Hobby hobby = Hobby.builder().student(student).name("농구"+i).build();
			hobbyRepository.save(hobby);
		}
    }
    
    //일단 학생당 여러 취미 출력..

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

/* @Transactional
 * 클래스, 메소드에 @Transactional이 선언되면 해당 클래스에 트랜잭션이 적용된 프록시 객체 생성
 * 프록시 객체는 @Transactional이 포함된 메서드가 호출될 경우, 트랜잭션을 시작하고 Commit or Rollback을 수행
 * CheckedException or 예외가 없을 때는 Commit
 * UncheckedException이 발생하면 Rollback
 *
 */
