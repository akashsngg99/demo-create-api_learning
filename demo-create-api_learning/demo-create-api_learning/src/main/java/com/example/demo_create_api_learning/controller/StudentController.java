package com.example.demo_create_api_learning.controller;

import com.example.demo_create_api_learning.Dto.StudentDto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/student")
    public StudentDto getStudentDetails(){
        return new StudentDto(1,"akash", "akash.sngg@gmail.com");

    }
}
