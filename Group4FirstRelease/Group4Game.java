package Team4;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.*;


public class Group4Game implements ActionListener{

          protected JButton ngButton, cgButton, oButton;
          private JFrame game = new JFrame();
          JPanel gamePanel;
          final static String GAMESTART = "GAME START";
          final static String NEWGAME = "NEW GAME";
          
    public Group4Game() {
        initUI();
    }
    

    public final void initUI() {
        game.setTitle("ReBirth of Legends");
        game.setVisible(true);
        game.setSize(600, 400);
        game.setLocationRelativeTo(null);
        Group4_GameStartTest gameStart = new Group4_GameStartTest();
        Group4_NewCharacter NewCharacter = new Group4_NewCharacter();
        game.setVisible(true);

        gamePanel = new JPanel(new CardLayout());
        gamePanel.add(gameStart, GAMESTART);
 //       gamePanel.add(NewCharacter, NEWGAME);
        game.add(gamePanel, BorderLayout.CENTER);
        
        //game.getContentPane().add(gameStart);
        //game.getContentPane().add(NewCharacter);
        //gamestart();
    }
    
  /*  public void gamestart(){
        JPanel j = new JPanel();
              game.setLayout(null);
        j.setToolTipText("A Panel container");

        ngButton = new JButton("New Game");
        ngButton.setBounds(250, 120, 100, 30);
        ngButton.setToolTipText("Start A New Game");
        ngButton.setMnemonic(KeyEvent.VK_D);
        ngButton.setActionCommand("disable");
        
        cgButton = new JButton("Continue");
        cgButton.setBounds(250, 180, 100, 30);
        cgButton.setToolTipText("Continue a Saved Game");
        cgButton.setMnemonic(KeyEvent.VK_M);
        cgButton.setEnabled(false);

        oButton = new JButton("Options");
        oButton.setBounds(250, 240, 100, 30);
        oButton.setToolTipText("Game Options");
        oButton.setMnemonic(KeyEvent.VK_E);
        oButton.setActionCommand("enable");
        oButton.setEnabled(false);

        game.add(ngButton);
        game.add(cgButton);
        game.add(oButton);
        
        ngButton.addActionListener(this);
        oButton.addActionListener(this);
    

}*/
    
    public static void main(String[] args) {
      /*  SwingUtilities.invokeLater(new Runnable() {
            public void run() {                
                Group4Game ex = new Group4Game();
                ex.setVisible(true);
            }
        });*/
        Group4Game ex = new Group4Game();
        ex.initUI();
    }
    
    public void cardSwaper()
    {
        CardLayout cl = (CardLayout)(gamePanel.getLayout());
        cl.show(gamePanel,NEWGAME );
    }
    
    
    @Override
     public void actionPerformed (ActionEvent evt) {
        CardLayout cl = (CardLayout)(gamePanel.getLayout());
        cl.show(gamePanel,NEWGAME );
    }
  
 /*   @Override
      public void actionPerformed(ActionEvent e) {
        if("disable".equals(e.getActionCommand())) {
                //game.remove(this);
                Group4_NewCharacter newGame = new Group4_NewCharacter();
                game.add(newGame);
            //cgButton.setEnabled(false);
            //ngButton.setEnabled(false);
           // oButton.setEnabled(true);
        }
        else{
        //    ngButton.setEnabled(true);
          //  cgButton.setEnabled(true);
            //oButton.setEnabled(false);
        }
        
            
        }*/
    }

