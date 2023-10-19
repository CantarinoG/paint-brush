package cantarino.paintbrush;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class frmPaint extends javax.swing.JFrame {

    private enum TipoFigura {tfPonto, tfReta, tfCirculo, tfRetangulo, tfSpray, tfBorracha, tfPiramide, tfCilindro, tfDesenhar, tfPoligono}
    private TipoFigura tipoFigura = TipoFigura.tfDesenhar; // variável controladora do tipo figura
    private Retangulo retangulo = new Retangulo();
    private Reta reta = new Reta();
    private Circulo circulo = new Circulo();
    private Borracha borracha = new Borracha(30);
    private Spray spray = new Spray();
    private Poligono poligono = new Poligono();
    
    public frmPaint() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setTitle("PaintBrush");
        btnDesenhar.setBackground(Color.LIGHT_GRAY);
    }
    
    private void limparSelecao() {
        btnDesenhar.setBackground(Color.WHITE);
        btnPonto.setBackground(Color.WHITE);
        btnReta.setBackground(Color.WHITE);
        btnSpray.setBackground(Color.WHITE);
        btnBorracha.setBackground(Color.WHITE);
        btnPoligono.setBackground(Color.WHITE);
        btnCirculo.setBackground(Color.WHITE);
        btnRetangulo.setBackground(Color.WHITE);
        btnPiramide.setBackground(Color.WHITE);
        btnCilindro.setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPaint = new javax.swing.JPanel();
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
        btnDesenhar = new javax.swing.JButton();
        chkExibirCompr = new javax.swing.JCheckBox();
        chkPerimetro = new javax.swing.JCheckBox();
        btnPoligono = new javax.swing.JButton();
        lblLink = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        pnlPaint.setBackground(new java.awt.Color(255, 255, 255));
        pnlPaint.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlPaintMouseDragged(evt);
            }
        });
        pnlPaint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlPaintMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlPaintMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlPaintLayout = new javax.swing.GroupLayout(pnlPaint);
        pnlPaint.setLayout(pnlPaintLayout);
        pnlPaintLayout.setHorizontalGroup(
            pnlPaintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlPaintLayout.setVerticalGroup(
            pnlPaintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        btnPonto.setBackground(new java.awt.Color(255, 255, 255));
        btnPonto.setForeground(new java.awt.Color(0, 0, 0));
        btnPonto.setText("Ponto");
        btnPonto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPonto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPontoMouseClicked(evt);
            }
        });

        btnReta.setBackground(new java.awt.Color(255, 255, 255));
        btnReta.setForeground(new java.awt.Color(0, 0, 0));
        btnReta.setText("Reta");
        btnReta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnReta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetaMouseClicked(evt);
            }
        });

        btnCirculo.setBackground(new java.awt.Color(255, 255, 255));
        btnCirculo.setForeground(new java.awt.Color(0, 0, 0));
        btnCirculo.setText("Círculo");
        btnCirculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCirculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCirculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCirculoMouseClicked(evt);
            }
        });

        btnRetangulo.setBackground(new java.awt.Color(255, 255, 255));
        btnRetangulo.setForeground(new java.awt.Color(0, 0, 0));
        btnRetangulo.setText("Retângulo");
        btnRetangulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRetangulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetanguloMouseClicked(evt);
            }
        });

        btnSpray.setBackground(new java.awt.Color(255, 255, 255));
        btnSpray.setForeground(new java.awt.Color(0, 0, 0));
        btnSpray.setText("Spray");
        btnSpray.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSpray.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSpray.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSprayMouseClicked(evt);
            }
        });
        btnSpray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSprayActionPerformed(evt);
            }
        });

        btnCilindro.setBackground(new java.awt.Color(255, 255, 255));
        btnCilindro.setForeground(new java.awt.Color(0, 0, 0));
        btnCilindro.setText("Cilindro");
        btnCilindro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCilindro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCilindro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCilindroMouseClicked(evt);
            }
        });

        btnPiramide.setBackground(new java.awt.Color(255, 255, 255));
        btnPiramide.setForeground(new java.awt.Color(0, 0, 0));
        btnPiramide.setText("Pirâmide");
        btnPiramide.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPiramide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPiramide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPiramideMouseClicked(evt);
            }
        });
        btnPiramide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiramideActionPerformed(evt);
            }
        });

        btnBorracha.setBackground(new java.awt.Color(255, 255, 255));
        btnBorracha.setForeground(new java.awt.Color(0, 0, 0));
        btnBorracha.setText("Borracha");
        btnBorracha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBorracha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorracha.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btnBorrachaMouseDragged(evt);
            }
        });
        btnBorracha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrachaMouseClicked(evt);
            }
        });

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

        btnDesenhar.setBackground(new java.awt.Color(255, 255, 255));
        btnDesenhar.setForeground(new java.awt.Color(0, 0, 0));
        btnDesenhar.setText("Desenhar");
        btnDesenhar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDesenhar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDesenhar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDesenharMouseClicked(evt);
            }
        });

        chkExibirCompr.setForeground(new java.awt.Color(0, 0, 0));
        chkExibirCompr.setText("Exibir Compr.");
        chkExibirCompr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkExibirComprActionPerformed(evt);
            }
        });

        chkPerimetro.setForeground(new java.awt.Color(0, 0, 0));
        chkPerimetro.setText("Exibir Perímetro");

        btnPoligono.setBackground(new java.awt.Color(255, 255, 255));
        btnPoligono.setForeground(new java.awt.Color(0, 0, 0));
        btnPoligono.setText("Polígono");
        btnPoligono.setToolTipText("Após inserir 2 pontos ou mais, pressione o botão direito para finalizar.");
        btnPoligono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPoligono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPoligono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPoligonoMouseClicked(evt);
            }
        });

        lblLink.setForeground(new java.awt.Color(0, 102, 204));
        lblLink.setText("<html><u>Feito por @CantarinoG</u></html>");
        lblLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLinkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPaint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnReta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSpray, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBorracha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDesenhar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkExibirCompr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnRetangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnPoligono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnCilindro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnPiramide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chkArea, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                        .addGap(142, 142, 142)))
                                .addGap(41, 41, 41))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkPerimetro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlCorExterna, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(pnlCorInterna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jColorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPaint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jColorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlCorInterna, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlCorExterna, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDesenhar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPoligono, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPiramide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCilindro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRetangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chkArea)
                                    .addComponent(chkExibirCompr))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSpray, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkPerimetro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorracha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(lblLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void btnPontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPontoMouseClicked
        tipoFigura = tipoFigura.tfPonto;
        limparSelecao();
        btnPonto.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnPontoMouseClicked

    private void btnRetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetaMouseClicked
        tipoFigura = tipoFigura.tfReta;
        limparSelecao();
        btnReta.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnRetaMouseClicked

    private void btnSprayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSprayMouseClicked
        tipoFigura = tipoFigura.tfSpray;
        limparSelecao();
        btnSpray.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnSprayMouseClicked

    private void btnBorrachaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrachaMouseClicked
        tipoFigura = tipoFigura.tfBorracha;
        limparSelecao();
        btnBorracha.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnBorrachaMouseClicked

    private void btnCirculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCirculoMouseClicked
        tipoFigura = tipoFigura.tfCirculo;
        limparSelecao();
        btnCirculo.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnCirculoMouseClicked

    private void btnRetanguloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetanguloMouseClicked
        tipoFigura = tipoFigura.tfRetangulo;
        limparSelecao();
        btnRetangulo.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnRetanguloMouseClicked

    private void btnPiramideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPiramideMouseClicked
        tipoFigura = tipoFigura.tfPiramide;
        limparSelecao();
        btnPiramide.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnPiramideMouseClicked

    private void btnCilindroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCilindroMouseClicked
        tipoFigura = tipoFigura.tfCilindro;
        limparSelecao();
        btnCilindro.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnCilindroMouseClicked

    private void pnlPaintMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPaintMousePressed
        if (tipoFigura == TipoFigura.tfPonto) {
            Ponto p = new Ponto();
            p.cor = pnlCorExterna.getBackground();
            p.x = evt.getX();
            p.y = evt.getY();
            p.desenhar(pnlPaint.getGraphics());
        }
        else if (tipoFigura == TipoFigura.tfRetangulo){
            retangulo.cor = pnlCorExterna.getBackground();
            retangulo.corInterna = pnlCorInterna.getBackground();
            retangulo.exibirArea = chkArea.isSelected();
            retangulo.exibirPerimetro = chkPerimetro.isSelected();
            retangulo.x = evt.getX();
            retangulo.y = evt.getY();
        }
        else if(tipoFigura == TipoFigura.tfReta) {
            reta.cor = pnlCorExterna.getBackground();
            reta.exibirCompr = chkExibirCompr.isSelected();
            reta.x = evt.getX();
            reta.y = evt.getY();
        }
        else if(tipoFigura == TipoFigura.tfCirculo) {
            circulo.exibirArea = chkArea.isSelected();
            circulo.exibirPerimetro = chkPerimetro.isSelected();
            circulo.x = evt.getX();
            circulo.y = evt.getY();
        }
        else if(tipoFigura == TipoFigura.tfPoligono) {
            if(poligono.listaPontos.size() >= 2 && evt.getButton() == MouseEvent.BUTTON3) poligono.desenhar(pnlPaint.getGraphics());
            else {
                poligono.cor = pnlCorExterna.getBackground();
                poligono.corInterna = pnlCorInterna.getBackground();
                poligono.adicionarPonto(evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_pnlPaintMousePressed

    private void pnlPaintMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPaintMouseReleased
        if (tipoFigura == TipoFigura.tfRetangulo) {
            retangulo.base = Math.abs(evt.getX() - retangulo.x);
            retangulo.largura = Math.abs(evt.getY() - retangulo.y);
            if(evt.getX() < retangulo.x) retangulo.x = evt.getX();
            if(evt.getY() < retangulo.y) retangulo.y = evt.getY();
            retangulo.desenhar(pnlPaint.getGraphics());
        } else if(tipoFigura == TipoFigura.tfReta) {
            reta.x1 = evt.getX();
            reta.y1 = evt.getY();
            reta.desenhar(pnlPaint.getGraphics());
        } else if(tipoFigura == TipoFigura.tfCirculo) {
            circulo.raio = (int) Math.sqrt(Math.pow(evt.getX() - circulo.x, 2) + Math.pow(evt.getY() - circulo.y, 2));
            circulo.corInterna = pnlCorInterna.getBackground();
            circulo.cor = pnlCorExterna.getBackground();
            circulo.desenhar(pnlPaint.getGraphics());
        }
    }//GEN-LAST:event_pnlPaintMouseReleased

    private void btnBorrachaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrachaMouseDragged

    }//GEN-LAST:event_btnBorrachaMouseDragged

    private void pnlPaintMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPaintMouseDragged
        if(tipoFigura == TipoFigura.tfBorracha){
            borracha.corInterna = pnlCorInterna.getBackground();
            borracha.x = evt.getX();
            borracha.y = evt.getY();
            borracha.desenhar(pnlPaint.getGraphics());
        } else if(tipoFigura == TipoFigura.tfDesenhar) {
            Ponto p = new Ponto();
            p.cor = pnlCorExterna.getBackground();
            p.x = evt.getX();
            p.y = evt.getY();
            p.desenhar(pnlPaint.getGraphics());
        } else if(tipoFigura == TipoFigura.tfSpray) {
            spray.cor = pnlCorExterna.getBackground();
            spray.x = evt.getX();
            spray.y = evt.getY();
            spray.desenhar(pnlPaint.getGraphics());
        }
    }//GEN-LAST:event_pnlPaintMouseDragged

    private void btnDesenharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesenharMouseClicked
        tipoFigura = TipoFigura.tfDesenhar;
        limparSelecao();
        btnDesenhar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnDesenharMouseClicked

    private void chkExibirComprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkExibirComprActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkExibirComprActionPerformed

    private void btnPoligonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPoligonoMouseClicked
        tipoFigura = TipoFigura.tfPoligono;
        limparSelecao();
        btnPoligono.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnPoligonoMouseClicked

    private void lblLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLinkMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/CantarinoG"));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lblLinkMouseClicked

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
    private javax.swing.JButton btnDesenhar;
    private javax.swing.JButton btnPiramide;
    private javax.swing.JButton btnPoligono;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnReta;
    private javax.swing.JButton btnRetangulo;
    private javax.swing.JButton btnSpray;
    private javax.swing.JCheckBox chkArea;
    private javax.swing.JCheckBox chkExibirCompr;
    private javax.swing.JCheckBox chkPerimetro;
    private javax.swing.JColorChooser jColorChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblLink;
    private javax.swing.JButton pnlCorExterna;
    private javax.swing.JButton pnlCorInterna;
    private javax.swing.JPanel pnlPaint;
    // End of variables declaration//GEN-END:variables
}
