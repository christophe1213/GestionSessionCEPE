/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Eleve;

/**
 *
 * @author Thierry Christophe
 */
public class Eleve {
    private String numeleve;
    private String numecole;
    private String nom;
    private String prenom;
    
    public Eleve(String nElev,String nEcole, String n,String p){
    
        numeleve=nElev;
        numecole=nEcole;
        nom=n;
        prenom=p;
    
    }
    public String getNumEleve(){return numeleve;}
    public String getNumEcole(){ return numecole;}
    public String getNom(){return nom;}
    public String getPrenom(){return prenom;}
    
}
