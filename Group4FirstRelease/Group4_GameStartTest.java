package Team4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.*;


public class Group4_GameStartTest extends JPanel implements MouseListener {

    
    public Group4_GameStartTest() {
        initUI();
    }

    public final void initUI() {

      

        setLayout(null);
        setToolTipText("A Panel container");

        JButton ngButton = new JButton("New Game");
        ngButton.setBounds(250, 120, 100, 30);
        ngButton.setToolTipText("Start A New Game");
        ngButton.addMouseListener(this);
        
        JButton cgButton = new JButton("Continue");
        cgButton.setBounds(250, 180, 100, 30);
        cgButton.setToolTipText("Continue a Saved Game");
        cgButton.addMouseListener(null);

        JButton oButton = new JButton("Options");
        oButton.setBounds(250, 240, 100, 30);
        oButton.setToolTipText("Game Options");
        oButton.addMouseListener(null);

        add(ngButton);
        add(cgButton);
        add(oButton);

      
    }
    
 

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Group4_GameStartTest ex = new Group4_GameStartTest();
                ex.setVisible(true);
                
            }
        });
    }
  
    void eventOutput(String eventDescription, MouseEvent e) {
        System.out.println(eventDescription + " detected on "
                + e.getComponent().getClass().getName()
                + "." );
        
    }
  public void mousePressed(MouseEvent e) {
        eventOutput("Mouse pressed (# of clicks: "
                + e.getClickCount() + ")", e);
//                     
            
        
    }
     
    public void mouseReleased(MouseEvent e) {
        eventOutput("Mouse released (# of clicks: "
                + e.getClickCount() + ")", e);
    }
     
    public void mouseEntered(MouseEvent e) {
        eventOutput("Mouse entered", e);
    }
     
    public void mouseExited(MouseEvent e) {
        eventOutput("Mouse exited", e);
    }
     
    public void mouseClicked(MouseEvent e) {
        eventOutput("Mouse clicked (# of clicks: "
                + e.getClickCount() + ")", e);
    }
    
}
