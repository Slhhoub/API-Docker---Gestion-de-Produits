# API Docker - Gestion de Produits

## Description du Projet
Ce projet est une application de gestion de produits utilisant Docker pour la containerisation et Spring Boot pour la gestion du backend. L'application permet de créer, lire, mettre à jour et supprimer des produits, et elle expose une API RESTful pour interagir avec les données des produits.

## Tâches effectuées jusqu'à maintenant

### 1. **Création de l'application Spring Boot**
- Mise en place d'une application Spring Boot de base avec un modèle `Produit`.
- Ajout des dépendances nécessaires pour le projet.
- Création d'un contrôleur pour gérer les produits (CRUD).

### 2. **Gestion de la base de données avec MySQL**
- Configuration de MySQL dans l'application pour la persistance des données des produits.
- Création d'une base de données pour stocker les produits.
- Ajout d'un fichier Dockerfile pour créer une image de l'application avec une base de données MySQL.

### 3. **Mise en place de Docker**
- Création d'un Dockerfile pour containeriser l'application Spring Boot.
- Mise en place d'un fichier `docker-compose.yml` pour exécuter l'application et MySQL dans des conteneurs Docker.
- Utilisation de Docker pour créer, tester et déployer des images de l'application.

### 4. **Intégration de Swagger pour la documentation de l'API**
- Ajout de Swagger à l'application pour générer une documentation interactive de l'API.
- Configuration des annotations Swagger pour documenter les endpoints de l'API (`@Operation`, `@Parameter`).
- Test de l'interface Swagger à l'adresse `http://localhost:8080/swagger-ui.html`.

### 5. **Création d'APIs pour la gestion des produits**
- Mise en place des routes pour récupérer tous les produits (`GET /api/produit`).
- Ajout de la route pour récupérer un produit par son ID (`GET /api/produit/{id}`).
- Mise en place de l'API pour créer un produit (`POST /api/produit`).
- Ajout des routes pour mettre à jour (`PUT /api/produit/{id}`) et supprimer (`DELETE /api/produit/{id}`) un produit.

### 6. **Tests unitaires et validation**
- Création de tests unitaires pour vérifier le bon fonctionnement des services et contrôleurs.
- Tests des routes API pour garantir que l'application répond correctement.

### 7. **Déploiement et gestion avec Docker**
- Construction d'une image Docker pour l'application.
- Push de l'image vers Docker Hub pour un partage facile entre différents environnements.
- Lancement de l'application avec Docker et Docker Compose pour tester en environnement isolé.

### 8. **Gestion des erreurs et exceptions**
- Ajout de la gestion des erreurs pour les cas où le produit n'est pas trouvé ou où les données sont invalides.
- Retour de messages d'erreur pertinents dans les réponses de l'API.

### 9. **Documentation de l'API avec OpenAPI et Swagger**
- Ajout de la documentation API avec OpenAPI et Swagger pour faciliter l'intégration avec d'autres services.
- Configuration de l'API avec des descriptions et des résumés dans Swagger.

## Comment exécuter l'application localement

### Prérequis :
- Docker installé
- Java 17+ installé

### 1. **Cloner le repository**
   ```bash
   git clone https://github.com/Slhhoub/API-Docker---Gestion-de-Produits.git
### 1. **Cloner le repository et récupérer l'image Docker**
   Pour récupérer l'image Docker et l'exécuter localement, utilisez la commande suivante :

   ```bash
   docker pull schhoub/api-dockerproduit
   docker run -p 8080:8080 schhoub/api-dockerproduit
