
package Backend;

import javax.swing.JPanel;
public class Routeur {
    
  
    public void Routage(JPanel parent, String r,JPanel[] menu){
        
         if(r!=" "){
            
            switch(r){
                case "Résultat":
                    Route(parent,menu[0]);  
                    break;
                case "Eleves":
                     Route(parent,menu[1]);  
                    break;
                case "Ecole":
                    Route(parent,menu[2]);  
                    break;
                case "Matière":
                    Route(parent,menu[3]);  
                    break;
                case "Note":
                    Route(parent,menu[4]);  
                    break;
                default :
                    System.out.println("fd");
                    break;
           }        
        
        
    }
    }
    public void Route(JPanel parent,JPanel content){
        parent.removeAll();
        parent.add(content);
        parent.repaint();
        parent.revalidate();
 
    }
}
