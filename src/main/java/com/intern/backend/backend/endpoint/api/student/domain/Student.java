package com.intern.backend.backend.endpoint.api.student.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 학생 엔티티
 * Builder 를 통해서만 엔티티 생성 , 불변(Immutable)성을 유지하게 위해
 */
@Getter
@Entity
@NoArgsConstructor
@Table(name = "tb_student")
@Builder
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long seq; // 시퀀스

    @Column(nullable = false, length = 40)
    private String name; // 이름

    @Column(nullable = false)
    private Integer age; // 나이

    /**
     * 관계전략
     * CascadeType.ALL : 부모 엔티티의 저장, 업데이트 , 삭제) 자식 엔티티에 적용되도록 한다.
     * CascadeType.PERSIST :
     * CascadeType.MERGE :
     * CascadeType.REMOVE :
     *
     * orphanRemoval = true 부모 엔티티에서 제거된 자식 엔티티가 자동으로 삭제됩니다.
     * orphanRemoval = false 부모 엔티티에서 자식 엔티티를 제거하더라도 데이터베이스에서 해당 자식 엔티티는 삭제 되지 않습니다.
     */
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Hobby> hobbies = new ArrayList<>();

    public void addHobby(Hobby hobby) {
        this.hobbies.add(hobby);
    }
}
