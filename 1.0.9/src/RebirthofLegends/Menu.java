/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RebirthofLegends;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author txu
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        makeFrame();
    }

    public void makeFrame() {


        ReadData heroRead = new ReadData();
        setTitle("Rebirth of Legends");
        setSize(600, 400);
        setVisible(true);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout(3, 100));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        New_Game = new javax.swing.JButton();
        Continue = new javax.swing.JButton();
        bg_main = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rebirth of Legends");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        New_Game.setText("New Game");
        New_Game.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                New_GameMouseClicked(evt);
            }
        });
        getContentPane().add(New_Game);
        New_Game.setBounds(250, 210, 130, 23);

        Continue.setText("Continue");
        Continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueActionPerformed(evt);
            }
        });
        getContentPane().add(Continue);
        Continue.setBounds(250, 250, 130, 23);

        bg_main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgmain.jpg"))); // NOI18N
        getContentPane().add(bg_main);
        bg_main.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void New_GameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_New_GameMouseClicked
// New Game Button
    CharCreate c = new CharCreate();
    //  setVisible(false);
    dispose();
}//GEN-LAST:event_New_GameMouseClicked

    private void ContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueActionPerformed
        Hero h = new Hero();
        ReadData heroRead = new ReadData();
        heroRead.openfile();
        h = heroRead.readRecords();
        heroRead.closefile();
        GameWorld g = new GameWorld(h);
        dispose();
    }//GEN-LAST:event_ContinueActionPerformed

private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
// TODO add your handling code here:
}//GEN-LAST:event_formWindowGainedFocus

    public static void main(String args[]) {

        Menu m = new Menu();
        //   m.setVisible(true);

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Continue;
    private javax.swing.JButton New_Game;
    private javax.swing.JLabel bg_main;
    // End of variables declaration//GEN-END:variables
}
