package Elements;
import javax.swing.*;
import java.awt.*;
public class CurrentLevel extends JPanel {
    private JRadioButton bg, avg, sk, pro ,lf, rf;
    private ButtonGroup b1,b2;
    private JComboBox ft,sp;

    public CurrentLevel (){
        super.setLayout(null);
        super.setBackground(Color.RED);
        super.setOpaque(false);
        super.setBounds(300,280,250,500);

        // Addig Labels
        JLabel l1= new JLabel("Playing Level");
        l1.setBounds(10,4,250,60);
        l1.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
        l1.setForeground(new Color(245,238,27));

        JLabel l2= new JLabel("Player Strong Foot");
        l2.setBounds(10,115,250,60);
        l2.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
        l2.setForeground(new Color(245,238,27));

        JLabel l3= new JLabel("Player Fitness");
        l3.setBounds(10,200,250,60);
        l3.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
        l3.setForeground(new Color(245,238,27));

        //Player level adding

        bg=new JRadioButton("Beginner");
        bg.setBounds(10, 60,100,20);
        bg.setBackground(new Color(49,60,79));
        bg.setForeground(Color.WHITE);
        super.add(bg);

        avg=new JRadioButton("Average");
        avg.setBounds(10, 90,100,20);
        avg.setBackground(new Color(49,60,79));
        avg.setForeground(Color.WHITE);
        super.add(avg);

        sk=new JRadioButton("Skilled");
        sk.setBounds(120, 60,100,20);
        sk.setBackground(new Color(49,60,79));
        sk.setForeground(Color.WHITE);
        super.add(sk);

        pro=new JRadioButton("Professional");
        pro.setBounds(120, 90,100,20);
        pro.setBackground(new Color(49,60,79));
        pro.setForeground(Color.WHITE);
        super.add(pro);

        b1 = new ButtonGroup();
        b1.add(bg);
        b1.add(avg);
        b1.add(sk);
        b1.add(pro);

        // Strong Foot Adding

        lf=new JRadioButton("Left Foot");
        lf.setBounds(10, 170,100,20);
        lf.setBackground(new Color(49,60,79));
        lf.setForeground(Color.WHITE);
        super.add(lf);

        rf= new JRadioButton("Right Foot");
        rf.setBounds(120, 170,100,20);
        rf.setBackground(new Color(49,60,79));
        rf.setForeground(Color.WHITE);
        super.add(rf);

        b2 = new ButtonGroup();
        b2.add(lf);
        b2.add(rf);


        // Fitness setting

    String[] fit= {"","Fit to Play", "Injured","Recovering"};

    ft= new JComboBox(fit);
    ft.setBounds(10, 250, 150, 35);
    ft.setBackground(new Color(49,60,79));
    ft.setForeground(Color.WHITE);
    ft.setFont(new Font("Agency FB",Font.PLAIN, 25));
    super.add(ft);


    // Squad type 

    JLabel l4= new JLabel("Player Type");
    l4.setBounds(10, 300, 250, 60);
    l4.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
    l4.setForeground(new Color(245,238,27));


    String[] sqd={"","Main Squad","Substitute","Reserved Squad"};
    sp= new JComboBox(sqd);
    sp.setBounds(10, 355, 150, 35);
    sp.setBackground(new Color(49,60,79));
    sp.setForeground(Color.WHITE);
    sp.setFont(new Font("Agency FB",Font.PLAIN, 25));
    super.add(sp);


//components adding
       super.add(l1); 
       super.add(l2);
       super.add(l3);
       super.add(l4);
    }
}
