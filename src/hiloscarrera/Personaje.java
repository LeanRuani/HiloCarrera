package hiloscarrera;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Personaje extends Thread {
    
    private JPanel jpPista;
    private JLabel jlCorredor;
    private int Prioridad;
    private ArrayList pod;
    private int x, y = 0;
    private float radio = 0;
    private float a, b = 0;
    
    
    public Personaje (JLabel c, JPanel p, float as, float bs, int prio, ArrayList pos) {
        jlCorredor = c;
        jpPista = p;
        a = as;
        b = bs;
        Prioridad = prio;
        pod = pos;
    }

    @Override
    public void run(){
        for (int i = 0; i < 360; i++){
            radio= (float)((a*b)/Math.sqrt(Math.pow(b, 2)* Math.pow(Math.cos(Math.toRadians(i)), 2) + Math.pow(a,2)*Math.pow(Math.sin(Math.toRadians(i)), 2)));
            x = (int) (radio * Math.cos(Math.toRadians(i))+ (750/2));
            y = (int) (radio * Math.sin(Math.toRadians(i))+ (450/2));
            jlCorredor.setLocation(x, y);
            try{
                Esperar();
            }catch (InterruptedException ie){        
            }
                yield();
            }
            pod.add((Icon)jlCorredor.getIcon());
            
            
//             for (int i = 0; i < 360; i++){
//                radio= (float)((a2*b2)/Math.sqrt(Math.pow(b2, 2)* Math.pow(Math.cos(Math.toRadians(i)), 2) + Math.pow(a2,2)*Math.pow(Math.sin(Math.toRadians(i)), 2)));
//                x = (int) (radio * Math.cos(Math.toRadians(i))+ (650/2));
//                y = (int) (radio * Math.sin(Math.toRadians(i))+ (350/2));
//                jlCorredor.setLocation(x, y);
//                try{
//                    Esperar();
//                }catch (InterruptedException ie){
//                    
//                }
//                    yield();
//                }    
//             
//             
//              for (int i = 0; i < 360; i++){
//                radio= (float)((a3*b3)/Math.sqrt(Math.pow(b3, 2)* Math.pow(Math.cos(Math.toRadians(i)), 2) + Math.pow(a3,2)*Math.pow(Math.sin(Math.toRadians(i)), 2)));
//                x = (int) (radio * Math.cos(Math.toRadians(i))+ (550/2));
//                y = (int) (radio * Math.sin(Math.toRadians(i))+ (350/2));
//                jlCorredor.setLocation(x, y);
//                try{
//                    Esperar();
//                }catch (InterruptedException ie){
//                    
//                }
//                    yield();
//                }    
    }
        
    private void Esperar() throws InterruptedException {
        Thread.sleep(Prioridad);
    }
            
}



