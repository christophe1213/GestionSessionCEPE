/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Note;

import Backend.Crud;
import Backend.Ecole.Ecole;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thierry Christophe
 */
public class NoteManagement extends Crud {
   
      public  DefaultTableModel liste(){
            //les colones
            String[] colonnes={"num Elève","numéro matiere","anné scolaire","note"};
            String[] line={"numeleve","nummat","annescolaire","note"};
            return super.liste("SELECT * FROM eleve order by numeleve ASC  ;", line,colonnes);
                
    }
    
     public Boolean insertion(Note note){
          String[] list = {note.getNummeleve(),note.getNummat(),note.getAnneScolaire(),String.valueOf(note.getNote())};
          String query="insert into note values (?,?,?,?);";   
          return super.tableUpdate(query, list);
     }
     public Boolean update(Note note){
         String[] list = {note.getNummeleve(),note.getNummat(),note.getAnneScolaire(),String.valueOf(note.getNote())};
         String query="update note set annescolaire=?,note=? where numeleve=? and nummat=?;";
         return super.tableUpdate(query, list);
     }
     
     public Boolean delete(Note note){
         String[] list = {note.getNummeleve(),note.getNummat()};
         String query="delete from note where numeleve=? and nummat=?;";
         return super.tableUpdate(query, list);
     }
    
}
