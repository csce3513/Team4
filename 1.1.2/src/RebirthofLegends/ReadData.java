package RebirthofLegends;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadData {

    private Scanner input;

    public void openfile() {
        try {
            input = new Scanner(new File("save.txt"));
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file.");
            System.exit(1);
        }
    }

    public Hero readRecords() {
        Saving record = new Saving();
        Hero h = new Hero();
        //System.out.printf("%-10s%-12s%-12s%-12s\n", "HP","Name","Element","Gender");

        try {
            h.setHealth(input.nextInt());
            h.setMaxHealth(input.nextInt());
            h.weapon.setUpgrade(input.nextInt());
            h.setName(input.next());
            h.setElement(input.next());
            h.setGender(input.next());
            h.setCrystals(input.nextInt());
            //    h.setMaxCrystals(input.nextInt());    

            //  System.out.printf("%-10d%-12s%-12s%-12s\n", record.getHP(),record.getName(),record.getElement(),record.getGender());
        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed");
            input.close();
            System.exit(1);
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file");
            System.exit(1);
        }
        return h;
    }

    public boolean canOpen() {
        if (input.hasNext()) {
            return true;
        } else {
            return false;
        }

    }

    public void closefile() {
        if (input != null) {
            input.close();
        }
    }
}
