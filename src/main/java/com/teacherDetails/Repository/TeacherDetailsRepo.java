package com.teacherDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teacherDetails.Model.Teacher;


public interface TeacherDetailsRepo extends JpaRepository<Teacher, Long>{

}
