package com.demoDatateam.dataTeam.infrastructure.adapter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demoDatateam.dataTeam.domain.port.input.UserLoginService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserLoginService userLoginService;

    @Autowired
    public AuthController(UserLoginService userLoginService){
        this.userLoginService = userLoginService;
    }

    @PostMapping("/login")
    public boolean login(@RequestParam String userDocumentType,
    @RequestParam Number userDocumentNumber,
    @RequestParam String userPassword){
        return userLoginService.authenticateUser(userDocumentType, userDocumentNumber, userPassword);
    }
}
