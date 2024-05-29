/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Matiere;

/**
 *
 * @author Thierry Christophe
 */
public class Matiere {
    
    private String nummat;
    private String designmat;
    private int coef;
    
    public Matiere(){
        nummat="";
        designmat="";
        coef=0;
    }
    public Matiere(String n, String d, int c){
        nummat=n;
        designmat=d;
        coef=c;  
    }
    
    //Get
    public String getNummat(){return nummat;}
    public String getDesign(){return designmat;}
    public int getCoef(){return coef;}
    
    //Set
    public void setNummat(String n){nummat=n;}
    public void setDesignmat(String d){designmat=d;}
    public void setCoef(int c){coef=c;}
    
    public void setAllAttribut(String n, String d, int c){
        nummat=n;
        designmat=d;
        coef=c;    
    }
}
