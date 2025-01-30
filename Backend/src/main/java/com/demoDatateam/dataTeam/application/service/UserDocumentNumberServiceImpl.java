package com.demoDatateam.dataTeam.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoDatateam.dataTeam.domain.port.input.UserDocumentNumberService;
import com.demoDatateam.dataTeam.domain.port.output.UserDocumentNumberValidator;

@Service
public class UserDocumentNumberServiceImpl implements UserDocumentNumberService {

    private final UserDocumentNumberValidator userDocumentNumberValidator;

    @Autowired
    public UserDocumentNumberServiceImpl(UserDocumentNumberValidator userDocumentNumberValidator){
        this.userDocumentNumberValidator = userDocumentNumberValidator;
    }

    @Override
    public boolean validateUserDocumentNumber( Number userDocumentNumber){
        return userDocumentNumberValidator.validate(userDocumentNumber);
    }

}
