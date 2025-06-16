package Elements;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Details extends JPanel implements MouseListener{

    private JTextField pn,pi,jn,sem;
    private JTextArea sg,ex;
    private JLabel tit, pnt,pit, jnt, semt, sgt,ext,msl,ms2l,kkl,mk1l,mk2l;
    private Font tf,lf;
    private Color tc,pntc;
    private ImageIcon ms,ms2,kk,mk1,mk2;
     public Details(){
        super.setLayout(null);
        super.setBounds(0,0,299,825);
        super.setBackground(new Color(244,0,0));
       super.setOpaque(false);


    //Font 
        lf=new Font("Agency FB",Font.BOLD,25);
        pntc =new Color(255,255,255);

        tf=new Font("Palatino Linotype",Font.BOLD,26);
        tc=new Color(245,238,27);

        //Tiltle 
tit = new JLabel("Scout Report ");
tit.setBounds(14,100,270,50);
tit.setFont(tf);
tit.setForeground(tc);
//textLabel

        pnt=new JLabel("Players Name :");
        pnt.setBounds(15,135,250,50);
        pnt.setFont(lf);
        pnt.setForeground(pntc);

        pit =new JLabel("Players ID :");
        pit.setBounds(15,185,250,50);
        pit.setFont(lf);
        pit.setForeground(pntc);


        semt=new JLabel("Semester :");
        semt.setBounds(15,235,250,50);
        semt.setFont(lf);
        semt.setForeground(pntc);

        jnt=new JLabel("Jersey No. :");
        jnt.setBounds(15,285,250,50);
        jnt.setFont(lf);
        jnt.setForeground(pntc);

        ext=new JLabel("Players Experience ");
        ext.setBounds(15,535,250,50);
        ext.setFont(lf);
        ext.setForeground(pntc);

         sgt=new JLabel("Players Field Strategy ");
        sgt.setBounds(15,355,250,50);
        sgt.setFont(lf);
        sgt.setForeground(pntc);
//textFields
        
        pn=new JTextField();
        pn.setBounds(140,148,132,30);
        pn.setFont(lf);
        pn.setBackground(new Color(60,79,92));
        pn.setForeground(new Color(206, 209, 199));
        pn.setBorder(BorderFactory.createEmptyBorder());
        pn.setOpaque(false);
        pn.setCaretColor(Color.WHITE);
       

        pi=new JTextField();
        pi.setBounds(140,198,132,30);
        pi.setFont(lf);
        pi.setBackground(new Color(60,79,92));
        pi.setForeground(Color.WHITE);
        pi.setBorder(BorderFactory.createEmptyBorder());
        pi.setOpaque(false);
        pi.setCaretColor(Color.white);

        sem=new JTextField();
        sem.setBounds(140,248,132,30);
        sem.setFont(lf);
        sem.setBackground(new Color(60,79,92));
        sem.setForeground(new Color(206, 209, 199));
        sem.setBorder(BorderFactory.createEmptyBorder());
        sem.setOpaque(false);
        sem.setCaretColor(Color.white);

        jn=new JTextField();
        jn.setBounds(140,298,35,30);
        jn.setFont(lf);
        jn.setBackground(new Color(60,79,92));
        jn.setForeground(Color.WHITE);
        jn.setBorder(BorderFactory.createEmptyBorder());
        jn.setOpaque(false);
        jn.setCaretColor(Color.WHITE);
        
//textArea
        ex=new JTextArea();
        ex.setBounds(15,590,260,100);
        ex.setBackground(new Color(60,79,92));
        ex.setForeground(Color.WHITE);
        ex.setCaretColor(Color.WHITE);
        ex.setFont(lf);
        ex.addMouseListener(this);

        sg=new JTextArea();
        sg.setBounds(15,410,260,100);
        sg.setBackground(new Color(60,79,92));
        sg.setForeground(Color.WHITE);
        sg.setCaretColor(Color.WHITE);
        sg.setFont(lf);
        sg.addMouseListener(this);

        //Messi 

        ms=new ImageIcon("LOGOCS/Media.png");
        msl=new JLabel(ms);
        msl.setBounds(55,80,350,500);
        msl.setOpaque(false);

        ms2=new ImageIcon("LOGOCS/Media2.png");
        ms2l=new JLabel(ms2);
        ms2l.setBounds(75,80,350,500);
        ms2l.setOpaque(false);
        ms2l.setVisible(false);

        //kaka
        kk=new ImageIcon("LOGOCS/kaka.png");
        kkl=new JLabel(kk);
        kkl.setBounds(0,515,125,500);
        kkl.setOpaque(false);

        //Messi kick

        mk1=new ImageIcon("LOGOCS/mk1.png");
        mk1l=new JLabel(mk1);
        mk1l.setBounds(105,680,180,150);
        mk1l.setOpaque(false);
        


        mk2=new ImageIcon("LOGOCS/mk2.png");
        mk2l=new JLabel(mk2);
        mk2l.setBounds(124,675,150,150);
        mk2l.setOpaque(false);
        mk2l.setVisible(false);
        

//Components adding
super.add(tit);
super.add(pnt);
super.add(pit);
super.add(semt);
super.add(sem);
super.add(pn);
super.add(pi);
super.add(jnt);
super.add(jn);
super.add(ext);
super.add(ex);
super.add(sg);
super.add(sgt);
super.add(msl);
super.add(ms2l);
super.add(kkl);
super.add(mk1l);
super.add(mk2l);
     }
    public void mouseClicked(MouseEvent me){

    }
    public void mouseEntered(MouseEvent me){
if (me.getSource()==ex) {
        mk2l.setVisible(true);
        mk1l.setVisible(false);
}
if (me.getSource()==sg) {
        ms2l.setVisible(true);
        msl.setVisible(false);
}
    }
    public void mousePressed(MouseEvent me){

    }
    public void mouseExited(MouseEvent me){
if (me.getSource()==ex) {
        mk2l.setVisible(false);
        mk1l.setVisible(true);
}
if (me.getSource()==sg) {
        ms2l.setVisible(false);
        msl.setVisible(true);
}
    }
    public void mouseReleased(MouseEvent me){

    }

//getters for Details
public String getName(){
        return pn.getText();
}
public String getId(){
        return pi.getText();
}
public String getSemester(){
return sem.getText();
}
public String getJersey(){
        return jn.getText();
}
public String getExp(){
        return ex.getText();
}
public String getStrategy(){
        return sg.getText();
}

}
