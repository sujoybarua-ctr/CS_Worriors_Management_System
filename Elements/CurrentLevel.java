package Elements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CurrentLevel extends JPanel implements ActionListener{
    private JRadioButton bg, avg, sk, pro, lf, rf;
    private ButtonGroup b1, b2;
    private JComboBox<String> ft, sp;// using a String type array for JComboBox
    private ImageIcon in;
    private JLabel inl;
    private Coach coach;

    public CurrentLevel() {
        super.setLayout(null);
        super.setBackground(Color.RED);
        super.setOpaque(false);
        super.setBounds(300, 280, 240, 550);

        // Addig Labels
        JLabel l1 = new JLabel("Technical Level");
        l1.setBounds(10, 4, 250, 60);
        l1.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
        l1.setForeground(new Color(245, 238, 27));

        JLabel l2 = new JLabel("Player Strong Foot");
        l2.setBounds(10, 115, 250, 60);
        l2.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
        l2.setForeground(new Color(245, 238, 27));

        JLabel l3 = new JLabel("Player Fitness");
        l3.setBounds(10, 200, 250, 60);
        l3.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
        l3.setForeground(new Color(245, 238, 27));

        // Player level adding

        bg = new JRadioButton("Beginner");
        bg.setBounds(10, 60, 100, 20);
        bg.setBackground(new Color(49, 60, 79));
        bg.setForeground(Color.WHITE);
        bg.setFont(new Font("Agency FB", Font.BOLD, 20));
        super.add(bg);

        avg = new JRadioButton("Average");
        avg.setBounds(10, 90, 100, 20);
        avg.setBackground(new Color(49, 60, 79));
        avg.setForeground(Color.WHITE);
        avg.setFont(new Font("Agency FB", Font.BOLD, 20));
        super.add(avg);

        sk = new JRadioButton("Skilled");
        sk.setBounds(120, 60, 100, 20);
        sk.setBackground(new Color(49, 60, 79));
        sk.setForeground(Color.WHITE);
        sk.setFont(new Font("Agency FB", Font.BOLD, 20));
        super.add(sk);

        pro = new JRadioButton("Professional");
        pro.setBounds(120, 90, 100, 20);
        pro.setBackground(new Color(49, 60, 79));
        pro.setForeground(Color.WHITE);
        pro.setFont(new Font("Agency FB", Font.BOLD, 20));
        super.add(pro);

        b1 = new ButtonGroup();
        b1.add(bg);
        b1.add(avg);
        b1.add(sk);
        b1.add(pro);

        // Strong Foot Adding

        lf = new JRadioButton("Left Foot");
        lf.setBounds(10, 170, 100, 20);
        lf.setBackground(new Color(49, 60, 79));
        lf.setForeground(Color.WHITE);
        lf.setFont(new Font("Agency FB", Font.BOLD, 20));
        super.add(lf);

        rf = new JRadioButton("Right Foot");
        rf.setBounds(120, 170, 100, 20);
        rf.setBackground(new Color(49, 60, 79));
        rf.setForeground(Color.WHITE);
        rf.setFont(new Font("Agency FB", Font.BOLD, 20));
        super.add(rf);

        b2 = new ButtonGroup();
        b2.add(lf);
        b2.add(rf);

        // Fitness setting

        String[] fit = { "", "Fit to Play", "Injured", "Recovering" };

        ft = new JComboBox<String>(fit);
        ft.setBounds(10, 250, 150, 35);
        ft.setBackground(new Color(60,79,92));
        ft.setForeground(Color.WHITE);
        ft.setFont(new Font("Agency FB", Font.PLAIN, 25));
        super.add(ft);
        ft.addActionListener(this);

        // Squad type

        JLabel l4 = new JLabel("Player Type");
        l4.setBounds(10, 300, 250, 60);
        l4.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
        l4.setForeground(new Color(245, 238, 27));

        String[] sqd = { "", "Main Squad", "Substitute", "Reserved Squad" };
        sp = new JComboBox<String>(sqd);
        sp.setBounds(10, 355, 150, 35);
        sp.setBackground(new Color(60,79,92));
        sp.setForeground(Color.WHITE);
        sp.setFont(new Font("Agency FB", Font.PLAIN, 25));
        super.add(sp);
        sp.addActionListener(this);

        //Iniesta 

        in = new ImageIcon("LOGOCS/mad.png");
        inl = new JLabel(in);
        inl.setBounds(10, 390, 150, 150);
        inl.setOpaque(false);
        super.add(inl);

        

        // components adding
        super.add(l1);
        super.add(l2);
        super.add(l3);
        super.add(l4);
    }
    //Getters for Coach Panel

        public JComboBox<String> getFt(){
            return ft;
        }

        public JComboBox<String> getSp(){
            return sp;
        }

        //setter for Coach 
        public void setCoach(Coach coach) {
            this.coach = coach;
        }

        //Coach Resttrictions
        public void actionPerformed(ActionEvent ae){
            if (ae.getSource()==ft || ae.getSource()==sp) {
                coach.coachSelect();
            }
        }

        //Getters for Current Level

        public String getPlayerLevel(){
            if (bg.isSelected()) {
                return "Begginer";
            }
            if (avg.isSelected()) {
                return "Average";
            }
            if (sk.isSelected()) {
                return "Skilled";
            }
            if (pro.isSelected()) {
                return "Professional";
            }
            return "";
        }

        public String getStrongFoot(){
            if (lf.isSelected()) {
                return "Left Foot";
            }
            if (rf.isSelected()) {
                return "Right Foot";
            }
            return "";
        }

        public String getFit(){
            if (ft.getSelectedItem()!=null ) {
                return (String)ft.getSelectedItem();
            }return "";
        }
        public String getSquadType(){
            if (sp.getSelectedItem()!= null) {
                return (String)sp.getSelectedItem();
            } return "";
        }
}
