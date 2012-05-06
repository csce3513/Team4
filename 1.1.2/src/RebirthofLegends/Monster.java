package RebirthofLegends;

 
 
public class Monster {
    
    private int health;
    private int damage;
    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    private int maxHP;

    
    
    Monster(){
        health = 10;
        damage = 5;
        level = 1;
        maxHP = 10;
    }
    
    public Monster(int a)
    {
        level = a;
        setStats(a);
        maxHP = health;
    }
    
    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }
    
    public void setStats(int a)
    {
        
        health = a*a*10;  
        damage = a*a+2;
            
    }
    
    public int getHealth()
    {
        return health;
    }
    
  public void takeDamage(int n)
    {
    	health -= n;
    }
    
    public boolean deadCheck()
    {
        return (health <= 0); 
    }
    
    public int doDamage(){
    	return damage;
    }
 
}