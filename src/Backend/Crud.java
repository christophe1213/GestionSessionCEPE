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
import java.util.ArrayList;

/**
 *
 * @author Thierry Christophe
 */
 public class Crud {
    
      protected  Connection con ;
      protected  PreparedStatement ps ;
      private String url = "jdbc:postgresql://localhost:5432/gestion_session_cepe";
      private String utilisateur = "postgres";
      private String motDePasse = "azerty";
      
      
      public  DefaultTableModel  liste(String q,String l[],String c[])
      {
            String[] line = new String[l.length];
            DefaultTableModel m = new DefaultTableModel(null, c);
  
             try{
            
                    con = DriverManager.getConnection(url, utilisateur, motDePasse);
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
    
      public Boolean tableUpdate(String q,ArrayList<Object>o){
         
             Boolean update=false;
                       
            try{
              
                //con=Connection();
                con = DriverManager.getConnection(url, utilisateur, motDePasse);
                ps=(PreparedStatement)con.prepareStatement(q);
     
             
               
                for(int i=0;i<o.size();i++){
                        Object element = o.get(i);
                        if(element instanceof String){
                            System.out.println(element+" est une chaine de caractère");
                            String elt= (String) element;    
                            ps.setString(i+1, elt);
                        }else if(element instanceof Integer){
                            int eltInt = (int) element;
                           System.out.println(element+" est une entier");
                           ps.setInt(i+1, eltInt);
                       }else {
                            System.out.println(element+" est une  Type inconue");
                        }
                    }
                 ps.executeUpdate();
                update=true;
                con.close();
                 
              
           } catch (SQLException e) {
                    System.out.println("Erreur de mise à jour2 d'elve");
                    e.printStackTrace();
        }
          return update;
      }
  
      
}
