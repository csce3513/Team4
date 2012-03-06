package Team4;


public class Weapon {
    private Integer Upgrade;
    private Integer Wpatk;
    private Integer maxUpg;
    
    Weapon(){
        Upgrade = 0;
        Wpatk = 7;
        maxUpg = 100;
    }
    Weapon(int upgrade, int dmg){
        Upgrade = upgrade;
        Wpatk = dmg;
        maxUpg = 100;
    }

    public Integer getUpgrade() {
        return Upgrade;
    }

    public void setUpgrade(Integer upgrade) {
        Upgrade = upgrade;
    }

    public Integer getWpatk() {
        return Wpatk;
    }

    public void setWpatk(Integer wpatk) {
        Wpatk = wpatk;
    }
   
    public void setMaxUpg(Integer maxUpg) {
        this.maxUpg = maxUpg;
    }

    public Integer getMaxUpg() {
        return maxUpg;
    }
   

   
    public String toString(){
        return("Upgrade:" + Upgrade.toString() + " "+"Attack:" + Wpatk.toString());
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


}


