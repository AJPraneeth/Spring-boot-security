package com.example.desktop_application_backend.Service;

import com.example.desktop_application_backend.Model.RegisterRequest;
import com.example.desktop_application_backend.Model.User;
import com.example.desktop_application_backend.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final UserRepository userRepository;
    private final JwtService jwtService;

    public AuthService(UserRepository userRepository, JwtService jwtService) {
        this.userRepository = userRepository;
        this.jwtService = jwtService;
    }

    public AutenticationResponse register(RegisterRequest registerRequest) {

        var user = User.builder()
                .firstName(registerRequest.getFirstName())
                .lastName(registerRequest.getLastName())
                .email(registerRequest.getEmail())
                .password(registerRequest.getPassword())
                .role(registerRequest.getRole())
                .build();
        var savedUser = userRepository.save(user);
        String jwtToken =jwtService.generateToken(user);
        return  AutenticationResponse.builder().token(jwtToken).build();

    }
}
