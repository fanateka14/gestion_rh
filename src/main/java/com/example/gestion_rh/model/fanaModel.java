package com.example.gestion_rh.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "candidat")
public class fanaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_annonce", nullable = false)
    private Integer idAnnonce;

    @Column(nullable = false, length = 40)
    private String nom;

    @Column(nullable = false, length = 40)
    private String prenom;

    private Integer age;

    private Integer genre; // 1 = Homme, 2 = Femme (par exemple)

    @Column(length = 60)
    private String adresse;

    @Column(length = 40, unique = true)
    private String email;

    @Column(name = "annees_experience")
    private Integer anneesExperience;

    @Column(name = "lettre_motivation", length = 300)
    private String lettreMotivation;

    @Column(length = 60)
    private String cv;

    @Column(name = "date_candidature")
    private LocalDate dateCandidature;


    public fanaModel() {}

    public fanaModel(Integer idAnnonce, String nom, String prenom, Integer age, Integer genre,
                     String adresse, String email, Integer anneesExperience,
                     String lettreMotivation, String cv, LocalDate dateCandidature) {
        this.idAnnonce = idAnnonce;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.genre = genre;
        this.adresse = adresse;
        this.email = email;
        this.anneesExperience = anneesExperience;
        this.lettreMotivation = lettreMotivation;
        this.cv = cv;
        this.dateCandidature = dateCandidature;
    }

    // --- Getters et setters ---
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getIdAnnonce() { return idAnnonce; }
    public void setIdAnnonce(Integer idAnnonce) { this.idAnnonce = idAnnonce; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public Integer getGenre() { return genre; }
    public void setGenre(Integer genre) { this.genre = genre; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Integer getAnneesExperience() { return anneesExperience; }
    public void setAnneesExperience(Integer anneesExperience) { this.anneesExperience = anneesExperience; }

    public String getLettreMotivation() { return lettreMotivation; }
    public void setLettreMotivation(String lettreMotivation) { this.lettreMotivation = lettreMotivation; }

    public String getCv() { return cv; }
    public void setCv(String cv) { this.cv = cv; }

    public LocalDate getDateCandidature() { return dateCandidature; }
    public void setDateCandidature(LocalDate dateCandidature) { this.dateCandidature = dateCandidature; }
}
