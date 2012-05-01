package RebirthofLegends;

public class Weapon {

    private int Upgrade;
    private int Wpatk;
    private int maxUpg;

    Weapon() {
        Upgrade = 1;
        Wpatk = 10;
        maxUpg = 100;
    }

    Weapon(int upgrade, int dmg) {
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
        if (Upgrade <= 10) {
            Wpatk = (Upgrade * Upgrade) * 3 / 2 + 2;
        } else if (Upgrade > 10) {
            Wpatk = (Upgrade * Upgrade) * 5 / 2 + 10;
        }

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

    public int resetWpatk() {
        return Wpatk = 7;
    }

    public int resetUpg() {
        return Upgrade = 0;
    }

    public int wepCheck() {
        if (maxUpg > 100 || getUpgrade() <= 0) {
            System.out.println("Error");
            return resetWpatk();
        }
        return resetUpg();
    }

    public int cToUpg() {
        int crystalsNeeded[] = {2,7,12,17,21,25,33,42,55,70,120,200,350,400,
            600,800,1000,2000,5000,10000,99999,999999999}; 
        /*
        if(Upgrade <=5){
            crystalsNeeded = Upgrade *3/2 + 10;
        }*/
        
        return crystalsNeeded[Upgrade];   
    }

    public void upgrade() {
        if (Upgrade > maxUpg) {
            System.out.println("you have exceeded the max level");
        } else {
            Upgrade++;
            Wpatk = ((Wpatk * 5) / 4 + 5);
        }
    }
}
