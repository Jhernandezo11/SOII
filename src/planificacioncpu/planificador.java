package planificacioncpu;
import java.text.DecimalFormat;
import java.util.Stack;
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
        etiquetapromedioida.setVisible(false);
        boton1.setVisible(false);
        boton1.setEnabled(false);
        //--> al seleccionar opcion RR
        txtoriginales.setVisible(true);
        etquantum.setVisible(true);
        etnprocesos.setVisible(true);
        
        nprocesos.setVisible(true);
        quantum.setVisible(true);
        etprocesosoriginales.setVisible(true);
        lblTPromEntrada.setText("");
        lblTPromRes.setText("");
        txtesta.setVisible(true);
        etpromedioespera.setVisible(true);
        etiquetapromedioida.setVisible(true);
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
    Stack<String> arrTiempos = new Stack<String>();
    Stack<TiempoRR> tiempos = new Stack<TiempoRR>();

    public void roundrobin() {
        tamar=Integer.parseInt(nprocesos.getText());
        int p[] = new int[tamar];
        int co[] = new int[tamar];
        int es[] = new int[tamar];
        int vuelta[] = new int[tamar];
        
        for (int i = 0; i < tamar; i++) {
            co[i] = p[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la rafaga de CPU "
                    + "del proceso [" + (i + 1) + "]"));       
        }
        q = Integer.parseInt(quantum.getText());
        for (int j = 0; j <tamar; j++) {
            while (p[j] >= 0) {
                txtoriginales.append("vuelta "+c+"\n");
                for (int i = 0; i < p.length; i++) {

                    if (p[i] > 0) {
                        txtoriginales.append("P[" + (i + 1) + "] : " + p[i] + "\n");
                        if (p[i] > 0) {
                            vuelta[i]++;
                        }
                        pushTiempos(p[i], q, Integer.toString(i+1));
                    }
                    
                    //al tamaño ingresado se le resta el quantum
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
        
        //--> llenar los tiempos
        txtaTiempos.append("Tiempo = Proceso\n");
        for (int j = 0; j < arrTiempos.size(); j++) {
            txtaTiempos.append("T["+j+"] = "+arrTiempos.elementAt(j)+"\n");
        }
        
        //--> calcular tiempos de entrada
        calcularTiempos(co);
        
        //--> calcular tiempos promedio
        promediosTiempos(tamar);
        
        //--> tabla con resultados
        mostrarTabla(tamar, co, vuelta);
    }
    
    private void pushTiempos (int tamanio, int quantum, String proceso) {
        boolean bdiff = true;
        TiempoRR objTRR = new TiempoRR(0, 0, proceso, 0, 0);
        if (tamanio > quantum) {
            if (arrTiempos.size() != 0 && arrTiempos.lastElement().equals(proceso)) {
                bdiff = false;
            }
            for (int i = 0; i< quantum; i++) {
                arrTiempos.push(proceso);
                if (i == 0 && bdiff) {
                    objTRR.tIni = (arrTiempos.size()-1);
                }
            }
        } else {
            if (arrTiempos.size() != 0 && arrTiempos.lastElement().equals(proceso)) {
                bdiff = false;
            }
            for (int i = 0; i < tamanio; i++) {
                arrTiempos.push(proceso);
                if (i == 0 && bdiff) {
                    objTRR.tIni = (arrTiempos.size()-1);
                }
            }
        }
        if (tiempos.size() != 0 && tiempos.lastElement().proceso.equals(proceso)) {
            // si el ultimo objeto ingresado es el mismo que el proceso actual
            tiempos.lastElement().tFin = (arrTiempos.size()-1);
        } else {
            objTRR.tFin = (arrTiempos.size()-1);
            tiempos.push(objTRR);
        }
    }
    
    private void calcularTiempos (int procesos []) {
        //--> se calculan los tiempos de entrada y respuesta
        for (int i = 0; i < procesos.length; i++) {
            int tFin = 0;
            for (int j = 0; j < tiempos.size(); j++) {
                if (tiempos.elementAt(j).proceso.equals(Integer.toString(i+1))){
                    tiempos.elementAt(j).tEnt += (tiempos.elementAt(j).tIni - tFin);
                    tFin = tiempos.elementAt(j).tFin;
                    
                    tiempos.elementAt(j).tRes = tFin;
                    System.out.println(j + " => "+
                            tiempos.elementAt(j).tIni+" "+
                            tiempos.elementAt(j).tFin+" "+
                            tiempos.elementAt(j).tEnt+" "+
                            tiempos.elementAt(j).tRes+" "+
                            tiempos.elementAt(j).proceso);
                }
            }
        }
    }
    
    private void promediosTiempos (int nProcesos) {
        //--> se calcula el promedio de los tiempos de entrada
        int tPromEnt = 0, tPromRes = 0, tRes = 0;
        for (int j = 0; j < tiempos.size(); j++) {
            tPromEnt += tiempos.elementAt(j).tEnt;
        }
        double tpe = ((double)tPromEnt / (double)nProcesos);
        lblTPromEntrada.setText(tPromEnt+" / "+nProcesos+" = "+Double.toString(tpe));
        
        //--> se calcula el promedio de los tiempos de respuesta
        for (int i = 0; i < nProcesos; i++) {
            for (int j = 0; j < tiempos.size(); j++) {
                if (tiempos.elementAt(j).proceso.equals(Integer.toString(i+1))){
                    if (tRes < tiempos.elementAt(j).tRes) {
                        tRes = tiempos.elementAt(j).tRes;
                    }
                }
            }
            tPromRes += tRes;
            tRes = 0;
        }
        double tpr = ((double)tPromRes / (double)nProcesos);
        lblTPromRes.setText(tPromRes+" / "+nProcesos+" = "+Double.toString(tpr));
    }
    
    private void mostrarTabla (int tamar, int co [], int vuelta []) {
        txtesta.append("\nProceso\tRáfaga\tEspera\tT. Entrada\tT. Respuesta");
        for (int h = 0; h < tamar; h++) {
            int tFin = 0, tEnt = 0, tRes = 0;
            String th = "\np[" + (h + 1) + "] \t   " + co[h] + "\t   " + vuelta[h];
            for (int j = 0; j < tiempos.size(); j++) {
                if (tiempos.elementAt(j).proceso.equals(Integer.toString(h+1))){
                    //--> para tiempo entrada
                    tEnt += (tiempos.elementAt(j).tIni - tFin);
                    tFin = tiempos.elementAt(j).tFin;
                    //--> para tiempo respuesta
                    if (tRes < tiempos.elementAt(j).tRes) {
                        tRes = tiempos.elementAt(j).tRes;
                    }
                }
            }
            th += "\t"+tEnt+"\t"+tRes;
            tEnt = 0;
            tFin = 0;
            tRes = 0;
            txtesta.append(th);
        }
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
        etiquetapromedioida = new javax.swing.JLabel();
        etpromedioespera = new javax.swing.JLabel();
        etprocesosoriginales = new javax.swing.JLabel();
        boton1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtaTiempos = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        lblTPromEntrada = new javax.swing.JLabel();
        lblTPromRes = new javax.swing.JLabel();
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

        etquantum.setText("Quantum");

        txtesta.setColumns(20);
        txtesta.setRows(5);
        jScrollPane1.setViewportView(txtesta);

        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtoriginales.setColumns(20);
        txtoriginales.setRows(5);
        txtoriginales.setEnabled(false);
        jScrollPane2.setViewportView(txtoriginales);

        nprocesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nprocesosActionPerformed(evt);
            }
        });

        etnprocesos.setText("No. de Procesos");

        etiquetapromedioida.setText("Tiempo Promedio Respuesta");

        etpromedioespera.setText("Tiempo Promedio Entrada");

        etprocesosoriginales.setText("Vueltas");

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

        txtaTiempos.setColumns(20);
        txtaTiempos.setRows(5);
        txtaTiempos.setEnabled(false);
        jScrollPane3.setViewportView(txtaTiempos);

        jLabel1.setText("Tiempos/Procesos");

        lblTPromEntrada.setText("jLabel2");

        lblTPromRes.setText("jLabel2");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nprocesos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etnprocesos)))
                            .addComponent(etprocesosoriginales, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(quantum)
                                    .addComponent(etquantum)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel1)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTPromEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiquetapromedioida, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(boton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(etpromedioespera, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lblTPromRes)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etprocesosoriginales)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(etpromedioespera)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTPromEntrada)
                                .addGap(16, 16, 16)
                                .addComponent(etiquetapromedioida, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTPromRes)
                                .addGap(20, 20, 20))
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
        
        if (nproc <= 0 || ncant <= 0) {
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblTPromEntrada;
    private javax.swing.JLabel lblTPromRes;
    private javax.swing.JTextField nprocesos;
    private javax.swing.JTextField quantum;
    private javax.swing.JTextArea txtaTiempos;
    private javax.swing.JTextArea txtesta;
    private javax.swing.JTextArea txtoriginales;
    // End of variables declaration//GEN-END:variables
}
