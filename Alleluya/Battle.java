
package Team4;


import javax.swing.*;


public class Battle extends JFrame{
    
String entered_word;
int LISTSIZE = 10;
Hero hero = new Hero();
Monster monster = new Monster();
Frame f = new Frame();

    
    public Battle(String n)
    {
        entered_word = n;
 
    	Hero h = new Hero();
    	Monster m = new Monster();
    	h = returnHero();
    	m = returnMonster();
    	
    	while(!m.deadCheck() && !h.deadCheck()){
    	heroMonsterFight();
    	}
        
    }
   
    public String typeTheWord(){
    	return entered_word;
    	
    }
   
    
    public void heroMonsterFight(){
    	
    	monster.takeDamage(hero.doDamage(charCompare(f.actualWord(),typeTheWord())));
    	
    	if(monster.deadCheck()){
            
    	String output =	"You win with " + hero.getHealth() + " health left";
        JOptionPane.showMessageDialog(null,output);
        setVisible(false);
    	}
    	else{
    	hero.takeDamage(monster.doDamage());
    	if(hero.deadCheck())
        {
    		String output = "You Lose with the monster having " + monster.getHealth() + " health left";
                JOptionPane.showMessageDialog(null,output);
                setVisible(false);
        }
    	
    }}
    	
    public Monster returnMonster(){
    	return monster;
    }
    
    public Hero returnHero(){
    	return hero;
    }
    public Frame returnFrame(){
    	return f;
    }
    
    
 public double charCompare(String actual, String entered){
        int numCorrect = 0;
        int a;
        int e;
        a = actual.length();
        
        e = entered.length();
        
        if (a <= e)
        {
            for(int i = 0; i < a; i++){
                if(actual.charAt(i) == entered.charAt(i)){
                	
                    numCorrect++;
                    }}
            	
            return (double) numCorrect / e;
            
        }
        else if (e < a){
            for(int i = 0; i < e; i++){
                 if(actual.charAt(i) == entered.charAt(i)){
                 	
                     numCorrect++;
                     }}
            
               return (double) numCorrect / a;
        }
        else      
                return 0.0;
    }
    
}
