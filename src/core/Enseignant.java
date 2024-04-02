
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
public class Enseignant extends Contact{
    private String Statut;

    public Enseignant(String Statut, String code, String nom, Date dateDeNaissance, String address, String email, String telNumber) {
        super(code, nom, dateDeNaissance, address, email, telNumber);
        this.Statut = Statut;
    }

    public String getStatut() {
        return Statut;
    }

    public void setStatut(String Statut) {
        this.Statut = Statut;
    }


    
    
}
