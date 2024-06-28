
package Backend.Eleve;

import Backend.Crud;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


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
            return super.liste("select * from eleve order by nom asc;", line,colonnes);
                
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
     public DefaultComboBoxModel selection(){
            String[] line={"numEcole"};
            String query="SELECT numecole from ecole order by numecole ASC;";
            return super.selection(query, line); 
      }
     public  DefaultTableModel search(String eleve){
           String[] colonnes={"num Eleve","Ecole","Nom","Prenom"};
           String[] line={"numeleve","ecole","nom","prenom"};
           System.out.println("fdf");
           return super.liste("select * from eleve where nom ILIKE '%"+eleve+"%' or prenom ILIKE '%"+eleve+"%'  ;", line,colonnes);
                 
     }
     public DefaultTableModel Resultat(){
            String[] colonnes={"num Eleve","Nom","Prénom","ecole","moyenne"};
            String[] line={"numeleve","nom","prenom","design","moyenne"};
            String query="select eleve.numeleve,eleve.nom,eleve.prenom,ecole.design, TO_CHAR(SUM(coef * note) / SUM(coef)::float, 'FM999999990.00') as Moyenne from note,matiere,eleve,ecole where "
                    + "   eleve.numeleve=note.numeleve and matiere.nummat=note.nummat and eleve.numecole = ecole.numecole "
                    + "   group by note.numeleve,eleve.numeleve,eleve.nom,eleve.prenom,ecole.design having sum(coef*note)/sum(coef)::float>9.75 order by Moyenne desc;";
            
            return super.liste(query, line, colonnes);
     }
     public DefaultTableModel EleveEchec(){
          String[] colonnes={"num Eleve","Nom","Prénom","ecole","moyenne"};
          String[] line={"numeleve","nom","prenom","design","moyenne"};
          String query="select eleve.numeleve,eleve.nom,eleve.prenom,ecole.design, TO_CHAR(SUM(coef * note) / SUM(coef)::float, 'FM999999990.00') as Moyenne from note,matiere,eleve,ecole where "
                    + "   eleve.numeleve=note.numeleve and matiere.nummat=note.nummat and eleve.numecole = ecole.numecole "
                    + "   group by note.numeleve,eleve.numeleve,eleve.nom,eleve.prenom,ecole.design having sum(coef*note)/sum(coef)::float<9.75 order by Moyenne desc;";
          return super.liste(query, line, colonnes);
     }
     public DefaultTableModel EleveSucces6eme(){
          String[] colonnes={"num Eleve","Nom","Prénom","ecole","moyenne"};
          String[] line={"numeleve","nom","prenom","design","moyenne"};
          String query="select eleve.numeleve,eleve.nom,eleve.prenom,ecole.design, TO_CHAR(SUM(coef * note) / SUM(coef)::float, 'FM999999990.00') as Moyenne from note,matiere,eleve,ecole where "
                    + "   eleve.numeleve=note.numeleve and matiere.nummat=note.nummat and eleve.numecole = ecole.numecole  "
                    + "   group by note.numeleve,eleve.numeleve,eleve.nom,eleve.prenom,ecole.design having sum(coef*note)/sum(coef)::float>12 order by Moyenne desc;";
          return super.liste(query, line, colonnes);
     }
     public void pdfNOte(String n,String p){
         
       Document document = new Document();
       String querry="select annescolaire,nom,prenom,design as ecole from eleve,ecole,note where"
               + " note.numeleve=eleve.numeleve and ecole.numecole=eleve.numecole and eleve.numeleve='"+n+"' limit 1 ";
        try {
            System.out.println("Creating PDF...");
            PdfWriter.getInstance(document, new FileOutputStream(p+".pdf"));
            document.open();
            document.add(new Paragraph("Relevet de note \n."));
            
              try{
            
                    con = DriverManager.getConnection(url, utilisateur, motDePasse);
                    Statement statement = con.createStatement();
                    ResultSet resultSet = statement.executeQuery(querry);
                    //Présentation
                    while(resultSet.next()){
                      
                       document.add(new Paragraph("Anne scolaire:"+resultSet.getString(1)));
                       document.add(new Paragraph("Nom:"+resultSet.getString(2)));
                       document.add(new Paragraph("Prenom:"+resultSet.getString(3)));
                       document.add(new Paragraph("Ecole:"+resultSet.getString(4)));
                         
                    }
                    
                    document.add(new Paragraph("\n \n."));
                    String[] t = {"Matiere","Coefficient","note","note ponderé"};
                    querry="select designmat,coef,note,(note*coef) as note from matiere,note where note.nummat=matiere.nummat and note.numeleve ='"+n+"'";
                    con = DriverManager.getConnection(url, utilisateur, motDePasse);
                    statement = con.createStatement();
                    resultSet = statement.executeQuery(querry);
                    //Titre du tableau
                    PdfPTable table = new PdfPTable(4);
                    for(int i=0;i<t.length;i++){
                        
                        PdfPCell cell = new PdfPCell(new Paragraph(t[i]));
                        table.addCell(cell);
                    }
                    while(resultSet.next()){
                   
                      for(int i = 0;i<t.length;i++){
                            PdfPCell cell = new PdfPCell(new Paragraph(resultSet.getString(i+1)));
                            table.addCell(cell); 
                      }
   
                    }
                    
                    document.add(table);
                    PdfPTable tableNote = new PdfPTable(2);
                    querry="select sum(note*coef) as total,TO_CHAR(SUM(coef * note) / SUM(coef)::float, 'FM999999990.00') as moyenne from matiere,note where"
                            + " matiere.nummat=note.nummat and note.numeleve='"+n+"';";     
                    con = DriverManager.getConnection(url, utilisateur, motDePasse);
                    statement = con.createStatement();
                    resultSet = statement.executeQuery(querry);
                    System.out.println("Insertion du tableau de note");
                      while(resultSet.next()){
                   
             
                        tableNote.addCell(new PdfPCell(new Paragraph("Total")));
                        tableNote.addCell(new PdfPCell(new Paragraph(resultSet.getString(1))));
                        tableNote.addCell(new PdfPCell(new Paragraph("Moyenne")));
                        tableNote.addCell(new PdfPCell(new Paragraph(resultSet.getString(2))));
                      
                    }
                    document.add(tableNote);
                    con.close();
                    
                    // con.close();
    
              } catch (SQLException e) {
                   System.out.println("Erreur");
                   e.printStackTrace();
              }
             
           
            System.out.println("PDF created successfully.");
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (document.isOpen()) {
                document.close();
                System.out.println("Document closed.");
            }
        }
     }
}
