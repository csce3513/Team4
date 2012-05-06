package RebirthofLegends;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WriteData {

    private Formatter output;

    public void openFile() throws FileNotFoundException {
        try {
            output = new Formatter("save.txt");
        } catch (SecurityException securityException) {
            System.err.println("You do not have write access to this file");
            System.exit(1);
        }
    }

    public void addRecords() {
        Saving record = new Saving();

        try {
            record.setHP(100);
            record.setName("Alley");
            record.setElement("Wind");
            record.setGender("Male");

            if (record.getHP() > 0) {
                output.format("%d %s %s %s %d\n", record.getHP(), record.getName(), record.getElement(), record.getGender(), record.getCrystal());
            } else {
                System.out.println("HP must be greater than 0");
            }
        } catch (FormatterClosedException formatterClosedException) {
            System.err.println("Error writing to file");
            return;
        } catch (NoSuchElementException elementException) {
            System.err.println("Invalid input. Please try again.");
        }
    }

    public void addRecords(Hero h) {
        Saving record = new Saving();

        try {
            record.setHP(h.getHealth());
            record.setMaxHP(h.getMaxHealth());
            record.setWeapUpg(h.weapon.getUpgrade()); //this is supposed to set weapon upgrade
            record.setName(h.getName());
            record.setElement(h.getElement());
            record.setGender(h.getGender());
            record.setCrystal(h.getCrystals());
     //       record.setMaxCrystal(h.getMaxCrystals());
            if (record.getHP() > 0) {
                output.format("%d %d %d %s %s %s %d\n", record.getHP(), record.getMaxHP(), record.getWeapUpg(), record.getName(), record.getElement(), record.getGender(), record.getCrystal());
            } else {
                System.out.println("HP must be greater than 0");
            }
        } catch (FormatterClosedException formatterClosedException) {
            System.err.println("Error writing to file");
            return;
        } catch (NoSuchElementException elementException) {
            System.err.println("Invalid input. Please try again.");
        }
    }

    public void closeFile() {
        if (output != null) {
            output.close();
        }
    }
}
