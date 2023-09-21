package com.intern.backend.backend.endpoint.spring.one.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.backend.backend.endpoint.spring.one.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
