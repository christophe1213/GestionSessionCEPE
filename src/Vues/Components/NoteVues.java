
package Vues.Components;
import Backend.Note.NoteManagement;
import Backend.Note.Note;
import Vues.Components.table.TableCustom;
import javax.swing.JOptionPane;
public class NoteVues extends javax.swing.JPanel {
   
    /**
     * Creates new form NoteVues
     */
    private static NoteManagement noteTraitement = new NoteManagement();
    private Note note = new Note();
    private boolean updt=false;
    
    public NoteVues() {
        initComponents();
        initCustom();
    }
    
    public void initCustom(){
        jTable2.setModel(noteTraitement.liste());
        TableCustom.apply(jScrollPane2, TableCustom.TableType.MULTI_LINE);
        //jComboBox1.setModel(noteTraitement.selectionEleve());
        jComboBox2.setModel(noteTraitement.selectionMat());
        Btn_Ajout.setBackground(Asset.theme);
        Btn_Ajout.setForeground(Asset.ColorText);
        Btn_Ajout.setFont(Asset.fontBtn);
        Btn_update.setBackground(Asset.theme);
        Btn_update.setForeground(Asset.ColorText);
        Btn_update.setFont(Asset.fontBtn);
        Btn_update1.setBackground(Asset.theme);
        Btn_update1.setForeground(Asset.ColorText);
        Btn_update1.setFont(Asset.fontBtn);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Btn_update1 = new javax.swing.JButton();
        Btn_update = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Btn_Ajout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jLabel5.setFont(new java.awt.Font("SansSerif", 2, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Géstion de note");

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel2.setOpaque(false);
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        Btn_update1.setBackground(new java.awt.Color(51, 102, 255));
        Btn_update1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Btn_update1.setText("supprimer");
        Btn_update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_update1ActionPerformed(evt);
            }
        });

        Btn_update.setBackground(new java.awt.Color(51, 102, 255));
        Btn_update.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Btn_update.setText("modifier");
        Btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_updateActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Numèro élève");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Numèro Matière");

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item1", "Item2", "Item23" }));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Note ");

        jTextField3.setText("2022-2023");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Année Scolaire");

        Btn_Ajout.setBackground(new java.awt.Color(51, 102, 255));
        Btn_Ajout.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Btn_Ajout.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Ajout.setText("Ajouter");
        Btn_Ajout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AjoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Géstion de note");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Btn_Ajout, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197)
                        .addComponent(Btn_update)
                        .addGap(159, 159, 159)
                        .addComponent(Btn_update1)
                        .addGap(236, 236, 236))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(191, 191, 191)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(jSpinner1))
                .addGap(171, 171, 171))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn_update)
                        .addComponent(Btn_Ajout))
                    .addComponent(Btn_update1))
                .addContainerGap())
        );

        jPanel3.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(150, 403));

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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable2MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        add(jPanel3, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_AjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AjoutActionPerformed
        // TODO add your handling code here:
      if(Integer.parseInt(jSpinner1.getValue().toString())<0||Integer.parseInt(jSpinner1.getValue().toString())>20){
            JOptionPane.showInternalMessageDialog(null, "Le note doit être inferieurou egale a 20 et positive");
      }else{
            
            note.setAllAttribut(jTextField4.getText(), jComboBox2.getSelectedItem().toString()
                    ,jTextField3.getText(),Integer.parseInt(jSpinner1.getValue().toString()));
            
            if(noteTraitement.insertion(note)){
                JOptionPane.showInternalMessageDialog(null, "Insertion réussi");
                jSpinner1.setValue(0);
                jTable2.setModel(noteTraitement.liste());
            }else{
                JOptionPane.showInternalMessageDialog(null, "Echec d'insertion");
            }
      }
    }//GEN-LAST:event_Btn_AjoutActionPerformed

    private void Btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_updateActionPerformed
        // TODO add your handling code here:
        if(updt){
            if(Integer.parseInt(jSpinner1.getValue().toString())<0||Integer.parseInt(jSpinner1.getValue().toString())>20){
                JOptionPane.showInternalMessageDialog(null, "Le note doit être inferieur ou égale a 20 et positive");
            }else{
                    note.setAllAttribut(jTextField4.getText().toString(), jComboBox2.getSelectedItem().toString()
                                    ,jTextField3.getText(),Integer.parseInt(jSpinner1.getValue().toString()));

                  if(noteTraitement.update(note)){
                        JOptionPane.showInternalMessageDialog(null, "Modification réussi");
                        jSpinner1.setValue(0);
                        jTable2.setModel(noteTraitement.liste());
                        updt=true;
                  }else{
                      JOptionPane.showInternalMessageDialog(null, "Echec de modification");
                  }
            }
        }else  JOptionPane.showInternalMessageDialog(null, "Veillez selectionez dans tablea avant de modifier");
    
    }//GEN-LAST:event_Btn_updateActionPerformed

    private void Btn_update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_update1ActionPerformed
        // TODO add your handling code here:
         try{
              int i = jTable2.getSelectedRow();
              note.setAllAttribut(jTable2.getModel().getValueAt(i, 0).toString(), jTable2.getModel().getValueAt(i, 1).toString()
                                ,jTable2.getModel().getValueAt(i, 2).toString(),Integer.parseInt(jTable2.getModel().getValueAt(i,3).toString()));
              int message =  JOptionPane.showConfirmDialog(this, "Vous voulez le supprimer", "confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
              if(message==JOptionPane.YES_OPTION){  
                    if(noteTraitement.delete(note)){
                          JOptionPane.showInternalMessageDialog(null, "Suppréssion  réussi");
                    
                          jTable2.setModel(noteTraitement.liste());
                    }else{
                        JOptionPane.showInternalMessageDialog(null, "Echec de suppréssion");
                    }
               }
              
        }catch(Exception e){
               JOptionPane.showInternalMessageDialog(null, "Veuillez selection le table avant de modifier");   
        }
    }//GEN-LAST:event_Btn_update1ActionPerformed

    private void jTable2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseReleased
        // TODO add your handling code here:
           //Eviter la modification du clé primaire
        updt=true;
        int i = jTable2.getSelectedRow();
              
                //jComboBox1.setSelectedItem(jTable2.getModel().getValueAt(i, 0).toString());
                jTextField4.setText(jTable2.getModel().getValueAt(i, 0).toString());
                jComboBox2.setSelectedItem(jTable2.getModel().getValueAt(i, 1).toString());
               // jComboBox1.setSelectedItem();
               
                System.out.println(jTable2.getModel().getValueAt(i, 1).toString());
                jTextField3.setText(jTable2.getModel().getValueAt(i, 2).toString());
                jSpinner1.setValue(Integer.parseInt(jTable2.getModel().getValueAt(i,3).toString()));
    }//GEN-LAST:event_jTable2MouseReleased

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
           jTable2.setModel(noteTraitement.liste());
    }//GEN-LAST:event_formMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
         jComboBox2.setModel(noteTraitement.selectionMat());
        
    }//GEN-LAST:event_jPanel2MouseClicked
 
    public static void UpdateData(){
       // jComboBox1.setModel(noteTraitement.selectionEleve());
        //jComboBox2.setModel(noteTraitement.selectionMat());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Ajout;
    private javax.swing.JButton Btn_update;
    private javax.swing.JButton Btn_update1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
