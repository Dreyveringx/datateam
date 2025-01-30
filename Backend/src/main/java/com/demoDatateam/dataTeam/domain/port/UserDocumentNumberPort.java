package com.demoDatateam.dataTeam.domain.port;

public interface UserDocumentNumberPort {
    boolean validateDocumentNumber (String documentType, Number documentNumber );
}
