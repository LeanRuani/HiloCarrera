package hiloscarrera;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.Color;

public class Pista extends javax.swing.JPanel {

   
    public Pista() {
        initComponents();
        
    }
    @Override
    public void paintComponent(Graphics g){
       super.paintComponent(g); 
       Graphics2D g2 = (Graphics2D) g;
       g2.draw(new Ellipse2D.Float(25,25,750,450));
       g2.draw(new Ellipse2D.Float(75,75,650,350));
       g2.draw(new Ellipse2D.Float(125,125,550,250));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
