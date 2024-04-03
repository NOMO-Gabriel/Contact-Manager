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
    private String salaire;
    private String statut;
    private String categorie;
    private String indiceDeSalaire;
    private String occupation;

    public Agent(String code, String nom, String dateDeNaissance, String addresse, String email, String telNumber, String salaire, String statut,String categorie,String indiceDeSalaire,String occupation) {
        super(code, nom, dateDeNaissance, addresse, email, telNumber);
        this.salaire = salaire;
        this.statut = statut;
        this.categorie = categorie;
        this.indiceDeSalaire = indiceDeSalaire;
        this.occupation = occupation;
    }

    public String getSalaire() {
        return salaire;
    }

    public void setSalaire(String salaire) {
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

    public String getIndiceDeSalaire() {
        return indiceDeSalaire;
    }

    public void setIndiceDeSalaire(String indiceDeSalaire) {
        this.indiceDeSalaire = indiceDeSalaire;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    
    
    
    
}
