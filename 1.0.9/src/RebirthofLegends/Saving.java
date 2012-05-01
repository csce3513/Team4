package RebirthofLegends;

public class Saving {

    private int HP;
    private int maxHP;
    private String name;
    private String element;
    private String gender;
    private int crystal;
    private int maxCrystal;

    public Saving() {
        this(0, "", "", "", 0);
    }

    public Saving(int h, String nm, String elm, String g, int c) {
        setHP(h);
        setName(nm);
        setElement(elm);
        setGender(g);
        setCrystal(c);
    }
    public Saving(int h, int mh, String nm, String elm, String g, int c, int mc) {
        
        setHP(h);
        setMaxHP(mh);
        setName(nm);
        setElement(elm);
        setGender(g);
        setCrystal(c);
        setMaxCrystal(mc);
    }

    public void setHP(int h) {
        HP = h;
    }
    
    public void setMaxHP(int h){
        maxHP = h;
    }

    public void setGender(String g) {
        gender = g;
    }

    public void setName(String nm) {
        name = nm;
    }

    public void setElement(String elm) {
        element = elm;
    }

    public void setCrystal(int c) {
        crystal = c;
    }

    public void setMaxCrystal(int c) {
        maxCrystal = c;
    }
    public int getHP() {
        return HP;
    }
    
    public int getMaxHP() {
        return maxHP;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getElement() {
        return element;
    }

    public int getCrystal() {
        return crystal;
    }
    
    public int getMaxCrystal() {
        return maxCrystal;
    }    
}
