package frame;
import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import Elements.*;

import java.awt.*;

public class Home extends JFrame{
  private JPanel  panel;
  private Color fc;
  private JLabel wicon;
  private ImageIcon winLog;
 private Details d;
 private PlayerAttribute pa ;
private CurrentLevel currentLevel;
private Coach coach;
private Showdetails dt;
  private Add ad;
  //Frame 
  
  public Home(){
    super("CS Worriors Homepage");
    super.setBounds(600,85,820,855);
    super.setDefaultCloseOperation(EXIT_ON_CLOSE);

        d = new Details();
        pa = new PlayerAttribute();
        coach = new Coach();
        currentLevel = new CurrentLevel();
        dt = new Showdetails();
  
        ad = new Add(d, pa, coach, currentLevel, dt);


  //Colour
   fc= new Color(49,60,79);
   

    //Panel

    panel= new JPanel();
    panel.setLayout(null);
    panel.setBackground(fc);
    
// Coach and current level logic



currentLevel.setCoach(coach);
coach.setCurrentLevel(currentLevel);

currentLevel.getFt().addActionListener(currentLevel);
currentLevel.getSp().addActionListener(currentLevel);


//Images
winLog=new ImageIcon("LOGOCS/CSIcon-modified.png");
super.setIconImage(winLog.getImage());
//Adding Elements
panel.add(new Header());
panel.add(d);
panel.add(pa);
panel.add(currentLevel);
panel.add(coach);
panel.add(dt);
panel.add(ad);
//Panel adding
super.add(panel);
  }

    
}