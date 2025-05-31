package Elements;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Header extends JPanel{
    private Font f1;
    private Color lc;
    private JLabel l1,licon;
    private ImageIcon img;
    public Header(){
        super.setLayout(null);
        super.setBounds(0, 0, 2500, 55);
        super.setBackground(new Color(159,201,58));
        //Font 
    f1= new Font("Agency FB",Font.BOLD,30);
    //Title
lc= new Color(255,255,255);
l1= new JLabel("CS Worriors Homepage");
l1.setBounds(280, 0, 2500 , 58);
l1.setFont(f1);
l1.setForeground(lc);
l1.setBackground(new Color(159,201,58));
l1.setOpaque(true);
//Images 
img=new ImageIcon("LOGOCS/CSIconTitle-modified.png");
licon=new JLabel(img);
licon.setBounds(250,18,25,25);

super.add(l1);
super.add(licon);
    }
}
