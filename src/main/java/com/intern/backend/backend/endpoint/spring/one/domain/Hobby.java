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
import lombok.Setter;

@Getter
//@Setter
@Entity 
@Builder
@NoArgsConstructor
@Table(name = "tb_hobby") //"tb_hobby" 테이블과 매핑
@AllArgsConstructor
 
public class Hobby {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long hobby_seq; // - pk
  // 학생시퀀스를 키 값으로 하면 referenceddCol~~자동 키값이랑 pk충돌 일어날텐데..
  // 그럼 어노테이션도 쓸 필요가 없나? referencedCol 더더더ㅓㄷ더ㅓ
   
   @Column(length = 50, unique = true) // 컬럼 길이 50, 중복 허용
   private String name; //취미 
   
   @ManyToOne
   @JoinColumn(name = "student_seq") //fk설정 //referencedColumnName사용은 좋지 않음
   private Student student;
   
   /*
   @ManyToOne // 한 명의 학생이 여러 개의 취미를 가질 수 있습니다.
   @JoinColumn(name = "student_seq", referencedColumnName = "seq") //관계를 맺을 컬럼 명시
   // name 속성(student_seq)는 Hobby의 외래키로 지정
   // reference~~ 속성(seq)는 Student의 기본키 컬럼 지정
   // 즉, student_seq가 Student의 seq를 참조
   // 근데 왜 못 받아와? //아까랑 다른 문제 //
   private Student student;
   */
   //mapping
   
   // 왜 tb_hobby 못 발견하니,,,Table "TB_HOBBY" not found;
   // could not prepare statement 에러..hibernate.exception..?
   // org.h2.jdbc.JdbcSQLSyntaxErrorException: Table "TB_HOBBY" not found; SQL statement:
   // where 인식 못하는듯..?name
   // 잘 되다가 안되는거면,,,뭘 지웠나,,,안보임.,.,.,
   //@ManyToOne 안타면 name이 pk로 들어감
   // student_seq 기본키 지정하면 생성은 성공 
   // ---->but. 새로고침하면 성공/실패/실패/실패 결과...새로고침./................!!!!
   // 첫 로직을 타다가 실패가 뜨는거면 exception....
   // h2에 db는 잘 넣어짐....
   
   // ㄴ당연하지,,,,,,,Hobby unique 중복설정 해놨으니 새로고침시 실패창이지.....
   
   
   
   /* 양방양 키로 ...........음..........?
   @OneToMany(mappedBy = "student")
	private List<Student> student = new ArrayList<Student>();
    */
   
   //빌더 패턴은 순서없이 객체 생성 가능 -> null로 왜 받아옴?
   
   
}

// 제약조건 걸려고 32번째 줄처럼 했는데 왜 DB에는 h2 DB에서는 왜 컬럼으로 표기되는것으로 보이는거지.. 
//	ㄴ 1-1,1-2,2-1,2-1 학생당 취미 ''''''''

/*	@ManyToOne : 다대일(N:1) 관계를 설정 
 *  @JoinColumn : 외래키 관계 지정*/
