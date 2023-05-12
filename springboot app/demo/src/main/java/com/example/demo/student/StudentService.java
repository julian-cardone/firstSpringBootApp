package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


//this is the service layer. It is responsible for all business logic.
public class StudentService {

    //ideally, this info would come from a database
    public List<Student> getStudents() {
        return List.of(new Student(1, "Jo", "jo.jo@mail.com", LocalDate.of(1999, Month.APRIL, 5),23));
    }

}
