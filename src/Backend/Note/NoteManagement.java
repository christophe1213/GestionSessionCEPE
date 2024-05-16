/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Note;

import Backend.Crud;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 *
 * @author Thierry Christophe
 */
public class NoteManagement extends Crud {
   
      public  DefaultTableModel liste(){
            //les colones
            String[] colonnes={"num Elève","numéro matiere","anné scolaire","note"};
            String[] line={"numeleve","nummat","annescolaire","note"};
            return super.liste("SELECT * FROM note  ;", line,colonnes);
                
    }
    
     public Boolean insertion(Note note){
      
            String query="insert into note values (?,?,?,?);";   
            ArrayList<Object> noteTraitement = new ArrayList<>();
            
          
            noteTraitement.add(note.getNummeleve());
            noteTraitement.add(note.getNummat());
            noteTraitement.add(note.getAnneScolaire());
            noteTraitement.add(note.getNote());
          
            return super.tableUpdate(query, noteTraitement);
         
     }
     public Boolean update(Note note){
            
            String query="update note set annescolaire=?,note=? where numeleve=? and nummat=?;";
            ArrayList<Object> noteTraitement = new ArrayList<>();
            noteTraitement.add(note.getAnneScolaire());
            noteTraitement.add(note.getNote());
            noteTraitement.add(note.getNummeleve());
            noteTraitement.add(note.getNummat());
            return super.tableUpdate(query, noteTraitement);
        
     }
     
     public Boolean delete(Note note){
     
            String query="delete from note where numeleve=? and nummat=?;";
            ArrayList<Object> noteTraitement = new ArrayList<>();
            noteTraitement.add(note.getNummeleve());
            noteTraitement.add(note.getNummat());
            return super.tableUpdate(query, noteTraitement);
        
     }
    
}
