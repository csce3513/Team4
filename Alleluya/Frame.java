package Team4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame{
  JLabel hero,hero_HP, monster,monster_HP, label;
  JTextField name;
  JButton next,back;

  private Group4_NewCharacter f;
  String[] wordList = { "tom", "alley", "scot","richard","jack","xu","harvey","alleluya","iradukunda", "alvie","men","software","engineering","team","awesome"};

  Monster m = new Monster();
  Hero h;
  Battle b ; 
  
  
  public Frame(){ 
     
  f = new Group4_NewCharacter();
  h = new Hero(100,f.getName(),f.getElement(),f.getGender());
  
  f.setVisible(false);
  

  
  setSize(600, 400);
  setVisible(true);
  setLocationRelativeTo(null);
  setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  setLayout(new BorderLayout(3,100));
  
  name = new JTextField("Type that word");
  name.setBounds(250, 100, 100, 100);
  
  String write_me = "Please type the word: " + "  " + actualWord() + "  ";
  label = new JLabel(write_me);
  
   
  String hero_name = "Hero's" + " health";
  
  hero = new JLabel(hero_name);
 
  
  monster = new JLabel("Monster's health");
  
  String Hp = " " + h.getHealth() + " "; 
  String HP = " " + m.getHealth() + " "; 

  hero_HP = new JLabel(Hp);
  monster_HP = new JLabel(HP);
  next = new JButton("NEXT");
  back = new JButton("Back");
  
  JPanel p1 = new JPanel(new GridLayout(2,2));
  p1.add(hero);
  p1.add(monster);
  p1.add(hero_HP);
  p1.add(monster_HP);
  
  
  JPanel p2 = new JPanel(new FlowLayout());
  p2.add(label);
  p2.add(name);
  
  
  
  JPanel p3 = new JPanel(new GridLayout(1,2));
  p3.add(back);
  p3.add(next);
  
  next.addActionListener(new Next());
  back.addActionListener(new Back());
  name.addActionListener(new HEL()); 
 
  
 
  add(p1,BorderLayout.NORTH);
  add(p2,BorderLayout.CENTER);
  add(p3,BorderLayout.SOUTH);
 
  
  
  }
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
    public class Next implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {
            setVisible(false);
            
        }
    }
     public class Back implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {
            f.setVisible(true);
            setVisible(false);
        }
    }
     public String getTypedWord(){
         
    return name.getText().toLowerCase();
}
  
     public class HEL implements ActionListener{
         public void actionPerformed(ActionEvent e)
         {
        Battle b = new Battle(getTypedWord());
        setVisible(false);
       
    	
    	
    	
         }
     }
     public int getIndex()
    {
        return (int)(Math.random()*15);
    }
    
    public String actualWord(){
    	return wordList[getIndex()];
    }
     
}