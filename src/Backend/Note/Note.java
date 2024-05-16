/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Note;

/**
 *
 * @author Thierry Christophe
 */
public class Note {
    private String nummat;
    private String numeleve;
    private String anneScolaire;
    private int note;
    
    public Note(String nElev,String nMat, String annSco,int n){
        
        numeleve=nElev;
        nummat=nMat;
        anneScolaire=annSco;
        note=n;
    }
    
    public String getNummat(){return nummat;}
    public String getNummeleve(){return numeleve;}
    public String getAnneScolaire(){return  anneScolaire;}
    public int getNote(){return note;}
}
