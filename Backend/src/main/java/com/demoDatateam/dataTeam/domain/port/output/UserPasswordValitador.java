package com.demoDatateam.dataTeam.domain.port.output;

public interface UserPasswordValitador {

    boolean validate(String userPassword);

    boolean validateUserPassword(String userPassword);

}
