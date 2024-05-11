/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import Backend.Ecole.Ecole;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thierry Christophe
 */
 public class Crud {
    
      protected Connection con;
      protected PreparedStatement ps ;
      
      
      public DefaultTableModel  liste(String q,String l[],String c[])
      {
           // String[] colonnes={"numEcole","design","adresse"};
            String[] line = new String[l.length];
            DefaultTableModel m = new DefaultTableModel(null, c);
             try{
                    con= Connection();
                    Statement statement = con.createStatement();
                    ResultSet resultSet = statement.executeQuery(q);
                    
                        while(resultSet.next()){
                            for(int i=0;i<l.length;i++){
                                line[i]=resultSet.getString(l[i]);
                            }
                 
                         m.addRow(line);
                  }
                    System.out.println("affichage2 d'ecole réussi+");
                    con.close();
    
              } catch (SQLException e) {
                   System.out.println("Échec d'affichagage2 du table d'ecole");
                   e.printStackTrace();
               }
             return m;
      }
    
      public boolean tableUpdate(String q,String l[]){
           Boolean updateTable=false; 

         try{
        
          con=Connection();   
          ps=(PreparedStatement)con.prepareStatement(q);
     
          for(int i=0;i<l.length;i++){
              if(i==0)ps.setString(i+1, l[i]);
              else if(l[i].matches("[+-]?\\d*(\\.\\d+)?")){  
                  System.out.println("C'est un nombre");
                  ps.setInt(i+1, Integer.parseInt(l[i]));
              }else{ 
                  ps.setString(i+1, l[i]);
                  System.out.println("C'est n'est pas nombre (ins2)");
              }
              
          }
          ps.executeUpdate();
          System.out.println("Kaiza aty za");
          updateTable=true;
          con.close();
                
        } catch (SQLException e) {
            System.out.println("Erreur de mise à jour2 d'ecole");
            e.printStackTrace();
        }
         
          return updateTable;
      
          
      }
      public Connection Connection(){
        String url = "jdbc:postgresql://localhost:5432/gestion_session_cepe";
        String utilisateur = "postgres";
        String motDePasse = "azerty";
        Connection connexion = null;
        
        
        try {
            // Tentative de connexion à la base de données
            connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
             System.out.println("connection réussi !");
            
             
        } catch (SQLException e) {
            //si il y a une echec de connection
            System.out.println("Échec de la connexion !");
            e.printStackTrace();
        }
        return connexion;
    }
}
