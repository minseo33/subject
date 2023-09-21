package com.intern.backend.backend.endpoint.api.student.service;

import com.intern.backend.backend.endpoint.api.student.domain.Hobby;
import com.intern.backend.backend.endpoint.api.student.domain.Student;
import com.intern.backend.backend.endpoint.api.student.domain.repository.HobbyRepository;
import com.intern.backend.backend.endpoint.api.student.domain.repository.StudentRepository;
import com.intern.backend.backend.endpoint.api.student.endpoint.support.HobbyDTO;
import org.springframework.stereotype.Service;

@Service
public class HobbyService {
    private final StudentRepository studentRepository;
    private final HobbyRepository hobbyRepository;

    public HobbyService(StudentRepository studentRepository, HobbyRepository hobbyRepository) {
        this.studentRepository = studentRepository;
        this.hobbyRepository = hobbyRepository;
    }

    /**
     * 학생에 취미 등록
     * @param req
     */
    public void createHobby(HobbyDTO.SaveReq req) throws Exception {
        // 존재하는 학생인지 확인
        Student student = studentRepository.findById(req.getStudentSeq())
                .orElseThrow(() -> new Exception("존재하지 않는 학생 입니다."));

        Hobby hobby = hobbyRepository.findByName(req.getHobby());
        if(hobby != null){
            throw new Exception("이미 등록된 취미 입니다.");
        }
        hobby = Hobby.builder()
                .student(student)
                .name(req.getHobby())
                .build();
        student.addHobby(hobby);
        studentRepository.save(student);
    }
}
