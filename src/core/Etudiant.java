package core;
import core.Contact;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel
 */
public class Etudiant extends Contact{
    private String cycle;
    private String niveau;

    public Etudiant(String code, String nom, String dateDeNaissance, String addresse, String email, String telNumber, String cycle, String niveau) {
        super(code, nom, dateDeNaissance, addresse, email, telNumber);
        this.cycle = cycle;
        this.niveau = niveau;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
    
}
