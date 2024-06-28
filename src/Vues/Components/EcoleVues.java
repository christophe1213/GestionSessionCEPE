
package Vues.Components;

import Backend.Routeur;
import Backend.Ecole.EcoleManager;
import Backend.Ecole.Ecole;
//VUES
import Vues.Components.table.TableCustom;
import Vues.Components.EleveVues;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EcoleVues extends javax.swing.JPanel {

    private EcoleManager ecoleTraitement = new EcoleManager();
    private Ecole ecole = new Ecole();
    private Routeur route = new Routeur();
    public static DefaultComboBoxModel<String> model = new DefaultComboBoxModel();
    public EcoleVues() {
        initComponents();
        init();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_ecole = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_ajout = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel_upddate = new javax.swing.JPanel();
        jLabel_action = new javax.swing.JLabel();
        jLabel_numecole = new javax.swing.JLabel();
        jLabel_design = new javax.swing.JLabel();
        jLabel_adresse = new javax.swing.JLabel();
        jTextField_numecole = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField_adresse = new javax.swing.JTextField();
        jTextField_design = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        jPanel_ecole.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_ecole.setPreferredSize(new java.awt.Dimension(720, 420));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btn_ajout.setBackground(new java.awt.Color(51, 102, 255));
        btn_ajout.setText("Ajouter");
        btn_ajout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ajoutActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(51, 102, 255));
        btn_update.setText("Modifier");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(51, 102, 255));
        btn_delete.setText("Supprimer");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 2, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Liste d'Ecole");

        javax.swing.GroupLayout jPanel_ecoleLayout = new javax.swing.GroupLayout(jPanel_ecole);
        jPanel_ecole.setLayout(jPanel_ecoleLayout);
        jPanel_ecoleLayout.setHorizontalGroup(
            jPanel_ecoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ecoleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_ecoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ecoleLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ecoleLayout.createSequentialGroup()
                        .addComponent(btn_ajout)
                        .addGap(30, 30, 30)
                        .addComponent(btn_update)
                        .addGap(56, 56, 56)
                        .addComponent(btn_delete)
                        .addGap(36, 36, 36))))
        );
        jPanel_ecoleLayout.setVerticalGroup(
            jPanel_ecoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ecoleLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel_ecoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ajout)
                    .addComponent(btn_update)
                    .addComponent(btn_delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel_ecole, "card2");

        jPanel_upddate.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_upddate.setPreferredSize(new java.awt.Dimension(720, 420));

        jLabel_action.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_action.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel_action.setText("Insertion de nouveau école");

        jLabel_numecole.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_numecole.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel_numecole.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_numecole.setText("numméro ecole");

        jLabel_design.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_design.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel_design.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_design.setText("Design");

        jLabel_adresse.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_adresse.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel_adresse.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_adresse.setText("Adresse");

        jButton2.setBackground(new java.awt.Color(51, 102, 255));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setText("Ajouter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 102, 255));
        jButton4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton4.setText("Retour");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_upddateLayout = new javax.swing.GroupLayout(jPanel_upddate);
        jPanel_upddate.setLayout(jPanel_upddateLayout);
        jPanel_upddateLayout.setHorizontalGroup(
            jPanel_upddateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_upddateLayout.createSequentialGroup()
                .addGroup(jPanel_upddateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_upddateLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel_upddateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_numecole)
                            .addComponent(jLabel_design)
                            .addComponent(jLabel_adresse))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel_upddateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_design, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_numecole, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_upddateLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)
                        .addGap(165, 165, 165)
                        .addComponent(jLabel_action, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_upddateLayout.setVerticalGroup(
            jPanel_upddateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_upddateLayout.createSequentialGroup()
                .addGroup(jPanel_upddateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_upddateLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel_action, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_upddateLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton4)))
                .addGap(26, 26, 26)
                .addGroup(jPanel_upddateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_numecole, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_numecole, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel_upddateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_upddateLayout.createSequentialGroup()
                        .addComponent(jLabel_design, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_upddateLayout.createSequentialGroup()
                        .addComponent(jTextField_design, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 384, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        add(jPanel_upddate, "card3");
    }// </editor-fold>//GEN-END:initComponents
    //Initialisation
    public void init(){
        jTable1.setModel(ecoleTraitement.liste());
        TableCustom.apply(jScrollPane1, TableCustom.TableType.MULTI_LINE);
        btn_ajout.setBackground(Asset.theme);
        btn_ajout.setFont(Asset.fontBtn);
        btn_ajout.setForeground(Asset.ColorText);
        btn_delete.setBackground(Asset.theme);
        btn_delete.setFont(Asset.fontBtn);
        btn_delete.setForeground(Asset.ColorText);
        btn_update.setBackground(Asset.theme);
        btn_update.setFont(Asset.fontBtn);
        btn_update.setForeground(Asset.ColorText);
        jButton2.setBackground(Asset.theme);
        jButton2.setFont(Asset.fontBtn);
        jButton2.setForeground(Asset.ColorText);
        jButton4.setBackground(Asset.theme);
        jButton4.setForeground(Asset.ColorText);
        jButton4.setFont(Asset.fontBtn);
        
    }
    private void btn_ajoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ajoutActionPerformed
        // TODO add your handling code here:
        //Préparation pour le panel  updtate en panel d'insertion
        jTextField_numecole.setText("");
        jTextField_adresse.setText("");
        jTextField_design.setText("");
        jButton2.setText("Ajouter");
        
        jLabel_action.setText("Insertion école");
        jTextField_numecole.setEditable(true);
        route.Route(this, jPanel_upddate);
    }//GEN-LAST:event_btn_ajoutActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Creation du ecole
        
            
             ecole.setNumEcole(jTextField_numecole.getText());
             ecole.setDesign(jTextField_design.getText());
             ecole.setAdresse(jTextField_adresse.getText());
                     //Action si on fait une insertion
            if(jButton2.getText()=="Ajouter"){
                if(ecoleTraitement.insertion(ecole)){
                        JOptionPane.showInternalMessageDialog(null, "Insertion réussi");
                        jTextField_numecole.setText("");
                        jTextField_adresse.setText("");
                        jTextField_design.setText("");
                        route.Route(this, jPanel_ecole);
                        jTable1.setModel(ecoleTraitement.liste());
                        EleveVues.updateData();
               }else{
                  JOptionPane.showInternalMessageDialog(null, "Vérifier votre donné inserer"); 
               }
        //Action si on fait une modification
            }else if(jButton2.getText()=="Modifier"){
                jTextField_numecole.setEditable(false);
                if(ecoleTraitement.update(ecole)){
                        JOptionPane.showInternalMessageDialog(null, "Modificiation  réussi");
                        jTextField_numecole.setText("");
                        jTextField_adresse.setText("");
                        jTextField_design.setText("");    
                        route.Route(this, jPanel_ecole);
                        jTable1.setModel(ecoleTraitement.liste());
                        EleveVues.updateData();
                }else {
                        JOptionPane.showInternalMessageDialog(null, "Echec de modificiation");
            }
        }
          
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        // TODO add your handling code here    
    }//GEN-LAST:event_jTable1MouseReleased

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code her
        try{
            
            jButton2.setText("Modifier");
            jLabel_action.setText("Modification d'une ecole");
            int i = jTable1.getSelectedRow();
            jTextField_numecole.setText(jTable1.getModel().getValueAt(i, 0).toString());
            jTextField_numecole.setEditable(false);
            jTextField_design.setText(jTable1.getModel().getValueAt(i, 1).toString());
            jTextField_adresse.setText(jTable1.getModel().getValueAt(i, 2).toString());
            route.Route(this,jPanel_upddate);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Veuillez selectioner avant modifier");
            System.out.println(e);
        }
      
       
    }//GEN-LAST:event_btn_updateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        route.Route(this,jPanel_ecole);
        jTable1.setModel(ecoleTraitement.liste());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
      //Utilisation exception si il une erreur
      try{
            //MESSAGE DE CONFIRMATION
            int i = jTable1.getSelectedRow();
              
            int message =  JOptionPane.showConfirmDialog(this, "Vous voulez le supprimer", "confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            //si le message est oui 
            if(message==JOptionPane.YES_OPTION){
                //Récupération des information
                ecole.setNumEcole(jTable1.getModel().getValueAt(i, 0).toString());
                ecole.setDesign(jTable1.getModel().getValueAt(i, 1).toString());
                ecole.setAdresse(jTable1.getModel().getValueAt(i, 2).toString());
                if(ecoleTraitement.delete(ecole)){
                        JOptionPane.showInternalMessageDialog(null, "Supprésion  réussi");
                        jTable1.setModel(ecoleTraitement.liste());
               }else{
                  JOptionPane.showInternalMessageDialog(null, "Echec de suppresion");
               }  
                
            }
      
      }catch(Exception e){
           JOptionPane.showInternalMessageDialog(null, "Veuillez selectionner avant de supprimer");
      }    
        
    }//GEN-LAST:event_btn_deleteActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ajout;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_action;
    private javax.swing.JLabel jLabel_adresse;
    private javax.swing.JLabel jLabel_design;
    private javax.swing.JLabel jLabel_numecole;
    private javax.swing.JPanel jPanel_ecole;
    private javax.swing.JPanel jPanel_upddate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_adresse;
    private javax.swing.JTextField jTextField_design;
    private javax.swing.JTextField jTextField_numecole;
    // End of variables declaration//GEN-END:variables
}
