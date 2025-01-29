package com.demoDatateam.dataTeam.infrastructure.adapter.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class JpaUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_document_type")
    private Integer idDocumentType;

    @Column(name = "document_number")
    private Integer documentNumber;

    private String password;
    

}
