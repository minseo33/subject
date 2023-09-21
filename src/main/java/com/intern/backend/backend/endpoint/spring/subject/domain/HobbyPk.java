package com.intern.backend.backend.endpoint.spring.subject.domain;

import java.io.Serializable;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Embeddable
public class HobbyPk implements Serializable {
	
	@ManyToOne
	@JoinColumn(name = "student_code")
	private Student student;
	
	@Column(name = "hobby_name")
	private String name;
}
