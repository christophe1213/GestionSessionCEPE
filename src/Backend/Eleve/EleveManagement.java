/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Eleve;

import Backend.Crud;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

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
            ArrayList<Object> eleveTraite = new ArrayList<>();
            eleveTraite.add(eleve.getNumEleve());
            eleveTraite.add(eleve.getNumEcole());
            eleveTraite.add(eleve.getNom());
            eleveTraite.add(eleve.getPrenom());
          return super.tableUpdate(query, eleveTraite);
     }
     public Boolean update(Eleve eleve){
         
            String query="update eleve set nom=?,prenom=? where numEcole=? and numeleve=?;";
            ArrayList<Object> eleveTraite = new ArrayList<>();
            eleveTraite.add(eleve.getNom());
            eleveTraite.add(eleve.getPrenom());
            eleveTraite.add(eleve.getNumEcole());
            eleveTraite.add(eleve.getNumEleve());
         return super.tableUpdate(query, eleveTraite);
     }
     
     public Boolean delete(Eleve eleve){
            String query="delete from eleve where numeleve=? and numecole=? ;";
            ArrayList<Object> eleveTraite = new ArrayList<>();
      
            eleveTraite.add(eleve.getNumEleve());
            eleveTraite.add(eleve.getNumEcole());
         return super.tableUpdate(query, eleveTraite);
     }
     public  DefaultTableModel search(String eleve){
           String[] colonnes={"num Eleve","Ecole","Nom","Prenom"};
           String[] line={"numeleve","ecole","nom","prenom"};
           return super.liste("select numeleve,design as Ecole,nom,prenom from eleve,ecole where eleve.numecole=ecole.numecole and eleve.nom LIKE'%"+eleve+"%' ;", line,colonnes);
                 
     }
     public DefaultTableModel Resultat(){
            String[] colonnes={"num Eleve","moyenne"};
            String[] line={"numeleve","moyenne"};
            String query="select numeleve ,sum(coef*note)/sum(coef) as Moyenne from note, matiere where note.nummat=matiere.nummat  group by numeleve;";
        return super.liste(query, line, colonnes);
     }
}
