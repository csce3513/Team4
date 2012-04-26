package RebirthofLegends;


public class Weapon {
    private int Upgrade;
    private int Wpatk;
    private int maxUpg;
    
    Weapon(){
        Upgrade = 1;
        Wpatk = 10;
        maxUpg = 100;
    }
    Weapon(int upgrade, int dmg){
        Upgrade = upgrade;
        Wpatk = dmg;
        maxUpg = 100;
    }

    public int getUpgrade() {
        return Upgrade;
    }

    public void setUpgrade(Integer upgrade) {
        Upgrade = upgrade;
    }

    public int getWpatk() {
        return Wpatk;
    }

    public void setWpatk(Integer wpatk) {
        Wpatk = wpatk;
    }
   
    public void setMaxUpg(Integer maxUpg) {
        this.maxUpg = maxUpg;
    }

    public int getMaxUpg() {
        return maxUpg;
    }
   
    public int resetWpatk(){
        return Wpatk = 7;
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
    		Wpatk = ((Wpatk * 5)/4+5);
    	}
    }
    
    


}


