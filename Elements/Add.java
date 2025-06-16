package Elements;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import Entity.*;
public class Add extends JPanel implements MouseListener, ActionListener {
   private JButton ad, ext;
   private ImageIcon sa,sg;
   private JLabel sal, sgl;
   private Details d;
   private PlayerAttribute pa;
   private Coach c;
   private CurrentLevel cl;
   private Showdetails dt;
public Add(Details d, PlayerAttribute pa, Coach c, CurrentLevel cl, Showdetails dt) {

this.d = d;
this.pa = pa;
this.c = c;
this.cl = cl;
this.dt=dt;

    super.setLayout(null);
    super.setBounds(300,710,550,100);
    super.setBackground(Color.RED);
    super.setOpaque(false);

    //Buttons
    ad= new JButton("Add");
    ad.setFont(new Font("Agency FB", Font.BOLD, 20));
    ad.setBackground(new Color(49,60,79));
    ad.setForeground(Color.WHITE);
    ad.setBounds(250, 50, 100, 30);
    ad.addMouseListener(this);


    ext= new JButton("Exit");
    ext.setFont(new Font("Agency FB", Font.BOLD, 20));
    ext.setBackground(new Color(49,60,79));
    ext.setForeground(Color.WHITE);
    ext.setBounds(380, 50, 100, 30);
    ext.addActionListener(this);

// suii
sa= new ImageIcon("LOGOCS/sa.png");
sg= new ImageIcon("LOGOCS/sg.png");
sal=new JLabel(sa);
sal.setBounds(170,0,100,100);
sgl=new JLabel(sg);
sgl.setBounds(180,10,100,100);
sal.setOpaque(false);
sgl.setOpaque(false);
sal.setVisible(false);



    super.add(ad);
    super.add(ext);
    super.add(sal);
    super.add(sgl);
    ad.addActionListener(this);
}
// Mouse Listner

public void mouseClicked(MouseEvent me){

}
public void mousePressed(MouseEvent me) {
}

public void mouseReleased(MouseEvent me) {
}
public void mouseEntered(MouseEvent me) {
 
 if(me.getSource()==ad){
        sal.setVisible(true);
        sgl.setVisible(false);
    }
}
public void mouseExited(MouseEvent me) {
    if(me.getSource()==ad){
    sal.setVisible(false);
    sgl.setVisible(true);
 }
}
// methods for add function

public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==ad){
        String name,id,jersey,sem,exp,stg,pos,level,sf,fitn,plt,cap,coc,coct;
        name=d.getName();
        id=d.getId();
        jersey=d.getJersey();
        sem=d.getSemester();
        exp=d.getExp();
        stg=d.getStrategy();
        pos=pa.getPositions();
        level=cl.getPlayerLevel();
        sf=cl.getStrongFoot();
        fitn=cl.getFit();
        plt=cl.getSquadType();
        cap=c.getCaptancy();
        coc=c.getCoach();
        coct=c.getCoachType();
        if( name.isEmpty() || id.isEmpty() || jersey.isEmpty() || sem.isEmpty() || exp.isEmpty() || stg.isEmpty() || pos.isEmpty() || level.isEmpty() || sf.isEmpty() || cap.isEmpty() || coc.isEmpty() || coct.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill all the neccessary informations ", "info lacking", JOptionPane.ERROR_MESSAGE);
        }else {
            Player obj= new Player(name, id, jersey, sem, exp, stg, pos, level, sf, fitn, plt, cap, coc, coct);
            obj.insertInfo();
            JOptionPane.showMessageDialog(null, "Infomation Registered!","Registration",JOptionPane.INFORMATION_MESSAGE);
            check();
        }

    }if(ae.getSource()==ext){
            System.exit(0);
        }
} private void check(){
    try {
        File file =new File("./Data/PlayerData.txt");
        if(file.exists()){
            FileReader fr=new FileReader(file);
            BufferedReader br= new BufferedReader(fr);
            String line;
            while ((line= br.readLine())!=null){
                dt.appendText(line+"\n");
            }
            br.close();
            fr.close();
        }
    }catch(IOException ioe){
        ioe.printStackTrace();
        JOptionPane.showMessageDialog(this,"Error!");
    }
}

}