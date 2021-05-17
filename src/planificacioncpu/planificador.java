package planificacioncpu;
import javax.swing.JOptionPane;



public class planificador extends javax.swing.JFrame {

    public planificador() {
        initComponents();
        txtoriginales.setVisible(false);
        etquantum.setVisible(false);
        etnprocesos.setVisible(false);
        
        nprocesos.setVisible(false);
        quantum.setVisible(false);
        etprocesosoriginales.setVisible(false);
        txtesta.setVisible(false);
        etpromedioespera.setVisible(false);
        promedioespera.setVisible(false);
        etiquetapromedioida.setVisible(false);
        promedioida.setVisible(false);
        boton1.setVisible(false);
        boton1.setEnabled(false);
        //--> al seleccionar opcion RR
        txtoriginales.setVisible(true);
        etquantum.setVisible(true);
        etnprocesos.setVisible(true);
        
        nprocesos.setVisible(true);
        quantum.setVisible(true);
        etprocesosoriginales.setVisible(false);
        txtesta.setVisible(true);
        etpromedioespera.setVisible(true);
        promedioespera.setVisible(true);
        etiquetapromedioida.setVisible(true);
        promedioida.setVisible(true);
        boton1.setVisible(true);
        boton1.setEnabled(true);
    }

    
    int co[];
    int p[];
    int vuelta[];
    int q;
    int procesos_originales[];
    int tamar;
    int c = 0;
    int temp = 0;
    int total = 0;
    float tiempo_espera, tiempo_ida;

    public void roundrobin() {
       tamar=Integer.parseInt(nprocesos.getText());
         int p[] = new int[tamar];
        int co[] = new int[tamar];
        int es[] = new int[tamar];
        int vuelta[] = new int[tamar];

        for (int i = 0; i < tamar; i++) {
            co[i] = p[i] = Integer.parseInt(JOptionPane.showInputDialog("introduza el tamanio "
                    + "del proceso [" + (i + 1) + "]"));
        }
        q = Integer.parseInt(quantum.getText());
        for (int j = 0; j <tamar; j++) {
            while (p[j] >= 0) {
                for (int i = 0; i < p.length; i++) {

                    if (p[i] >= 0) {
                        txtoriginales.append("\nP[" + (i + 1) + "] : " + p[i] + "\t");
                        if (p[i] > 0) {
                            vuelta[i]++;
                        }
                    }
                    p[i] -= q;
                }
                c++;
            }
        }
        for (int i = 0; i < p.length; i++) {
            es[i] = vuelta[i] + co[i];
            tiempo_espera += vuelta[i];
            tiempo_ida += es[i];
        }
        txtesta.append("\nProceso\ttamanio\tespera\tida");
        for (int i = 0; i < tamar; i++) {
         txtesta.append("\np[" + (i + 1) + "] \t   " + co[i] + "\t   " + vuelta[i] + "\t" + es[i]);
        }
        promedioespera.setText(""+ (tiempo_espera / tamar));
        promedioida.setText(""+ (tiempo_ida / tamar));
    }

     public void fcfs(){
          tamar=Integer.parseInt(nprocesos.getText()); 
        
      int p[] = new int[tamar];
        int co[] = new int[tamar];
        int es[] = new int[tamar];
        int vuelta[] = new int[tamar];

        for (int i = 0; i < tamar; i++) {
            co[i] = p[i] = Integer.parseInt(JOptionPane.showInputDialog("introduza el tamanio "
                    + "del proceso [" + (i + 1) + "]"));
        }
        q = 1;
        for (int i = 0; i < p.length; i++) {
        
            txtoriginales.append("\nP[" + (i + 1) + "] : " + p[i] + "\t");
        
        }
        vuelta[0] = 0;
        for (int i = 1; i < tamar; i++) {
            vuelta[i] = vuelta[i - 1] + co[i - 1];
            total = total + vuelta[i];
        }
        for (int i = 0; i < p.length; i++) {
            es[i] = vuelta[i] + co[i];
            tiempo_espera += vuelta[i];
            tiempo_ida += es[i];

        }
txtesta.append("\nProceso\ttamanio\tespera\tida" );
        for (int i = 0; i < p.length; i++) {
            txtesta.append("\np[" + (i + 1) + "] \t   " + co[i] + "\t   " + vuelta[i] + "\t" + es[i]);
        }
        promedioespera.setText(""+ (tiempo_espera / tamar));
        promedioida.setText(""+ (tiempo_ida / tamar));
     }
      

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        quantum = new javax.swing.JTextField();
        etquantum = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtesta = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtoriginales = new javax.swing.JTextArea();
        nprocesos = new javax.swing.JTextField();
        etnprocesos = new javax.swing.JLabel();
        promedioida = new javax.swing.JLabel();
        promedioespera = new javax.swing.JLabel();
        etiquetapromedioida = new javax.swing.JLabel();
        etpromedioespera = new javax.swing.JLabel();
        etprocesosoriginales = new javax.swing.JLabel();
        boton1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jButton3.setText("Agregar Procesos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        quantum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantumActionPerformed(evt);
            }
        });

        etquantum.setText("Cantidad");

        txtesta.setColumns(20);
        txtesta.setRows(5);
        jScrollPane1.setViewportView(txtesta);

        txtoriginales.setColumns(20);
        txtoriginales.setRows(5);
        jScrollPane2.setViewportView(txtoriginales);

        nprocesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nprocesosActionPerformed(evt);
            }
        });

        etnprocesos.setText("No. de Procesos");

        etiquetapromedioida.setText("Promedio Ida");

        etpromedioespera.setText("Promedio Espera");

        etprocesosoriginales.setText("Procesos Originales");

        boton1.setBackground(new java.awt.Color(0, 153, 153));
        boton1.setForeground(new java.awt.Color(255, 255, 255));
        boton1.setText("Ejecutar");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(etprocesosoriginales, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 237, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(promedioida, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(promedioespera, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(16, 16, 16))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(etiquetapromedioida, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(etpromedioespera, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nprocesos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etnprocesos))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(quantum)
                    .addComponent(etquantum))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etnprocesos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nprocesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etquantum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(etprocesosoriginales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(etpromedioespera)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(promedioespera, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(etiquetapromedioida, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(promedioida, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quantumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantumActionPerformed

    private void nprocesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nprocesosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nprocesosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        String sProcesos = nprocesos.getText().trim();
        String sCantidad = quantum.getText().trim();
        
        int nproc = sProcesos.isEmpty()? 0 : Integer.parseInt(sProcesos);
        int ncant = sCantidad.isEmpty()? 0 : Integer.parseInt(sCantidad);
        
        if (nproc == 0 && ncant == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese valores mayores a cero");
        } else {
            roundrobin();
        }
    }//GEN-LAST:event_boton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(planificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(planificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(planificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(planificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new planificador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JLabel etiquetapromedioida;
    private javax.swing.JLabel etnprocesos;
    private javax.swing.JLabel etprocesosoriginales;
    private javax.swing.JLabel etpromedioespera;
    private javax.swing.JLabel etquantum;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nprocesos;
    private javax.swing.JLabel promedioespera;
    private javax.swing.JLabel promedioida;
    private javax.swing.JTextField quantum;
    private javax.swing.JTextArea txtesta;
    private javax.swing.JTextArea txtoriginales;
    // End of variables declaration//GEN-END:variables
}
