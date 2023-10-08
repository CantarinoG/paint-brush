package cantarino.paintbrush;

import javax.swing.JFrame;

public class frmPaint extends javax.swing.JFrame {

    private enum TipoFigura {tfPonto, tfReta, tfCirculo, tfRetangulo, tfSpray, tfBorracha, tfPiramide, tfCilindro}
    //private TipoFigura tipoFigura = TipoFigura.tfPonto; // variável controladora do tipo figura
    //private Retangulo retangulo = new Retangulo();
    
    public frmPaint() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jColorChooser = new javax.swing.JColorChooser();
        btnPonto = new javax.swing.JButton();
        btnReta = new javax.swing.JButton();
        btnCirculo = new javax.swing.JButton();
        btnRetangulo = new javax.swing.JButton();
        btnSpray = new javax.swing.JButton();
        btnCilindro = new javax.swing.JButton();
        btnPiramide = new javax.swing.JButton();
        btnBorracha = new javax.swing.JButton();
        chkArea = new javax.swing.JCheckBox();
        pnlCorInterna = new javax.swing.JButton();
        pnlCorExterna = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        btnPonto.setBackground(new java.awt.Color(255, 255, 255));
        btnPonto.setForeground(new java.awt.Color(0, 0, 0));
        btnPonto.setText("Ponto");
        btnPonto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnReta.setBackground(new java.awt.Color(255, 255, 255));
        btnReta.setForeground(new java.awt.Color(0, 0, 0));
        btnReta.setText("Reta");
        btnReta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCirculo.setBackground(new java.awt.Color(255, 255, 255));
        btnCirculo.setForeground(new java.awt.Color(0, 0, 0));
        btnCirculo.setText("Círculo");
        btnCirculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRetangulo.setBackground(new java.awt.Color(255, 255, 255));
        btnRetangulo.setForeground(new java.awt.Color(0, 0, 0));
        btnRetangulo.setText("Retângulo");
        btnRetangulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSpray.setBackground(new java.awt.Color(255, 255, 255));
        btnSpray.setForeground(new java.awt.Color(0, 0, 0));
        btnSpray.setText("Spray");
        btnSpray.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSpray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSprayActionPerformed(evt);
            }
        });

        btnCilindro.setBackground(new java.awt.Color(255, 255, 255));
        btnCilindro.setForeground(new java.awt.Color(0, 0, 0));
        btnCilindro.setText("Cilindro");
        btnCilindro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnPiramide.setBackground(new java.awt.Color(255, 255, 255));
        btnPiramide.setForeground(new java.awt.Color(0, 0, 0));
        btnPiramide.setText("Pirâmide");
        btnPiramide.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPiramide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiramideActionPerformed(evt);
            }
        });

        btnBorracha.setBackground(new java.awt.Color(255, 255, 255));
        btnBorracha.setForeground(new java.awt.Color(0, 0, 0));
        btnBorracha.setText("Borracha");
        btnBorracha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        chkArea.setForeground(new java.awt.Color(0, 0, 0));
        chkArea.setText("Exibir Área");
        chkArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pnlCorInterna.setBackground(new java.awt.Color(255, 255, 255));
        pnlCorInterna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCorInternaMouseClicked(evt);
            }
        });

        pnlCorExterna.setBackground(new java.awt.Color(0, 0, 0));
        pnlCorExterna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCorExternaMouseClicked(evt);
            }
        });
        pnlCorExterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnlCorExternaActionPerformed(evt);
            }
        });

        jLabel1.setText("Cor Interna");

        jLabel2.setText("Cor Externa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSpray, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorracha, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRetangulo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCilindro, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(btnPiramide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkArea, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addGap(142, 142, 142)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCorExterna, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(pnlCorInterna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jColorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jColorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPiramide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnReta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnRetangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCilindro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSpray, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBorracha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkArea)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlCorInterna, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlCorExterna, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPiramideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiramideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPiramideActionPerformed

    private void btnSprayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSprayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSprayActionPerformed

    private void pnlCorExternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnlCorExternaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlCorExternaActionPerformed

    private void pnlCorExternaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCorExternaMouseClicked
        pnlCorExterna.setBackground(jColorChooser.getColor());
    }//GEN-LAST:event_pnlCorExternaMouseClicked

    private void pnlCorInternaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCorInternaMouseClicked
        pnlCorInterna.setBackground(jColorChooser.getColor());
    }//GEN-LAST:event_pnlCorInternaMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorracha;
    private javax.swing.JButton btnCilindro;
    private javax.swing.JButton btnCirculo;
    private javax.swing.JButton btnPiramide;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnReta;
    private javax.swing.JButton btnRetangulo;
    private javax.swing.JButton btnSpray;
    private javax.swing.JCheckBox chkArea;
    private javax.swing.JColorChooser jColorChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pnlCorExterna;
    private javax.swing.JButton pnlCorInterna;
    // End of variables declaration//GEN-END:variables
}
