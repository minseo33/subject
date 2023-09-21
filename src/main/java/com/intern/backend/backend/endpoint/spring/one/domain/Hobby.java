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
@Table(name = "tb_hobby")
@AllArgsConstructor
/*
public class Hobby {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long student_seq; //학생 시퀀스
	
	@Column(length = 50, unique = true) //컬럼 길이값 및 중복 설정
	//중복 설정 왜 함? -> 중복된 취미는 등록될 수 없다
	private String name; //취미
	
	@ManyToOne //부모클래스는 1개, Student 여러명이 Hobby 한개를 가진다
    @JoinColumn(name = "seq") //관계를 맺을 컬럼 명시
	//Student 클래스와 Hobby 클래스 간의 FK관계 지정
	//Student 클래스를 seq에 참조시킴  //?
    private Student student;
	
}

// 제약조건 걸려고 32번째 줄처럼 했는데 왜 DB에는 h2 DB에서는 왜 컬럼으로 표기되는것으로 보이는거지..
*/

public class Hobby {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long student_seq;
    
    @Column(length = 50, unique = true)
    private String name;
    /*
    @ManyToOne
    @JoinColumn(name = "student_seq", referencedColumnName = "seq")
    private Hobby hobby;
    */
/*
    @OneToOne(mappedBy = "hobby")
    private Student student;
*/
}