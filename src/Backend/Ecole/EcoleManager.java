
package Backend.Ecole;

import Backend.Crud;
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
          String[] list = {ecole.getnumEcole(),ecole.getdesign(),ecole.getadresse()};
          String query="insert into ecole values (?,?,?);";
        
          return super.tableUpdate(query, list);
     }
     public Boolean update(Ecole ecole){
         String[] list = {ecole.getdesign(),ecole.getadresse(),ecole.getnumEcole()};
         String query="update ecole set design=?,adresse=? where numEcole=?;";
         return super.tableUpdate(query, list);
     }
     
     public Boolean delete(Ecole ecole){
         String[] list = {ecole.getnumEcole()};
         String query="delete from ecole where numecole=?;";
         return super.tableUpdate(query, list);
     }
}
