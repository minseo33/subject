package com.intern.backend.backend.endpoint.spring.one.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.backend.backend.endpoint.spring.one.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	// 엔티티 메소드 외에 다른 컬럼의 데이터를 접근하려면 새로 메소드를 정의해야함
	// JpaRepository 인터페이스를 상속받을 때 <클래스 타입, 데이터 타입>을 선언하면
	// 엔티티 클래스와 매핑되는 테이블의 CRUD 기능을 사용 할 수 있다고 함

}

/* Repository란?
*	- 엔티티에 의해 생성된 데이터베이스 테이블에 접근하는 메서드들을 사용하기 위한 인터페이스
*	- 테이터 처리를 위해 테이블에 CRUD의 처리를 정의하는 계층
// mapper같은 인터페이스인듯
// 인터페이스와 같은것인데 클래스파일과 같이? // 꼭 같이 있어야한다고 함... //domain 때문인듯?
*/
