
import core.Contact;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel
 */
public class Repertoire {
    private List<Contact> contacts;

    public Repertoire(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
    
    
    public void ajouter(Contact contact){
            contacts.add(contact);
    }
    
    public void supprimer(Contact contact){
            contacts.remove(contact);
    }
    
    public void modifier(int index,Contact contact){
            contacts.set(index, contact);
    }
    
    
    public int rechercher(Contact contact){
        return contacts.indexOf(contact);
    }
}
