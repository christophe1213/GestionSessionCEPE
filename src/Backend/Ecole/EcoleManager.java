
package Backend.Ecole;

import Backend.Crud;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class EcoleManager extends Crud {
        
      
      public  DefaultTableModel liste(){
            //les colones
            String[] colonnes={"num Ecole","design","adresse"};
            String[] line={"numEcole","design","adresse"};
            return super.liste("SELECT * FROM ecole order by ecole ASC  ;", line,colonnes);
                
    }
    
     public Boolean insertion(Ecole ecole)
     {
          
           String query="insert into ecole values (?,?,?);";
           ArrayList<Object> ecoleTraite = new ArrayList<>();
          
           ecoleTraite.add(ecole.getnumEcole());
           ecoleTraite.add(ecole.getdesign());
           ecoleTraite.add(ecole.getadresse());
           return super.tableUpdate(query, ecoleTraite);
        
          
     }
     public Boolean update(Ecole ecole){
            String[] list = {ecole.getdesign(),ecole.getadresse(),ecole.getnumEcole()};
            String query="update ecole set design=?,adresse=? where numEcole=?;";
            ArrayList<Object> ecoleTraite = new ArrayList<>();
          
            ecoleTraite.add(ecole.getdesign());
            ecoleTraite.add(ecole.getadresse());
            ecoleTraite.add(ecole.getnumEcole());
            return super.tableUpdate(query, ecoleTraite);
     }
     
     public Boolean delete(Ecole ecole){
            String[] list = {ecole.getnumEcole()};
            String query="delete from ecole where numecole=?;";
            ArrayList<Object> ecoleTraite = new ArrayList<>();
            ecoleTraite.add(ecole.getnumEcole());
            return super.tableUpdate(query, ecoleTraite);
     }
}
