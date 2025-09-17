package com.example.gestion_rh.controller;

import com.example.gestion_rh.model.fanaModel;
import com.example.gestion_rh.repository.fanaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/candidats")
public class CandidatController {

    private final fanaRepository candidatRepository;

    public CandidatController(fanaRepository candidatRepository) {
        this.candidatRepository = candidatRepository;
    }

    // 👉 Afficher le formulaire
    @GetMapping("/nouveau")
    public String afficherFormulaire(Model model) {
        model.addAttribute("candidat", new fanaModel());
        return "candidat_form"; // correspond au fichier candidat_form.html
    }

    // 👉 Traiter l’insertion
    @PostMapping("/enregistrer")
    public String enregistrerCandidat(@ModelAttribute fanaModel candidat) {
        candidatRepository.save(candidat);
        return "redirect:/candidats/liste"; // redirection après insertion
    }

    // 👉 Afficher la liste des candidats
    @GetMapping("/liste")
    public String listerCandidats(Model model) {
        model.addAttribute("candidats", candidatRepository.findAll());
        return "candidat_liste"; // correspond à candidat_liste.html
    }
}
