package com.teacherDetails.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.teacherDetails.Model.Teacher;
import com.teacherDetails.Repository.TeacherDetailsRepo;
@Service
public class TeacherDetailsImpl implements TeacherDetailsService{
	private TeacherDetailsRepo teacherDetailsrepo;
	
	

	public TeacherDetailsImpl(TeacherDetailsRepo teacherDetailsrepo) {
		super();
		this.teacherDetailsrepo = teacherDetailsrepo;
	}

//	@Override
//	public Teacher addTeacher(Teacher teacher) {
//		return teacherDetailsrepo.save(teacher);
//
//	}

	@Override
	public List<Teacher> getAllTeachers() {
		return teacherDetailsrepo.findAll();
	}
}
