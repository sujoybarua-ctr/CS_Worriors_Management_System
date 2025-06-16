package Elements;
import javax.swing.*;
import java.awt.*;
public class PlayerAttribute extends JPanel {
private JCheckBox gk,cb,lb,rb,cm,dm,am,rm,lm,lw,rw,st;    

public PlayerAttribute(){
    super.setLayout(null);
    super.setBounds(300,0,250,280);
    super.setBackground(Color.cyan);
    super.setOpaque(false);

//Lbels adding
     
    JLabel pp= new JLabel("Field Expertise");
    pp.setBounds(10,98,250,50);
    pp.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
    pp.setForeground(new Color(245,238,27));
    super.add(pp);
// CheckBox adding

gk=new JCheckBox("GK");
cb=new JCheckBox("CB");
lb=new JCheckBox("LB");
rb=new JCheckBox("RB");
cm=new JCheckBox("CM");
dm=new JCheckBox("DMF");
am=new JCheckBox("AMF");
rm=new JCheckBox("RM");
lm=new JCheckBox("LM");
lw=new JCheckBox("LWF");
rw=new JCheckBox("RWF");
st=new JCheckBox("CF");

//CheckBox Bound Section
gk.setBounds(10, 148, 50, 20);
cb.setBounds(10, 178, 50, 20);
lb.setBounds(10,208,50,20);
rb.setBounds(10,238,50,20);
cm.setBounds(80,148,60,20);
dm.setBounds(80,178,60,20);
am.setBounds(80,208,60,20);
rm.setBounds(80,238,50,20);
lm.setBounds(150,148,50,20);
lw.setBounds(150,178,60,20);
rw.setBounds(150,208,60,20);
st.setBounds(150,238,50,20);

//checkBox Background and Foreground

gk.setBackground(new Color(49,60,79));
cb.setBackground(new Color(49,60,79));
lb.setBackground(new Color(49,60,79));
rb.setBackground(new Color(49,60,79));
dm.setBackground(new Color(49,60,79));
cm.setBackground(new Color(49,60,79));
am.setBackground(new Color(49,60,79));
rm.setBackground(new Color(49,60,79));
lm.setBackground(new Color(49,60,79));
lw.setBackground(new Color(49,60,79));
rw.setBackground(new Color(49,60,79));
st.setBackground(new Color(49,60,79));


gk.setForeground(Color.white);
cb.setForeground(Color.white);
lb.setForeground(Color.white);
rb.setForeground(Color.white);
cm.setForeground(Color.white);
dm.setForeground(Color.white);
am.setForeground(Color.white);
rm.setForeground(Color.white);
lm.setForeground(Color.white);
lw.setForeground(Color.white);
rw.setForeground(Color.white);
st.setForeground(Color.white);

//checkbox adding

super.add(gk);
super.add(cb);
super.add(lb);
super.add(rb);
super.add(cm);
super.add(dm);
super.add(am);
super.add(rm);
super.add(lm);
super.add(lw);
super.add(rw);
super.add(st);

}
// Methods for getting values of checkboxes

public String getPositions(){
    StringBuilder p = new StringBuilder();// StringBuilder to modify String (cuz Strings are immutable)
    if(gk.isSelected()) p.append("GK ");
    if(cb.isSelected())p.append("CB ");
    if (lb.isSelected()) p.append("LB ");
    if (rb.isSelected()) p.append("RB ");
    if (cm.isSelected()) p.append("CM ");
    if (dm.isSelected()) p.append("DMF ");
    if (am.isSelected()) p.append("AMF ");
    if (rm.isSelected()) p.append("RM ");
    if (lm.isSelected()) p.append("LM ");
    if (lw.isSelected()) p.append("LWF ");
    if (rw.isSelected()) p.append("RWF ");
    if (st.isSelected()) p.append("CF ");

    return p.toString().trim();// convert mutable StringBuilder to immutable string with trim() removing 
    // before and after spaces
}
}
