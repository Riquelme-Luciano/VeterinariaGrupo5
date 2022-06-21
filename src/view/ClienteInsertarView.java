/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteData;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Conexion;

/**
 *
 * @author danib
 */
public class ClienteInsertarView extends javax.swing.JPanel {

    Conexion con = new Conexion();
    ClienteData data = new ClienteData(con);
    Cliente c = new Cliente();
    ArrayList<Cliente> lista = new ArrayList();

    public ClienteInsertarView() {
        initComponents();
        lista=(ArrayList<Cliente>) data.listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        asterisco2 = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        lblDoc1 = new javax.swing.JLabel();
        lblDoc4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblDoc = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        txtAlternativo = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lblDoc5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblDoc2 = new javax.swing.JLabel();
        lblDoc3 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        lblAtras = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        asterisco = new javax.swing.JLabel();
        asterisco1 = new javax.swing.JLabel();
        asterisco3 = new javax.swing.JLabel();
        asterisco4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        asterisco2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        asterisco2.setForeground(new java.awt.Color(255, 255, 255));
        asterisco2.setText("*");

        setBackground(new java.awt.Color(228, 249, 245));
        setMaximumSize(new java.awt.Dimension(970, 620));
        setMinimumSize(new java.awt.Dimension(970, 620));
        setPreferredSize(new java.awt.Dimension(970, 620));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(228, 249, 245));
        background.setMaximumSize(new java.awt.Dimension(970, 620));
        background.setMinimumSize(new java.awt.Dimension(970, 620));
        background.setPreferredSize(new java.awt.Dimension(970, 620));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDoc1.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        lblDoc1.setForeground(new java.awt.Color(64, 81, 78));
        lblDoc1.setText("Nombre:");
        background.add(lblDoc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        lblDoc4.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        lblDoc4.setForeground(new java.awt.Color(64, 81, 78));
        lblDoc4.setText("Persona alternativa:");
        background.add(lblDoc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, -1));

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Roboto", 0, 28)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.setBorder(null);
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        background.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 283, 40));

        lblDoc.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        lblDoc.setForeground(new java.awt.Color(64, 81, 78));
        lblDoc.setText("Documento:");
        background.add(lblDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 160, -1));

        btnActualizar.setBackground(new java.awt.Color(98, 210, 162));
        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(null);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        background.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 150, 50));

        txtAlternativo.setBackground(new java.awt.Color(255, 255, 255));
        txtAlternativo.setFont(new java.awt.Font("Roboto", 0, 28)); // NOI18N
        txtAlternativo.setForeground(new java.awt.Color(0, 0, 0));
        txtAlternativo.setBorder(null);
        txtAlternativo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAlternativoKeyTyped(evt);
            }
        });
        background.add(txtAlternativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 283, 40));

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setFont(new java.awt.Font("Roboto", 0, 28)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido.setBorder(null);
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        background.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 283, 40));

        lblDoc5.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        lblDoc5.setForeground(new java.awt.Color(64, 81, 78));
        lblDoc5.setText("Telefono:");
        background.add(lblDoc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setFont(new java.awt.Font("Roboto", 0, 28)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccion.setBorder(null);
        background.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 283, 40));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Roboto", 0, 28)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorder(null);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        background.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 283, 40));

        btnGuardar.setBackground(new java.awt.Color(31, 171, 137));
        btnGuardar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        background.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 150, 50));

        lblDoc2.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        lblDoc2.setForeground(new java.awt.Color(64, 81, 78));
        lblDoc2.setText("Apellido:");
        background.add(lblDoc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        lblDoc3.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        lblDoc3.setForeground(new java.awt.Color(64, 81, 78));
        lblDoc3.setText("Direccion:");
        background.add(lblDoc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        txtDocumento.setBackground(new java.awt.Color(255, 255, 255));
        txtDocumento.setFont(new java.awt.Font("Roboto", 0, 28)); // NOI18N
        txtDocumento.setForeground(new java.awt.Color(0, 0, 0));
        txtDocumento.setBorder(null);
        txtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDocumentoKeyTyped(evt);
            }
        });
        background.add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 283, 40));

        lblAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha-rellena.png"))); // NOI18N
        lblAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtrasMouseClicked(evt);
            }
        });
        background.add(lblAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 153, 158));
        jLabel1.setText("Campos obligatorios *");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, 30));

        asterisco.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        asterisco.setForeground(new java.awt.Color(64, 81, 78));
        asterisco.setText("*");
        background.add(asterisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, 20, 20));

        asterisco1.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        asterisco1.setForeground(new java.awt.Color(64, 81, 78));
        asterisco1.setText("*");
        background.add(asterisco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 20, 20));

        asterisco3.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        asterisco3.setForeground(new java.awt.Color(64, 81, 78));
        asterisco3.setText("*");
        background.add(asterisco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 20, 20));

        asterisco4.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        asterisco4.setForeground(new java.awt.Color(64, 81, 78));
        asterisco4.setText("*");
        background.add(asterisco4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 20, 20));

        jLabel2.setForeground(new java.awt.Color(64, 81, 78));
        jLabel2.setText("XXXX xxxxxx");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, -1, -1));

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 620));
    }// </editor-fold>//GEN-END:initComponents


    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        //validar que rellene campos obligatorios
        if (validacionesVacias() == 1) {
            JOptionPane.showMessageDialog(this, "Debe llenar los campos requeridos");
        } else {
            long documento = Long.parseLong(txtDocumento.getText());
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String direccion = txtDireccion.getText();
            long telefono = Long.parseLong(txtTelefono.getText());
            String alternativo = txtAlternativo.getText();

            c.setDni(documento);
            c.setNombre(nombre);
            c.setApellido(apellido);
            c.setDireccion(direccion);
            c.setTelefono(telefono);
            c.setAlternativa(alternativo);

            //valido si ya existe el cliente que quiero agregar
            boolean validarExistencia = false;
            for (Cliente cl : lista) {
                validarExistencia = cl.getDni()==c.getDni();
                if (validarExistencia == true) {
                    break;
                }
            }

            if (validarExistencia == true) {
                JOptionPane.showMessageDialog(this, "El cliente que desea agregar ya existe");
            } else {
                int r = data.insertarCliente(c);

                if (r == 1) {
                    JOptionPane.showMessageDialog(this, "Cliente agregado");
                    listar(ClientesView2.tablaClientes);
                    limpiarContenido();
                } else {
                    JOptionPane.showMessageDialog(this, "Error");
                }
            }

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        //validar que rellene campos obligatorios
        if (validacionesVacias() == 1) {
            JOptionPane.showMessageDialog(this, "Debe llenar los campos requeridos");
        } else {
            long documento = Long.valueOf(txtDocumento.getText());
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            long telefono = Long.valueOf(txtTelefono.getText());
            String direccion = txtDireccion.getText();
            String alternativo = txtAlternativo.getText();

            c.setDni(documento);
            c.setNombre(nombre);
            c.setApellido(apellido);
            c.setDireccion(direccion);
            c.setTelefono(telefono);
            c.setAlternativa(alternativo);

            int r = data.actualizarCliente(c);

            if (r == 1) {
                JOptionPane.showMessageDialog(this, "Cliente actualizado");
                listar(ClientesView2.tablaClientes);
            } else {
                JOptionPane.showMessageDialog(this, "Error al actualizar");
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void lblAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseClicked
        this.setVisible(false);
        ClientesView2.background.setVisible(true);
    }//GEN-LAST:event_lblAtrasMouseClicked

    private void txtDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentoKeyTyped
        int key = evt.getKeyChar();//Devuelve el carácter asociado a la clave en este evento.
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        if (txtDocumento.getText().trim().length() == 9) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDocumentoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        int key = evt.getKeyChar();//Devuelve el carácter asociado a la clave en este evento.
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        if (txtTelefono.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        MenuView.validarSoloTexto(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        MenuView.validarSoloTexto(evt);
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtAlternativoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlternativoKeyTyped
        MenuView.validarSoloTexto(evt);
    }//GEN-LAST:event_txtAlternativoKeyTyped


    public void listar(JTable tabla) {
        ClientesView2.modelo.setRowCount(0);
        ClientesView2.modelo = (DefaultTableModel) tabla.getModel();
        lista = (ArrayList<Cliente>) data.listar();
        Object[] object = new Object[6];

        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getDni();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getApellido();
            object[3] = lista.get(i).getTelefono();
            object[4] = lista.get(i).getDireccion();
            object[5] = lista.get(i).getAlternativa();
            ClientesView2.modelo.addRow(object);
        }
        ClientesView2.tablaClientes.setModel(ClientesView2.modelo);
    }

    public void limpiarContenido() {
        txtDocumento.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtAlternativo.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asterisco;
    private javax.swing.JLabel asterisco1;
    private javax.swing.JLabel asterisco2;
    private javax.swing.JLabel asterisco3;
    private javax.swing.JLabel asterisco4;
    private javax.swing.JPanel background;
    protected static javax.swing.JButton btnActualizar;
    protected static javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblDoc;
    private javax.swing.JLabel lblDoc1;
    private javax.swing.JLabel lblDoc2;
    private javax.swing.JLabel lblDoc3;
    private javax.swing.JLabel lblDoc4;
    private javax.swing.JLabel lblDoc5;
    protected static javax.swing.JTextField txtAlternativo;
    protected static javax.swing.JTextField txtApellido;
    protected static javax.swing.JTextField txtDireccion;
    protected static javax.swing.JTextField txtDocumento;
    protected static javax.swing.JTextField txtNombre;
    protected static javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    public int validacionesVacias() {
        String a = txtDocumento.getText();
        String b = txtNombre.getText();
        String c = txtApellido.getText();
        String d = txtTelefono.getText();

        if (a.isEmpty() || b.isEmpty() || c.isEmpty() || d.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

}
