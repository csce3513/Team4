package Team4;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Group4_NewCharacter extends JFrame{
 
  JTextField nameField;
  String ge,el,name; 
  Group4_GameStart f; 
  Hero h;
 
  
  public Group4_NewCharacter(){
      
  setTitle("New Character selection");
   f = new Group4_GameStart();
   h = new Hero();
   f.setSize(600,400);
  setLayout(new BorderLayout());
  
  JRadioButton fire = new JRadioButton("Fire");
  JRadioButton water = new JRadioButton("Water");
  JRadioButton wind = new JRadioButton("Wind");
  JRadioButton earth = new JRadioButton("Earth");
  JRadioButton female = new JRadioButton("Female");
  JRadioButton male = new JRadioButton("Male");
  nameField = new JTextField("Enter your name");
  nameField.setBounds(250, 100, 100, 100);
  JButton next = new JButton("NEXT");
  JButton back = new JButton("BACK");
  
  JPanel p1 = new JPanel();
  p1.add(nameField);
  
  JPanel p2 = new JPanel(new GridLayout(4,1));
  p2.add(fire);
  p2.add(water);
  p2.add(wind);
  p2.add(earth);
  
  JPanel p3 = new JPanel(new GridLayout(2,1));
  p3.add(female);
  p3.add(male);
 
  JPanel p4 = new JPanel(new FlowLayout());
  p4.add(p2);
  p4.add(p3);
  JPanel p5 = new JPanel(new GridLayout(1,2));
  p5.add(back);
  p5.add(next);
  
  ButtonGroup bg = new ButtonGroup();
  bg.add(fire);
  bg.add(water);
  bg.add(wind);
  bg.add(earth);
  
  
  fire.addActionListener(new Element());
  fire.setBounds(250,120,100,30);
  wind.addActionListener(new Element());
  water.addActionListener(new Element());
  earth.addActionListener(new Element());
  
  ButtonGroup gender = new ButtonGroup();
  gender.add(male);
  gender.add(female);
  
  male.addActionListener(new Gender());
  female.addActionListener(new Gender());
  
  next.addActionListener(new Next());
  back.addActionListener(new Back());
  add(p1, BorderLayout.NORTH);
  add(p4, BorderLayout.CENTER);
  add(p5,BorderLayout.SOUTH);

  
  setSize(400, 250);
  setVisible(true);
  setLocationRelativeTo(null);
  setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
    
    public void setName(String n){
        name = n;
    }
    
    public void setGender(String g){
        ge = g;
    }
    
    public void setElement(String e){
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
    public class Next implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {
            Frame f = new Frame();
        
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
     public class Gender implements ActionListener{
         public void actionPerformed(ActionEvent e)
         {
             setGender(e.getActionCommand());
         }
     }
     public class Element implements ActionListener{
         public void actionPerformed(ActionEvent e)
         {
             setElement(e.getActionCommand());
         }
     }
}