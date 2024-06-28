
package Vues;
import Backend.Routeur;
import javax.swing.JPanel;


public class App extends javax.swing.JPanel {
    private static Routeur route = new Routeur();    
    public App() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu1 = new Vues.Components.Menu();
        jPanel1 = new javax.swing.JPanel();
        resultatVues1 = new Vues.Components.ResultatVues();

        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setPreferredSize(new java.awt.Dimension(1024, 720));
        setLayout(new java.awt.BorderLayout());
        add(menu1, java.awt.BorderLayout.LINE_START);

        jPanel1.setLayout(new java.awt.CardLayout());
        jPanel1.add(resultatVues1, "card2");

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
//Système de routage
    public static void  Route(String m, JPanel[] child){
        route.Routage(jPanel1, m, child);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel jPanel1;
    private Vues.Components.Menu menu1;
    private Vues.Components.ResultatVues resultatVues1;
    // End of variables declaration//GEN-END:variables
}
