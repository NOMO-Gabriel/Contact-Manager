package main;
import IHM.MainFormApplication;
import IHM.CreationContactFrame;
import IHM.ListeContactsFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel
 */


public class MainApplication {
    
            
         public  MainFormApplication mainFrame ; 
         public  ListeContactsFrame listecontacts;
         public  CreationContactFrame contactFrame ;
         
         public MainApplication(){
         
               mainFrame = new MainFormApplication();    
               listecontacts= new ListeContactsFrame(mainFrame);
               contactFrame = new CreationContactFrame(mainFrame);
  
         }
         
                private void activeM(){
                this.mainFrame.setVisible(true);
                }
                private void activeC(){
                    this.contactFrame.setVisible(true);
                }
                private void activeL(){
                this.listecontacts.setVisible(true);
                }
                 
                 
                private void desactiveM(){
                this.mainFrame.setVisible(false);
                }
                 
                private void desactiveC(){
                    this.contactFrame.setVisible(false);
                }
                private void desactiveL(){
                this.listecontacts.setVisible(false);
                }
                
                 public void active1(){
                     activeM();
                     desactiveC();
                     desactiveL();
                 }
                 
                 public void active2(){
                     activeC();
                     desactiveM();
                     desactiveL();
                 }
                 
                 public void active3(){
                     activeL();
                     desactiveC();
                     desactiveM();
                 }
    
    
  
      
    public static void main(String[] args){
        
            MainApplication       start= new MainApplication();
            
                                   start.active1();
            
         
              
        }

    }

