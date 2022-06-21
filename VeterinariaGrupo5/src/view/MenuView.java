package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;

public class MenuView extends javax.swing.JFrame {

    public MenuView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        panelPrincipal = new javax.swing.JPanel();
        background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelBtnes = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnCliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        btnMascotas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblCliente1 = new javax.swing.JLabel();
        btnTratamiento = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblCliente2 = new javax.swing.JLabel();
        btnVisitas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblCliente3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblCliente5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 620));
        setMinimumSize(new java.awt.Dimension(1200, 620));
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(11, 95, 93));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(1200, 620));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(1200, 620));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(1200, 620));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMaximumSize(new java.awt.Dimension(970, 620));
        background.setMinimumSize(new java.awt.Dimension(970, 620));
        background.setName(""); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(970, 620));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel1)
                .addContainerGap(232, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );

        panelPrincipal.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, -2, 970, 620));

        panelBtnes.setBackground(new java.awt.Color(17, 153, 158));
        panelBtnes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("VETERINARIA");
        labelTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelBtnes.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 170, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        panelBtnes.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 210, 10));

        btnCliente.setBackground(new java.awt.Color(17, 153, 158));
        btnCliente.setForeground(new java.awt.Color(11, 95, 93));
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliente.setFocusable(false);
        btnCliente.setMinimumSize(new java.awt.Dimension(158, 70));
        btnCliente.setPreferredSize(new java.awt.Dimension(229, 70));
        btnCliente.setVerifyInputWhenFocusTarget(false);
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClienteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClienteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnClienteMouseReleased(evt);
            }
        });
        btnCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clienteLogo.png"))); // NOI18N
        btnCliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 70, -1));

        lblCliente.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente.setText("Clientes");
        btnCliente.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 64));

        panelBtnes.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 230, 70));

        btnMascotas.setBackground(new java.awt.Color(17, 153, 158));
        btnMascotas.setForeground(new java.awt.Color(11, 95, 93));
        btnMascotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMascotas.setFocusable(false);
        btnMascotas.setMinimumSize(new java.awt.Dimension(188, 70));
        btnMascotas.setPreferredSize(new java.awt.Dimension(235, 70));
        btnMascotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMascotasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMascotasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMascotasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMascotasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMascotasMouseReleased(evt);
            }
        });
        btnMascotas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-mascota.png"))); // NOI18N
        btnMascotas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        lblCliente1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblCliente1.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente1.setText("Mascotas");
        btnMascotas.add(lblCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 118, 64));

        panelBtnes.add(btnMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 230, -1));

        btnTratamiento.setBackground(new java.awt.Color(17, 153, 158));
        btnTratamiento.setForeground(new java.awt.Color(11, 95, 93));
        btnTratamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTratamiento.setFocusable(false);
        btnTratamiento.setMinimumSize(new java.awt.Dimension(215, 70));
        btnTratamiento.setPreferredSize(new java.awt.Dimension(230, 70));
        btnTratamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTratamientoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTratamientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTratamientoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTratamientoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnTratamientoMouseReleased(evt);
            }
        });
        btnTratamiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tratamiento-logo.png"))); // NOI18N
        btnTratamiento.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 0, -1, -1));

        lblCliente2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblCliente2.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente2.setText("Tratamientos");
        btnTratamiento.add(lblCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 64));

        panelBtnes.add(btnTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 230, -1));

        btnVisitas.setBackground(new java.awt.Color(17, 153, 158));
        btnVisitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisitas.setMinimumSize(new java.awt.Dimension(180, 70));
        btnVisitas.setPreferredSize(new java.awt.Dimension(230, 70));
        btnVisitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVisitasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVisitasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVisitasMouseExited(evt);
            }
        });
        btnVisitas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visitLogo.png"))); // NOI18N
        btnVisitas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 58, -1));

        lblCliente3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblCliente3.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente3.setText("Visitas");
        btnVisitas.add(lblCliente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 110, 64));

        panelBtnes.add(btnVisitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 230, 70));

        btnSalir.setBackground(new java.awt.Color(17, 153, 158));
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setMinimumSize(new java.awt.Dimension(175, 84));
        btnSalir.setPreferredSize(new java.awt.Dimension(230, 84));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        btnSalir.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 58, -1));

        lblCliente5.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblCliente5.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente5.setText("Salir");
        btnSalir.add(lblCliente5, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 0, 110, 64));

        panelBtnes.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 230, 70));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        panelBtnes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelPrincipal.add(panelBtnes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseClicked
        ClientesView2 v = new ClientesView2();
        v.setSize(970, 620);
        v.setLocation(0, 0);

        this.background.removeAll();//limpia el contenedor
        this.background.add(v, BorderLayout.CENTER);
        this.background.revalidate();
        this.background.repaint();
    }//GEN-LAST:event_btnClienteMouseClicked

    private void btnClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseEntered
        btnCliente.setBackground(new Color(48, 227, 202));
    }//GEN-LAST:event_btnClienteMouseEntered

    private void btnClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseExited
        btnCliente.setBackground(new Color(17,153,158));
    }//GEN-LAST:event_btnClienteMouseExited

    private void btnClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMousePressed

    }//GEN-LAST:event_btnClienteMousePressed

    private void btnClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseReleased

    }//GEN-LAST:event_btnClienteMouseReleased

    private void btnMascotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMascotasMouseClicked
        MascotasView v = new MascotasView();
        v.setSize(970, 620);
        v.setLocation(0, 0);

        this.background.removeAll();//limpia el contenedor
        this.background.add(v, BorderLayout.CENTER);
        this.background.revalidate();
        this.background.repaint();
    }//GEN-LAST:event_btnMascotasMouseClicked

    private void btnMascotasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMascotasMouseEntered
        btnMascotas.setBackground(new Color(48, 227, 202));
    }//GEN-LAST:event_btnMascotasMouseEntered

    private void btnMascotasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMascotasMouseExited
        btnMascotas.setBackground(new Color(17,153,158));
    }//GEN-LAST:event_btnMascotasMouseExited

    private void btnMascotasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMascotasMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMascotasMousePressed

    private void btnMascotasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMascotasMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMascotasMouseReleased

    private void btnTratamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTratamientoMouseClicked
        TratamientoView v = new TratamientoView();
        v.setSize(970, 620);
        v.setLocation(0, 0);

        this.background.removeAll();//limpia el contenedor
        this.background.add(v, BorderLayout.CENTER);
        this.background.revalidate();
        this.background.repaint();
    }//GEN-LAST:event_btnTratamientoMouseClicked

    private void btnTratamientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTratamientoMouseEntered
        btnTratamiento.setBackground(new Color(48, 227, 202));
    }//GEN-LAST:event_btnTratamientoMouseEntered

    private void btnTratamientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTratamientoMouseExited
        btnTratamiento.setBackground(new Color(17,153,158));
    }//GEN-LAST:event_btnTratamientoMouseExited

    private void btnTratamientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTratamientoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTratamientoMousePressed

    private void btnTratamientoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTratamientoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTratamientoMouseReleased

    private void btnVisitasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisitasMouseEntered
        btnVisitas.setBackground(new Color(48, 227, 202));
    }//GEN-LAST:event_btnVisitasMouseEntered

    private void btnVisitasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisitasMouseExited
        btnVisitas.setBackground(new Color(17,153,158));
    }//GEN-LAST:event_btnVisitasMouseExited

    private void btnVisitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisitasMouseClicked
        VisitaView v = new VisitaView();
        v.setSize(970, 620);
        v.setLocation(0, 0);

        this.background.removeAll();//limpia el contenedor
        this.background.add(v, BorderLayout.CENTER);
        this.background.revalidate();
        this.background.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_btnVisitasMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(249, 76, 102));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(17,153,158));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

   public static void validarSoloTexto(KeyEvent evt) {
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JPanel background;
    private javax.swing.JPanel btnCliente;
    private javax.swing.JPanel btnMascotas;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JPanel btnTratamiento;
    private javax.swing.JPanel btnVisitas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCliente1;
    private javax.swing.JLabel lblCliente2;
    private javax.swing.JLabel lblCliente3;
    private javax.swing.JLabel lblCliente5;
    private javax.swing.JPanel panelBtnes;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
