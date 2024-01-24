# Application de Vaccination

Cette application web permet de gérer les centres de vaccination et les citoyens qui y sont affiliés.

## Technologies Utilisées

- Spring Boot
- Spring Data JPA
- Thymeleaf
- H2 Database (pour la simplicité du développement)

## Configuration de la Base de Données

L'application utilise une base de données H2 par défaut. La configuration de la base de données peut être ajustée dans le fichier `application.properties`.

```properties
# Configuration H2 Database
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

## Exécution de l'Application

### Prérequis

Assure-toi d'avoir les outils suivants installés sur ta machine :

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Git](https://git-scm.com/downloads)

### Étapes détaillées

1. **Clone le Dépôt :**

   Ouvre une fenêtre de terminal et exécute la commande suivante pour cloner le dépôt depuis GitHub :

   ```bash
   git clone https://github.com/aqarbal/exam-framework-jee-vaccination-center-app.git
   ```

2. **Ouvre le Projet dans ton IDE :**

   Utilise ton IDE préféré (par exemple, IntelliJ, Eclipse) pour ouvrir le projet. Importe-le comme projet Maven si nécessaire.

3. **Exécute l'Application :**

   Cherche la classe ExamFrameworkJeeApplication et exécute-la en tant qu'application Java.

4. **Accède à l'Application :**

   L'application sera disponible à l'adresse [http://localhost:8080/vaccination](http://localhost:8080/). Ouvre ton navigateur web et accède à cette URL.

   ```plaintext
   http://localhost:8080/vaccination/
   ```
   
## Fonctionnalités

- **Ajouter un Nouveau Citoyen :** Accédez à `/vaccination/ajouterCitoyen` pour ajouter un nouveau citoyen.
- **Ajouter un Nouveau Centre de Vaccination :** Accédez à `/vaccination/ajouterCentre` pour ajouter un nouveau centre de vaccination.
- **Liste des Centres de Vaccination :** Accédez à `/vaccination/listeCentres` pour afficher une liste de tous les centres avec des liens pour voir les détails de chaque centre.


