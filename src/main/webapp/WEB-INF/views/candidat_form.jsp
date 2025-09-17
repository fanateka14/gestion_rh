<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ajouter un Candidat</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        .form-group { margin-bottom: 15px; }
        label { display: inline-block; width: 150px; }
        input, textarea, select { width: 200px; padding: 5px; }
        button { padding: 10px 20px; background-color: #4CAF50; color: white; border: none; cursor: pointer; }
        button:hover { background-color: #45a049; }
    </style>
</head>
<body>
<h2>Ajouter un Nouveau Candidat</h2>
<form action="/candidats/enregistrer" method="post">
    <div class="form-group">
        <label for="idAnnonce">ID Annonce :</label>
        <input type="number" id="idAnnonce" name="idAnnonce" required />
    </div>
    <div class="form-group">
        <label for="nom">Nom :</label>
        <input type="text" id="nom" name="nom" required maxlength="40" />
    </div>
    <div class="form-group">
        <label for="prenom">Prénom :</label>
        <input type="text" id="prenom" name="prenom" required maxlength="40" />
    </div>
    <div class="form-group">
        <label for="age">Âge :</label>
        <input type="number" id="age" name="age" />
    </div>
    <div class="form-group">
        <label for="genre">Genre :</label>
        <select id="genre" name="genre">
            <option value="">Sélectionner</option>
            <option value="1">Homme</option>
            <option value="2">Femme</option>
        </select>
    </div>
    <div class="form-group">
        <label for="adresse">Adresse :</label>
        <input type="text" id="adresse" name="adresse" maxlength="60" />
    </div>
    <div class="form-group">
        <label for="email">Email :</label>
        <input type="email" id="email" name="email" maxlength="40" />
    </div>
    <div class="form-group">
        <label for="anneesExperience">Années d'expérience :</label>
        <input type="number" id="anneesExperience" name="anneesExperience" />
    </div>
    <div class="form-group">
        <label for="lettreMotivation">Lettre de motivation :</label>
        <textarea id="lettreMotivation" name="lettreMotivation" maxlength="300"></textarea>
    </div>
    <div class="form-group">
        <label for="cv">CV (URL ou chemin) :</label>
        <input type="text" id="cv" name="cv" maxlength="60" />
    </div>
    <div class="form-group">
        <label for="dateCandidature">Date de candidature :</label>
        <input type="date" id="dateCandidature" name="dateCandidature" />
    </div>
    <button type="submit">Enregistrer</button>
</form>
<br>
<a href="/candidats/liste">Voir la liste des candidats</a>
</body>
</html>