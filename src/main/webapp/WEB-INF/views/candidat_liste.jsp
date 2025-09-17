<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste des Candidats</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        table { width: 100%; border-collapse: collapse; }
        th, td { border: 1px solid #ddd; padding: 8px; text-align: left; }
        th { background-color: #f2f2f2; }
        tr:nth-child(even) { background-color: #f9f9f9; }
        a { color: #4CAF50; text-decoration: none; }
        a:hover { text-decoration: underline; }
    </style>
</head>
<body>
<h2>Liste des Candidats</h2>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>ID Annonce</th>
        <th>Nom</th>
        <th>Prénom</th>
        <th>Âge</th>
        <th>Genre</th>
        <th>Adresse</th>
        <th>Email</th>
        <th>Années d'expérience</th>
        <th>Lettre de motivation</th>
        <th>CV</th>
        <th>Date de candidature</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="candidat" items="${candidats}">
        <tr>
            <td>${candidat.id}</td>
            <td>${candidat.idAnnonce}</td>
            <td>${candidat.nom}</td>
            <td>${candidat.prenom}</td>
            <td>${candidat.age}</td>
            <td>
                <c:choose>
                    <c:when test="${candidat.genre == 1}">Homme</c:when>
                    <c:when test="${candidat.genre == 2}">Femme</c:when>
                    <c:otherwise>Non spécifié</c:otherwise>
                </c:choose>
            </td>
            <td>${candidat.adresse}</td>
            <td>${candidat.email}</td>
            <td>${candidat.anneesExperience}</td>
            <td>${candidat.lettreMotivation}</td>
            <td><a href="${candidat.cv}" target="_blank">Voir CV</a></td>
            <td>${candidat.dateCandidature}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br>
<a href="/candidats/nouveau">Ajouter un nouveau candidat</a>
</body>
</html>