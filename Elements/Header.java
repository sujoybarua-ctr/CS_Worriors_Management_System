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
        super.setBounds(0, 0, 2500, 55);//width 800( Smaller window)
        super.setBackground(new Color(159,201,58));
        //Font 
    f1= new Font("Agency FB",Font.BOLD,30);
    //Title
lc= new Color(255,255,255);
l1= new JLabel("CS Worriors Homepage");
l1.setBounds(300, 0, 2500 , 58);//width 800( Smaller window)
l1.setFont(f1);
l1.setForeground(lc);
l1.setBackground(new Color(159,201,58));
//Images 
img=new ImageIcon("LOGOCS/CSIconTitle-modified.png");
licon=new JLabel(img);
licon.setBounds(270,18,25,25);

super.add(l1);
super.add(licon);
    }
}
