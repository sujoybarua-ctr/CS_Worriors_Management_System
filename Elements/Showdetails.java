package Elements;
import javax.swing.*;
import java.awt.*;
public class Showdetails extends JPanel{
    private JTextArea d;
    public Showdetails(){
super.setLayout(null);
super.setBounds(540,350,290,450);
super.setBackground(Color.RED);
super.setOpaque(false);

 JLabel l=new JLabel("Showing Details");
 l.setBounds(35,50,250,50);
 l.setFont(new Font("Palatino Linotype", Font.BOLD, 25));
    l.setForeground(new Color(245,238,27));

 // TextArea
 d=new JTextArea();
 d.setBounds(10,110,235,250);
    d.setFont(new Font("Agency FB", Font.BOLD, 20));
    d.setForeground(Color.WHITE);
    d.setBackground(new Color(60,79,92));
    JScrollPane scrollPane= new JScrollPane(d);
    scrollPane.setBounds(10,110,235,250);

    super.add(scrollPane);
    super.add(l);
    }
    //Method for appending the submitted infos in Add class 
    public void appendText(String Text){
d.append(Text);
    }
}
