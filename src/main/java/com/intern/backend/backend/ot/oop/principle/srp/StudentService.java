package com.intern.backend.backend.ot.oop.principle.srp;

import com.intern.backend.backend.ot.oop.principle.srp.password.PasswordEncoder;
import com.intern.backend.backend.ot.oop.principle.srp.password.Sha256PasswordEncoder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 단일 책임 원칙
 */
@Service
public class StudentService {
    private final PasswordEncoder passwordEncoder;

    public StudentService(@Qualifier("sha256PasswordEncoder") PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }
    /**
     * 여러개의 책임을 가지고 있기 때문에 변경이 필요할 때 수정할 대상이 불명확 해진다.
     */
    /**
     * 학생 생성
     * @param id
     * @param password
     * @param hobby
     * 암호화 => 단방향, 양방향 ( 암호화 , 복호화 )
     *
     *
     */

    public void createStudent(String id, String password, List<String> hobby){
        // 비밀번호 암호화
        // A 알고리즘
        passwordEncoder.encrypt("1234");
        // 사용자 저장
        // 취미 등록
    }

    /**
     * 학생 정보 수정
     * @param id
     * @param password
     * @param hobby
     */
    public void modifyStudent(String id, String password, List<String> hobby) {
        // 사용자 확인
        // 사용자 비밀번호 변경 확인
        // 비밀번호 암호화
        // A 알고리즘
        passwordEncoder.encrypt("1234");
        // 사용자 정보 수정
        // 취미 수정
    }

}
