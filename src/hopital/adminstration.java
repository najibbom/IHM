/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hopital;

/*
Bibliotheque extern
*/
import mdlaf.*;
import mdlaf.animation.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import mdlaf.utils.MaterialColors;

/**
 *
 * @author najibboubrim
 */
public class adminstration extends javax.swing.JFrame {
    
    // Declarations des variables globales
    DefaultTableModel dm; 

    /**
     * Creates new form administration
     */
    public adminstration() {
        initComponents();
        
        // Creation des colonnes
        creerColonnes();
        
    }
    
    private void creerColonnes() {
        // Get table model
        dm = (DefaultTableModel) jTable1.getModel();
        
        // Ajouter les colonnes
        dm.addColumn("Nom");
        dm.addColumn("Prenom");
        dm.addColumn("Age");
        dm.addColumn("Poste");
        dm.addColumn("Heurs de travail");        
    }
    
    // Population du tableau
    private void ajouterInfo(String nom, String prenom, String age, String poste, String hrs ) {
        // Tableau pour l'ajout des informations
        String[] tab = {nom, prenom, age, poste, hrs};
        dm.addRow(tab);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(320, 80, 450, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hopital/icons8-hospital_2.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(850, 440, 90, 90);

        jLabel3.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gestion des Employées");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(360, 40, 420, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hopital/testtt.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(480, 0, 600, 140);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(720, 150, 10, 490);

        jButton1.setText("Editer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(830, 160, 97, 29);

        jButton2.setText("Insérer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(740, 160, 87, 29);

        jButton3.setText("Supprimer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(940, 160, 108, 29);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hopital/testtt.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 140);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(960, 190, 70, 12);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(750, 190, 70, 12);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(840, 190, 80, 12);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 160, 710, 480);

        jLabel5.setFont(new java.awt.Font("Lato", 1, 13)); // NOI18N
        jLabel5.setText("Heurs de travail:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(740, 350, 110, 16);

        jLabel6.setFont(new java.awt.Font("Lato", 1, 13)); // NOI18N
        jLabel6.setText("Nom: ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(740, 230, 45, 16);

        jLabel7.setFont(new java.awt.Font("Lato", 1, 13)); // NOI18N
        jLabel7.setText("Prenom:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(740, 260, 60, 16);

        jLabel8.setFont(new java.awt.Font("Lato", 1, 13)); // NOI18N
        jLabel8.setText("Age:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(740, 290, 45, 16);

        jLabel9.setFont(new java.awt.Font("Lato", 1, 13)); // NOI18N
        jLabel9.setText("Poste : ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(740, 320, 45, 16);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(860, 216, 180, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(860, 250, 180, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(860, 280, 180, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(860, 310, 180, 30);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(860, 340, 180, 26);
        jPanel1.add(jSeparator6);
        jSeparator6.setBounds(770, 400, 260, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Button Editer:
        MaterialUIMovement.add(jButton1, MaterialColors.TEAL_A100);
        
        dm.setValueAt(jTextField1.getText(), jTable1.getSelectedRow(), 0);
        dm.setValueAt(jTextField2.getText(), jTable1.getSelectedRow(), 1);
        dm.setValueAt(jTextField3.getText(), jTable1.getSelectedRow(), 2);
        dm.setValueAt(jTextField4.getText(), jTable1.getSelectedRow(), 3);
        dm.setValueAt(jTextField5.getText(), jTable1.getSelectedRow(), 4);
        
         // Pour tout effacer
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Button insrer:
        MaterialUIMovement.add(jButton2, MaterialColors.TEAL_A100);
        
        ajouterInfo(jTextField1.getText() , jTextField2.getText() , jTextField3.getText() , jTextField4.getText() , jTextField5.getText());
        
        // Pour tout effacer
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Button Supprimer:
        MaterialUIMovement.add(jButton3, MaterialColors.RED_100);
        
        dm.removeRow(jTable1.getSelectedRow());
        
        // Pour tout effacer
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         // TODO add your handling code here:
        jTextField1.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        jTextField2.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jTextField3.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        jTextField4.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        jTextField5.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
                try {
		UIManager.setLookAndFeel (new MaterialLookAndFeel ());
		}
		catch (UnsupportedLookAndFeelException e) {
		e.printStackTrace ();
		}
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminstration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminstration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminstration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminstration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminstration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
