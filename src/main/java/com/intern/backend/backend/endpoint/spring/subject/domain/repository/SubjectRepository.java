package com.intern.backend.backend.endpoint.spring.subject.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.backend.backend.endpoint.spring.subject.domain.Student;

public interface SubjectRepository extends JpaRepository<Student, Long> {
}
