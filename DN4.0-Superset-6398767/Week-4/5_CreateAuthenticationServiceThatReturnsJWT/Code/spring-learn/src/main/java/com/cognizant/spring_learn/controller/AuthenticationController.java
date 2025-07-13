package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.service.AuthenticationService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            return ResponseEntity.status(401).body("Missing or invalid Authorization header");
        }

        String base64Credentials = authHeader.substring("Basic ".length());
        String[] credentials = new String(Base64.getDecoder().decode(base64Credentials)).split(":", 2);

        if (credentials.length != 2) {
            return ResponseEntity.status(401).body("Invalid credentials format");
        }

        String token = authenticationService.generateToken(credentials[0], credentials[1]);

        if (token == null) {
            return ResponseEntity.status(401).body("Invalid username or password");
        }

        return ResponseEntity.ok("{\"token\":\"" + token + "\"}");
    }
}
