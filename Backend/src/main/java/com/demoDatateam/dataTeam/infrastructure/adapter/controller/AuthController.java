package com.demoDatateam.dataTeam.infrastructure.adapter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.demoDatateam.dataTeam.application.dto.AuthRequest;
import com.demoDatateam.dataTeam.application.dto.LoginResponse;
import com.demoDatateam.dataTeam.domain.port.input.UserLoginService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserLoginService userLoginService;

    @Autowired
    public AuthController(UserLoginService userLoginService) {
        this.userLoginService = userLoginService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest authRequest) {
        if (userLoginService.authenticateUser(authRequest.getUserDocumentType(),
                authRequest.getUserDocumentNumber(),
                authRequest.getUserPassword())) {
            return ResponseEntity.ok(new LoginResponse("TokenJWT"));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }

}
