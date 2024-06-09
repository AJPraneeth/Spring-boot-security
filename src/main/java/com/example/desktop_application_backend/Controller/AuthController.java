package com.example.desktop_application_backend.Controller;


import com.example.desktop_application_backend.Model.RegisterRequest;
import com.example.desktop_application_backend.Service.AutenticationResponse;
import com.example.desktop_application_backend.Service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;

    }

    @PostMapping("/register")
    public ResponseEntity<AutenticationResponse> registerUser(
            @RequestBody RegisterRequest registerRequest) {

        AutenticationResponse autenticationResponse= authService.register(registerRequest);
        return ResponseEntity.ok(autenticationResponse);

    }
}
