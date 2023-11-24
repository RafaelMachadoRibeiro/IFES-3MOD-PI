/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

/**
 *
 * @author RafaelMR
 */
public class telaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form telaPrincipal
     */
    public telaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeEmpresa = new javax.swing.JLabel();
        nomeArea = new javax.swing.JLabel();
        textoDataInicio = new javax.swing.JLabel();
        numeroDataInicio = new javax.swing.JLabel();
        textoDataFinal = new javax.swing.JLabel();
        numeroDataFinal = new javax.swing.JLabel();
        botaoEnviaDocumento = new java.awt.Button();
        botaoChat = new java.awt.Button();
        botaoStatus = new java.awt.Button();
        botaoDesconectar = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(790, 625));

        nomeEmpresa.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        nomeEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeEmpresa.setText("ACM Contábil");

        nomeArea.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        nomeArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeArea.setText("Tela principal");

        textoDataInicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoDataInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoDataInicio.setText("Data de início do IRPF:");

        numeroDataInicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numeroDataInicio.setText("15/03/23");

        textoDataFinal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoDataFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoDataFinal.setText("Data de final do IRPF:");

        numeroDataFinal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numeroDataFinal.setText("31/05/23");

        botaoEnviaDocumento.setActionCommand("button");
        botaoEnviaDocumento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botaoEnviaDocumento.setLabel("ENVIAR DOCUMENTOS");
        botaoEnviaDocumento.setName(""); // NOI18N
        botaoEnviaDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviaDocumentoActionPerformed(evt);
            }
        });

        botaoChat.setActionCommand("button");
        botaoChat.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botaoChat.setLabel("ENTRAR EM CONTATO");
        botaoChat.setName(""); // NOI18N
        botaoChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoChatActionPerformed(evt);
            }
        });

        botaoStatus.setActionCommand("button");
        botaoStatus.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botaoStatus.setLabel("STATUS IRPF");
        botaoStatus.setName(""); // NOI18N
        botaoStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoStatusActionPerformed(evt);
            }
        });

        botaoDesconectar.setActionCommand("button");
        botaoDesconectar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoDesconectar.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        botaoDesconectar.setLabel("DESCONECTAR");
        botaoDesconectar.setName(""); // NOI18N
        botaoDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDesconectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nomeArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomeEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(botaoStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textoDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textoDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(268, 268, 268))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(numeroDataInicio)
                                    .addGap(339, 339, 339))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(numeroDataFinal)
                                            .addGap(339, 339, 339))
                                        .addComponent(botaoDesconectar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(294, Short.MAX_VALUE)
                    .addComponent(botaoEnviaDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(276, 276, 276)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeArea)
                .addGap(144, 144, 144)
                .addComponent(botaoChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(textoDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textoDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(botaoDesconectar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(224, 224, 224)
                    .addComponent(botaoEnviaDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(369, Short.MAX_VALUE)))
        );

        botaoDesconectar.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoChatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoChatActionPerformed

    private void botaoEnviaDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviaDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoEnviaDocumentoActionPerformed

    private void botaoStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoStatusActionPerformed

    private void botaoDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDesconectarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoDesconectarActionPerformed

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
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button botaoChat;
    private java.awt.Button botaoDesconectar;
    private java.awt.Button botaoEnviaDocumento;
    private java.awt.Button botaoStatus;
    private javax.swing.JLabel nomeArea;
    private javax.swing.JLabel nomeEmpresa;
    private javax.swing.JLabel numeroDataFinal;
    private javax.swing.JLabel numeroDataInicio;
    private javax.swing.JLabel textoDataFinal;
    private javax.swing.JLabel textoDataInicio;
    // End of variables declaration//GEN-END:variables
}