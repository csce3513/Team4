package RebirthofLegends;

import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Store extends javax.swing.JFrame {

    Hero h;

    public Store() {
        initComponents();
        makeFrame();
    }

    Store(Hero hero) {
        h = hero;
        initComponents();
        makeFrame();
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
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Upg_wp = new javax.swing.JButton();
        Upg_HP = new javax.swing.JButton();
        back = new javax.swing.JButton();
        Heal = new javax.swing.JButton();
        UpgradeLabel = new javax.swing.JLabel();
        BuyHPLabel = new javax.swing.JLabel();
        HealLabel = new javax.swing.JLabel();
        bg_store = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Upg_wp.setText("Upgrade Weapon");
        Upg_wp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Upg_wpActionPerformed(evt);
            }
        });
        getContentPane().add(Upg_wp);
        Upg_wp.setBounds(230, 80, 140, 30);

        Upg_HP.setText("Buy Health");
        Upg_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Upg_HPActionPerformed(evt);
            }
        });
        getContentPane().add(Upg_HP);
        Upg_HP.setBounds(230, 160, 140, 30);

        back.setText("Back to World");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(70, 300, 120, 30);

        Heal.setText("Heal");
        Heal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HealActionPerformed(evt);
            }
        });
        getContentPane().add(Heal);
        Heal.setBounds(230, 230, 140, 30);

        UpgradeLabel.setForeground(new java.awt.Color(140, 96, 26));
        UpgradeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UpgradeLabel.setText("You need "+h.weapon.cToUpg()+" crystals to upgrade");
        UpgradeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UpgradeLabel.setOpaque(true);
        getContentPane().add(UpgradeLabel);
        UpgradeLabel.setBounds(210, 60, 190, 14);

        BuyHPLabel.setForeground(new java.awt.Color(140, 96, 26));
        BuyHPLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BuyHPLabel.setText("Buy 20 Health for 10 Crystals");
        BuyHPLabel.setOpaque(true);
        getContentPane().add(BuyHPLabel);
        BuyHPLabel.setBounds(210, 140, 190, 14);

        HealLabel.setForeground(new java.awt.Color(140, 96, 26));
        HealLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HealLabel.setText("Fully Heal for 1 Crystal!");
        HealLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HealLabel.setOpaque(true);
        getContentPane().add(HealLabel);
        HealLabel.setBounds(210, 210, 190, 14);

        bg_store.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_store.jpg"))); // NOI18N
        getContentPane().add(bg_store);
        bg_store.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
// Back to Game World button
    GameWorld g = new GameWorld(h);
    dispose();


}//GEN-LAST:event_backActionPerformed

private void HealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HealActionPerformed
// Heal button:
    if(h.maxHealth == h.health){
        String output = "You are at full health and do not need to heal";
        JOptionPane.showMessageDialog(null, output);
    }
    else if (h.getCrystals() > 0) {
        h.heal();
        h.takemymoney(1);
        String output = "You have been healed back to full health! ";
        JOptionPane.showMessageDialog(null, output);
    } else {
        String output = "You aint got no dough =( ";
        JOptionPane.showMessageDialog(null, output);
    }
    Store s = new Store(h);
        dispose();

}//GEN-LAST:event_HealActionPerformed

private void Upg_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Upg_HPActionPerformed
// Buy HP button:
    if (h.getCrystals() >= 10) {
        h.takemymoney(10);
        h.incMaxHP();
        String output = "You have " + h.getCrystals() + " Left";
        JOptionPane.showMessageDialog(null, output);
    } else {
        String output = "You aint got no dough =( ";
        JOptionPane.showMessageDialog(null, output);
    }
    Store s = new Store(h);
        dispose();
}//GEN-LAST:event_Upg_HPActionPerformed

private void Upg_wpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Upg_wpActionPerformed
// Weapon Upgrade Button:
    if (h.getCrystals() >= h.weapon.cToUpg()) {
        h.takemymoney(h.weapon.cToUpg());
        h.weapon.upgrade();
        String output = "You have " + h.getCrystals() + " Crystals Left ";
        JOptionPane.showMessageDialog(null, output);
    } else {
        String output = "You aint got no dough =( ";
        JOptionPane.showMessageDialog(null, output);
    }
    Store s = new Store(h);
        dispose();
}//GEN-LAST:event_Upg_wpActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BuyHPLabel;
    private javax.swing.JButton Heal;
    private javax.swing.JLabel HealLabel;
    private javax.swing.JButton Upg_HP;
    private javax.swing.JButton Upg_wp;
    private javax.swing.JLabel UpgradeLabel;
    private javax.swing.JButton back;
    private javax.swing.JLabel bg_store;
    // End of variables declaration//GEN-END:variables
}
