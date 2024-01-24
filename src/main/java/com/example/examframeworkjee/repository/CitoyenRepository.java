package com.example.examframeworkjee.repository;

import com.example.examframeworkjee.entities.Citoyen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitoyenRepository extends JpaRepository<Citoyen, Long> {
}
