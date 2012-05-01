package RebirthofLegends;

public class Saving {

    private int HP;
    private String name;
    private String element;
    private String gender;
    private int crystal;

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

    public void setHP(int h) {
        HP = h;
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

    public int getHP() {
        return HP;
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
}
