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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Home = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        home_desc = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Hero_Info.setBackground(new java.awt.Color(0, 102, 102));
        Hero_Info.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name: " + h.getName() );
        Hero_Info.add(jLabel1);
        jLabel1.setBounds(10, 10, 140, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HP: " + h.getHealth());
        Hero_Info.add(jLabel2);
        jLabel2.setBounds(10, 30, 140, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Crystals: " + h.getCrystals());
        Hero_Info.add(jLabel4);
        jLabel4.setBounds(10, 50, 140, 14);

        getContentPane().add(Hero_Info);
        Hero_Info.setBounds(360, 10, 160, 80);

        Home.setText("Home");
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        getContentPane().add(Home);
        Home.setBounds(390, 260, 140, 20);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt_dungeon.jpg"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 40, 200, 150);

        home_desc.setBackground(new java.awt.Color(0, 102, 102));
        home_desc.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        home_desc.setForeground(new java.awt.Color(255, 255, 255));
        home_desc.setText("Click \"Home\" to fully Heal!");
        home_desc.setOpaque(true);
        getContentPane().add(home_desc);
        home_desc.setBounds(380, 240, 160, 20);

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

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg01.jpeg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // Add code for hp refill here and a message saying hp refilled
        h.heal();
        String output = "You have been restored to " + h.getHealth() + " health";
        JOptionPane.showMessageDialog(null, output);

    }//GEN-LAST:event_HomeMouseClicked

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
    //setVisible(false);
    //  f.setVisible(true);
}//GEN-LAST:event_SaveMouseClicked

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Hero_Info;
    private javax.swing.JButton Home;
    private javax.swing.JButton Save;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel home_desc;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
