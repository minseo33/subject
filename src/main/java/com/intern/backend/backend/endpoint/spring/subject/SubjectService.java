package com.intern.backend.backend.endpoint.spring.subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;import org.springframework.http.ZeroCopyHttpOutputMessage;
import org.springframework.stereotype.Service;

import com.intern.backend.backend.endpoint.spring.subject.domain.Hobby;
import com.intern.backend.backend.endpoint.spring.subject.domain.HobbyPk;
import com.intern.backend.backend.endpoint.spring.subject.domain.Student;
import com.intern.backend.backend.endpoint.spring.subject.domain.repository.HobbyRepository;
import com.intern.backend.backend.endpoint.spring.subject.domain.repository.SubjectRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SubjectService {
	/* private final SubjectBean subjectBean; */
	private final SubjectRepository subjectRepository;
	private final HobbyRepository hobbyRepository;
	
	public SubjectService( SubjectRepository subjectRepository, HobbyRepository hobbyRepository) {
		/* this.subjectBean = subjectBean; */
		this.subjectRepository = subjectRepository;
		this.hobbyRepository = hobbyRepository;
	}
	
	@Transactional(rollbackOn = Exception.class)
	public Student addStudentByNameAndAge(Student student) {		
		Student result = subjectRepository.save(student);
		
		return result;
	}

	public String addHobbyByNameAndStudentCode(HobbyPk hobbyPk, Long student_code) {
		Student student = subjectRepository.findById(student_code).get();
		HobbyPk hobbies = HobbyPk.builder().student(student).name(hobbyPk.getName()).build();
		
		
		return null;
	}

}
