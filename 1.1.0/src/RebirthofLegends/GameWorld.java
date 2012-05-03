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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        name = new javax.swing.JLabel();
        Crystals = new javax.swing.JLabel();
        WeaponLvl = new javax.swing.JLabel();
        atk = new javax.swing.JLabel();
        HP_Wplvl = new javax.swing.JLabel();
        Store = new javax.swing.JButton();
        DDoor = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        DDLabel = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jDesktopPane1.setBackground(new java.awt.Color(0, 102, 102));
        jDesktopPane1.setForeground(new java.awt.Color(0, 102, 102));

        name.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Name: " + h.getName()
        );
        //jLabel2.setText("HP: " + h.getHealth());
        name.setBounds(10, 10, 120, 14);
        jDesktopPane1.add(name, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Crystals.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Crystals.setForeground(new java.awt.Color(255, 255, 255));
        Crystals.setText("Crystals: " + h.getCrystals()
        );
        Crystals.setBounds(10, 90, 120, 14);
        jDesktopPane1.add(Crystals, javax.swing.JLayeredPane.DEFAULT_LAYER);

        WeaponLvl.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        WeaponLvl.setForeground(new java.awt.Color(255, 255, 255));
        WeaponLvl.setText("Weapon Level: " + h.weapon.getUpgrade());
        WeaponLvl.setBounds(10, 50, 120, 14);
        jDesktopPane1.add(WeaponLvl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        atk.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        atk.setForeground(new java.awt.Color(255, 255, 255));
        atk.setText("Current Attack: "+h.weapon.getWpatk());
        atk.setBounds(10, 70, 120, 14);
        jDesktopPane1.add(atk, javax.swing.JLayeredPane.DEFAULT_LAYER);

        HP_Wplvl.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        HP_Wplvl.setForeground(new java.awt.Color(255, 255, 255));
        HP_Wplvl.setText("HP: " + h.getHealth());
        HP_Wplvl.setBounds(10, 30, 120, 14);
        jDesktopPane1.add(HP_Wplvl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(420, 20, 140, 110);

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
        Store.setBounds(440, 290, 110, 30);

        DDoor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt_dungeon.jpg"))); // NOI18N
        DDoor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DDoorMouseClicked(evt);
            }
        });
        getContentPane().add(DDoor);
        DDoor.setBounds(140, 60, 200, 150);

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
        DDLabel.setBounds(140, 210, 200, 20);

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

    private void DDoorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DDoorMouseClicked
        // Add code for opening up dungeon frame.
        Dungeon d = new Dungeon(h);
        setVisible(false);
        //     d.setVisible(true);

    }//GEN-LAST:event_DDoorMouseClicked

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
    private javax.swing.JButton DDoor;
    private javax.swing.JLabel HP_Wplvl;
    private javax.swing.JButton Save;
    private javax.swing.JButton Store;
    private javax.swing.JLabel WeaponLvl;
    private javax.swing.JLabel atk;
    private javax.swing.JLabel bg;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
