package com.intern.backend.backend.endpoint.api.student.domain.repository;

import com.intern.backend.backend.endpoint.api.student.domain.Hobby;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HobbyRepository extends JpaRepository<Hobby, Long> {
    Hobby findByName(String hobby);
}
