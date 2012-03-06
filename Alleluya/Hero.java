
package Team4;

public class Hero {
    int health = 0;
    String name = "";
    String element = "";
    String gender = "";
   
   
    Weapon awesome = new Weapon();
   
    Hero(){
       
        setHealth(100);
        setName("tom");
        setElement("fire");
        setGender("male");
    }
   
    Hero(int h, String n, String e, String g){
       
       setHealth(h);
       setName(n);
       setElement(e);
       setGender(g);
    }
    
    public int doDamage(double d){
        int weaponDmg = awesome.getWpatk();
        int dmgDone = (int) (weaponDmg* d);
        return dmgDone;
    }
    
    public void takeDamage(int n){
        health -= n;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setGender(String g){
        gender = g;
    }
    
    public void setElement(String e){
        element = e;
    }
    public boolean deadCheck(){
        if(health <= 0)
            return true;
        else
            return false;
    }
    public Weapon getAwesome() {
		return awesome;
	}

	public void setAwesome(Weapon awesome) {
		this.awesome = awesome;
	}

	public String getName() {
		return name;
	}

	public String getElement() {
		return element;
	}

	public String getGender() {
		return gender;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getHealth(){
        return health;
    }
}
