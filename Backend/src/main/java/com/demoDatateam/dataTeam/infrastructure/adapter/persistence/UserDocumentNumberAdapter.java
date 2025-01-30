package com.demoDatateam.dataTeam.infrastructure.adapter.persistence;

import org.springframework.stereotype.Component;

import com.demoDatateam.dataTeam.domain.model.User;
import com.demoDatateam.dataTeam.domain.port.UserDocumentNumberPort;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UserDocumentNumberAdapter implements UserDocumentNumberPort {

    private final UserRepository userRepository;

    @Override
    public boolean validateUserDocumentNumber(String userDocumentType, Number userDocumentNumber) {
        User user = userRepository.findByUserDocumentTypeAndUserDocumentNumber(userDocumentType, userDocumentNumber);
        return user != null;
    }

}
