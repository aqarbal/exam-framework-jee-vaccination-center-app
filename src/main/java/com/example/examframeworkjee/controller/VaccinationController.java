package com.example.examframeworkjee.controller;

import com.example.examframeworkjee.entities.CentreVaccination;
import com.example.examframeworkjee.entities.Citoyen;
import com.example.examframeworkjee.repository.CentreVaccinationRepository;
import com.example.examframeworkjee.repository.CitoyenRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/vaccination")
public class VaccinationController {

    private final CitoyenRepository citoyenRepository;
    private final CentreVaccinationRepository centreVaccinationRepository;

    @GetMapping("/")
    public String accueil() {
        return "accueil";
    }

    public VaccinationController(CitoyenRepository citoyenRepository, CentreVaccinationRepository centreVaccinationRepository) {
        this.citoyenRepository = citoyenRepository;
        this.centreVaccinationRepository = centreVaccinationRepository;
    }

    @GetMapping("/ajouterCitoyen")
    public String ajouterCitoyen(Model model) {
        model.addAttribute("citoyen", new Citoyen());
        model.addAttribute("centres", centreVaccinationRepository.findAll());
        return "ajouterCitoyen";
    }

    @PostMapping("/ajouterCitoyen")
    public String sauvegarderCitoyen(@ModelAttribute Citoyen citoyen) {
        System.out.println(citoyen);
        citoyenRepository.save(citoyen);
        return "redirect:/vaccination/afficherCentre/" + citoyen.getCentre().getId();
    }

    @GetMapping("/ajouterCentre")
    public String ajouterCentre(Model model) {
        model.addAttribute("centre", new CentreVaccination());
        return "ajouterCentre";
    }

    @PostMapping("/ajouterCentre")
    public String sauvegarderCentre(@ModelAttribute CentreVaccination centre) {
        centreVaccinationRepository.save(centre);
        return "redirect:/vaccination/afficherCentre/" + centre.getId();
    }

    @GetMapping("/listeCentres")
    public String afficherListeCentres(Model model) {
        List<CentreVaccination> centres = centreVaccinationRepository.findAll();
        model.addAttribute("centres", centres);
        return "listeCentres";
    }

    @GetMapping("/afficherCentre/{id}")
    public String afficherCentre(@PathVariable Long id, Model model) {
        CentreVaccination centre = centreVaccinationRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Centre de vaccination non trouvé"));
        model.addAttribute("centre", centre);
        model.addAttribute("citoyens", centre.getCitoyens());
        return "afficherCentre";
    }
}
