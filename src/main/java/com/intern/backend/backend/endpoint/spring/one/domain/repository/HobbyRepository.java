package com.intern.backend.backend.endpoint.spring.one.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.backend.backend.endpoint.spring.one.domain.Hobby;

public interface HobbyRepository extends JpaRepository<Hobby, Long>{

}

//Repository를 하는 이유?
// -> 검색해봐 -> .save?