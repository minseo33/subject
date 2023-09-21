package com.intern.backend.backend.endpoint.spring.one.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.backend.backend.endpoint.spring.one.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
