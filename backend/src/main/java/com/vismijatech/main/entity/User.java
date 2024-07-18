package com.vismijatech.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Pattern(regexp = "^[a-z,A-Z ]{5,25}$", message = "Invalid name format!")
    private String name;

    @Pattern(regexp = "^[a-zA-Z0-9._%±]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,}$", message = "Invalid email format!")
    private String email;

    @Pattern(regexp = "^[a-z,A-Z,0-9]{5,25}$", message = "Invalid password format!")
    private String password;

    @Pattern(regexp = "^[0-9]{10}$/", message = "Invalid password format")
    private String phoneNo;

    @Pattern(regexp = "^[a-z,A-Z]{3,25}$", message = "Invalid city format!")
    private String city;
}
