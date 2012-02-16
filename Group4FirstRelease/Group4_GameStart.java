package Team4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.*;


public class Group4_GameStart  {
        
        public JButton ngButton, cgButton, oButton;
        public JLabel  la;
        
    public static void main(String[] args){
   Group4_GameStart sr = new Group4_GameStart();
    }
    
    public Group4_GameStart() {
     
        JFrame newframe = new JFrame("Rebirth of Legends"); 

        JPanel ha = new JPanel();
        
        ngButton = new JButton("New Game");
        cgButton = new JButton("Continue");
        oButton = new JButton("Options");
        la = new JLabel("No Button Clicked!");

        ha.add(ngButton);
        ha.add(cgButton);
        ha.add(oButton);
        ha.add(la);
        
        ngButton.addActionListener(new action());
       oButton.addActionListener(new Test());
       cgButton.addActionListener(new Test());
    
 

    
    newframe.add(ha, BorderLayout.CENTER);
    newframe.add(la, BorderLayout.NORTH);
    newframe.setSize(600, 400);
    newframe.setVisible(true);
    newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
    }
  public class action implements ActionListener{
        @Override
  public void actionPerformed(ActionEvent e){
 
  Group4_NewCharacter sr = new Group4_NewCharacter();
  }
  }
  // test if continue and options buttom work
   public class Test implements ActionListener{
        @Override
  public void actionPerformed(ActionEvent e){
 
  la.setText(e.getActionCommand()+ " button clicked!");
  }
  }
        
            
        }
    


