package View;


import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Geovane
 */
public class GraficoView extends javax.swing.JFrame {

    /**
     * Creates new form JanelaDoGrafico
     */
    public GraficoView() {
        initComponents();
        
        
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        
        listaDePessoas.add(new Pessoa("Jubs", 69));
        listaDePessoas.add(new Pessoa("Fofa", 90));
        listaDePessoas.add(new Pessoa("Mineirona", 110));
        listaDePessoas.add(new Pessoa("Dani", 25));
        listaDePessoas.add(new Pessoa("Big Hell", 24));
        
        GraficoDeBarra graficoDeBarra = new GraficoDeBarra();
        
        //importante pro painel não ficar em branco
        this.jpnGrafico.setLayout(new BorderLayout());
        
        this.jpnGrafico.add(graficoDeBarra.criarGrafico(listaDePessoas));
        
        pack();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnGrafico = new javax.swing.JPanel();
        bntDesfazer = new javax.swing.JButton();
        btnRestaurarPadrao = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        LblGraficosPadrao = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        CkBoxLegenda = new javax.swing.JCheckBox();
        CkBoxTituloEixos = new javax.swing.JCheckBox();
        CkBoxTitulo = new javax.swing.JCheckBox();
        CkBoxRotuloDadosPercentual = new javax.swing.JCheckBox();
        CkBoxRotuloDadosValor = new javax.swing.JCheckBox();
        CkBoxRotuloDadosValorPercentual = new javax.swing.JCheckBox();
        CkBoxCorBarras = new javax.swing.JCheckBox();
        CkBoxCorBarrasGrupo = new javax.swing.JCheckBox();
        CkBoxGrade = new javax.swing.JCheckBox();
        LblElementosGraficos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jpnGraficoLayout = new javax.swing.GroupLayout(jpnGrafico);
        jpnGrafico.setLayout(jpnGraficoLayout);
        jpnGraficoLayout.setHorizontalGroup(
            jpnGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );
        jpnGraficoLayout.setVerticalGroup(
            jpnGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );

        bntDesfazer.setText("Desfazer");
        bntDesfazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDesfazerActionPerformed(evt);
            }
        });

        btnRestaurarPadrao.setText("Restaurar Padrão");
        btnRestaurarPadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarPadraoActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barras Horizontais", "Barras Verticais" }));
        jComboBox1.setToolTipText("");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        LblGraficosPadrao.setText("Gráficos padrão");

        CkBoxLegenda.setText("Legenda");
        CkBoxLegenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CkBoxLegendaActionPerformed(evt);
            }
        });

        CkBoxTituloEixos.setText("Título dos eixos");

        CkBoxTitulo.setText("Título");
        CkBoxTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CkBoxTituloActionPerformed(evt);
            }
        });

        CkBoxRotuloDadosPercentual.setText("Rótulo de Dados (%)");

        CkBoxRotuloDadosValor.setText("Rórutlo de Dados - Valor");

        CkBoxRotuloDadosValorPercentual.setText("Rótulo de Dados - Valor (%)");

        CkBoxCorBarras.setText("Cor das Barras");

        CkBoxCorBarrasGrupo.setText("Cor das Barras (por grupo)");

        CkBoxGrade.setText("Grade");

        LblElementosGraficos.setText("Elementos gráficos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CkBoxTitulo)
                    .addComponent(CkBoxLegenda)
                    .addComponent(CkBoxTituloEixos)
                    .addComponent(CkBoxRotuloDadosPercentual)
                    .addComponent(CkBoxRotuloDadosValor)
                    .addComponent(CkBoxRotuloDadosValorPercentual)
                    .addComponent(CkBoxCorBarras)
                    .addComponent(CkBoxCorBarrasGrupo)
                    .addComponent(CkBoxGrade)
                    .addComponent(LblElementosGraficos, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblElementosGraficos)
                .addGap(14, 14, 14)
                .addComponent(CkBoxTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CkBoxLegenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CkBoxTituloEixos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CkBoxRotuloDadosPercentual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CkBoxRotuloDadosValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CkBoxRotuloDadosValorPercentual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CkBoxCorBarras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CkBoxCorBarrasGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CkBoxGrade)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpnGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(bntDesfazer)
                            .addGap(18, 18, 18)
                            .addComponent(btnRestaurarPadrao)
                            .addGap(18, 18, 18)
                            .addComponent(btnFechar)
                            .addGap(22, 22, 22))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(LblGraficosPadrao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblGraficosPadrao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntDesfazer)
                    .addComponent(btnRestaurarPadrao)
                    .addComponent(btnFechar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntDesfazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDesfazerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntDesfazerActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void CkBoxLegendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CkBoxLegendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CkBoxLegendaActionPerformed

    private void CkBoxTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CkBoxTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CkBoxTituloActionPerformed

    private void btnRestaurarPadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarPadraoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRestaurarPadraoActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaDoGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaDoGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaDoGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaDoGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficoView().setVisible(true);
            }
        });
    }

    public JCheckBox getCkBoxCorBarras() {
        return CkBoxCorBarras;
    }

    public JCheckBox getCkBoxCorBarrasGrupo() {
        return CkBoxCorBarrasGrupo;
    }

    public JCheckBox getCkBoxGrade() {
        return CkBoxGrade;
    }

    public JCheckBox getCkBoxLegenda() {
        return CkBoxLegenda;
    }

    public JCheckBox getCkBoxRotuloDadosPercentual() {
        return CkBoxRotuloDadosPercentual;
    }

    public JCheckBox getCkBoxRotuloDadosValor() {
        return CkBoxRotuloDadosValor;
    }

    public JCheckBox getCkBoxRotuloDadosValorPercentual() {
        return CkBoxRotuloDadosValorPercentual;
    }

    public JCheckBox getCkBoxTitulo() {
        return CkBoxTitulo;
    }

    public JCheckBox getCkBoxTituloEixos() {
        return CkBoxTituloEixos;
    }

    public JLabel getLblElementosGraficos() {
        return LblElementosGraficos;
    }

    public JLabel getLblGraficosPadrao() {
        return LblGraficosPadrao;
    }

    public JButton getBntDesfazer() {
        return bntDesfazer;
    }

    public JButton getBtnFechar() {
        return btnFechar;
    }

    public JButton getBtnRestaurarPadrao() {
        return btnRestaurarPadrao;
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JPanel getJpnGrafico() {
        return jpnGrafico;
    }



       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CkBoxCorBarras;
    private javax.swing.JCheckBox CkBoxCorBarrasGrupo;
    private javax.swing.JCheckBox CkBoxGrade;
    private javax.swing.JCheckBox CkBoxLegenda;
    private javax.swing.JCheckBox CkBoxRotuloDadosPercentual;
    private javax.swing.JCheckBox CkBoxRotuloDadosValor;
    private javax.swing.JCheckBox CkBoxRotuloDadosValorPercentual;
    private javax.swing.JCheckBox CkBoxTitulo;
    private javax.swing.JCheckBox CkBoxTituloEixos;
    private javax.swing.JLabel LblElementosGraficos;
    private javax.swing.JLabel LblGraficosPadrao;
    private javax.swing.JButton bntDesfazer;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnRestaurarPadrao;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpnGrafico;
    // End of variables declaration//GEN-END:variables
}
