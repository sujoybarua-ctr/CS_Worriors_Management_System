import java.lang.*;
import javax.swing.*;

import Elements.*;

import java.awt.*;

public class Home extends JFrame{
  private JPanel  panel;
  private Color fc;
  private JLabel wicon;
  private ImageIcon img,winLog;
  //Frame 
  
  public Home(){
    super("CS Worriors Homepage");
    super.setBounds(600,200,800,800);
    super.setDefaultCloseOperation(EXIT_ON_CLOSE);

  //Colour
   fc= new Color(49,60,79);
   

    //Panel

    panel= new JPanel();
    panel.setLayout(null);
    panel.setBackground(fc);
    
// labels



//Images
winLog=new ImageIcon("LOGOCS/CSIcon-modified.png");
super.setIconImage(winLog.getImage());
//Adding Elements
panel.add(new Header());
panel.add(new Details());
panel.add(new PlayerAttribute());
panel.add(new CurrentLevel());
//Panel adding
super.add(panel);
  }
    
}