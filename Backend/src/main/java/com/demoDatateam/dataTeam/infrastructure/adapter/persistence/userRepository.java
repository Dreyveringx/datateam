package com.demoDatateam.dataTeam.infrastructure.adapter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoDatateam.dataTeam.domain.model.User;

public interface UserRepository extends JpaRepository<User, String> {

    User findByUserDocumentTypeAndUserDocumentNumber(String userDocumentType, Number userDocumentNumber);
} 