package com.teacherDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.teacherDetails.Model.Teacher;
import com.teacherDetails.Service.TeacherDetailsService;


@CrossOrigin(origins ="http://localhost:3000/" )
@RestController
@RequestMapping("/api/teacherDetails")
public class TeacherController {
	@Autowired
	private TeacherDetailsService teacherDetailsService;

	public TeacherController(TeacherDetailsService teacherDetailsService) {
		super();
		this.teacherDetailsService = teacherDetailsService;
	}
	
//	@PostMapping("/teacher")
//	public ResponseEntity<Teacher> addTeacher(@RequestBody Teacher teacher){
//		return new ResponseEntity<Teacher>(teacherDetailsService.addTeacher(teacher), HttpStatus.CREATED);
//	}
	
	@GetMapping
	public List<Teacher> getAllTeachers(){
		return teacherDetailsService.getAllTeachers();
		
	}

}
