package RebirthofLegends;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;


public class BattleFrame extends JFrame{
    Timer timer = new Timer(5000,null);
    JLabel hero, hero_HP, monster, monster_HP, label;
    JProgressBar heroHP, monsterHP;
    JTextField name;
    JButton back;
    

    
    private CharCreate f;
    String[] wordList = {"tom", "alley", "scot", "richard", "jack", "xu",
        "harvey", "alleluya", "iradukunda", "alvie", "men", "software", "engineering",
        "team", "awesome", "Stop", "hurt", "punch", "lick?"};
    Monster m = new Monster();
    Hero h;
    Battle b;
    String actual;
    HeroMonster hm = new HeroMonster();
    
    

    public BattleFrame(Hero hero, Monster monster) {
        h = hero;
        m = monster;
        makeFrame();

    }

    public BattleFrame(Hero hero)  {
        h = hero;
        makeFrame();
    }

    public BattleFrame() {
        // CharCreate f = new CharCreate();
        // f.setVisible(false);
        //   h = new Hero(100, f.getName(), f.getElement(), f.getGender());
        h = new Hero();
        m = new Monster();
        makeFrame();



    }

    public void makeFrame() {
        if(!h.deadCheck()){
        
        
        setSize(600, 400);
        setVisible(true);
        setLocationRelativeTo(null);
              
            setVisible(true);
        timer.start();
       
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout(3, 100));

        if (m.deadCheck()) {
            setVisible(false);
        }

        name = new JTextField(20);
        name.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameMouseClicked(evt);
            }
        });

        name.setBounds(
                250, 100, 500, 100);


        actual = actualWord();
        String write_me = "Please type the word: " + "  " + actual + "  ";
        label = new JLabel(write_me);
        String hero_name = h.getName() + "'s" + " health";
        hero = new JLabel(hero_name);
        heroHP = new JProgressBar(0,h.getMaxHealth());
        heroHP.setValue(h.getHealth());
        heroHP.setStringPainted(true);
        
        heroHP.setBackground(Color.GREEN);
        heroHP.setForeground(Color.BLACK);
        
        
        monsterHP = new JProgressBar(0,m.getMaxHP());
        monsterHP.setValue(m.getHealth());
        monsterHP.setStringPainted(true);
        monsterHP.setForeground(Color.RED);
        
        monster = new JLabel("Monster's health");
        String Hp = " " + h.getHealth() + " ";
        String HP = " " + m.getHealth() + " ";
        hero_HP = new JLabel(Hp);
        monster_HP = new JLabel(HP);
        back = new JButton("Back");
        
        JPanel p1 = new JPanel(new GridLayout(3, 3));
        
      
        
        //p1.add(hero);
        p1.add(hero,5,0);
        p1.add(monster);

        
        p1.add(heroHP);
        p1.add(monsterHP);
        
        p1.add(hero_HP);
        p1.add(monster_HP);
        p1.setOpaque(true);
        JPanel p2 = new JPanel(new FlowLayout());

        p2.add(label);

        p2.add(name);
        p2.setOpaque(true);
        JPanel p3 = new JPanel(new GridLayout(1, 2));

        p3.add(back);
        p3.setOpaque(true);;
        
        back.addActionListener(
                new Back());
        name.addActionListener(
                new HEL());
        
        
        timer.addActionListener(
                new TIMER());
      
        
        
        
       
        
        
        
        getContentPane().add(p1, BorderLayout.NORTH);
        getContentPane().add(p2, BorderLayout.CENTER);
        getContentPane().add(p3, BorderLayout.SOUTH);
        
        getLayeredPane().setVisible(true);
    }}

    public class Closed implements ActionListener {

        private final JFrame frame;

        Closed(JFrame frame) {
            this.frame = frame;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            frame.dispose();
            timer.stop();

        }
    }

    public class Back implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            GameWorld g = new GameWorld(h);
            dispose();
            timer.stop();

        }
    }

    public String getTypedWord() {
        return name.getText().toLowerCase();
    }

    public void Fight() {
        Battle b = new Battle();
        HeroMonster hm = new HeroMonster();
        hm = b.Battle(getTypedWord(), h, m, actual);
        h = hm.returnHero();
        m = hm.returnMonster();
        dispose();
    }

   /* public void keyTyped(java.awt.event.KeyEvent evt) {
        java.util.Timer t1 = new java.util.Timer();
        TimerClass tt = new TimerClass(5000);
        t1.schedule(tt, 5000);
        Fight();

    }*/

  

    public class HEL implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Fight();
            timer.stop();
        }
    }
    
    public class TIMER implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Fight();
            timer.stop();
        }
    }

    public int getIndex() {
        return (int) (Math.random() * 15);
    }

    public String actualWord() {
        return wordList[getIndex()];
    }

    private void nameMouseClicked(java.awt.event.MouseEvent evt) {
        // Clear text on battle:
        
        name.setText("");
    }
   

    

}



  

    