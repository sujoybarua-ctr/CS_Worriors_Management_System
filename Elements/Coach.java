package Elements;
import javax.swing.*;

import java.awt.event.*;

import java.awt.*;
public class Coach extends JPanel implements ActionListener{
    private JRadioButton cy,cn, chy, chn;
    private ButtonGroup cp,bg;
    private JComboBox<String> ct; // Using a String type array for JComboBox
    private CurrentLevel currentLevel ;
    private boolean coachWarning;
    public Coach(){
        super.setLayout(null);
        super.setBounds(540,10,300,370);
        super.setBackground(Color.RED);
        super.setOpaque(false);
//Title
        JLabel c=new JLabel("Management");
        c.setFont(new Font("Palatino Linotype", Font.BOLD, 25));
        c.setForeground(new Color(245,238,27));
        c.setBounds(50,87,250,50);

//Asking

JLabel ask= new JLabel("Player is Coach ?");
ask.setFont(new Font("Agency FB", Font.BOLD, 25));
ask.setForeground(Color.WHITE);
ask.setBounds(60,200,250,50);

JLabel ctl= new JLabel("Coach Type");
ctl.setFont(new Font("Agency FB", Font.BOLD, 25));
ctl.setForeground(Color.WHITE);
ctl.setBounds(60, 285, 250, 50);

JLabel cl=new JLabel("Captancy");
cl.setFont(new Font("Agency FB", Font.BOLD, 25));
cl.setForeground(Color.WHITE);
cl.setBounds(60, 115, 250, 50);
//RadioButton

cy=new JRadioButton("Yes");
cy.setFont(new Font("Agency FB", Font.BOLD, 20));
cy.setBackground(new Color(49,60,79));
cy.setForeground(Color.WHITE);
cy.setBounds(55,170 , 50, 20);
super.add(cy);
cy.addActionListener(this);

cn=new JRadioButton("No");
cn.setFont(new Font("Agency FB", Font.BOLD, 20));
cn.setBackground(new Color(49,60,79));
cn.setForeground(Color.WHITE);
cn.setBounds(145,170 , 50, 20);
super.add(cn);

cp=new ButtonGroup();
cp.add(cy);
cp.add(cn);

chy= new JRadioButton("Yes");
chy.setFont(new Font("Agency FB", Font.BOLD, 20));
chy.setBackground(new Color(49,60,79));
chy.setForeground(Color.WHITE);
chy.setBounds(55,255 , 50, 20);
chn= new JRadioButton("No");
chn.setFont(new Font("Agency FB", Font.BOLD, 20));
chn.setBackground(new Color(49,60,79));
chn.setForeground(Color.WHITE);
chn.setBounds(145,255 , 50, 20);
super.add(chn);
super.add(chy);
chy.addActionListener(this);
chn.addActionListener(this);

bg=new ButtonGroup();
bg.add(chy);
bg.add(chn);

        //JComboBox
String [] ctp={"","N/A","Manager","Assistant Manager"};
ct= new JComboBox<String>(ctp);
ct.setBounds(55, 340, 150, 30);
ct.setBackground(new Color(60,79,92));
ct.setForeground(Color.WHITE);
ct.setFont(new Font("Agency FB", Font.BOLD, 20));
super.add(ct);
        super.add(c);
        super.add(cl);
        super.add(ask);
        super.add(ctl);
    }
//setter for currentLevel to access from Home class
public void setCurrentLevel(CurrentLevel currentLevel) {
        this.currentLevel = currentLevel;
    }

    //Method for coach slection with conditions

public void coachSelect(){
        String fit=(String)currentLevel.getFt().getSelectedItem();
        String playertype=(String)currentLevel.getSp().getSelectedItem();
     
        if ((fit!=null && !fit.isEmpty())|| (playertype!=null && !playertype.isEmpty())) {// if any of the selection(except "") in ft or sp happened       
        ct.setSelectedIndex(1);
        ct.setEnabled(false);
        chy.setSelected(false);
        chy.setEnabled(false);

        //popup logic

                if (!coachWarning) {
                JOptionPane.showMessageDialog(null, "You cannot select to be Coach now", "Note", JOptionPane.INFORMATION_MESSAGE); 
                coachWarning = true;
                }
        chn.setSelected(true);
        }else { if (!chn.isSelected()) {
                 ct.setEnabled(true);  
                chy.setEnabled(true);
                coachWarning=false;
        }
             
        }
}
public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==chy) {
                cn.setSelected(true);
                ct.setEnabled(true);
    }
    if (ae.getSource()==chn) {
        ct.setSelectedIndex(1);
                ct.setEnabled(false);
    }
        if (ae.getSource()==cy) {
                chn.setSelected(true);
                ct.setSelectedIndex(1);
                ct.setEnabled(false);
                chy.setEnabled(false);
                if (!coachWarning) {
                JOptionPane.showMessageDialog(null, "You cannot select to be Coach now", "Note", JOptionPane.INFORMATION_MESSAGE); 
                coachWarning = true;
                }
        }
}
//getters for coach panel
public String getCaptancy(){
        if (cy.isSelected()) {
                return "Yes";
        }else if (cn.isSelected()) {
                return "No";
        }
return "";
}
public String getCoach(){
        if (chy.isSelected()) {
                return "Yes";
        }else if (chn.isSelected()) {
                return "No";
        }
        return "";}

public String getCoachType(){
        return (String)ct.getSelectedItem();
        
}       


}
