package hiloscarrera;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JLabel;


public class Podio extends Thread{
    
    ArrayList al;
    Personaje Mario, Luigi, Toad;
    JLabel jlblPos1, jlblPos2, jlblPos3;
    
    public Podio (JLabel pos1, JLabel pos2, JLabel pos3, ArrayList pos, Personaje Ma, Personaje Lu, Personaje To){
       jlblPos1=pos1;
       jlblPos2=pos2;
       jlblPos3=pos3;
       Mario = Ma;
       Luigi = Lu;
       Toad = To;
       al = pos; 
    }
    
    public void run(){
        while ((Mario.isAlive()) || Luigi.isAlive() || Toad.isAlive()){
            
        }
        
        jlblPos1.setIcon((Icon)al.get(0));
        jlblPos2.setIcon((Icon)al.get(1));
        jlblPos3.setIcon((Icon)al.get(2));
    }
    
    
    
}
