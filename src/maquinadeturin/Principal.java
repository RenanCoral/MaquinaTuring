/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadeturin;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class Principal extends javax.swing.JFrame {

 Maquina maquina = new Maquina();
 String estado="0";
 String simboloEscrito="";
 String simboloLeido="";
 String movimiento="";
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        DefaultTableModel temp = (DefaultTableModel) jtCinta.getModel();
        temp.setNumRows(0);
        temp.setColumnCount(0);
        
        DefaultTableModel temp2 = (DefaultTableModel) jtEstados.getModel();
        temp2.setNumRows(0);
        temp2.setColumnCount(0);
    }
    String[] cargar(int opcion){
       DefaultTableModel temp = (DefaultTableModel) jtCinta.getModel();
       temp.setNumRows(0);
       String cadena = " "; 
       
        if (opcion == 2 | opcion == 4) {
             cadena= " " + jtxtCadena.getText() +" "; 
            for (int i = 0; i < jtxtCadena.getText().length(); i++) {
               cadena = cadena + " ";
            }
        }else{
            
            cadena= " " + jtxtCadena.getText() +" "; 
        }
        String[] caracter = cadena.split("");
        temp.setColumnCount(caracter.length);
        temp.addRow(caracter);
       return caracter;
    }
    void Ejecutar(int opcion, int opcionCarga){
        DefaultTableModel temp = (DefaultTableModel) jtCinta.getModel();
       String caracter[] = new String[cargar(opcionCarga).length];
       String casilla[] = new String[3];

       int posicion = 1;
       
       caracter = cargar(opcionCarga);
       estado="0";
       simboloLeido = caracter[1];
       movimiento = " ";
        do {
            casilla = elegirMaquina(opcion);
            //casilla = maquina.palindromo(estado, simboloLeido);
            
            estado = casilla[0];
            simboloEscrito = casilla[1];
            movimiento = casilla[2];
            
            caracter[posicion] = simboloEscrito;
            
            if ("R".equals(movimiento)) {
                posicion = posicion +1;
            }else{
                posicion = posicion -1;
            }
            simboloLeido = caracter[posicion];
            temp.addRow(caracter);            
             if ("F".equals(casilla[0])) {
                JOptionPane.showMessageDialog(null, "infoMessage", 
                                "La cadena es un palindromo",
                                JOptionPane.INFORMATION_MESSAGE);
            }
        } while (!casilla[0].contains("F"));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnPalin = new javax.swing.JButton();
        jbtnCopiar = new javax.swing.JButton();
        jbtnResta = new javax.swing.JButton();
        jbtnMul = new javax.swing.JButton();
        jbtnSum = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCinta = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtCadena = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtEstados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtnPalin.setText("Palindromo");
        jbtnPalin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPalinActionPerformed(evt);
            }
        });

        jbtnCopiar.setText("Copiar Cadena");
        jbtnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCopiarActionPerformed(evt);
            }
        });

        jbtnResta.setText("Resta");
        jbtnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRestaActionPerformed(evt);
            }
        });

        jbtnMul.setText("Multiplicación");
        jbtnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMulActionPerformed(evt);
            }
        });

        jbtnSum.setText("Suma");
        jbtnSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSumActionPerformed(evt);
            }
        });

        jLabel1.setText("Cadena de entrada:");

        jtCinta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtCinta.setEnabled(false);
        jScrollPane1.setViewportView(jtCinta);

        jScrollPane2.setViewportView(jtxtCadena);

        jtEstados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtEstados.setEnabled(false);
        jScrollPane3.setViewportView(jtEstados);

        jLabel2.setText("Cinta de cadena");

        jLabel3.setText("Tabla de estados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jbtnPalin)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnCopiar)
                        .addGap(34, 34, 34)
                        .addComponent(jbtnMul)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnSum)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnResta)))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(jLabel2)))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(212, 212, 212))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnPalin)
                    .addComponent(jbtnCopiar)
                    .addComponent(jbtnResta)
                    .addComponent(jbtnMul)
                    .addComponent(jbtnSum))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPalinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPalinActionPerformed
      Ejecutar(1,1);
    }//GEN-LAST:event_jbtnPalinActionPerformed

    private void jbtnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCopiarActionPerformed
        Ejecutar(2,2);
    }//GEN-LAST:event_jbtnCopiarActionPerformed

    private void jbtnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRestaActionPerformed
        Ejecutar(3,3);
    }//GEN-LAST:event_jbtnRestaActionPerformed

    private void jbtnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMulActionPerformed
       Ejecutar(4,4);
    }//GEN-LAST:event_jbtnMulActionPerformed

    private void jbtnSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSumActionPerformed
        Ejecutar(5,5);
    }//GEN-LAST:event_jbtnSumActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new Principal().setVisible(true);
            }
        });
    }

    /**
     *
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbtnCopiar;
    private javax.swing.JButton jbtnMul;
    private javax.swing.JButton jbtnPalin;
    private javax.swing.JButton jbtnResta;
    private javax.swing.JButton jbtnSum;
    private javax.swing.JTable jtCinta;
    private javax.swing.JTable jtEstados;
    private javax.swing.JTextPane jtxtCadena;
    // End of variables declaration//GEN-END:variables

    private String[] elegirMaquina(int i) {
        String casilla[] = new String[3];
        switch(i){
            case 1:
                casilla = maquina.palindromo(estado, simboloLeido);
                break;
            case 2:
                casilla = maquina.copiar(estado, simboloLeido);
                break;
            case 3:
               break;
            case 4:
                casilla = maquina.multiplicar(estado, simboloLeido);
                break;
            case 5:
                break;
        }
     return casilla;
    }
}
