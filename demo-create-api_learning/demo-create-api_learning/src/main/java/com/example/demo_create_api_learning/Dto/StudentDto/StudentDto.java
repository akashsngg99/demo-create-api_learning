package com.example.demo_create_api_learning.Dto.StudentDto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDto {
    public long id;
    public String name;
    public String emailId;

}
