package RebirthofLegends;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class BattleFrame extends JFrame {

    Timer timer = new Timer(5000, null);
    JLabel hero, hero_HP, monster, monster_HP, label;
    JProgressBar heroHP, monsterHP;
    JTextField name;
    JButton back;
    private javax.swing.JLabel bg_Battle;
    String[] wordList = {"tom", "alley", "scot", "richard", "jack", "xu", "brad", "doctor", "dead", "supercalifragilisticexpialidocious", "graduation",
        "harvey", "alleluya", "iradukunda", "alvie", "men", "software", "engineering", "sword", "axe", "shield", "hammer", "pizza", "cyrstal", "github",
        "team", "awesome", "stop", "hurt", "punch", "game", "rebirth", "of", "legends", "deaton", "failboat", "monster", "health", "0101010101", "boss",
        "pairprogramming", "extreme"
    };
    Monster m = new Monster();
    Hero h;
    Battle b;
    String actual;
    HeroMonster hm = new HeroMonster();
    String bg = "";

    public String getBg() {
        return bg;
    }

    public void setBg(String bg) {
        this.bg = bg;
    }

    public BattleFrame(Hero hero, Monster monster, String g) {
        h = hero;
        m = monster;
        bg = g;
        makeFrame();

    }

    public BattleFrame(Hero hero) {
        h = hero;
        makeFrame();
    }

    public BattleFrame() {
        h = new Hero();
        m = new Monster();
        bg = "/images/bg_battleRP";
        makeFrame();
    }

    public void makeFrame() {
        Frame f = new Frame();
        bg_Battle = new javax.swing.JLabel();
        bg_Battle.setIcon(new javax.swing.ImageIcon(getClass().getResource(bg))); // NOI18N
        //getContentPane().add(bg_Battle);
        bg_Battle.setBounds(0, 0, 600, 400);
        bg_Battle.setOpaque(false);

        if (!h.deadCheck()) {
            setSize(600, 400);
            setVisible(true);
            setLocationRelativeTo(null);

            setVisible(true);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLayout(new BorderLayout(3, 100));
            
            timer.start();
                       

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
            label.setForeground(Color.white);
            String hero_name = h.getName() + "'s" + " health";
            hero = new JLabel(hero_name);
            hero.setForeground(Color.white);
            heroHP = new JProgressBar(0, h.getMaxHealth());
            heroHP.setValue(h.getHealth());
            heroHP.setStringPainted(true);
            UIManager.put("ProgressBar.selectionBackground", Color.BLUE);
            UIManager.put("ProgressBar.selectionForeground", Color.WHITE);

            heroHP.setBackground(Color.BLACK);
            heroHP.setForeground(Color.BLACK);


            monsterHP = new JProgressBar(0, m.getMaxHP());
            monsterHP.setValue(m.getHealth());
            monsterHP.setStringPainted(true);
            monsterHP.setForeground(Color.BLACK);

            monster = new JLabel("Monster's health");
            monster.setForeground(Color.white);

            String Hp = " " + h.getHealth() + " ";
            String HP = " " + m.getHealth() + " ";
            hero_HP = new JLabel(Hp);
            monster_HP = new JLabel(HP);
            back = new JButton("Back");

            JPanel p1 = new JPanel(new GridLayout(3, 3));



            //p1.add(hero);
            p1.add(hero, 5, 0);
            p1.add(monster);


            p1.add(heroHP);
            p1.add(monsterHP);

            p1.add(hero_HP);
            p1.add(monster_HP);

            JPanel p2 = new JPanel(new GridLayout(2, 1));

            p2.add(label);

            p2.add(name);

            JPanel p3 = new JPanel(new GridLayout(1, 2));

            p3.add(back);


            back.addActionListener(
                    new Back());
            name.addActionListener(
                    new HEL());

            timer.addActionListener(
                    new TIMER());



            getContentPane().add(p1);
            p1.setBounds(0, 0, 600, 80);
            p1.setOpaque(false);

            getContentPane().add(p2);
            p2.setBounds(150, 150, 300, 50);
            p2.setOpaque(false);

            getContentPane().add(p3);
            p3.setBounds(150, 320, 300, 30);
            p3.setOpaque(false);

            getContentPane().add(bg_Battle);
            bg_Battle.setBounds(0, 0, 600, 400);
            getContentPane().setVisible(true);

        }
    }

    public class Closed implements ActionListener {

        private final JFrame frame;

        Closed(JFrame frame) {
            this.frame = frame;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            timer.stop();
            frame.dispose();
        }
    }

    public class Back implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            timer.stop();
            GameWorld g = new GameWorld(h);
            dispose();
        }
    }

    public String getTypedWord() {
        return name.getText().toLowerCase();
    }

    public void Fight() {
        Battle b = new Battle();
        HeroMonster hm = new HeroMonster(h,m);
        hm = b.Battle(getTypedWord(), h, m, actual,bg);
        h = hm.returnHero();
        m = hm.returnMonster();
        dispose();
    }

    /*
     * public void keyTyped(java.awt.event.KeyEvent evt) { java.util.Timer t1 =
     * new java.util.Timer(); TimerClass tt = new TimerClass(5000);
     * t1.schedule(tt, 5000); Fight();
     *
     * }
     */
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
        return (int) (Math.random() * wordList.length);
    }

    public String actualWord() {
        return wordList[getIndex()];
    }

    private void nameMouseClicked(java.awt.event.MouseEvent evt) {
        // Clear text on battle:

        name.setText("");
    }
}
