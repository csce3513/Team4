package RebirthofLegends;

import javax.swing.*;

public class Battle extends JFrame {

    String entered_word;
    int LISTSIZE = 10;
    Hero hero = new Hero();
    Monster monster = new Monster();
    HeroMonster hm = new HeroMonster();
    String userInput = "";
    String actualInput = "";
    String bg = "";

    public HeroMonster Battle(String n, Hero h, Monster m, String r, String g) {
        entered_word = n;
        userInput = n;
        actualInput = r;
        hero = h;
        monster = m;
        bg = g;

   //     if (m.getLevel() != 10) {
            if (!m.deadCheck() && !h.deadCheck()) {
                heroMonsterFight(n, r);
                BattleFrame f = new BattleFrame(hero, monster, bg);
            }

  //      } else if (m.getLevel() == 10) {
  //          if (!m.deadCheck() && !h.deadCheck()) {
  //              heroMonsterFight(n, r);
  //              BattleFrame f = new BattleFrame(hero, monster, bg);
  //          } else if (m.getHealth() <= 0) {
  //              dispose();
  //              Win w = new Win();
  //          }

  //      }
        hm = new HeroMonster(h, m);
        return hm;

    }

    public String typeTheWord() {
        return entered_word;

    }

    public void heroMonsterFight(String actual, String entered) {

        if (monster.getLevel() != 10) {

            monster.takeDamage(hero.doDamage(charCompare(actual, entered)));

            if (monster.deadCheck()) {

                String output = "You win with " + hero.getHealth() + " health left";
                JOptionPane.showMessageDialog(null, output);
                hero.win(monster.getLevel() * monster.getLevel());
                dispose();
                Dungeon d = new Dungeon(hero);
            } else {
                hero.takeDamage(monster.doDamage());
                if (hero.deadCheck()) {
                    GameOver go = new GameOver();
                    dispose();
                }

            }
        } else if (monster.getLevel() == 10) {
            monster.takeDamage(hero.doDamage(charCompare(actual, entered)));

            if (monster.deadCheck()) {
                dispose();
                Win w = new Win();
            } else {
                hero.takeDamage(monster.doDamage());
                if (hero.deadCheck()) {
                    GameOver go = new GameOver();
                    dispose();
                }

            }
            
        }
    }

    public Monster returnMonster() {
        return monster;
    }

    public Hero returnHero() {
        return hero;
    }

    public double charCompare(String actual, String entered) {
        int numCorrect = 0;
        int a;
        int e;
        a = actual.length();

        e = entered.length();

        if (a <= e) {
            for (int i = 0; i < a; i++) {
                if (actual.charAt(i) == entered.charAt(i)) {

                    numCorrect++;
                }
            }

            return (double) numCorrect / e;

        } else if (e < a) {
            for (int i = 0; i < e; i++) {
                if (actual.charAt(i) == entered.charAt(i)) {

                    numCorrect++;
                }
            }

            return (double) numCorrect / a;
        } else {
            return 0.0;
        }
    }
}
