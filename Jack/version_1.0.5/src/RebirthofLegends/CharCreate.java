/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RebirthofLegends;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Infected
 */
public class CharCreate extends javax.swing.JFrame {

    //  JTextField nameField;
    String ge, el, name;
    //   Menu f;
    Hero h;

    public CharCreate() {
        initComponents();
        makeFrame();
        //  f = new Menu();
        h = new Hero();
        ge = "Male";
        el = "Fire";

    }

    public void makeFrame() {
        setTitle("New Character selection");
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
            java.util.logging.Logger.getLogger(CharCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CharCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CharCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CharCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public void setName(String n) {
        name = n;
    }

    public void setGender(String g) {
        ge = g;
    }

    public void setElement(String e) {
        el = e;
    }

    public String getName() {
        return name;
    }

    public String getElement() {
        return el;
    }

    public String getGender() {
        return ge;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Back_Menu = new javax.swing.JButton();
        Create = new javax.swing.JButton();
        M_button = new javax.swing.JButton();
        F_button = new javax.swing.JButton();
        Elements = new javax.swing.JComboBox();
        Element_Desc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/H_01.jpg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(90, 90, 180, 190);

        jTextField1.setText("Character Name");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(80, 30, 190, 30);

        Back_Menu.setText("Back to Menu");
        Back_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back_MenuMouseClicked(evt);
            }
        });
        getContentPane().add(Back_Menu);
        Back_Menu.setBounds(40, 320, 120, 30);

        Create.setText("Create");
        Create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateMouseClicked(evt);
            }
        });
        getContentPane().add(Create);
        Create.setBounds(450, 320, 100, 30);

        M_button.setBackground(new java.awt.Color(0, 153, 204));
        M_button.setText("Male");
        M_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(M_button);
        M_button.setBounds(340, 90, 80, 40);

        F_button.setBackground(new java.awt.Color(255, 153, 153));
        F_button.setText("Female");
        F_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(F_button);
        F_button.setBounds(450, 90, 80, 40);

        Elements.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fire", "Wind", "Water", "Earth" }));
        Elements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElementsActionPerformed(evt);
            }
        });
        getContentPane().add(Elements);
        Elements.setBounds(370, 180, 110, 20);

        Element_Desc.setBackground(new java.awt.Color(255, 255, 102));
        Element_Desc.setText("Choose Your Element");
        getContentPane().add(Element_Desc);
        Element_Desc.setBounds(360, 150, 140, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgchar.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void CreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateMouseClicked
        // Create Button:
        h = new Hero(100, jTextField1.getText(), getElement(), getGender());
        GameWorld g = new GameWorld(h);
        dispose();
    }//GEN-LAST:event_CreateMouseClicked

    private void Back_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_MenuMouseClicked
        // Back to Menu Button
        Menu m = new Menu();
        dispose();
    }//GEN-LAST:event_Back_MenuMouseClicked

    private void ElementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElementsActionPerformed
        // Elements drop list:
        int a = Elements.getSelectedIndex();

        setElement((String) Elements.getItemAt(a));

    }//GEN-LAST:event_ElementsActionPerformed

    private void M_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_buttonMouseClicked
        // Male button:
        setGender("Male");
    }//GEN-LAST:event_M_buttonMouseClicked

    private void F_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F_buttonMouseClicked
        // Female Button:
        setGender("Female");
    }//GEN-LAST:event_F_buttonMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Menu;
    private javax.swing.JButton Create;
    private javax.swing.JTextField Element_Desc;
    private javax.swing.JComboBox Elements;
    private javax.swing.JButton F_button;
    private javax.swing.JButton M_button;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
