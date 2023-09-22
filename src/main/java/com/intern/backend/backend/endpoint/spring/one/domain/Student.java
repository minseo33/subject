package com.intern.backend.backend.endpoint.spring.one.domain;

import java.util.ArrayList;
import java.util.List; //list사용

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity 
@Builder
@NoArgsConstructor
@Table(name = "tb_student") //"tb_student" 테이블과 매핑
@AllArgsConstructor

// tb_student 테이블과 매핑되는 엔티티 클래스(Student)를 정의하고, 
// 엔티티 클래스를 사용해 Spring Boot와 JPA를 통해 데이터베이스와 상호 작용

public class Student {
  
  @Id // PK로 지정하는 역할
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long seq; //PK로 지정
  
  @Column(length = 40, nullable = false)  // 컬럼 길이 40, null 허용 X
  private String name; //학생명
  
  @Column(nullable = false) // null 허용 X
  private int age; //나이
  
  @OneToMany(mappedBy = "student") //
  private List<Hobby> hobbies = new ArrayList<>();
  
}


 

/* 스프링부트에서는 Entity들을 domain 패키지에 생성한다 */

/* Entity란?
*	- 데이터베이스 논리적 구성요소로, 개체의 의미
*	- JPA의 엔티티는 테이블,컬럼과 같은 의미
*/

/*	@Entity 
*	- JPA 라이브러리, DB와 매핑되는 자바 클래스 지정 어노테이션
*	- 해당 클래스를 JPA의 엔티티로 인식하고, Lombok을 통해 자동으로 DB에 컬럼 생성
*/

/*	@Builder
*	- lombok에서 제공해주는 기능, 생성자 대신에 이용하는 패턴
// 생성자를 대신해주는 놈이라고 생각하면 되는건가?
*/

/*	@Table(name = "tb_student")
*	- 엔티티 클래스가 매핑될 데이터베이스 테이블의 이름을 지정
*	- 여기서는 "tb_student" 테이블과 매핑
*/

/*@GeneratedValue(strategy = GenerationType.IDENTITY) 
*	- 제약조건을 걸지 않으면, PK 값을 각 DBMS에 맞는 자동증가 컬럼으로 만들어준다 
*	- 기본키를 자동 생성해주는 어노테이션 
*	- 자동으로 1씩 증가
// GeneratedValue 더더더더더ㅓ
*	- strategy : 고유 번호를 생성하는 옵션
*	- GenerationType.IDENTITY : 독립적인 시퀀스를 생성, 기본키 생성을 위한 설정)
*/

/*	@Column
*	- 컬럼의 세부 설정을 정의 할 때 사용
*	- length : 컬럼 길이 결정
*	- nullable : 중복을 true, false
*/



