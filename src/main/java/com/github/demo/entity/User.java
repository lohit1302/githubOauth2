package com.github.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.demo.enums.AuthProvider;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email")
})
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    String name;

    @Email
    @Column(nullable = false)
    String email;

    String imageUrl;

    @Column(nullable = false)
    Boolean emailVerified = false;

    @JsonIgnore
    String password;

    @NotNull
    @Enumerated(EnumType.STRING)
    AuthProvider provider;

    String providerId;

}