package RebirthofLegends;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BattleFrame extends JFrame {

    JLabel hero, hero_HP, monster, monster_HP, label;
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

    public BattleFrame(Hero hero) {
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

        setSize(600, 400);
        setVisible(true);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout(3, 100));

        if (m.deadCheck()) {
            setVisible(false);
        }

        name = new JTextField("Ctrol+A");
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
        monster = new JLabel("Monster's health");
        String Hp = " " + h.getHealth() + " ";
        String HP = " " + m.getHealth() + " ";
        hero_HP = new JLabel(Hp);
        monster_HP = new JLabel(HP);
        back = new JButton("Back");
        JPanel p1 = new JPanel(new GridLayout(2, 2));

        p1.add(hero);

        p1.add(monster);

        p1.add(hero_HP);

        p1.add(monster_HP);
        JPanel p2 = new JPanel(new FlowLayout());

        p2.add(label);

        p2.add(name);
        JPanel p3 = new JPanel(new GridLayout(1, 2));

        p3.add(back);

        back.addActionListener(
                new Back());
        name.addActionListener(
                new HEL());



        add(p1, BorderLayout.NORTH);

        add(p2, BorderLayout.CENTER);

        add(p3, BorderLayout.SOUTH);
    }

    public class Closed implements ActionListener {

        private final JFrame frame;

        Closed(JFrame frame) {
            this.frame = frame;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            frame.dispose();

        }
    }

    public class Back implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            GameWorld g = new GameWorld(h);
            dispose();

        }
    }

    public String getTypedWord() {

        return name.getText().toLowerCase();


    }

    public class HEL implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Battle b = new Battle();
            HeroMonster hm = new HeroMonster();
            hm = b.Battle(getTypedWord(), h, m, actual);
            h = hm.returnHero();
            m = hm.returnMonster();
            setVisible(false);
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
    
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
}