package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1,
                        "bilel" ,
                        "bilel.feki.92@gmail.com" ,
                        22
                )
        );
    }

}
