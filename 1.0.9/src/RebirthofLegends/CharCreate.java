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

        bg_avatar = new javax.swing.JLabel();
        ele_desc = new javax.swing.JLabel();
        Char_Name = new javax.swing.JTextField();
        Back_Menu = new javax.swing.JButton();
        Create = new javax.swing.JButton();
        M_button = new javax.swing.JButton();
        F_button = new javax.swing.JButton();
        Elements = new javax.swing.JComboBox();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        bg_avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/H_01.jpg"))); // NOI18N
        getContentPane().add(bg_avatar);
        bg_avatar.setBounds(90, 90, 180, 190);

        ele_desc.setBackground(new java.awt.Color(253, 228, 207));
        ele_desc.setFont(new java.awt.Font("Times New Roman", 1, 14));
        ele_desc.setText("Choose your Element");
        ele_desc.setOpaque(true);
        getContentPane().add(ele_desc);
        ele_desc.setBounds(360, 160, 140, 17);

        Char_Name.setText("Character Name");
        Char_Name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Char_NameMouseClicked(evt);
            }
        });
        Char_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Char_NameActionPerformed(evt);
            }
        });
        Char_Name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Char_NameFocusGained(evt);
            }
        });
        Char_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Char_NameKeyTyped(evt);
            }
        });
        getContentPane().add(Char_Name);
        Char_Name.setBounds(80, 30, 190, 30);

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

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgchar.jpg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Char_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Char_NameActionPerformed
    }//GEN-LAST:event_Char_NameActionPerformed

    private void CreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateMouseClicked
        // Create Button:
        h = new Hero(100, Char_Name.getText(), getElement(), getGender());
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

    private void Char_NameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Char_NameMouseClicked
        // Clear text on char name:
        Char_Name.setText("");
    }//GEN-LAST:event_Char_NameMouseClicked

private void Char_NameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Char_NameFocusGained
// TODO add your handling code here:
}//GEN-LAST:event_Char_NameFocusGained

private void Char_NameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Char_NameKeyTyped
// TODO add your handling code here:
}//GEN-LAST:event_Char_NameKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Menu;
    private javax.swing.JTextField Char_Name;
    private javax.swing.JButton Create;
    private javax.swing.JComboBox Elements;
    private javax.swing.JButton F_button;
    private javax.swing.JButton M_button;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bg_avatar;
    private javax.swing.JLabel ele_desc;
    // End of variables declaration//GEN-END:variables
}
