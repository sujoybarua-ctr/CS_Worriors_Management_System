package Entity;
import java.lang.*;
import javax.swing.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Player {
private String name,id,jersey,sem,exp,stg,pos,level,sf,fitn,plt,cap,coc,coct;
private File file;
private FileWriter fwriter;
public Player(String name, String id, String jersey, String sem, String exp, String stg, String pos, String level, String sf, String fitn, String plt, String cap, String coc, String coct) {
    this.name = name;
    this.id = id;
    this.jersey = jersey;
    this.sem = sem;
    this.exp = exp;
    this.stg = stg;
    this.pos = pos;
    this.level = level;
    this.sf = sf;
    this.fitn = fitn;
    this.plt = plt;
    this.cap = cap;
    this.coc = coc;
    this.coct = coct;
    } public void insertInfo(){
        try {
            file =new File("./Data/PlayerData.txt");
            if (!file.exists()) {
                file.getParentFile().mkdirs(); // creates a parent folder to contain txt file
                file.createNewFile();
            }

            LocalDateTime date=LocalDateTime.now();
            DateTimeFormatter formatmy= DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");
            String dateNow= date.format(formatmy);

fwriter = new FileWriter(file,true);
fwriter.write("Date registered:"+dateNow+"\n");
fwriter.write("============================\n");
            fwriter.write("Name: "+name+"\n");
            fwriter.write("Id: "+id+"\n");
            fwriter.write("Semester: "+sem);
            fwriter.write("\nJersey No. :"+jersey);
            fwriter.write("\nStrategy: "+stg);
            fwriter.write("\nPosition(s): "+pos);
            fwriter.write("\nLevel: "+level);
            fwriter.write("\nStrong Foot: "+sf);
            fwriter.write("\nFitness: "+fitn);
            fwriter.write("\nSquad Type: "+plt);
            fwriter.write("\nCaptaincy: "+cap);
            fwriter.write("\nCoach: "+coc);
            fwriter.write("\nCoach Type: "+coct);
            fwriter.write("\nExperience: "+exp);
            fwriter.write("\n------------------------------\n");
fwriter.flush(); //ensure the file is written
fwriter.close();//closes file writer

        } catch (IOException ioe) {
           ioe.printStackTrace();
           JOptionPane.showMessageDialog(null, "Error reading file", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     
}