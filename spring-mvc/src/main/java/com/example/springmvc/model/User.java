package com.example.springmvc.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users") // Ensure the table name matches your database schema
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotEmpty(message = "Username is required")
    @Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters")
    @Column(name = "username", nullable = false)
    private String username;

    @NotEmpty(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    @Column(name = "password", nullable = false)
    private String password;

    @NotEmpty(message = "Email is required")
    @Email(message = "Email should be valid")
    @Column(name = "email", nullable = false)
    private String email;

    @NotEmpty(message = "Gender is required")
    @Column(name = "gender")
    private String gender;

    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 100, message = "Age must be less than or equal to 100")
    @Column(name = "age")
    private int age;

    @NotEmpty(message = "Role is required")
    @Column(name = "role")
    private String role;

    @Column(name = "married")
    private boolean married;

    @NotEmpty(message = "Profession is required")
    @Column(name = "profession")
    private String profession;

    @Embedded
    private Address address;
}
