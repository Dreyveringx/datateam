package com.demoDatateam.dataTeam.application.dto;

import lombok.Data;

@Data
public class AuthRequest {

    private String userDocumentType;
    private Number userDocumentNumber;
    private String userPassword;

}

