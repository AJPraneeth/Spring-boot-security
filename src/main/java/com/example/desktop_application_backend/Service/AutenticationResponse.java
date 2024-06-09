package com.example.desktop_application_backend.Service;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AutenticationResponse {

     @JsonProperty("access_token")
    private String token;
}
