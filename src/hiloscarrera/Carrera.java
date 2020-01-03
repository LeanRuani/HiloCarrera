package hiloscarrera;

import java.util.ArrayList;

public class Carrera extends javax.swing.JFrame {

    ArrayList pos;
    Podio pod;
    Personaje Mario;
    Personaje Luigi;
    Personaje Toad;
    
    public Carrera() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnEmpezar = new javax.swing.JButton();
        Pista = new hiloscarrera.Pista();
        jlblLuigi = new javax.swing.JLabel();
        jlblToad = new javax.swing.JLabel();
        jlblMario = new javax.swing.JLabel();
        jlblPod3 = new javax.swing.JLabel();
        jlblPod1 = new javax.swing.JLabel();
        jlblPod2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtnEmpezar.setText("Empezar");
        jbtnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEmpezarActionPerformed(evt);
            }
        });

        Pista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Pista.setLayout(null);

        jlblLuigi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hiloscarrera/Luigi2.png"))); // NOI18N
        Pista.add(jlblLuigi);
        jlblLuigi.setBounds(10, 60, 30, 40);

        jlblToad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hiloscarrera/Toad2.png"))); // NOI18N
        Pista.add(jlblToad);
        jlblToad.setBounds(10, 110, 40, 40);

        jlblMario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hiloscarrera/Mario2.png"))); // NOI18N
        Pista.add(jlblMario);
        jlblMario.setBounds(10, 10, 35, 40);

        jlblPod3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPod3.setText("3");
        jlblPod3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Pista.add(jlblPod3);
        jlblPod3.setBounds(310, 220, 60, 50);

        jlblPod1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPod1.setText("1");
        jlblPod1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Pista.add(jlblPod1);
        jlblPod1.setBounds(370, 200, 60, 50);

        jlblPod2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPod2.setText("2");
        jlblPod2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Pista.add(jlblPod2);
        jlblPod2.setBounds(430, 210, 60, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Pista, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnEmpezar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pista, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEmpezarActionPerformed

        pos = new ArrayList();
        
        float a1 = 750/2;
        float b1 = 450/2;
        float a2 = 650/2;
        float b2 = 350/2;
        float a3 = 550/2;
        float b3 = 250/2;
       
        Personaje Mario = new Personaje(jlblMario, Pista, a1, b1, (int) Math.floor(Math.random()*10-1+1)+1, pos);
        Personaje Luigi = new Personaje (jlblLuigi, Pista, a2, b2, (int) Math.floor(Math.random()*10-1+1)+1, pos);
        Personaje Toad = new Personaje (jlblToad, Pista, a3, b3, (int) Math.floor(Math.random()*10-1+1)+1, pos);
        pod =  new Podio (jlblPod1, jlblPod2, jlblPod3, pos, Mario, Luigi, Toad);
        
        Toad.start();
        Luigi.start();
        Mario.start(); 
        pod.start();
 
    }//GEN-LAST:event_jbtnEmpezarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private hiloscarrera.Pista Pista;
    private javax.swing.JButton jbtnEmpezar;
    private javax.swing.JLabel jlblLuigi;
    private javax.swing.JLabel jlblMario;
    private javax.swing.JLabel jlblPod1;
    private javax.swing.JLabel jlblPod2;
    private javax.swing.JLabel jlblPod3;
    private javax.swing.JLabel jlblToad;
    // End of variables declaration//GEN-END:variables
}
