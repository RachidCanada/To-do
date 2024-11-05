# To-Do List Application

Ce projet est une application de gestion de tâches (To-Do List) développée en **Java** avec **Spring Boot**. L'application permet aux utilisateurs de créer, afficher, mettre à jour et supprimer des tâches. Elle est équipée d'une interface utilisateur simple en HTML/CSS/JavaScript pour interagir avec l'API REST.

## Fonctionnalités

- Ajouter une nouvelle tâche avec un titre et une description
- Afficher toutes les tâches
- Marquer une tâche comme terminée ou en cours
- Supprimer une tâche
- Interface utilisateur avec une To-Do List interactive

## Technologies Utilisées

- **Java** - Langage principal pour le développement backend
- **Spring Boot** - Framework pour créer l'API REST
  - **Spring Data JPA** - Pour l'interaction avec la base de données
  - **H2 Database** - Base de données en mémoire pour le développement
- **HTML/CSS/JavaScript** - Interface utilisateur simple
- **GitHub** - Hébergement du code source

## Structure du Projet

Le projet est structuré comme suit :


## Prérequis

- **Java 17** ou une version plus récente
- **Maven** (pour gérer les dépendances)
- Un IDE comme **Eclipse** ou **IntelliJ** (optionnel)

## Installation et Exécution

1. Clonez le dépôt :

   ```bash
   git clone https://github.com/RachidCanada/To-do.git


   API Endpoints
L'application expose plusieurs endpoints REST pour gérer les tâches :

GET /api/tasks - Récupérer la liste de toutes les tâches
GET /api/tasks/{id} - Récupérer une tâche par son ID
POST /api/tasks - Ajouter une nouvelle tâche
PUT /api/tasks/{id} - Mettre à jour une tâche existante
DELETE /api/tasks/{id} - Supprimer une tâche
