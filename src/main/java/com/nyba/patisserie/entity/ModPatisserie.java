package com.nyba.patisserie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor @Data
public class ModPatisserie extends User {
    private String nom;
    private String prenom;
    @OneToMany
    private List<Patisserie> patisseries= new ArrayList();
    @OneToMany
    private List<Reclamation> reclamations=new ArrayList<>();
}
