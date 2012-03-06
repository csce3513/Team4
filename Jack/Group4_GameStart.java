package Team4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.*;


public class Group4_GameStart extends JFrame {
        
        public JButton ngButton, cgButton, oButton;
      
        
    public static void main(String[] args){
   Group4_GameStart newframe = new Group4_GameStart();
   newframe.setTitle("Rebirth of Legends");
    newframe.setSize(600, 400);
    newframe.setVisible(true);
    newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public Group4_GameStart() {

        JPanel ha = new JPanel();
        
        ngButton = new JButton("New Game");
        cgButton = new JButton("Continue");
        oButton = new JButton("Options");
        
        ha.setLayout(new GridLayout(3,1,0,0));
        ha.add(ngButton);
        ha.add(cgButton);
        ha.add(oButton);
        
        
        ngButton.addActionListener(new action());
        
               add(ha);
  
    }
  public class action implements ActionListener{
        @Override
  public void actionPerformed(ActionEvent e){
 
  Group4_NewCharacter sr = new Group4_NewCharacter();
  setVisible(false);
  }
  }
  
        
            
        }
    


