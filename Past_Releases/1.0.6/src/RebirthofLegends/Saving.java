package RebirthofLegends;


public class Saving {
    
    private int HP;
    private String name;
    private String element;
    private String gender;
   
    public Saving()
    {
        this(0,"","","");
    }
    
    public Saving(int h, String nm, String elm,String g)
    {
        setHP(h);
        setName(nm);
        setElement(elm);
        setGender(g);
    }
    
    public void setHP(int h)
    {
        HP = h;
    }
     public void setGender(String g)
    {
        gender = g;
    }
    public void setName(String nm)
    {
        name = nm;
    }
    
    public void setElement(String elm)
    {
        element = elm;
    }
    
    public int getHP()
    {
        return HP;
    }
    
    public String getName()
    {
        return name;
    }
     public String getGender()
    {
        return gender;
    }
    public String getElement()
    {
        return element;
    }
}
