package com.intern.backend.backend.endpoint.api.student.domain.repository;
import com.intern.backend.backend.endpoint.api.student.endpoint.support.StudentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<StudentDTO.SearchRes> selectStudents(StudentDTO.SearchReq req);
}
