package Team4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Group4_NewCharacter{
  JLabel label, lab;
  JButton close;
  JFrame frame;
  public Group4_NewCharacter(){
  frame = new JFrame("New Character selection");
  JRadioButton fire = new JRadioButton("Fire");
  JRadioButton water = new JRadioButton("Water");
  JRadioButton wind = new JRadioButton("Wind");
  JRadioButton earth = new JRadioButton("Earth");
  JRadioButton female = new JRadioButton("Female");
  JRadioButton male = new JRadioButton("Male");
  close = new JButton("Close");
 
  
  JPanel panel = new JPanel();
  
  panel.add(fire);
  panel.add(water);
  panel.add(wind);
  panel.add(earth);
  panel.add(female);
  panel.add(male);
  panel.add(close);
  
  ButtonGroup bg = new ButtonGroup();
  bg.add(fire);
  bg.add(water);
  bg.add(wind);
  bg.add(earth);
  
  fire.addActionListener(new MyTest());
  wind.addActionListener(new MyTest());
  water.addActionListener(new MyTest());
  earth.addActionListener(new MyTest());
  
  ButtonGroup gender = new ButtonGroup();
  gender.add(male);
  gender.add(female);
  
  male.addActionListener(new MTest());
  female.addActionListener(new MTest());
  
  close.addActionListener(new Closed(frame));
  
  
  
  label = new JLabel("no element Selected");
  lab = new JLabel("no gender selected!");
  
  frame.add(panel, BorderLayout.NORTH);
  frame.add(label, BorderLayout.CENTER);
  frame.add(lab,BorderLayout.EAST);
  frame.setSize(600, 400);
  frame.setVisible(true);
  frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  }
// test NewCharacter creation
  public class MyTest implements ActionListener{
        @Override
  public void actionPerformed(ActionEvent e){
  label.setText(e.getActionCommand() + " button selected!");
  
  }
  }
   public class MTest implements ActionListener{
        @Override
  public void actionPerformed(ActionEvent e){
  lab.setText(e.getActionCommand() + " button selected!");
  
  }
  }
   
   // close the second frame
    public class Closed implements ActionListener{
        private final JFrame frame;
  Closed(JFrame frame){
      this.frame = frame;
  }
        @Override
  public void actionPerformed(ActionEvent e)
  {
     
  frame.dispose(); 
  
  }
  }
}