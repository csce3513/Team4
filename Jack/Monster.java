package Team4;

 
 
public class Monster {
    
    private int health;
    private int damage;
    
    Monster(){
        health = 30;
        damage = 5;
    }
    
    public Monster(int a)
    {
      setHealth(a);
    }
    
    public void setHealth(int a)
    {
        if (a >= 0 )
        health = a;  
            
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