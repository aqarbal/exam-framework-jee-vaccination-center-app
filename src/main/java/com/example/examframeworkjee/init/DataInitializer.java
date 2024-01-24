package com.example.examframeworkjee.init;

import com.example.examframeworkjee.entities.CentreVaccination;
import com.example.examframeworkjee.entities.Citoyen;
import com.example.examframeworkjee.repository.CentreVaccinationRepository;
import com.example.examframeworkjee.repository.CitoyenRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@AllArgsConstructor
@Component
public class DataInitializer implements CommandLineRunner {

    private final CitoyenRepository citoyenRepository;
    private final CentreVaccinationRepository centreVaccinationRepository;


    @Override
    public void run(String... args) throws Exception {
        // Initialisation des données ici
        CentreVaccination centre1 = new CentreVaccination();
        centre1.setNom("AGADIR IDA OUTANANE");
        centre1.setAdresse("AGADIR");
        centreVaccinationRepository.save(centre1);

        CentreVaccination centre2 = new CentreVaccination();
        centre2.setNom("AIN CHOCK");
        centre2.setAdresse("CASABLANCA");
        centreVaccinationRepository.save(centre2);

        CentreVaccination centre3 = new CentreVaccination();
        centre3.setNom("AIN SEBAA HAY MOHAMMADI");
        centre3.setAdresse("CASABLANCA");
        centreVaccinationRepository.save(centre3);

        Citoyen citoyen1 = new Citoyen();
        citoyen1.setNom("QARBAL Abdelaziz");
        citoyen1.setCentre(centre2);
        citoyenRepository.save(citoyen1);

        Citoyen citoyen2 = new Citoyen();
        citoyen2.setNom("RAJAI Mohammed");
        citoyen2.setCentre(centre1);
        citoyenRepository.save(citoyen2);

        Citoyen citoyen3 = new Citoyen();
        citoyen3.setNom("OUHNI Mustafa");
        citoyen3.setCentre(centre2);
        citoyenRepository.save(citoyen3);
    }
}
