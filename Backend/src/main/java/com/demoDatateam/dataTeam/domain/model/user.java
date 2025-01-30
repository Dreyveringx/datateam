package com.demoDatateam.dataTeam.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {
    private Long id;
    private Integer idDocumentType;
    private Integer documentNumber;
    private String password;

}
