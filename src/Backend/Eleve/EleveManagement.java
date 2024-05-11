/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Eleve;

import Backend.Crud;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thierry Christophe
 */
public class EleveManagement extends Crud 
{
   public  DefaultTableModel liste(){
            //les colones
            String[] colonnes={"num Eleve","Ecole","Nom","Prenom"};
            String[] line={"numeleve","numecole","nom","prenom"};
            return super.liste("select * from eleve;", line,colonnes);
                
    }
    
     public Boolean insertion(Eleve eleve)
     {
          String[] list = {eleve.getNumEleve(),eleve.getNumEcole(),eleve.getNom(),eleve.getPrenom()};
          String query="insert into eleve values (?,?,?,?);";
        
          return super.tableUpdate(query, list);
     }
     public Boolean update(Eleve eleve){
        String[] list = {eleve.getNumEcole(),eleve.getNom(),eleve.getPrenom(),eleve.getNumEleve()};
         String query="update eleve set nom=?,prenom=? where numEcole=? and numeleve=?;";
         return super.tableUpdate(query, list);
     }
     
     public Boolean delete(Eleve eleve){
         String[] list = {eleve.getNumEleve(),eleve.getNumEcole()};
         String query="delete from ecole where numeleve=? and numecole=? ;";
         return super.tableUpdate(query, list);
     }
     public  DefaultTableModel search(String eleve){
           String[] colonnes={"num Eleve","Ecole","Nom","Prenom"};
           String[] line={"numeleve","ecole","nom","prenom"};
           return super.liste("select numeleve,design as Ecole,nom,prenom from eleve,ecole where eleve.numecole=ecole.numecole and eleve.nom="+eleve+" ;", line,colonnes);
                 
     }
}
