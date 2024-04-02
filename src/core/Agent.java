/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;
import core.Contact;
import java.util.Date;

/**
 *
 * @author gabriel
 */
public class Agent extends Contact{
      private float salaire;
    private String statut;
    private String categorie;
    private float indiceDeSalaire;
    private String occupation;

    public Agent(float salaire, String statut, String categorie, float indiceDeSalaire, String occupation, String code, String nom, Date dateDeNaissance, String address, String email, String telNumber) {
        super(code, nom, dateDeNaissance, address, email, telNumber);
        this.salaire = salaire;
        this.statut = statut;
        this.categorie = categorie;
        this.indiceDeSalaire = indiceDeSalaire;
        this.occupation = occupation;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public float getIndiceDeSalaire() {
        return indiceDeSalaire;
    }

    public void setIndiceDeSalaire(float indiceDeSalaire) {
        this.indiceDeSalaire = indiceDeSalaire;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    
    
    
    
}
