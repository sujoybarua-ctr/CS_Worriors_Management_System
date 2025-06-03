package Elements;
import javax.swing.*;
import java.awt.*;

public class Details extends JPanel{

    private JTextField pn,pi,jn,sem;
    private JTextArea sg,ex;
    private JLabel tit, pnt,pit, jnt, semt, sgt,ext;
    private Font tf,lf;
    private Color tc,pntc;
     public Details(){
        super.setLayout(null);
        super.setBounds(0,0,290,800);
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

        pi=new JTextField();
        pi.setBounds(140,198,132,30);
        pi.setFont(lf);
        pi.setBackground(new Color(60,79,92));
        pi.setForeground(Color.WHITE);

        sem=new JTextField();
        sem.setBounds(140,248,132,30);
        sem.setFont(lf);
        sem.setBackground(new Color(60,79,92));
        sem.setForeground(new Color(206, 209, 199));

        jn=new JTextField();
        jn.setBounds(140,298,35,30);
        jn.setFont(lf);
        jn.setBackground(new Color(60,79,92));
        jn.setForeground(Color.WHITE);
        
//textArea
        ex=new JTextArea();
        ex.setBounds(15,590,260,100);
        ex.setFont(lf);

        sg=new JTextArea();
        sg.setBounds(15,410,260,100);
        sg.setFont(lf);
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
     }
    
}
