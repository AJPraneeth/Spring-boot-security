package com.example.desktop_application_backend.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RegisterRequest {
private String firstName;
private String lastName;
private String email;
private String password;
private Role role;
}
