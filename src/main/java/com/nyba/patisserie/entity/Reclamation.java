package com.nyba.patisserie.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Reclamation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String type;
    private String corps;
    @ManyToMany
    private ModPatisserie modPatisserie;
}
