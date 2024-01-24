package com.example.examframeworkjee.entities;

import com.example.examframeworkjee.entities.CentreVaccination;
import lombok.*;

import jakarta.persistence.*;

@Data
@Entity
public class Citoyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @ManyToOne
    @JoinColumn(name = "centre_id")
    private CentreVaccination centre;
}
