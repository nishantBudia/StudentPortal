package com.nishant.StudentPortal.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Entity
@Table(name = "addresses")
@Validated
public class Address {
    @Id
    @GeneratedValue()
    private Long id;

    @NotBlank
    private String landmark;


    @Pattern(regexp = "^\\d{6}")
    private String zipcode;

    @NotBlank
    private String district;

    @NotBlank
    private String state;

    @NotBlank
    private String country;

}
