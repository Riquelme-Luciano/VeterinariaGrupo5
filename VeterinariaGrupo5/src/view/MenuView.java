
package view;

import java.awt.BorderLayout;
import java.awt.Color;


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

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(11, 95, 93));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMinimumSize(new java.awt.Dimension(900, 500));
        background.setPreferredSize(new java.awt.Dimension(900, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(376, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        panelPrincipal.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, -2, 780, 530));

        panelBtnes.setBackground(new java.awt.Color(11, 95, 93));
        panelBtnes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Clinica Veterinaria");
        labelTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelBtnes.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 230, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        panelBtnes.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 210, 10));

        btnCliente.setBackground(new java.awt.Color(11, 95, 93));
        btnCliente.setForeground(new java.awt.Color(11, 95, 93));
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCliente.setFocusable(false);
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clienteLogo.png"))); // NOI18N

        lblCliente.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente.setText("Clientes");

        javax.swing.GroupLayout btnClienteLayout = new javax.swing.GroupLayout(btnCliente);
        btnCliente.setLayout(btnClienteLayout);
        btnClienteLayout.setHorizontalGroup(
            btnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClienteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCliente)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        btnClienteLayout.setVerticalGroup(
            btnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(lblCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelBtnes.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 230, 40));

        btnMascotas.setBackground(new java.awt.Color(11, 95, 93));
        btnMascotas.setForeground(new java.awt.Color(11, 95, 93));
        btnMascotas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMascotas.setFocusable(false);
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-mascota.png"))); // NOI18N

        lblCliente1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblCliente1.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente1.setText("Mascotas");

        javax.swing.GroupLayout btnMascotasLayout = new javax.swing.GroupLayout(btnMascotas);
        btnMascotas.setLayout(btnMascotasLayout);
        btnMascotasLayout.setHorizontalGroup(
            btnMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMascotasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCliente1)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        btnMascotasLayout.setVerticalGroup(
            btnMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(lblCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelBtnes.add(btnMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 230, 40));

        btnTratamiento.setBackground(new java.awt.Color(11, 95, 93));
        btnTratamiento.setForeground(new java.awt.Color(11, 95, 93));
        btnTratamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTratamiento.setFocusable(false);
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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tratamiento-logo.png"))); // NOI18N

        lblCliente2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblCliente2.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente2.setText("Tratamientos");

        javax.swing.GroupLayout btnTratamientoLayout = new javax.swing.GroupLayout(btnTratamiento);
        btnTratamiento.setLayout(btnTratamientoLayout);
        btnTratamientoLayout.setHorizontalGroup(
            btnTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTratamientoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        btnTratamientoLayout.setVerticalGroup(
            btnTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCliente2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelBtnes.add(btnTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 230, 40));

        panelPrincipal.add(panelBtnes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseClicked
        ClientesView v = new ClientesView();
        v.setSize(800,500);
        v.setLocation(0,0);
        
        this.background.removeAll();//limpia el contenedor
        this.background.add(v, BorderLayout.CENTER);
        this.background.revalidate();
        this.background.repaint();
    }//GEN-LAST:event_btnClienteMouseClicked

    private void btnClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseEntered
        btnCliente.setBackground(new Color(11,113,81));
    }//GEN-LAST:event_btnClienteMouseEntered

    private void btnClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseExited
        btnCliente.setBackground(new Color(11,95,93));
    }//GEN-LAST:event_btnClienteMouseExited

    private void btnClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMousePressed
        
    }//GEN-LAST:event_btnClienteMousePressed

    private void btnClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseReleased
    
    }//GEN-LAST:event_btnClienteMouseReleased

    private void btnMascotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMascotasMouseClicked
        MascotasView v = new MascotasView();
        v.setSize(800,500);
        v.setLocation(0,0);
        
        this.background.removeAll();//limpia el contenedor
        this.background.add(v, BorderLayout.CENTER);
        this.background.revalidate();
        this.background.repaint();
    }//GEN-LAST:event_btnMascotasMouseClicked

    private void btnMascotasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMascotasMouseEntered
        btnMascotas.setBackground(new Color(11,113,81));
    }//GEN-LAST:event_btnMascotasMouseEntered

    private void btnMascotasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMascotasMouseExited
        btnMascotas.setBackground(new Color(11,95,93));
    }//GEN-LAST:event_btnMascotasMouseExited

    private void btnMascotasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMascotasMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMascotasMousePressed

    private void btnMascotasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMascotasMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMascotasMouseReleased

    private void btnTratamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTratamientoMouseClicked
        TratamientoView v = new TratamientoView();
        v.setSize(800,500);
        v.setLocation(0,0);
        
        this.background.removeAll();//limpia el contenedor
        this.background.add(v, BorderLayout.CENTER);
        this.background.revalidate();
        this.background.repaint();
    }//GEN-LAST:event_btnTratamientoMouseClicked

    private void btnTratamientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTratamientoMouseEntered
        btnTratamiento.setBackground(new Color(11,113,81));
    }//GEN-LAST:event_btnTratamientoMouseEntered

    private void btnTratamientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTratamientoMouseExited
        btnTratamiento.setBackground(new Color(11,95,93));
    }//GEN-LAST:event_btnTratamientoMouseExited

    private void btnTratamientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTratamientoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTratamientoMousePressed

    private void btnTratamientoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTratamientoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTratamientoMouseReleased

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnCliente;
    private javax.swing.JPanel btnMascotas;
    private javax.swing.JPanel btnTratamiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCliente1;
    private javax.swing.JLabel lblCliente2;
    private javax.swing.JPanel panelBtnes;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
