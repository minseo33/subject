package com.intern.backend.backend.ot.oop.principle.srp;

import com.intern.backend.backend.ot.oop.principle.srp.password.Md5PasswordEncoder;
import com.intern.backend.backend.ot.oop.principle.srp.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    private final PasswordEncoder passwordEncoder;

    public TeacherService(@Qualifier("md5PasswordEncoder") PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public void createTeacher(){
        // 선생님 비밀번호 암호화
        passwordEncoder.encrypt("123123123");
        // 선생님 생성
    }
}
