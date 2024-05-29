package Vues.Components;

import Backend.Routeur;
import Backend.Eleve.EleveManagement;
import Backend.Eleve.Eleve;
import Vues.Components.table.TableCustom;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
import Vues.Components.NoteVues;
public class EleveVues extends javax.swing.JPanel {

    private static EleveManagement eleveTraitement  = new EleveManagement();
    private Routeur route                    = new Routeur();
    private Eleve eleve                      = new Eleve();
    public EleveVues() {
        initComponents();
        init();
    }
    //Initialisation personnalisé
    private void init(){
        jTable2.setModel(eleveTraitement.liste());
        TableCustom.apply(jScrollPane2, TableCustom.TableType.MULTI_LINE);
        jComboBox_numecole.setModel(eleveTraitement.selection());
        route.Route(this, jPanel1);
        search();
        NoteVues.l();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_numeleve = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_prenom = new javax.swing.JTextField();
        jTextField_nom = new javax.swing.JTextField();
        jComboBox_numecole = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton_back = new javax.swing.JButton();
        jButton_action = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        input_search = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Insertion d'Eleve");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Numèro élève");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Num école");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nom");

        jComboBox_numecole.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_numecole.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jComboBox_numecole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item1", "Item2", "Item23" }));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Prénom");

        jButton_back.setBackground(new java.awt.Color(51, 102, 255));
        jButton_back.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton_back.setText("Retour");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        jButton_action.setBackground(new java.awt.Color(51, 102, 255));
        jButton_action.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton_action.setText("Ajouter");
        jButton_action.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_back)
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_numeleve, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox_numecole, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jButton_action, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(505, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_back))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_numeleve, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_numecole, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(166, 166, 166)
                .addComponent(jButton_action, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(319, Short.MAX_VALUE))
        );

        add(jPanel2, "card4");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel5.setFont(new java.awt.Font("SansSerif", 2, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Liste d'Eleve");

        jButton5.setBackground(new java.awt.Color(51, 102, 255));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Modifier");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 102, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("supprimer");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        input_search.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                input_searchCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                input_searchInputMethodTextChanged(evt);
            }
        });
        input_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_searchActionPerformed(evt);
            }
        });
        input_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_searchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                input_searchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_searchKeyTyped(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(51, 102, 255));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Recherche");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(input_search, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(35, 35, 35)
                .addComponent(jButton6)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5)
                    .addComponent(jButton1)
                    .addComponent(input_search, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
        );

        add(jPanel1, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        route.Route(this, jPanel2);
        jButton_action.setText("Ajouter");
        jLabel1.setText("Insertion du nouveau  éleve");
        jTextField_numeleve.setEditable(true);
        jComboBox_numecole.setEnabled(true);
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        // TODO add your handling code here:
          route.Route(this, jPanel1);
          jTable2.setModel(eleveTraitement.liste());
         
    }//GEN-LAST:event_jButton_backActionPerformed

    private void jButton_actionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actionActionPerformed
        // TODO add your handling code here:
        //Eleve eleve = new Eleve(jTextField1.getText(),jComboBox1.getSelectedItem().toString(),jTextField2.getText(),jTextField3.getText());
        eleve.setNumEleve(jTextField_numeleve.getText());
        eleve.setNumEcole(jComboBox_numecole.getSelectedItem().toString());
        eleve.setNom(jTextField_nom.getText());
        eleve.setPrenom(jTextField_prenom.getText());
        
        if(jButton_action.getText()=="Ajouter"){
            if(eleveTraitement.insertion(eleve)){
                JOptionPane.showInternalMessageDialog(null, "Insertion réussi");
                jTextField_numeleve.setText("");
                jTextField_prenom.setText("");
                jTextField_nom.setText("");
                route.Route(this, jPanel1);
                jTable2.setModel(eleveTraitement.liste());
                NoteVues.UpdateData();
                
            }else{
                JOptionPane.showInternalMessageDialog(null, "Vérifier votre donné inserer");
            }
        }else if(jButton_action.getText()=="Modifier"){

            if(eleveTraitement.update(eleve)){
                JOptionPane.showInternalMessageDialog(null, "Modificiation  réussi");
                jTextField_numeleve.setText("");
                jTextField_prenom.setText("");
                jTextField_nom.setText("");
                route.Route(this, jPanel1);
                jTable2.setModel(eleveTraitement.liste());
                NoteVues.UpdateData();
            }else {
                JOptionPane.showInternalMessageDialog(null, "Echec de modificiation");
            }
            
        }

    }//GEN-LAST:event_jButton_actionActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            int i = jTable2.getSelectedRow();
            jTextField_numeleve.setText(jTable2.getModel().getValueAt(i, 0).toString());
            jTextField_numeleve.setEditable(false);
            jComboBox_numecole.setSelectedItem(jTable2.getModel().getValueAt(i, 1).toString());
            jComboBox_numecole.setEnabled(false);
            jTextField_nom.setText(jTable2.getModel().getValueAt(i, 2).toString());
            jTextField_prenom.setText(jTable2.getModel().getValueAt(i, 3).toString());
            route.Route(this, jPanel2);
            jButton_action.setText("Modifier");
            jLabel1.setText("Modfication du l'eleve");
        }catch(Exception e){
            JOptionPane.showMessageDialog(jButton1, " Veuillez selection avant de modfifier ");
        }      
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try{
            int i = jTable2.getSelectedRow();
            eleve.setNumEleve(jTable2.getModel().getValueAt(i, 0).toString());
            eleve.setNumEcole(jTable2.getModel().getValueAt(i, 1).toString());
            eleve.setNom(jTable2.getModel().getValueAt(i, 2).toString());
            eleve.setPrenom(jTable2.getModel().getValueAt(i, 3).toString());
            int message =  JOptionPane.showConfirmDialog(this, "Vous voulez le supprimer", "confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
            if(message==JOptionPane.YES_OPTION){  
                
                if(eleveTraitement.delete(eleve)){
                    JOptionPane.showInternalMessageDialog(null, "suppression réussi");
                    jTable2.setModel(eleveTraitement.liste());
                    NoteVues.UpdateData();
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this," Veuillez selection avant de supprimer ");
        }
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        System.out.println(input_search.getText());
          jTable2.setModel(eleveTraitement.search(input_search.getText()));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void input_searchInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_input_searchInputMethodTextChanged
        // TODO add your handling code here:
        System.out.println(input_search.getText());
        jTable2.setModel(eleveTraitement.search(input_search.getText()));
    }//GEN-LAST:event_input_searchInputMethodTextChanged

    private void input_searchCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_input_searchCaretPositionChanged
        // TODO add your handling code here:
       ;
    }//GEN-LAST:event_input_searchCaretPositionChanged

    private void input_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_searchKeyPressed
        // TODO add your handling code here:
       // System.out.print("fdf");
      //  System.out.println(input_search.getText());
       // System.out.println(input_search.getText());
    }//GEN-LAST:event_input_searchKeyPressed

    private void input_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_searchKeyReleased
        // TODO add your handling code here:
        
       // System.out.println(jTextField4.getText());
    }//GEN-LAST:event_input_searchKeyReleased

    private void input_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_searchKeyTyped
        // TODO add your handling code here:
        // System.out.println(jTextField4.getText());
    }//GEN-LAST:event_input_searchKeyTyped

    private void input_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_searchActionPerformed
        // TODO add your handling code here:
        System.out.println(input_search.getText());
    }//GEN-LAST:event_input_searchActionPerformed

    public void search(){
        
        
          input_search.getDocument().addDocumentListener(new DocumentListener() {
           @Override
           public void insertUpdate(DocumentEvent e) {
               jTable2.setModel(eleveTraitement.search(input_search.getText()));
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
               jTable2.setModel(eleveTraitement.search(input_search.getText()));
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
              jTable2.setModel(eleveTraitement.search(input_search.getText()));
            }
        });
    }
    public static void updateData(){
       jComboBox_numecole.setModel(eleveTraitement.selection());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField input_search;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton_action;
    private javax.swing.JButton jButton_back;
    private static javax.swing.JComboBox<String> jComboBox_numecole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField_nom;
    private javax.swing.JTextField jTextField_numeleve;
    private javax.swing.JTextField jTextField_prenom;
    // End of variables declaration//GEN-END:variables
}
