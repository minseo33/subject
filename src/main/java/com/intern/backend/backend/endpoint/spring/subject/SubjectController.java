package com.intern.backend.backend.endpoint.spring.subject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intern.backend.backend.endpoint.spring.subject.domain.Hobby;
import com.intern.backend.backend.endpoint.spring.subject.domain.HobbyPk;
import com.intern.backend.backend.endpoint.spring.subject.domain.Student;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
@RequestMapping(value = "/subject")
public class SubjectController {
	
	  private final SubjectService subjectService;
	  
	  public SubjectController(SubjectService subjectService) {
		  this.subjectService = subjectService;
	  }
	 
	
	@PostMapping(value = "/student")
	public String studentAddByNameAndAge(@RequestBody Student student) {
		String msg = "학생 등록 : " +  student.toString();
		log.info("*****" + msg + "*****");
		Student result = subjectService.addStudentByNameAndAge(student);
		
		return result.toString();
	}
	
	@PostMapping(value = "/hobby/{student_code}")
	public String hobbyAddByStudentCode(@RequestBody HobbyPk hobby,
										@PathVariable Long student_code)
	{
		String msg = "번호 : " + student_code + ", 취미 : " + hobby;
		String result = subjectService.addHobbyByNameAndStudentCode(hobby, student_code);
		return msg;
	}
	
}
