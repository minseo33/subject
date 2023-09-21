package com.intern.backend.backend.endpoint.api.student.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_hobby", uniqueConstraints = {@UniqueConstraint(columnNames = {"student_seq", "name"})})
public class Hobby {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long seq;


    @Column(name = "name", length = 50)
    private String name;

    @ManyToOne
    @JoinColumn(name = "student_seq")
    private Student student;

}
