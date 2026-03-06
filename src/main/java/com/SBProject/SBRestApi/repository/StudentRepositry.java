package com.SBProject.SBRestApi.repository;

import com.SBProject.SBRestApi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositry extends JpaRepository<Student,Integer> {

}
