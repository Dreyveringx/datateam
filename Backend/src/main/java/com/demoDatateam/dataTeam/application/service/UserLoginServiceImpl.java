package com.demoDatateam.dataTeam.application.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.demoDatateam.dataTeam.domain.port.input.UserLoginService;
import com.demoDatateam.dataTeam.domain.port.output.UserDocumentNumberValidator;
import com.demoDatateam.dataTeam.domain.port.output.UserDocumentTypeValidator;
import com.demoDatateam.dataTeam.domain.port.output.UserPasswordValitador;

public class UserLoginServiceImpl implements UserLoginService {

    private final UserDocumentTypeValidator userDocumentTypeValidator;
    private final UserDocumentNumberValidator userDocumentNumberValidator;
    private final UserPasswordValitador userPasswordValitador;

    @Autowired
    public UserLoginServiceImpl(
        UserDocumentTypeValidator userDocumentTypeValidator,
        UserDocumentNumberValidator userDocumentNumberValidator,
        UserPasswordValitador userPasswordValitador
    ){
        this.userDocumentTypeValidator = userDocumentTypeValidator;
        this.userDocumentNumberValidator = userDocumentNumberValidator;
        this.userPasswordValitador = userPasswordValitador;
    }

    @Override
    public boolean authenticateUser(String userDocumentType, Number userDocumentNumber, String userPassword){
        if (!userDocumentTypeValidator.validateUserDocumentType(userDocumentType)){
            return false;
        }
        if (!userDocumentNumberValidator.validateUserDocumentNumber(userDocumentNumber)){
            return false;
        }
        if (!userPasswordValitador.validateUserPassword(userPassword)){
            return false;
        }
                return false;
    }

}
