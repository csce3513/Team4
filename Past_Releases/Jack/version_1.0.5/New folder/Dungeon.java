package RebirthofLegends;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Dungeon extends JFrame {
  Hero h = new Hero();
    
      
    public Dungeon(Hero hero){
        h = hero;
        
        setTitle("The Dungeon's Frame");
        setSize(600,400);
        setVisible(true);
        setLocationRelativeTo(null);

        
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,3));
        
        JButton one = new JButton("Level 1");
        JButton two = new JButton("Level 2");
        JButton three = new JButton("Level 3");
        JButton four = new JButton("Level 4");
        JButton five = new JButton("Level 5");
        JButton six = new JButton("Level 6");
        JButton seven = new JButton("Level 7");
        JButton eight = new JButton("Level 8");
        JButton nine = new JButton("Level 9");
        
            p1.add(one);
            p1.add(two);
            p1.add(three);
            p1.add(four);
            p1.add(five);
            p1.add(six);
            p1.add(seven);
            p1.add(eight);
            p1.add(nine);
        
          
            
        
        p1.add(new JButton("Final Boss"));
        p1.add(new JButton("Back"));
        p1.add(new JButton("Next"));
        
        JPanel p2 = new JPanel(new BorderLayout());
       
        p2.add(p1, BorderLayout.CENTER);
        
        JPanel p3 = new JPanel(new GridLayout(2,1,0,0));
        p3.add(new JLabel("Name " + h.getName()));
        p3.add(new JLabel("Health " + h.getHealth()));
        p3.add(new JLabel("Element " + h.getElement()));
        p3.add(new JLabel("Damage: " + 10));
        add(p2, BorderLayout.EAST);
        add(p3, BorderLayout.CENTER);
        
         //back.addActionListener(new Back());
        
         one.addActionListener(new One());
    }
    
    public class Back implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {
           // f.setVisible(true);
            GameWorld g = new GameWorld();
            setVisible(false);
        //    g.setVisible(true);
        }
    }
    
    public class One implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {

            BattleFrame b = new BattleFrame(h);
            setVisible(false);
          //  b.setVisible(true);
        }
    }


   

}
