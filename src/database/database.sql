/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  gabriel
 * Created: 2 avr. 2024
 */

CREATE TABLE IF NOT EXISTS Etudiant (
    code VARCHAR(50) PRIMARY KEY,
    nom VARCHAR(100),
    dateNaissance DATE,
    address VARCHAR(255),
    email VARCHAR(100),
    telNumber VARCHAR(20),
    cycle VARCHAR(50),
    niveau VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS Enseignant (
    code VARCHAR(50) PRIMARY KEY,
    nom VARCHAR(100),
    dateNaissance DATE,
    address VARCHAR(255),
    email VARCHAR(100),
    telNumber VARCHAR(20),
    statut VARCHAR(50),
    salaire DECIMAL(10, 2)
);

CREATE TABLE IF NOT EXISTS Agent (
    code VARCHAR(50) PRIMARY KEY,
    nom VARCHAR(100),
    dateNaissance DATE,
    address VARCHAR(255),
    email VARCHAR(100),
    telNumber VARCHAR(20),
    statut VARCHAR(50),
    categorie VARCHAR(50),
    indiceSalaire INT,
    occupation VARCHAR(100)
);
