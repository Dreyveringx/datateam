package com.demoDatateam.dataTeam.infrastructure.adapter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoDatateam.dataTeam.domain.port.UserDocumentNumberPort;
import com.demoDatateam.dataTeam.domain.port.UserDocumentTypePort;
import com.demoDatateam.dataTeam.domain.port.UserPasswordPort;
import com.demoDatateam.dataTeam.domain.port.UserServicePort;

@RestController
@RequestMapping("api/auth")
public class AuthController {

    private final UserServicePort userServicePort;
    private final UserPasswordPort userPasswordPort;
    private final UserDocumentNumberPort userDocumentNumberPort;
    private final UserDocumentTypePort userDocumentTypePort;

}
