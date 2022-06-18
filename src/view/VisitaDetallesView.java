/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author danib
 */
public class VisitaDetallesView extends javax.swing.JPanel implements Printable {

    /**
     * Creates new form VisitaDetallesView
     */
    public VisitaDetallesView() {
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

        background = new javax.swing.JPanel();
        hoja = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTratamiento = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDetalles = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblMascCodigo = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblEspecie = new javax.swing.JLabel();
        lblMascAlias = new javax.swing.JLabel();
        lblMascRaza = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblImporte = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblFormaPago = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnImprimirTicket = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(390, 500));

        background.setBackground(new java.awt.Color(11, 95, 93));
        background.setPreferredSize(new java.awt.Dimension(390, 500));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hoja.setBackground(new java.awt.Color(255, 255, 255));
        hoja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Recibo de Pago");
        hoja.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 140, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("NRO.CODIGO:");
        hoja.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha:");
        hoja.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 50, -1));

        lblFecha.setBackground(new java.awt.Color(0, 0, 0));
        lblFecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 0, 0));
        lblFecha.setText("00/00/0000");
        hoja.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 80, -1));

        lblCodigo.setBackground(new java.awt.Color(0, 0, 0));
        lblCodigo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigo.setText("00000001");
        hoja.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 80, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTratamiento.setBackground(new java.awt.Color(255, 255, 255));
        lblTratamiento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTratamiento.setForeground(new java.awt.Color(0, 0, 0));
        lblTratamiento.setText("Vacunacion");
        jPanel2.add(lblTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 240, -1));

        txtAreaDetalles.setEditable(false);
        txtAreaDetalles.setBackground(new java.awt.Color(255, 255, 255));
        txtAreaDetalles.setColumns(20);
        txtAreaDetalles.setRows(5);
        jScrollPane1.setViewportView(txtAreaDetalles);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 350, 90));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Entidad: Clinica Veterinaria");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Detalle:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Tratamiento:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));

        hoja.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 370, 190));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Datos de la operacion:");
        hoja.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 170, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setBackground(new java.awt.Color(255, 255, 255));
        lblNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Daniel Eduardo Barros");
        jPanel3.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 160, -1));

        lblDni.setBackground(new java.awt.Color(255, 255, 255));
        lblDni.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDni.setForeground(new java.awt.Color(0, 0, 0));
        lblDni.setText("47497200");
        jPanel3.add(lblDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 200, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("DNI:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, -1));

        lblMascCodigo.setBackground(new java.awt.Color(255, 255, 255));
        lblMascCodigo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMascCodigo.setForeground(new java.awt.Color(0, 0, 0));
        lblMascCodigo.setText("03");
        jPanel3.add(lblMascCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 30, -1));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Nombre y apellido:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, -1));

        lblEspecie.setBackground(new java.awt.Color(255, 255, 255));
        lblEspecie.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEspecie.setForeground(new java.awt.Color(0, 0, 0));
        lblEspecie.setText("Perro");
        jPanel3.add(lblEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 40, -1));

        lblMascAlias.setBackground(new java.awt.Color(255, 255, 255));
        lblMascAlias.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMascAlias.setForeground(new java.awt.Color(0, 0, 0));
        lblMascAlias.setText("Roque ");
        jPanel3.add(lblMascAlias, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 70, -1));

        lblMascRaza.setBackground(new java.awt.Color(255, 255, 255));
        lblMascRaza.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMascRaza.setForeground(new java.awt.Color(0, 0, 0));
        lblMascRaza.setText("Beagle");
        jPanel3.add(lblMascRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 70, -1));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Mascota atendida:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, -1));

        hoja.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 370, 80));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImporte.setBackground(new java.awt.Color(255, 255, 255));
        lblImporte.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblImporte.setForeground(new java.awt.Color(0, 0, 0));
        lblImporte.setText("$3000.00");
        jPanel4.add(lblImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 90, 30));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("IMPORTE TOTAL:");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 30));

        hoja.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 260, 30));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Datos del Cliente:");
        hoja.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 170, -1));

        lblFormaPago.setBackground(new java.awt.Color(255, 255, 255));
        lblFormaPago.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblFormaPago.setForeground(new java.awt.Color(0, 0, 0));
        lblFormaPago.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFormaPago.setText("Efectivo");
        hoja.add(lblFormaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 260, -1));

        background.add(hoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 450));

        btnVolver.setBackground(new java.awt.Color(255, 102, 0));
        btnVolver.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        background.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, -1, -1));

        btnImprimirTicket.setBackground(new java.awt.Color(0, 153, 0));
        btnImprimirTicket.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnImprimirTicket.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimirTicket.setText("IMPRIMIR TICKET");
        btnImprimirTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirTicketActionPerformed(evt);
            }
        });
        background.add(btnImprimirTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        VisitaInsertarView.background.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnImprimirTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirTicketActionPerformed
        PrinterJob job = PrinterJob.getPrinterJob();//donde vamos a imprimir la pagina
        
        this.background.setSize(390,440);
        this.setBackground(Color.WHITE);
        
        job.setPrintable(this);
              
        
        
        if (job.printDialog()) {
            try {
                job.print();
                this.setSize(390,500);
            } catch (PrinterException ex) {
            }
        }else{
            JOptionPane.showMessageDialog(this, "La impresion dio error");
        }
        this.background.setSize(390,500);
    }//GEN-LAST:event_btnImprimirTicketActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnImprimirTicket;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel hoja;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    protected static javax.swing.JLabel lblCodigo;
    protected static javax.swing.JLabel lblDni;
    protected static javax.swing.JLabel lblEspecie;
    protected static javax.swing.JLabel lblFecha;
    protected static javax.swing.JLabel lblFormaPago;
    protected static javax.swing.JLabel lblImporte;
    protected static javax.swing.JLabel lblMascAlias;
    protected static javax.swing.JLabel lblMascCodigo;
    protected static javax.swing.JLabel lblMascRaza;
    protected static javax.swing.JLabel lblNombre;
    protected static javax.swing.JLabel lblTratamiento;
    protected static javax.swing.JTextArea txtAreaDetalles;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex == 0) {
            Graphics2D graphics2d = (Graphics2D) graphics;
            graphics2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
             graphics2d.scale(pageFormat.getImageableWidth() / this.getWidth(), pageFormat.getImageableHeight() / this.getHeight());
            printAll(graphics2d);
            return PAGE_EXISTS;
        } else {
            return NO_SUCH_PAGE;
        }
    }
}
