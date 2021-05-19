/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package planificacioncpu;



import Graficos.GraficaBarras;
import java.util.ArrayList;
import Graficos.GraficaPastel;
import javax.swing.JOptionPane;
import java.util.List;

public class Memoria extends javax.swing.JFrame {

        int memoria;
        int sistema;
        int disponible;
        int particiones=0;
        int sumamu=0;
        List<Integer[]> mapa=new ArrayList<Integer[]>(); 
    /**
     * Creates new form Memoria
     */
    public Memoria() {
        initComponents();

        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblocupada = new javax.swing.JLabel();
        lbp2 = new javax.swing.JLabel();
        lbp1 = new javax.swing.JLabel();
        lbldisponible = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmdparticion = new javax.swing.JButton();
        cmdeliminar = new javax.swing.JButton();
        cmdgraficar = new javax.swing.JButton();
        cmdguardar = new javax.swing.JButton();
        lbp6 = new javax.swing.JLabel();
        lblnumparticiones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblocupada.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblocupada.setForeground(new java.awt.Color(51, 51, 51));
        lblocupada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblocupada.setText("Proceso 2");

        lbp2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbp2.setForeground(new java.awt.Color(0, 102, 51));
        lbp2.setText("Memoria Ocupada");

        lbp1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbp1.setForeground(new java.awt.Color(0, 102, 51));
        lbp1.setText("Disponible");

        lbldisponible.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbldisponible.setForeground(new java.awt.Color(51, 51, 51));
        lbldisponible.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldisponible.setText("Proceso 1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Memoria");

        txttotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txttotal.setForeground(new java.awt.Color(0, 51, 51));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Gestion De Memoria");

        cmdparticion.setBackground(new java.awt.Color(0, 153, 153));
        cmdparticion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdparticion.setForeground(new java.awt.Color(255, 255, 255));
        cmdparticion.setText("Crear Particion");
        cmdparticion.setEnabled(false);
        cmdparticion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdparticionMouseClicked(evt);
            }
        });
        cmdparticion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdparticionActionPerformed(evt);
            }
        });

        cmdeliminar.setBackground(new java.awt.Color(0, 153, 153));
        cmdeliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdeliminar.setForeground(new java.awt.Color(255, 255, 255));
        cmdeliminar.setText("Eliminar Particion");
        cmdeliminar.setEnabled(false);
        cmdeliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdeliminarMouseClicked(evt);
            }
        });
        cmdeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdeliminarActionPerformed(evt);
            }
        });

        cmdgraficar.setBackground(new java.awt.Color(0, 153, 153));
        cmdgraficar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdgraficar.setForeground(new java.awt.Color(255, 255, 255));
        cmdgraficar.setText("Graficar");
        cmdgraficar.setEnabled(false);
        cmdgraficar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdgraficarMouseClicked(evt);
            }
        });
        cmdgraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdgraficarActionPerformed(evt);
            }
        });

        cmdguardar.setBackground(new java.awt.Color(0, 153, 153));
        cmdguardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdguardar.setForeground(new java.awt.Color(255, 255, 255));
        cmdguardar.setText("Guardar");
        cmdguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdguardarMouseClicked(evt);
            }
        });
        cmdguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdguardarActionPerformed(evt);
            }
        });

        lbp6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbp6.setForeground(new java.awt.Color(0, 102, 51));
        lbp6.setText("Particiones");

        lblnumparticiones.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblnumparticiones.setForeground(new java.awt.Color(51, 51, 51));
        lblnumparticiones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnumparticiones.setText("Proceso 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmdguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbp1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbp2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lbldisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblocupada, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmdgraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(117, 117, 117)
                                    .addComponent(cmdparticion, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmdeliminar))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lbp6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(lblnumparticiones, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdparticion)
                    .addComponent(cmdeliminar)
                    .addComponent(cmdguardar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbldisponible)
                                .addGap(18, 18, 18)
                                .addComponent(lblocupada))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbp1)
                                .addGap(18, 18, 18)
                                .addComponent(lbp2)))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdgraficar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblnumparticiones)
                        .addComponent(lbp6))
                    .addComponent(jButton1))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmdparticionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdparticionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdparticionMouseClicked

    private void cmdparticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdparticionActionPerformed
            
 
           
        
        
        int cantidad;
        
        cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de memoria a particionar"));
        if (disponible>=cantidad) {
            particiones = particiones + 1;
            this.cmdgraficar.setEnabled(true);
                
                Integer[]paso1={particiones,cantidad};
                mapa.add(paso1);
                disponible=disponible-cantidad;
                sumamu=sumamu+cantidad;

                lbldisponible.setText(Integer.toString(disponible));
                lblocupada.setText(Integer.toString(sumamu));
                lblnumparticiones.setText(Integer.toString(particiones));
                
            }else{

                    JOptionPane.showMessageDialog(rootPane, "No se puede particionar esa cantidad..proceso en cola");
                 }
        if (disponible==0) {
            this.cmdparticion.setEnabled(false);
            
        }
        

       
        
        


    }//GEN-LAST:event_cmdparticionActionPerformed

    private void cmdeliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdeliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdeliminarMouseClicked

    private void cmdeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdeliminarActionPerformed
        // TODO add your handling code here:
        
        Integer ubicacion;
        Integer cantidad;
        String cantidads;
         
        ubicacion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la partición a Eliminar"));
        
        for (int i = 0; i < mapa.size(); i++) {
            if (mapa.get(i)[0].toString().equals(ubicacion.toString())) {
            particiones = particiones -1;
            mapa.remove(ubicacion);
                
                cantidads=mapa.get(ubicacion)[1].toString();;
                cantidad=Integer.parseInt(cantidads);
                disponible=disponible+cantidad;
                sumamu=sumamu-cantidad;
                
                lbldisponible.setText(Integer.toString(disponible));
                lblocupada.setText(Integer.toString(sumamu));
                lblnumparticiones.setText(Integer.toString(particiones));
        
            
        
            
        }
        }
        
    }//GEN-LAST:event_cmdeliminarActionPerformed

    private void cmdgraficarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdgraficarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdgraficarMouseClicked

    private void cmdgraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdgraficarActionPerformed

        
        //Graficando

                            int a1[]=new int[particiones+1];
                            String numpart;
                            String a2[]=new String[particiones+1];
                            for (int y=0;y<a1.length-1;y++)//llenar arreglos
                            {
                                numpart=mapa.get(y)[1].toString();
                                a1[y]=Integer.parseInt(numpart);
                                a2[y]="Particion"+mapa.get(y)[0].toString();
                            }
                            a1[particiones]=disponible;
                            a2[particiones]="Disponible";
                            new GraficaPastel().GraficaPastel(a1, a2, "Gestion de Memoria");
        


       
    }//GEN-LAST:event_cmdgraficarActionPerformed

    private void cmdguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdguardarActionPerformed
        // TODO add your handling code here
        this.cmdparticion.setEnabled(true);
        this.cmdeliminar.setEnabled(true);
        memoria = Integer.parseInt(txttotal.getText());
        disponible=memoria;
 
        lbldisponible.setText(Integer.toString(memoria));
        lblocupada.setText(Integer.toString(0));
        lblnumparticiones.setText(Integer.toString(particiones));




    }//GEN-LAST:event_cmdguardarActionPerformed

    private void cmdguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdguardarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdguardarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Memoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Memoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Memoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Memoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Memoria().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdeliminar;
    private javax.swing.JButton cmdgraficar;
    private javax.swing.JButton cmdguardar;
    private javax.swing.JButton cmdparticion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbldisponible;
    private javax.swing.JLabel lblnumparticiones;
    private javax.swing.JLabel lblocupada;
    private javax.swing.JLabel lbp1;
    private javax.swing.JLabel lbp2;
    private javax.swing.JLabel lbp6;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
