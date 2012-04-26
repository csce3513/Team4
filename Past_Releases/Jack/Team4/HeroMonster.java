package Team4;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class HeroMonster {
    Hero hero = new Hero();
    Monster monster = new Monster();
    
    public HeroMonster(){
        hero = new Hero();
        monster = new Monster();
    }
    
    public HeroMonster(Hero h, Monster m){
        hero = h;
        monster = m;
    
}
    public Hero returnHero(){
        return hero;
    }
    
    public Monster returnMonster(){
        return monster;
    }
    
}
