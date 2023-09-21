package com.intern.backend.backend.endpoint.api.student.service;

import com.intern.backend.backend.endpoint.api.student.domain.Student;
import com.intern.backend.backend.endpoint.api.student.domain.repository.StudentMapper;
import com.intern.backend.backend.endpoint.api.student.domain.repository.StudentRepository;
import com.intern.backend.backend.endpoint.api.student.endpoint.support.ResponseDTO;
import com.intern.backend.backend.endpoint.api.student.endpoint.support.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 학생관리 서비스
 */
@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public StudentService(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    /**
     * 학생 생성 함수
     * @param req
     */
    public void createStudent(StudentDTO.SaveReq req) {
        Student student = Student.builder()
                .name(req.getName())
                .age(req.getAge())
                .build();
        studentRepository.save(student);
    }

    /**
     * 학생 조회 함수
     * @param req
     * @return
     */
    public ResponseDTO<StudentDTO.SearchRes> selectStudents(StudentDTO.SearchReq req) {
        List<StudentDTO.SearchRes> list = studentMapper.selectStudents(req);
        return new ResponseDTO(list);
    }
}
