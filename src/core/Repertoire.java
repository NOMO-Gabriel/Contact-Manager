package core;
import core.Contact;
import java.util.LinkedList;
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

    public Repertoire() {
        contacts = new LinkedList<Contact>();
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
    
    public void afficher(){
            System.out.print("[ ");
            for(Contact c:contacts){
                c.afficher();
            }
            System.out.print(" ] ");
    }
}
