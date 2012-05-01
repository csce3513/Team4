/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RebirthofLegends;

import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class GameWorld extends JFrame {

    Monster m = new Monster();
    Hero h;
    Battle b;
    String actual;

    public GameWorld() {
        initComponents();
        makeFrame();
    }

    GameWorld(Hero hero) {
        h = hero;
        initComponents();
        makeFrame();
    }

    public GameWorld(Hero hero, Monster monster) {
        h = hero;
        m = monster;
    }

    public void makeFrame() {

        setSize(600, 400);
        setVisible(true);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout(3, 100));

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameWorld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameWorld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameWorld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameWorld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Hero_Info = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Crystals = new javax.swing.JLabel();
        WeaponLvl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        HP_Wplvl = new javax.swing.JLabel();
        Store = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        DDLabel = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Hero_Info.setBackground(new java.awt.Color(0, 102, 102));
        Hero_Info.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name: " + h.getName()
        );
        //jLabel2.setText("HP: " + h.getHealth());
        Hero_Info.add(jLabel1);
        jLabel1.setBounds(10, 0, 140, 20);

        Crystals.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Crystals.setForeground(new java.awt.Color(255, 255, 255));
        Crystals.setText("Crystals: " + h.getCrystals()
        );
        Hero_Info.add(Crystals);
        Crystals.setBounds(10, 40, 140, 14);

        WeaponLvl.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        WeaponLvl.setForeground(new java.awt.Color(255, 255, 255));
        WeaponLvl.setText("HP: " + h.getHealth());
        Hero_Info.add(WeaponLvl);
        WeaponLvl.setBounds(320, 210, 140, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Current Attack: "+h.weapon.getWpatk());
        Hero_Info.add(jLabel3);
        jLabel3.setBounds(10, 54, 140, 20);

        HP_Wplvl.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        HP_Wplvl.setForeground(new java.awt.Color(255, 255, 255));
        HP_Wplvl.setText("HP: " + h.getHealth()+ "    UpgLevel: " + h.weapon.getUpgrade());
        Hero_Info.add(HP_Wplvl);
        HP_Wplvl.setBounds(10, 20, 130, 16);

        getContentPane().add(Hero_Info);
        Hero_Info.setBounds(360, 10, 160, 80);

        Store.setText("Store");
        Store.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StoreMouseClicked(evt);
            }
        });
        Store.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StoreActionPerformed(evt);
            }
        });
        getContentPane().add(Store);
        Store.setBounds(430, 250, 70, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt_dungeon.jpg"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 40, 200, 150);

        Save.setText("Save Game");
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
        });
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save);
        Save.setBounds(30, 310, 130, 20);

        DDLabel.setBackground(new java.awt.Color(0, 102, 102));
        DDLabel.setForeground(new java.awt.Color(255, 255, 255));
        DDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DDLabel.setText("Click Above to Begin");
        DDLabel.setOpaque(true);
        getContentPane().add(DDLabel);
        DDLabel.setBounds(110, 194, 200, 20);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg01.jpeg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StoreMouseClicked
        // Add code for hp refill here and a message saying hp refilled
        h.heal();
        String output = "You have been restored to " + h.getHealth() + " health";
        JOptionPane.showMessageDialog(null, output);

    }//GEN-LAST:event_StoreMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // Add code for opening up dungeon frame.
        Dungeon d = new Dungeon(h);
        setVisible(false);
        //     d.setVisible(true);

    }//GEN-LAST:event_jButton2MouseClicked

private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
    //save button
    WriteData save = new WriteData();
    try {
        save.openFile();
        save.addRecords(h);
        save.closeFile();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(GameWorld.class.getName()).log(Level.SEVERE, null, ex);
    }

}//GEN-LAST:event_SaveActionPerformed

private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked
// Back Button for going back to the game menu
     Menu f = new Menu();
     dispose();

}//GEN-LAST:event_SaveMouseClicked

    private void StoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StoreActionPerformed
        // Link to store
        Store s = new Store(h);
        dispose();
    }//GEN-LAST:event_StoreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Crystals;
    private javax.swing.JLabel DDLabel;
    private javax.swing.JLabel HP_Wplvl;
    private javax.swing.JPanel Hero_Info;
    private javax.swing.JButton Save;
    private javax.swing.JButton Store;
    private javax.swing.JLabel WeaponLvl;
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
