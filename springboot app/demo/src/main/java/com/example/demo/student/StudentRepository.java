package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {   //data type, id type

    //data access layer. student repository

    //SELECT * FROM student WHERE email = x
//    @Query("SELECT s FROM Student s WHERE s.email = ?1")      //could also put this
    Optional<Student> findStudentByEmail(String email);

}
