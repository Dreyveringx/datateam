package com.demoDatateam.dataTeam.domain.port;

import java.util.Optional;

import com.demoDatateam.dataTeam.domain.model.User;

public interface UserRepositoryPort {
    Optional<User>findByUsername(String username);
    User save(User user);

}
