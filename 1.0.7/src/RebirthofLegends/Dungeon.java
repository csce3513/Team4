/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RebirthofLegends;

import java.awt.BorderLayout;
import javax.swing.JFrame;



public class Dungeon extends JFrame {
    
    Hero h = new Hero();
  //  Monster m = new Monster();

    public Dungeon(Hero hero /*Monster monster */) {
        
        h = hero;
   //     m = monster;
        initComponents();
        makeFrame();
    }
    
    public Dungeon() {
        initComponents();
        makeFrame();
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
            java.util.logging.Logger.getLogger(Dungeon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dungeon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dungeon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dungeon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        blvl1 = new javax.swing.JButton();
        blvl2 = new javax.swing.JButton();
        blvl3 = new javax.swing.JButton();
        blvl4 = new javax.swing.JButton();
        blvl5 = new javax.swing.JButton();
        blvl6 = new javax.swing.JButton();
        blvlf = new javax.swing.JButton();
        back = new javax.swing.JButton();
        lvl1 = new javax.swing.JLabel();
        lvl2 = new javax.swing.JLabel();
        lvl3 = new javax.swing.JLabel();
        lvl4 = new javax.swing.JLabel();
        lvl5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lvl7 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        blvl1.setText("Level 1");
        blvl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blvl1ActionPerformed(evt);
            }
        });
        getContentPane().add(blvl1);
        blvl1.setBounds(20, 100, 150, 23);

        blvl2.setText("Level 2");
        getContentPane().add(blvl2);
        blvl2.setBounds(220, 100, 140, 23);

        blvl3.setText("Level 3");
        getContentPane().add(blvl3);
        blvl3.setBounds(420, 100, 140, 23);

        blvl4.setText("Level 4");
        getContentPane().add(blvl4);
        blvl4.setBounds(20, 220, 150, 23);

        blvl5.setText("Level 5");
        getContentPane().add(blvl5);
        blvl5.setBounds(220, 220, 140, 23);

        blvl6.setText("Level 6");
        getContentPane().add(blvl6);
        blvl6.setBounds(420, 220, 140, 23);

        blvlf.setText("Final Boss");
        getContentPane().add(blvlf);
        blvlf.setBounds(220, 330, 140, 23);

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(20, 330, 130, 23);

        lvl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_lvl1.jpg"))); // NOI18N
        getContentPane().add(lvl1);
        lvl1.setBounds(20, 10, 150, 113);

        lvl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_lvl2.jpg"))); // NOI18N
        getContentPane().add(lvl2);
        lvl2.setBounds(220, 10, 140, 110);

        lvl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_lvl3.jpg"))); // NOI18N
        getContentPane().add(lvl3);
        lvl3.setBounds(420, 10, 140, 110);

        lvl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_lvl4.jpg"))); // NOI18N
        getContentPane().add(lvl4);
        lvl4.setBounds(20, 140, 150, 100);

        lvl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_lvl5.jpg"))); // NOI18N
        getContentPane().add(lvl5);
        lvl5.setBounds(220, 140, 140, 100);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_lvl6.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(420, 140, 140, 100);

        lvl7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_lvlf.jpg"))); // NOI18N
        getContentPane().add(lvl7);
        lvl7.setBounds(220, 260, 140, 90);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_dung01.jpg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(-10, -20, 640, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void blvl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blvl1ActionPerformed
        // Level 1:
        BattleFrame b = new BattleFrame(h);
        dispose();
       // setVisible(false);
    }//GEN-LAST:event_blvl1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // Back to World button:
        GameWorld g = new GameWorld(h);
        dispose();
    }//GEN-LAST:event_backActionPerformed


       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel bg;
    private javax.swing.JButton blvl1;
    private javax.swing.JButton blvl2;
    private javax.swing.JButton blvl3;
    private javax.swing.JButton blvl4;
    private javax.swing.JButton blvl5;
    private javax.swing.JButton blvl6;
    private javax.swing.JButton blvlf;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lvl1;
    private javax.swing.JLabel lvl2;
    private javax.swing.JLabel lvl3;
    private javax.swing.JLabel lvl4;
    private javax.swing.JLabel lvl5;
    private javax.swing.JLabel lvl7;
    // End of variables declaration//GEN-END:variables
}
