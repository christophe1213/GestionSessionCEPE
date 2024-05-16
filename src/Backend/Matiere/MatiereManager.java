/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Matiere;

import Backend.Crud;
import Backend.Ecole.Ecole;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 *
 * @author Thierry Christophe
 */
public class MatiereManager extends Crud {
    
   
     public  DefaultTableModel liste(){
            //les colones
            String[] colonnes={"num Matière","design","coef"};
            String[] line={"nummat","designmat","coef"};
            return super.liste("SELECT * FROM matiere order by nummat ASC  ;", line,colonnes);
           // return f;    
    }
     
      public Boolean insertion(Matiere matiere){
        
          String query="insert into matiere values (?,?,?);";
        
           ArrayList<Object> matiereTraite = new ArrayList<>();
           matiereTraite.add(matiere.getNummat());
           matiereTraite.add(matiere.getDesign());
           matiereTraite.add(matiere.getCoef());
          return super.tableUpdate(query, matiereTraite);
     }
      
      public Boolean update(Matiere matiere){
        
           String query="update matiere set designmat=?,coef=? where nummat=?;";
           ArrayList<Object> matiereTraite = new ArrayList<>();
           matiereTraite.add(matiere.getDesign());
           matiereTraite.add(matiere.getCoef());
           matiereTraite.add(matiere.getNummat());
          return super.tableUpdate(query, matiereTraite);
     }
     
     public Boolean delete(Matiere matiere){
          
            String query="delete from matiere where nummat=?;";
            ArrayList<Object> matiereTraite = new ArrayList<>();
        
            matiereTraite.add(matiere.getNummat());
            return super.tableUpdate(query, matiereTraite);
     }

}
