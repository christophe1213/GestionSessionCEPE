
package Backend.Ecole;

/**
 *
 * @author Thierry Christophe
 */
public class Ecole {

    private String numEcole;
    private String design;
    private String adresse;
    
    public Ecole(String n, String d, String a )
    {
        numEcole=n;
        design=d;
        adresse=a;     
    }
    public String getnumEcole(){return numEcole;}
    public String getdesign(){return design;}
    public String getadresse(){return adresse;}
}
