package com.intern.backend.backend.endpoint.api.student.endpoint;

import com.intern.backend.backend.endpoint.api.student.endpoint.support.ResponseDTO;
import com.intern.backend.backend.endpoint.api.student.endpoint.support.StudentDTO;
import com.intern.backend.backend.endpoint.api.student.service.StudentService;
import org.springframework.web.bind.annotation.*;

/**
 * 학생관리 EndPoint
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    /**
     * 학생 생성
     * @param req
     * @return
     */
    @PostMapping
    public ResponseDTO createStudent(@RequestBody StudentDTO.SaveReq req){
        // 학생명 데이터 검증
        if(req.getName() == null  || "".equals(req.getName())){
            return new ResponseDTO("학생명을 입력해주세요.");
        }
        // 학생 나이 데이터 검증
        if(req.getAge() == null ){
            return new ResponseDTO("나이를 입력해주세요.");
        }
        // 학생 생성 서비스 함수 호출
        try {
            studentService.createStudent(req);
        }catch (Exception e){
            return new ResponseDTO(e.getMessage());
        }

        return new ResponseDTO();
    }

    /**
     * 학생 목록 조회
     * @param req
     * @return
     */
    @GetMapping("/list")
    public ResponseDTO<StudentDTO.SearchRes> selectStudents(StudentDTO.SearchReq req){
        return studentService.selectStudents(req);
    }
}
