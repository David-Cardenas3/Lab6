/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera;

import javax.swing.JLabel;

/**
 *
 * @author 
 */
public class frmCarrera extends javax.swing.JFrame {

    /**
     * Creates new form frmCarrera
     */
    public frmCarrera() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Carrear de autos");
    }

    public JLabel getAuto_1() {
        return auto_1;
    }

    public JLabel getAuto_2() {
        return auto_2;
    }

    public JLabel getAuto_3() {
        return auto_3;
    }

    public JLabel getAuto_4() {
        return auto_4;
    }

    public JLabel getAuto_5() {
        return auto_5;
    }

    public JLabel getAuto_6() {
        return auto_6;
    }

    public JLabel getAuto_7() {
        return auto_7;
    }

    public JLabel getAuto_8() {
        return auto_8;
    }
    
    public JLabel getAuto_9() {
        return auto_9;
    }
    
    public JLabel getAuto_10() {
        return auto_10;
    }
    

    public JLabel getBarrera(){
        return barrera;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        auto_1 = new javax.swing.JLabel();
        auto_2 = new javax.swing.JLabel();
        barrera = new javax.swing.JLabel();
        auto_3 = new javax.swing.JLabel();
        auto_4 = new javax.swing.JLabel();
        auto_5 = new javax.swing.JLabel();
        auto_6 = new javax.swing.JLabel();
        auto_7 = new javax.swing.JLabel();
        auto_8 = new javax.swing.JLabel();
        auto_9 = new javax.swing.JLabel();
        auto_10 = new javax.swing.JLabel();
        Inicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setText("Carrera Automovilistica");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        auto_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Auto1.png"))); // NOI18N

        auto_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Auto2.png"))); // NOI18N

        barrera.setBackground(new java.awt.Color(153, 255, 153));
        barrera.setOpaque(true);

        auto_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Auto3.png"))); // NOI18N

        auto_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Auto4.png"))); // NOI18N

        auto_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Auto5.png"))); // NOI18N

        auto_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Auto6.png"))); // NOI18N

        auto_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Auto7.png"))); // NOI18N

        auto_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Auto8.png"))); // NOI18N

        auto_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Auto9.png"))); // NOI18N

        auto_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Auto10.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(auto_5, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addComponent(auto_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(auto_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(auto_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(auto_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(auto_10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(auto_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(auto_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(auto_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(auto_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(barrera, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(barrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(auto_1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(auto_2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(auto_3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(auto_4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(auto_5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(auto_6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(auto_7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(auto_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(auto_9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(auto_10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Inicio.setText("Inicio ");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
            
          auto_1.setLocation(0,auto_1.getLocation().y);
          auto_2.setLocation(0,auto_2.getLocation().y);
          auto_3.setLocation(0,auto_3.getLocation().y);
          auto_4.setLocation(0,auto_4.getLocation().y);
          auto_5.setLocation(0,auto_5.getLocation().y);
          auto_6.setLocation(0,auto_6.getLocation().y);
          auto_7.setLocation(0,auto_7.getLocation().y);
          auto_8.setLocation(0,auto_8.getLocation().y);
          auto_9.setLocation(0,auto_9.getLocation().y);
          auto_10.setLocation(0,auto_10.getLocation().y);
          
          Carrera auto1 = new Carrera(auto_1, this);
          Carrera auto2 = new Carrera(auto_2, this);
          Carrera auto3 = new Carrera(auto_3, this);
          Carrera auto4 = new Carrera(auto_4, this);
          Carrera auto5 = new Carrera(auto_5, this);
          Carrera auto6 = new Carrera(auto_6, this);
          Carrera auto7 = new Carrera(auto_7, this);
          Carrera auto8 = new Carrera(auto_8, this);
          Carrera auto9 = new Carrera(auto_9, this);
          Carrera auto10 = new Carrera(auto_10, this);
          
          auto1.start();
          auto2.start();
          auto3.start();
          auto4.start();
          auto5.start();
          auto6.start();
          auto7.start();
          auto8.start();
          auto9.start();
          auto10.start();
          
    }//GEN-LAST:event_InicioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCarrera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Inicio;
    private javax.swing.JLabel auto_1;
    private javax.swing.JLabel auto_10;
    private javax.swing.JLabel auto_2;
    private javax.swing.JLabel auto_3;
    private javax.swing.JLabel auto_4;
    private javax.swing.JLabel auto_5;
    private javax.swing.JLabel auto_6;
    private javax.swing.JLabel auto_7;
    private javax.swing.JLabel auto_8;
    private javax.swing.JLabel auto_9;
    private javax.swing.JLabel barrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


}
