
package planificacioncpu;

import Graficos.GraficaBarras;
import javax.swing.JOptionPane;


public class SJF extends javax.swing.JFrame {

    /** Creates new form SJF */
    public SJF() {
        initComponents();
        
        lbc1.setText("");
        lbc2.setText("");
        lbc3.setText("");
        lbc4.setText("");
        
        lbe1.setText("");
        lbe2.setText("");
        lbe3.setText("");
        lbe4.setText("");
        
        lbesp1.setText("");
        lbesp2.setText("");
        lbesp3.setText("");
        lbesp4.setText("");
        
        lbl1.setText("");
        lbl2.setText("");
        lbl3.setText("");
        lbl4.setText("");
        
        lbp1.setText("");
        lbp2.setText("");
        lbp3.setText("");
        lbp4.setText("");
        
        lbret1.setText("");
        lbret2.setText("");
        lbret3.setText("");
        lbret4.setText("");
        
        lbres1.setText("");
        lbres2.setText("");
        lbres3.setText("");
        lbres4.setText("");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txttp1 = new javax.swing.JTextField();
        txttp2 = new javax.swing.JTextField();
        txttp3 = new javax.swing.JTextField();
        txttp4 = new javax.swing.JTextField();
        txtcp2 = new javax.swing.JTextField();
        txtcp1 = new javax.swing.JTextField();
        txtcp3 = new javax.swing.JTextField();
        txtcp4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        calcular = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lbp5 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbe1 = new javax.swing.JLabel();
        lbe5 = new javax.swing.JLabel();
        lbc5 = new javax.swing.JLabel();
        lbret1 = new javax.swing.JLabel();
        lbesp4 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbres4 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbc3 = new javax.swing.JLabel();
        lbc2 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbp2 = new javax.swing.JLabel();
        lbp1 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbc1 = new javax.swing.JLabel();
        lbe4 = new javax.swing.JLabel();
        lbe2 = new javax.swing.JLabel();
        lbe3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbc4 = new javax.swing.JLabel();
        lbp3 = new javax.swing.JLabel();
        lbp4 = new javax.swing.JLabel();
        lbres2 = new javax.swing.JLabel();
        lbesp2 = new javax.swing.JLabel();
        lbc7 = new javax.swing.JLabel();
        lbe7 = new javax.swing.JLabel();
        lbesp3 = new javax.swing.JLabel();
        lbres3 = new javax.swing.JLabel();
        lbesp1 = new javax.swing.JLabel();
        lbret4 = new javax.swing.JLabel();
        lbret2 = new javax.swing.JLabel();
        lbret3 = new javax.swing.JLabel();
        lbres1 = new javax.swing.JLabel();
        lbtpres = new javax.swing.JLabel();
        lbtpret = new javax.swing.JLabel();
        lbtpesp = new javax.swing.JLabel();

        setTitle(".:. Planificación CPU-SJF");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Proceso 1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Proceso 2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Proceso 3");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Proceso 4");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("PLANIFICACIÓN DE CPU - SHORT JOB FIRST");

        txttp1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txttp1.setForeground(new java.awt.Color(0, 51, 51));

        txttp2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txttp2.setForeground(new java.awt.Color(0, 51, 51));

        txttp3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txttp3.setForeground(new java.awt.Color(0, 51, 51));

        txttp4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txttp4.setForeground(new java.awt.Color(0, 51, 51));

        txtcp2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtcp2.setForeground(new java.awt.Color(0, 51, 51));

        txtcp1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtcp1.setForeground(new java.awt.Color(0, 51, 51));

        txtcp3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtcp3.setForeground(new java.awt.Color(0, 51, 51));

        txtcp4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtcp4.setForeground(new java.awt.Color(0, 51, 51));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("T Llegada");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("T CPU");

        calcular.setBackground(new java.awt.Color(0, 153, 153));
        calcular.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        calcular.setForeground(new java.awt.Color(255, 255, 255));
        calcular.setText("Ejecutar");
        calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcularMouseClicked(evt);
            }
        });
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbp5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbp5.setText("Procesos");

        lbl5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl5.setText("T Llegada");

        lbe1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbe1.setForeground(new java.awt.Color(153, 0, 0));
        lbe1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbe1.setText("Proceso 1");

        lbe5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbe5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbe5.setText("Estado");

        lbc5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbc5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbc5.setText("T CPU");

        lbret1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbret1.setForeground(new java.awt.Color(51, 51, 51));
        lbret1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbret1.setText("Proceso 1");

        lbesp4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbesp4.setForeground(new java.awt.Color(51, 51, 51));
        lbesp4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbesp4.setText("Proceso 4");

        lbl7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7.setText("T.Respuesta");

        lbres4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbres4.setForeground(new java.awt.Color(51, 51, 51));
        lbres4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbres4.setText("Proceso 4");

        lbl3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl3.setForeground(new java.awt.Color(51, 51, 51));
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setText("Proceso 3");

        lbc3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbc3.setForeground(new java.awt.Color(51, 51, 51));
        lbc3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbc3.setText("Proceso 3");

        lbc2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbc2.setForeground(new java.awt.Color(51, 51, 51));
        lbc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbc2.setText("Proceso 2");

        lbl2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl2.setForeground(new java.awt.Color(51, 51, 51));
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("Proceso 2");

        lbp2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbp2.setForeground(new java.awt.Color(0, 102, 51));
        lbp2.setText("Proceso 2");

        lbp1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbp1.setForeground(new java.awt.Color(0, 102, 51));
        lbp1.setText("Proceso 1");

        lbl1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl1.setForeground(new java.awt.Color(51, 51, 51));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("Proceso 1");

        lbc1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbc1.setForeground(new java.awt.Color(51, 51, 51));
        lbc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbc1.setText("Proceso 1");

        lbe4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbe4.setForeground(new java.awt.Color(153, 0, 0));
        lbe4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbe4.setText("Proceso 4");

        lbe2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbe2.setForeground(new java.awt.Color(153, 0, 0));
        lbe2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbe2.setText("Proceso 2");

        lbe3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbe3.setForeground(new java.awt.Color(153, 0, 0));
        lbe3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbe3.setText("Proceso 3");

        lbl4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl4.setForeground(new java.awt.Color(51, 51, 51));
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setText("Proceso 4");

        lbc4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbc4.setForeground(new java.awt.Color(51, 51, 51));
        lbc4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbc4.setText("Proceso 4");

        lbp3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbp3.setForeground(new java.awt.Color(0, 102, 51));
        lbp3.setText("Proceso 3");

        lbp4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbp4.setForeground(new java.awt.Color(0, 102, 51));
        lbp4.setText("Proceso 4");

        lbres2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbres2.setForeground(new java.awt.Color(51, 51, 51));
        lbres2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbres2.setText("Proceso 2");

        lbesp2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbesp2.setForeground(new java.awt.Color(51, 51, 51));
        lbesp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbesp2.setText("Proceso 2");

        lbc7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbc7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbc7.setText("T Espera");

        lbe7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbe7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbe7.setText("T Retorno");

        lbesp3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbesp3.setForeground(new java.awt.Color(51, 51, 51));
        lbesp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbesp3.setText("Proceso 3");

        lbres3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbres3.setForeground(new java.awt.Color(51, 51, 51));
        lbres3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbres3.setText("Proceso 3");

        lbesp1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbesp1.setForeground(new java.awt.Color(51, 51, 51));
        lbesp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbesp1.setText("Proceso 1");

        lbret4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbret4.setForeground(new java.awt.Color(51, 51, 51));
        lbret4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbret4.setText("Proceso 4");

        lbret2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbret2.setForeground(new java.awt.Color(51, 51, 51));
        lbret2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbret2.setText("Proceso 2");

        lbret3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbret3.setForeground(new java.awt.Color(51, 51, 51));
        lbret3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbret3.setText("Proceso 3");

        lbres1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbres1.setForeground(new java.awt.Color(51, 51, 51));
        lbres1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbres1.setText("Proceso 1");

        lbtpres.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbtpres.setText("xRespuesta");

        lbtpret.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbtpret.setText("xRetorno");

        lbtpesp.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbtpesp.setText("xEspera");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttp1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttp2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttp3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttp4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtcp4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcp3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcp2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcp1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbtpres, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbtpesp, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbtpret, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbp5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbc5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbp1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbp3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbp2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbp4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbc4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbc1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbc3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbc2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbe4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbe1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbe3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbe2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbe5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbc7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbres1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbres3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbres2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbres4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbesp4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbesp1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbesp3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbesp2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbret4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbret1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbret3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbret2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbe7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txttp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txttp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txttp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txttp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtcp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbc5)
                                    .addComponent(lbl5)
                                    .addComponent(lbp5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbc1)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbc2)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbc3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl1)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl2)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl3)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lbl4)
                                            .addComponent(lbc4)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbp1)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbp2)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbp3)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbp4))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbe5)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbe1)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbe2)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbe3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addComponent(lbe4))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbc7)
                                    .addComponent(lbl7)
                                    .addComponent(lbe7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbesp1)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbesp2)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbesp3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbres1)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbres2)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbres3)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lbres4)
                                            .addComponent(lbesp4)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbret1)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbret2)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbret3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addComponent(lbret4)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbtpesp)
                            .addComponent(lbtpres)
                            .addComponent(lbtpret)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed


        String [][]M=
               {
            {"Proceso 1","0","0"},
            {"Proceso 2","0","0"},
            {"Proceso 3","0","0"},
            {"Proceso 4","0","0"}
                };

//        Vector de Ubicación de orden y posiciones
        String [] S={"1","2","3","4"};
        String [] U={"1","2","3","4"};
        String [] P={"1","2","3","4"};
        String [] E={"Listo","Listo","Listo","Listo"};
        
        Integer numpro=4;

        /**
         * Leemos y Guardando los datos en la matriz
        */

        M[0][1]=txttp1.getText();
        M[1][1]=txttp2.getText();
        M[2][1]=txttp3.getText();
        M[3][1]=txttp4.getText();

        M[0][2]=txtcp1.getText();
        M[1][2]=txtcp2.getText();
        M[2][2]=txtcp3.getText();
        M[3][2]=txtcp4.getText();
        
        
        if (txttp1.getText().equals("") || txttp2.getText().equals("") || txttp3.getText().equals("") || txttp4.getText().equals("") || txtcp1.getText().equals("") || txtcp2.getText().equals("") || txtcp3.getText().equals("") || txtcp4.getText().equals("") ) {
            
            JOptionPane.showMessageDialog(rootPane, "Rellene todos los campos POrfavor");
        }
        
        
        else {
                
                                if (txttp1.getText().equals("0") || txttp2.getText().equals("0") || txttp3.getText().equals("0") || txttp4.getText().equals("0") ) {






                for (int i = 0; i < numpro; i++) {
                    S[i]=M[i][0]; //Num Proceso
                    U[i]=M[i][1]; //Llegada
                    P[i]=M[i][2]; //Tiempo CPU

                }

                     for (int i = 0 ; i < P.length - 1 ; i++) {
                    int min = i;

                        for (int j = i + 1 ; j < P.length ; j++) {
                        if (Integer.parseInt(P[j]) < Integer.parseInt(P[min])) {
                            min = j;    //encontramos el menor número

                            }

                        }


                        if (i != min) {
                        //permutamos los valores
                            String aux = U[i];
                            String aux2 = S[i];
                            String aux3 = P[i];
                            String aux4 = "Listo";

                            U[i] = U[min];
                            P[i] = P[min];
                            S[i] = S[min];
                            E[i] = "Listo";

                            U[min] = aux;
                            S[min] = aux2;
                            P[min] = aux3;
                            E[min] = aux4;
                           }

                      }


                /**
                * Mostramos los datos de los vectores segun el tiempo de llegada
                */
                lbp1.setText(S[0]);
                lbp2.setText(S[1]);
                lbp3.setText(S[2]);
                lbp4.setText(S[3]);

                lbl1.setText(U[0]);
                lbl2.setText(U[1]);
                lbl3.setText(U[2]);
                lbl4.setText(U[3]);

                lbc1.setText(P[0]);
                lbc2.setText(P[1]);
                lbc3.setText(P[2]);
                lbc4.setText(P[3]);

                lbe1.setText(E[0]);
                lbe2.setText(E[1]);
                lbe3.setText(E[2]);
                lbe4.setText(E[3]);


                int ttotal,tesp1,tesp2,tesp3,tesp4,tret1,tret2,tret3,tret4,tres1,tres2,tres3,tres4;
                double tpres,tpret,tpesp;

                ttotal=0;
                for (int i = 0; i < P.length; i++) {
                    ttotal+=Integer.parseInt(P[i]);

                }

                //CALCULAMOS LOS TIEMPOS PROMEDIOS
                tret1=Integer.parseInt(P[1])-Integer.parseInt(P[0]);
                tret2=Integer.parseInt(P[2])+Integer.parseInt(P[1])-Integer.parseInt(U[1]);
                tret3=Integer.parseInt(P[2])+Integer.parseInt(P[1])-Integer.parseInt(P[0]);
                tret4=Integer.parseInt(P[0])-Integer.parseInt(P[0]);
                tpret=(tret1+tret2+tret3+tret4)/4;


                tres1=Integer.parseInt(U[3])+Integer.parseInt(P[3]);
                tres2=(Integer.parseInt(P[3])+Integer.parseInt(P[0]));
                tres3=(Integer.parseInt(P[3])+Integer.parseInt(P[0])+Integer.parseInt(U[0]));
                tres4=(Integer.parseInt(P[3])+Integer.parseInt(P[0])+Integer.parseInt(U[0])+Integer.parseInt(P[2]));
                tpres=(tres1+tres2+tres3+tres4)/4;


                tesp1=Integer.parseInt(P[1])-Integer.parseInt(P[0]);
                tesp2=Integer.parseInt(P[2])+Integer.parseInt(P[1])-Integer.parseInt(U[1]);
                tesp3=Integer.parseInt(P[2])+Integer.parseInt(P[1])-Integer.parseInt(P[0]);
                tesp4=Integer.parseInt(P[0])-Integer.parseInt(P[0]);
                tpesp=(tesp1+tesp2+tesp3+tesp4)/4;


                lbret1.setText(Integer.toString(tret1));
                lbret2.setText(Integer.toString(tret2));
                lbret3.setText(Integer.toString(tret3));
                lbret4.setText(Integer.toString(tret4));

                lbres1.setText(Integer.toString(tres1));
                lbres2.setText(Integer.toString(tres2));
                lbres3.setText(Integer.toString(tres3));
                lbres4.setText(Integer.toString(tres4));

                lbesp1.setText(Integer.toString(tesp1));
                lbesp2.setText(Integer.toString(tesp2));
                lbesp3.setText(Integer.toString(tesp3));
                lbesp4.setText(Integer.toString(tesp4));


                lbtpesp.setText(Double.toString(tpesp));
                lbtpret.setText(Double.toString(tpret));
                lbtpres.setText(Double.toString(tpres));
                //Graficando

                            int a1[]=new int[4];
                            int cont=0;
                            String a2[]=new String[4];
                            for (int y=0;y<a1.length;y++)//llenar arreglos
                            {
                                cont=cont+Integer.parseInt(P[y]);
                                a1[y]=Integer.parseInt(U[y]);
                                a2[y]=Integer.toString(cont);
                            }
                            
                       GraficaBarras graficos;
                       graficos=new GraficaBarras();
                       graficos.graficarbarras(a1,a2,"Tiempos de CPU","Proceso","SJF");     
        //           
                
                
                
                                              }else{

                    JOptionPane.showMessageDialog(rootPane, "ingrese Un evento con tiempo inicial cero");
                }
            
            
        }



    }//GEN-LAST:event_calcularActionPerformed

    private void calcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcularMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_calcularMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

//    /**
//    * @param args the command line arguments
//    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbc1;
    private javax.swing.JLabel lbc2;
    private javax.swing.JLabel lbc3;
    private javax.swing.JLabel lbc4;
    private javax.swing.JLabel lbc5;
    private javax.swing.JLabel lbc7;
    private javax.swing.JLabel lbe1;
    private javax.swing.JLabel lbe2;
    private javax.swing.JLabel lbe3;
    private javax.swing.JLabel lbe4;
    private javax.swing.JLabel lbe5;
    private javax.swing.JLabel lbe7;
    private javax.swing.JLabel lbesp1;
    private javax.swing.JLabel lbesp2;
    private javax.swing.JLabel lbesp3;
    private javax.swing.JLabel lbesp4;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbp1;
    private javax.swing.JLabel lbp2;
    private javax.swing.JLabel lbp3;
    private javax.swing.JLabel lbp4;
    private javax.swing.JLabel lbp5;
    private javax.swing.JLabel lbres1;
    private javax.swing.JLabel lbres2;
    private javax.swing.JLabel lbres3;
    private javax.swing.JLabel lbres4;
    private javax.swing.JLabel lbret1;
    private javax.swing.JLabel lbret2;
    private javax.swing.JLabel lbret3;
    private javax.swing.JLabel lbret4;
    private javax.swing.JLabel lbtpesp;
    private javax.swing.JLabel lbtpres;
    private javax.swing.JLabel lbtpret;
    private javax.swing.JTextField txtcp1;
    private javax.swing.JTextField txtcp2;
    private javax.swing.JTextField txtcp3;
    private javax.swing.JTextField txtcp4;
    private javax.swing.JTextField txttp1;
    private javax.swing.JTextField txttp2;
    private javax.swing.JTextField txttp3;
    private javax.swing.JTextField txttp4;
    // End of variables declaration//GEN-END:variables

}
