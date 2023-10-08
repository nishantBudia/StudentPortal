package com.nishant.StudentPortal.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Entity
@Table(name = "assets")
@Validated
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Asset {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private AssetType type;

    @NotBlank
    private String name;

    @NotNull
    private Integer value;

    @OneToOne(mappedBy = "asset")
    private Student student;

}
