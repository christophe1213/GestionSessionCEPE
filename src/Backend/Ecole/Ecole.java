
package Backend.Ecole;

/**
 *
 * @author Thierry Christophe
 */
public class Ecole {

    private String numEcole;
    private String design;
    private String adresse;
    
    public Ecole()
    {
        numEcole=" ";
        design=" ";
        adresse=" ";

    }
    public Ecole(String n,String d,String a ){
        numEcole=n;
        design=d;
        adresse=a; 
    }
    
    //Get
    public String getnumEcole(){return numEcole;}
    public String getdesign(){return design;}
    public String getadresse(){return adresse;}
    
    //Set
    public void setNumEcole(String n){numEcole=n;}
    public void setDesign(String d){design=d;}
    public void setAdresse(String a){adresse=a;}
    
}
