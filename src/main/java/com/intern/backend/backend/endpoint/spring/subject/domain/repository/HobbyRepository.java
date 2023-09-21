package com.intern.backend.backend.endpoint.spring.subject.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.backend.backend.endpoint.spring.subject.domain.Hobby;
import com.intern.backend.backend.endpoint.spring.subject.domain.HobbyPk;

public interface HobbyRepository extends JpaRepository<Hobby, HobbyPk> {

}
