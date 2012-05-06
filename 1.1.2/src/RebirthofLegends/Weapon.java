package RebirthofLegends;

import java.lang.Math;

public class Weapon {

    private int Upgrade;
    private int Wpatk;
    private int maxUpg;

    Weapon() {
        Upgrade = 1;
        Wpatk = 10;
        maxUpg = 100;
    }

    Weapon(int upgrade) {
        Upgrade = upgrade;
      //  Wpatk = dmg;
        maxUpg = 100;
    }

    public int getUpgrade() {
        return Upgrade;
    }

    public void setUpgrade(Integer upgrade) {
        Upgrade = upgrade;
    }

    public int getWpatk() {
        if (Upgrade <= 6) {
            Wpatk = (int)(Math.pow(2,Upgrade)) + 3;
        } else if (Upgrade > 6 && Upgrade <= 11) {
            Wpatk = (11 * Upgrade) + 10;
        } else if (Upgrade > 11) {
            Wpatk = (Upgrade * Upgrade) * 2;
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
            System.out.println("Way to go hacker");
            return resetWpatk();
        }
        return resetUpg();
    }

    public int cToUpg() {
        int crystalsNeeded[] = {0,3,10,20,30,40,50,60,100,200,340,500,800,1000,2000,3000,4000,5000,6000,7000,8000,9000,9999,11000,12000,13000}; 
     //   int crystalsNeeded[]=;
/*
        for(int i = 1; i<200; i++){
            crystalsNeeded[Upgrade] = crystalsNeeded[i]* 10;
        }

        /*
        if(Upgrade <=5){
            crystalsNeeded = Upgrade *3/2 + 10;
        }*/
        
    //    return crystalsNeeded[Upgrade];   
        return crystalsNeeded[Upgrade];
    }

    public void upgrade() {
        if (Upgrade > maxUpg) {
            System.out.println("you have exceeded the max level");
        } else {
            Upgrade++;
          //  Wpatk = ((Wpatk * 5) / 4 + 5);
        }
    }
}
