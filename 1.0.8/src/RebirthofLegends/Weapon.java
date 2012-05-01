package RebirthofLegends;


public class Weapon {
    private int Upgrade;
    private int Dmg;
    private int maxUpg;

    
    Weapon(){
        Upgrade = 1;
        Dmg = 10;
        maxUpg = 100;
    }
    Weapon(int upgrade){
        Upgrade = upgrade;
        maxUpg = 100;
    }

    public int getUpgrade() {
        return Upgrade;
    }

    public void setUpgrade(Integer upgrade) {
        Upgrade = upgrade;
    }

    public int getWpatk() {
        return Dmg;
    }

    public void setWpatk(Integer wpatk) {
        Dmg = wpatk;
    }
   
    public void setMaxUpg(Integer maxUpg) {
        this.maxUpg = maxUpg;
    }

    public int getMaxUpg() {
        return maxUpg;
    }
   
    public int resetWpatk(){
        return Dmg = 7;
    }
   
    public int resetUpg(){
        return Upgrade = 0;
    }
   
    public int wepCheck(){
        if(maxUpg>100 || getUpgrade()<=0){
            System.out.println("Error");
            return resetWpatk();
        }
        return resetUpg();
    }
    
    public void upgrade(){
    	if(Upgrade > maxUpg){
    		System.out.println("you have exceeded the max level");
    	}
    	else{
    		Upgrade ++;
    		Dmg = ((Dmg * 5)/4+5);
    	}
    }
    
    


}


