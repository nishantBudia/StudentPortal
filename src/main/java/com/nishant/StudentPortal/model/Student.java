package com.nishant.StudentPortal.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.Set;

@Data
@Entity
@Table(name = "students")
@Validated
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Pattern(regexp = "^[A-Z][a-z]*$")
    private String name;

    @NotNull
    private Integer age;

    @Pattern(regexp = "^\\d{10}")
    private String phoneNumber;

    @NotNull
    @Enumerated(value = EnumType.STRING)
    private Branch branch;

    @NotNull
    @Enumerated(value = EnumType.STRING)
    private Department department;

    @OneToOne()
    private Address address;

    @OneToOne()
    private Asset asset;

    @ManyToMany
    Set<Course> courseSet;
}
