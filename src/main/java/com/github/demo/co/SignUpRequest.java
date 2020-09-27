package com.github.demo.co;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SignUpRequest {
    @NotBlank
    String name;

    @NotBlank
    @Email
    String email;

    @NotBlank
    String password;
}
