package com.SBProject.SBRestApi.Controller;

import com.SBProject.SBRestApi.entity.Student;
import com.SBProject.SBRestApi.repository.StudentRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepositry repo;
    //get all the studnts
    //localhost:8080/students

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return repo.findAll();
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id){
        return repo.findById(id).orElse(null);

    }

    @PostMapping("/student/add")
    @ResponseStatus(code= HttpStatus.CREATED)
    public String createStudent(@RequestBody Student student){
        repo.save(student);
        return "Student Added Succesfully";

    }

    @PutMapping("/student/update/{id}")
public Student updateStudent(@PathVariable int id, @RequestBody Student student){
    Student stu = repo.findById(id).orElse(null);

    if(stu != null){
        stu.setName(student.getName());
        stu.setBranch(student.getBranch());
        stu.setPercentage(student.getPercentage());
        repo.save(stu);
    }

    return stu;
}

    @DeleteMapping("/student/Del/{id}")
    public String removeStudent(@PathVariable int id){
        Student stu=repo.findById(id).get();
        repo.delete(stu);
        return "Student Removed";
    }
}


