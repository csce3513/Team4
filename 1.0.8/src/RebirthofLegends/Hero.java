package RebirthofLegends;

public class Hero {

    int health = 0;
    int maxHealth = 100;
    String name = "";
    String element = "";
    String gender = "";
    int crystals = 0;
    int maxCrystals = 0;
    Weapon weapon = new Weapon();

    Hero() {

        setHealth(100);
        setName("tom");
        setElement("fire");
        setGender("male");
    }

    Hero(int h, String n, String e, String g) {

        setHealth(h);
        setName(n);
        setElement(e);
        setGender(g);
    }
    
    Hero(int h,int mx, String n, String e, String g,int c, int mc){
        setMaxHealth(mx);
        setHealth(h);
        setName(n);
        setElement(e);
        setGender(g);
        setCrystals(c);
        setMaxCrystals(mc); 
    }

    public int doDamage(double d) {
            //Damge is d ( percentage Correct) * the current damage done by the weapon
        int weaponDmg = weapon.getWpatk();
        int dmgDone = (int) (weaponDmg * d);
        return dmgDone;
    }

    public void takeDamage(int n) {
        health -= n;
    }

    public void setName(String n) {
        name = n;
    }

    public void setGender(String g) {
        gender = g;
    }

    public void setElement(String e) {
        element = e;
    }
    
 

    public boolean deadCheck() {
        if (health <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public void heal() {
        health = maxHealth;
    }
    
    public void takemymoney(int a) {
        crystals = crystals - a;
    }
    
    public void incMaxHP(){
        maxHealth = maxHealth +20;
        health = health +20;
    }

    public void win() {
        crystals++;
    }
    public void win(int a) {
        crystals = crystals + a;
    }

    public Weapon getAwesome() {
        return weapon;
    }

    public void setAwesome(Weapon awesome) {
        this.weapon = awesome;
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

    public int getHealth() {
        return health;
    }

    public int getCrystals() {
        return crystals;
    }

    public void setCrystals(int crystals) {
        this.crystals = crystals;
    }
        
    public int getMaxCrystals() {
        return maxCrystals;
    }

    public void setMaxCrystals(int maxCrystals) {
        this.maxCrystals = maxCrystals;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
}
