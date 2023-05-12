package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Jo = new Student("Jo", "jo.jo@mail.com", LocalDate.of(1999, Month.APRIL, 5));

            Student Cole = new Student("Cole", "Cole.Cole@mail.com", LocalDate.of(1980, Month.APRIL, 5));

            repository.saveAll(
                    List.of(Jo, Cole)
            );

        };
    }

}
