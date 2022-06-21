/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author danib
 */
public class MascotaDetallesView extends javax.swing.JPanel {

    /**
     * Creates new form MascotaDetallesView
     */
    public MascotaDetallesView() {
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
        btnCerrarDetalles = new javax.swing.JLabel();
        lblEspecie = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPesoPromedio = new javax.swing.JLabel();
        lblNacimiento = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblRaza = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblAlias = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(48, 227, 202));
        background.setMaximumSize(new java.awt.Dimension(500, 400));
        background.setMinimumSize(new java.awt.Dimension(500, 400));
        background.setPreferredSize(new java.awt.Dimension(500, 400));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrarDetalles.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        btnCerrarDetalles.setForeground(new java.awt.Color(249, 76, 102));
        btnCerrarDetalles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrarDetalles.setText("x");
        btnCerrarDetalles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarDetalles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarDetallesMouseClicked(evt);
            }
        });
        background.add(btnCerrarDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, -1, 40, 30));

        lblEspecie.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        lblEspecie.setForeground(new java.awt.Color(255, 255, 255));
        lblEspecie.setText("Perro");
        background.add(lblEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 320, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Especie:");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 150, -1));

        lblPesoPromedio.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        lblPesoPromedio.setForeground(new java.awt.Color(255, 255, 255));
        lblPesoPromedio.setText("25kg");
        background.add(lblPesoPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 110, -1));

        lblNacimiento.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        lblNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblNacimiento.setText("14/06/2019");
        background.add(lblNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 210, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo:");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, -1));

        lblSexo.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(255, 255, 255));
        lblSexo.setText("Macho");
        background.add(lblSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 360, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Raza:");
        background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, -1));

        lblRaza.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        lblRaza.setForeground(new java.awt.Color(255, 255, 255));
        lblRaza.setText("Beagle");
        background.add(lblRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 350, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Color:");
        background.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 120, -1));

        lblColor.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        lblColor.setForeground(new java.awt.Color(255, 255, 255));
        lblColor.setText("Tricolor");
        background.add(lblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 360, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nacimiento:");
        background.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 200, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Peso Promedio:");
        background.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 250, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Peso:");
        background.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 130, -1));

        lblPeso.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        lblPeso.setForeground(new java.awt.Color(255, 255, 255));
        lblPeso.setText("28kg");
        background.add(lblPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 150, -1));

        lblAlias.setFont(new java.awt.Font("Roboto", 3, 40)); // NOI18N
        lblAlias.setForeground(new java.awt.Color(255, 255, 255));
        lblAlias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlias.setText("Roque");
        background.add(lblAlias, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 340, -1));

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarDetallesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarDetallesMouseClicked
        VisitaInsertarView.backDetalles.setVisible(false);
        
        //activo nuevamente los componentes
        VisitaInsertarView.comboClientes.setEnabled(true);
        VisitaInsertarView.comboMascotas.setEnabled(true);
        VisitaInsertarView.comboTratamientos.setEnabled(true);
        VisitaInsertarView.btnGuardar.setEnabled(true);
        VisitaInsertarView.txtAreaDescripcion.setEnabled(true);
        VisitaInsertarView.calendarVisita.setEnabled(true);
    }//GEN-LAST:event_btnCerrarDetallesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel btnCerrarDetalles;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    protected static javax.swing.JLabel lblAlias;
    protected static javax.swing.JLabel lblColor;
    protected static javax.swing.JLabel lblEspecie;
    protected static javax.swing.JLabel lblNacimiento;
    protected static javax.swing.JLabel lblPeso;
    protected static javax.swing.JLabel lblPesoPromedio;
    protected static javax.swing.JLabel lblRaza;
    protected static javax.swing.JLabel lblSexo;
    // End of variables declaration//GEN-END:variables
}
