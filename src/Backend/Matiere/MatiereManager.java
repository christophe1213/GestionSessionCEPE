/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Matiere;

import Backend.Crud;
import Backend.Ecole.Ecole;
import javax.swing.table.DefaultTableModel;

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
                
    }
     
      public Boolean insertion(Matiere matiere){
        // String[] list = new String[3];
         
          String[] list = {matiere.getNummat(),matiere.getDesign(),String.valueOf(matiere.getCoef())};
          String query="insert into matiere values (?,?,?);";
        
          return super.tableUpdate(query, list);
     }
      
      public Boolean update(Matiere matiere){
         String[] list = {matiere.getDesign(),String.valueOf(matiere.getCoef()),matiere.getNummat()};
         String query="update matiere set designmat=?,coef=? where nummat=?;";
         return super.tableUpdate(query, list);
     }
     
     public Boolean delete(Matiere matiere){
         String[] list = {matiere.getNummat()};
         String query="delete from matiere where nummat=?;";
         return super.tableUpdate(query, list);
     }

}
