import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.*;

public class ClickGame
{
  ////// Counter
   static double counter;

   ////// Upgrades
   static int upgrade = 1;
   static int autoclick = 0;
   static double autoclickspeed = 10;
   static boolean autoclicker = false;
  
  
   //////// UpgradeCost
   static double upgrade1Cost = 10;
   static double upgrade2Cost = 100;
   static double upgrade3Cost = 1000;
   static double upgrade4Cost = 10000;

   
   
  public static void main(String[] args)
  {
    new ClickGameFrame();
  }
  
}

class MyActionListener implements ActionListener{

  public void actionPerformed(ActionEvent e) {
  
    ClickGame.counter += 1*ClickGame.upgrade;
    System.out.println("Counter = " + ClickGame.counter);
    
  }
}

class MyActionListenerUpgrade1 implements ActionListener{

  public void actionPerformed(ActionEvent u) {
   
      if(ClickGame.upgrade1Cost <= ClickGame.counter){
        ClickGame.counter -= ClickGame.upgrade1Cost;
        ClickGame.upgrade += 1;
        ClickGame.upgrade1Cost = ClickGame.upgrade1Cost* 1.1;
        System.out.print("UpgradeCost1 = "+ ClickGame.upgrade1Cost);
        //upgradeButton1.setText("Preis: "+ ClickGame.upgrade1Cost);
        
      }
     
  }
}
class MyActionListenerUpgrade2 implements ActionListener{
  
  public void actionPerformed(ActionEvent u) {
   
      if(ClickGame.upgrade2Cost <= ClickGame.counter){
        ClickGame.counter -= ClickGame.upgrade2Cost;
        ClickGame.autoclick += 1;
        ClickGame.upgrade2Cost = ClickGame.upgrade2Cost* 1.1;
        System.out.print("UpgradeCost2 = "+ ClickGame.upgrade2Cost);
      }
     
  }
}

class MyActionListenerUpgrade3 implements ActionListener{

  public void actionPerformed(ActionEvent e) {
    double multiplayer = 0.1;
    if(ClickGame.upgrade3Cost <= ClickGame.counter){
      ClickGame.counter -= ClickGame.upgrade3Cost;
      ClickGame.autoclickspeed = ClickGame.autoclickspeed - multiplayer;
      multiplayer = multiplayer + 0.1;
    }
    
  }
  
}

class MyActionListenerUpgrade4 implements ActionListener{

  public void actionPerformed (ActionEvent e){

    if(ClickGame.upgrade4Cost <= ClickGame.counter || ClickGame.autoclicker == false){
      ClickGame.autoclicker = true;
      ClickGame.counter -= ClickGame.upgrade4Cost;
    }
  }
}



class ClickGameFrame extends JFrame
{
  public ClickGameFrame()
  {
    setTitle("Game");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setSize(500, 500);
    setContentPane(new ClickGamePanel());
    
  }
}

class ClickGamePanel extends JPanel 
{  
  public static final String upgradeButton1 = null;
  MyActionListener listener;
  public ClickGamePanel()
  {
    super();
    setLayout(new GridBagLayout());
    setBackground(Color.red);
    
    DecimalFormat dFormat = new DecimalFormat("#.##");

    GridBagConstraints c = new GridBagConstraints();

   
    JButton clickbutton = new JButton("Click");
    JButton upgradeButton1 = new JButton("Preis: ");
    JButton upgradeButton2 = new JButton("2");
    JButton upgradeButton3 = new JButton("3");
    JButton upgradeButton4 = new JButton("4");
    

    /////////////////// CLickButton ////////////////////
    
    c.fill = GridBagConstraints.BOTH;
    c.ipady = 380;
   
    c.weightx = 2;
    c.gridwidth = 1;
    c.gridx = 1;
    c.gridy = 2;

   
    add(clickbutton, c);

    clickbutton.addActionListener(new MyActionListener());
    
    /////////////////// Upgrade 1 ////////////////////
    
    c.ipady = 20;
    c.gridx = 1;
    c.gridy = 1;
    add(upgradeButton1, c);

    upgradeButton1.addActionListener(new MyActionListenerUpgrade1());

    /////////////////// Upgrade 2 ////////////////////
    
    c.gridx = 2;
    c.gridy = 1;
    add(upgradeButton2, c);

    upgradeButton2.addActionListener(new MyActionListenerUpgrade2());

    /////////////////// Upgrade 3 ////////////////////
    
    c.gridx = 3;
    c.gridy = 1;
    add(upgradeButton3, c);

    upgradeButton3.addActionListener(new MyActionListenerUpgrade3());

    /////////////////// Upgrade 4 ////////////////////
    
    c.gridx = 4;
    c.gridy = 1;
    add(upgradeButton4, c);

    upgradeButton1.addActionListener(new MyActionListenerUpgrade3());

    /////////////////// Countertext ////////////////////
  }

}
