package com.example.gestion_rh.lysaModel;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "annonce")
public class Annonce {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String profil;

    private String description;

    @Column(name = "critere_rech")
    private Integer critereRecherche;

    @Column(name = "date_publication")
    private LocalDate datePublication;

    // Getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCritereRecherche() {
        return critereRecherche;
    }

    public void setCritereRecherche(Integer critereRecherche) {
        this.critereRecherche = critereRecherche;
    }

    public LocalDate getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(LocalDate datePublication) {
        this.datePublication = datePublication;
    }
}
