package com.demoDatateam.dataTeam.infrastructure.adapter.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demoDatateam.dataTeam.domain.port.UserDocumentTypePort;

@Component
public class UserDocumetTypeAdapter implements UserDocumentTypePort{

    private final UserDocumentTypeRepository userDocumentTypeRepository;
    @Autowired
    public String getDocumentType(String type) {
        return userDocumentTypeRepository.findById(type)
        .map(UserDocumentType::getType)
        .orElseThrow(()-> new IllegalArgumentException("Tipo de documento no valido"))
    }
}
