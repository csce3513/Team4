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
  String actual;
  
  HeroMonster hm = new HeroMonster();
  public Frame(Hero hero, Monster monster){
      h = hero;
      m = monster;
      makeFrame();
      
  }
  
  
  
  public Frame(){ 
  f = new Group4_NewCharacter();
  h = new Hero(100,f.getName(),f.getElement(),f.getGender());
  m = new Monster();
  f.setVisible(false);
  makeFrame();
  
  }
  
private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team4/group4_CharSelect.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setOpaque(true);
        pack();
    }

  public void makeFrame(){
        
  setSize(600, 400);
  setVisible(true);
  setLocationRelativeTo(null);
  
  setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  setLayout(new BorderLayout(3,100));
  if(m.deadCheck()){
            setVisible(false);
        }
  
  name = new JTextField("Type that word");
  name.setBounds(250, 100, 100, 100);
  
  actual = actualWord();
  String write_me = "Please type the word: " + "  " + actual + "  ";
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
        Battle b = new Battle();
        HeroMonster hm = new HeroMonster();
        hm = b.Battle(getTypedWord(),h,m,actual);
        h = hm.returnHero();
        m = hm.returnMonster();
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
    
    
   private javax.swing.JLabel jLabel1;
   private javax.swing.JPanel jPanel1;
}