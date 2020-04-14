# Oniregist

## Table of Contents
1. [Overview](#Overview)
2. [Product Spec](#Product-Spec)
3. [Wireframes](#Wireframes)
4. [Schema](#Schema)

## Overview
### Description
 Oniregist est une application qui permet à ses opérateurs d'envoyer le nombre de titulaires de carte par jour et le nombre de cartes retournées

### App Evaluation
- **Category:** web portail 
- **Mobile:** Cette application serait développée pour mobile, web mais pourrait être tout aussi viable sur ordinateur.
La fonctionnalité ne serait pas limitée aux appareils mobiles, mais la version mobile pourrait potentiellement avoir plus
traits.
- **Story:** Oniregist est une application qui vous permet d envoyer des donnees sur votre téléphone Android 
- **Market:** les operateurs peuvent utiliser lors des rapports de fin de journée des élections à ce moment peut utiliser cette application.
- **Habit:** Cette application devrait être utilisée lorsqu on fait des registres de donnée.
- **Scope:** Cette application permettra aux opérateurs d'avoir une confiance claire que ceux qui sont dans les registres sont vraiment bons pour gérer leur temps

## Product Spec
### 1.Témoignages d'utilisateurs (obligatoires et facultatifs)

**Histoires incontournables requises**

- L'utilisateur peut se connecter avec l'identifiant et le prénom
- [x] Utilisé pourra sélectionner le departement et la commune appropriée
- [x] Les utilisateurs pourront voir toutes les informations à ce sujet une fois connectés
- [ ] Les utilisateurs pourront voir la somme des données enregistrésUser can login with id and firstname

** Histoires agréables à avoir en option **

- [] Les utilisateurs peuvent rechercher chaque chaque departement 
     et chaque commune appropriée
- [] L'utilisateur peut se déconnecter

### 2. Screen Archetypes

* S'identifier
   * L'utilisateur peut se connecter avec l'identifiant et le prénom

* Écran de sélection des departements et des communes
   * Les utilisateurs peuvent enregistrés les données
   * Les utilisateurs peuvent voir la somme des donnée inscrits

### 3. Utilisateur de navigation

** Navigation de flux ** (écran à écran)
* S'identifier
* Écran de connexion
* Écran des departements et des communes

## Wireframes

## Schema 

### Models
Modèle: utilisateur

| Propriété | Type | Description |
| -------- | -------- | ---------|
| Nom | String | Nom de l'utilisateur |
| Prénom | String | Prénom de l'utilisateur |
| ObjectID | String | Identifiant unique pour l'utilisateur |
| CreatedAt | Datetime | Date de création de l'utilisateur (champ par défaut) |

Modèle: Departement

| Propriété | Type | Description |
| -------- | -------- | ----------------------------------- |
| ObjectId | String | L'utilisateur utilise un identifiant unique pour se connecter | |
| Nom | String | Nom du departement |
| CreatedAt | Datetime | Date de création de l'utilisateur (champ par défaut) |
| UpdateAt | Datetime | Date de la dernière mise à jour de l'utilisateur (champ par défaut) |


Modèle: Commune

| Propriété | Type | Description |
| -------- | -------- | ----------------------------------- |
| ObjectId | String | L'utilisateur utilise un identifiant unique pour se connecter | |
| Nom | String | Nom du departement |
| CreatedAt | Datetime | Date de création de l'utilisateur (champ par défaut) |
| UpdateAt | Datetime | Date de la dernière mise à jour de l'utilisateur (champ par défaut) |

### La mise en réseau

* Écran de connexion
   * (Read / GET) Requête pour se connecter avec l'ID utilisateur.

* Écran de sélection des departements et des communes
 

* Détail
   * (Lire / OBTENIR) Requête pour afficher les détails de chaque commune sélectionné avant  
* Post-détail
   * (Read / GET) Requête pour afficher tous les departements et des communes choisis par l'utilisateur.




