package com.demoDatateam.dataTeam.domain.port;

public interface UserPasswordPort {

    boolean authenticatePassword(String username,String password);
}
