package com.intern.backend.backend.endpoint.api.student.domain.repository;

import com.intern.backend.backend.endpoint.api.student.domain.Hobby;
import com.intern.backend.backend.endpoint.api.student.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
