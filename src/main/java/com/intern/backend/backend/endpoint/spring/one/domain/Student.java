package com.intern.backend.backend.endpoint.spring.one.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Builder
@NoArgsConstructor
@Table(name = "tb_student")
@AllArgsConstructor
/*
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue - 제약조건을 걸지 않으면, PK 값을 각 DBMS에 맞는 자동증가 컬럼으로 만들어준다
	private Long seq; 
	
	//nullable -> null이 =  가능해? 놉 허용안해
	@Column(length = 40, nullable = false)
	private String name; //학생명
	
	@Column(nullable = false)
	private int age; //나이
	
}
*/

public class Student {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long seq;

@Column(length = 40, nullable = false)
private String name;

@Column(nullable = false)
private int age;

/*
@ManyToOne
@JoinColumn(name = "seq", referencedColumnName = "student_seq")
private Hobby hobby;
*/
}