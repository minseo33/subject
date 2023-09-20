package com.intern.backend.backend.endpoint.spring.one.domain.repository;

import com.intern.backend.backend.endpoint.spring.one.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
