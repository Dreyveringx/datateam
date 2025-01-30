package com.demoDatateam.dataTeam.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoDatateam.dataTeam.domain.port.input.UserDocumentTypeService;
import com.demoDatateam.dataTeam.domain.port.output.UserDocumentTypeValidator;

@Service
public class UserDocumentTypeServiceImpl implements UserDocumentTypeService{

    private final UserDocumentTypeValidator userDocumentTypeValidator;

    @Autowired
    public UserDocumentTypeServiceImpl(UserDocumentTypeValidator userDocumentTypeValidator){
        this.userDocumentTypeValidator = userDocumentTypeValidator;
    }

    @Override
    public boolean validateUserDocumentType(String userDocumentType){
        return userDocumentTypeValidator.validate(userDocumentType);
    }

}
