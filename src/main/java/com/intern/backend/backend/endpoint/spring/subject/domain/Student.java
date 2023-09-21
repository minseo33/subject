package com.intern.backend.backend.endpoint.spring.subject.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_STUDENT")
@ToString
public class Student {
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Id
	private Long student_code;
	
	@Column(nullable = false, length = 30)
	private String name;
	
	@Column(nullable = false)
	private int age;	
}
