package com.demoDatateam.dataTeam.application.service;

import com.demoDatateam.dataTeam.domain.port.UserDocumentTypePort;
import com.demoDatateam.dataTeam.domain.port.UserDocumentNumberPort;
import com.demoDatateam.dataTeam.domain.port.UserPasswordPort;

public class UserService {
    private final UserDocumentTypePort documentTypePort;
    private final UserDocumentNumberPort userDocumentNumberPort;
    private final UserPasswordPort userPasswordPort;

    public UserService(
            UserDocumentTypePort documentTypePort,
            UserDocumentNumberPort userDocumentNumberPort,
            UserPasswordPort userPasswordPort) { 
        this.documentTypePort = documentTypePort;
        this.userDocumentNumberPort = userDocumentNumberPort;
        this.userPasswordPort = userPasswordPort;
    }

    public boolean authenticateUser(String documentType, String documentNumber, String userPassword) {
        String type = documentTypePort.getDocumentType(documentType);
        boolean documentValid = userDocumentNumberPort.validateDocumentNumber(type, documentNumber);

        if (documentValid) {
            String username = type + "_" + documentNumber;
            return userPasswordPort.authenticatePassword(username, userPassword);
        }
        return false;
    }
}
