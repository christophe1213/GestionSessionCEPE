

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vues;

/**
 *
 * @author Thierry Christophe
 */
public class MainVues extends javax.swing.JPanel {

    /**
     * Creates new form MainVues
     */
    public MainVues() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eleveVues1 = new Vues.EleveVues();
        Menu = new javax.swing.JPanel();
        ecoleVues1 = new Vues.EcoleVues();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListMenu = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        Contener = new javax.swing.JPanel();
        Parent = new javax.swing.JPanel();
        matiereVues1 = new Vues.MatiereVues();
        noteVues1 = new Vues.NoteVues();
        resultatVues1 = new Vues.ResultatVues();

        setBackground(new java.awt.Color(153, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(7, 43, 188));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("CEPE");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Géstion séssion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        ListMenu.setBackground(new java.awt.Color(102, 102, 102));
        ListMenu.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Resultat", "Eleve", "Ecole", "Matiere", "Note" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ListMenuMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(ListMenu);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ecoleVues1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addComponent(ecoleVues1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 5, 193, -1));

        jPanel1.setBackground(new java.awt.Color(39, 39, 39));
        jPanel1.setLayout(new java.awt.CardLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 266, -1, -1));

        Contener.setBackground(new java.awt.Color(255, 255, 255));
        Contener.setLayout(new java.awt.BorderLayout());
        add(Contener, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 266, -1, -1));

        Parent.setBackground(new java.awt.Color(255, 255, 255));
        Parent.setLayout(new java.awt.CardLayout());
        Parent.add(matiereVues1, "card4");
        Parent.add(noteVues1, "card5");
        Parent.add(resultatVues1, "card6");

        add(Parent, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 5, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ListMenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListMenuMouseReleased
        // TODO add your handling code here:
        System.out.println(ListMenu.getSelectedValue());
        Parent.removeAll();
        System.out.println("Bouton roube appyeé");
        if(ListMenu.getSelectedValue()=="Resultat"){
       
        Parent.add(resultatVues1);
   
        }else if(ListMenu.getSelectedValue()=="Eleve"){
    
            Parent.add(eleveVues1);
          
        }else if(ListMenu.getSelectedValue()=="Ecole")Parent.add(ecoleVues1);
        else if (ListMenu.getSelectedValue()=="Matiere")Parent.add(matiereVues1);
        else Parent.add(noteVues1);
            
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_ListMenuMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contener;
    private javax.swing.JList<String> ListMenu;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Parent;
    private Vues.EcoleVues ecoleVues1;
    private Vues.EleveVues eleveVues1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private Vues.MatiereVues matiereVues1;
    private Vues.NoteVues noteVues1;
    private Vues.ResultatVues resultatVues1;
    // End of variables declaration//GEN-END:variables
}