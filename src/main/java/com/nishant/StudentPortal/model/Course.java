package com.nishant.StudentPortal.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@Table(name = "courses")
@Validated()
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Course {
    @Id
    @GeneratedValue
    private Integer id;

    @NotBlank
    private String courseCode;

    @NotBlank
    private String description;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate startDate;

    @NotNull
    private Byte credits;

    @ManyToMany
    private Set<Student> studentSet;

}
