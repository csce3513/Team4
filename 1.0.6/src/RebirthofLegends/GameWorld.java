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

  JLabel hero,hero_HP, monster,monster_HP, label;
  JTextField name;
  JButton next,back;
  
  Monster m = new Monster();
  Hero h;
  Battle b ; 
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
    
    public GameWorld(Hero hero, Monster monster){
      h = hero;
      m = monster;
      
  }
    
    
    
    public void makeFrame(){
        
      setSize(600, 400);
      setVisible(true);
      setLocationRelativeTo(null);
  
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setLayout(new BorderLayout(3,100));
      
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Hero_Info.setBackground(new java.awt.Color(51, 153, 255));
        Hero_Info.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Name: " + h.getName() );
        Hero_Info.add(jLabel1);
        jLabel1.setBounds(10, 10, 180, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("HP: " + h.getHealth());
        Hero_Info.add(jLabel2);
        jLabel2.setBounds(10, 30, 190, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Crystals: " + h.getCrystals());
        Hero_Info.add(jLabel4);
        jLabel4.setBounds(10, 50, 190, 14);

        getContentPane().add(Hero_Info);
        Hero_Info.setBounds(360, 10, 160, 80);

        jButton1.setText("Home");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(390, 260, 140, 20);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt_dungeon.jpg"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 40, 200, 150);

        jTextField1.setBackground(new java.awt.Color(51, 153, 255));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jTextField1.setText("Click \"Home\" to fully heal!");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(380, 240, 160, 20);

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
        Save.setBounds(70, 300, 130, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg01.jpeg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // Add code for hp refill here and a message saying hp refilled
        h.heal();
        String output =	"You have been restored to " + h.getHealth() + " health";
        JOptionPane.showMessageDialog(null,output);
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // Add code for opening up dungeon frame.
        Dungeon d = new Dungeon(h);
        setVisible(false);
   //     d.setVisible(true);
        
    }//GEN-LAST:event_jButton2MouseClicked

private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
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
   // Menu f = new Menu();
    //setVisible(false);
  //  f.setVisible(true);
}//GEN-LAST:event_SaveMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Hero_Info;
    private javax.swing.JButton Save;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
