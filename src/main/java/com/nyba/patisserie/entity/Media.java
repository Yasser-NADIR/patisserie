package com.nyba.patisserie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Media {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String type;
    @Lob
    private Blob contenue;
}
