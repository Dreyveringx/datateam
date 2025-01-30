package com.demoDatateam.dataTeam.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoDatateam.dataTeam.domain.port.input.UserPasswordService;
import com.demoDatateam.dataTeam.domain.port.output.UserPasswordValitador;

@Service
public class UserPasswordServiceImpl implements UserPasswordService {

    private final UserPasswordValitador userPasswordValitador;

    @Autowired
    public UserPasswordServiceImpl(UserPasswordValitador userPasswordValitador){
        this.userPasswordValitador = userPasswordValitador;
    }

    @Override
    public boolean validateUserPassword(String userPassword){
        return userPasswordValitador.validate(userPassword);
    }

}
