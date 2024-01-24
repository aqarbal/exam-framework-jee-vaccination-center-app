package com.example.examframeworkjee.entities;

import lombok.*;

import jakarta.persistence.*;
import java.util.List;

@Data
@Entity
public class CentreVaccination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String adresse;

    @OneToMany(mappedBy = "centre")
    private List<Citoyen> citoyens;

    @Override
    public String toString() {
        return "CentreVaccination{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
