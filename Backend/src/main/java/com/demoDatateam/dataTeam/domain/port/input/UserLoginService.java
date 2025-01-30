package com.demoDatateam.dataTeam.domain.port.input;

public interface UserLoginService {

    boolean authenticateUser(String userDocumentType, Number userDocumentNumber, String userPassword);
}
