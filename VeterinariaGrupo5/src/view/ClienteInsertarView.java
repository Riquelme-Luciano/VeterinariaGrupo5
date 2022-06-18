/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteData;
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setBackground(new java.awt.Color(11, 95, 93));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(11, 95, 93));
        background.setMaximumSize(new java.awt.Dimension(800, 500));
        background.setMinimumSize(new java.awt.Dimension(800, 500));
        background.setPreferredSize(new java.awt.Dimension(800, 500));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDoc1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblDoc1.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc1.setText("Nombre:");
        background.add(lblDoc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        lblDoc4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblDoc4.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc4.setText("Persona alternativa:");
        background.add(lblDoc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, -1));

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.setBorder(null);
        background.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 283, -1));

        lblDoc.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblDoc.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc.setText("Documento:");
        background.add(lblDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(0, 156, 91));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(null);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        background.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 120, 40));

        txtAlternativo.setBackground(new java.awt.Color(255, 255, 255));
        txtAlternativo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtAlternativo.setForeground(new java.awt.Color(0, 0, 0));
        txtAlternativo.setBorder(null);
        background.add(txtAlternativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 283, -1));

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido.setBorder(null);
        background.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 283, -1));

        lblDoc5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblDoc5.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc5.setText("Telefono:");
        background.add(lblDoc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccion.setBorder(null);
        background.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 283, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorder(null);
        background.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 283, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 153, 51));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        background.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 120, 40));

        lblDoc2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblDoc2.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc2.setText("Apellido:");
        background.add(lblDoc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        lblDoc3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblDoc3.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc3.setText("Direccion:");
        background.add(lblDoc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));

        txtDocumento.setBackground(new java.awt.Color(255, 255, 255));
        txtDocumento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtDocumento.setForeground(new java.awt.Color(0, 0, 0));
        txtDocumento.setBorder(null);
        background.add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 283, -1));

        lblAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha-rellena.png"))); // NOI18N
        lblAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtrasMouseClicked(evt);
            }
        });
        background.add(lblAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
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

        int r = data.insertarCliente(c);

        if (r == 1) {
            JOptionPane.showMessageDialog(this, "Cliente agregado");
            listar(ClientesView2.tablaClientes);
            limpiarContenido();
        } else {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
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
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void lblAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseClicked
        this.setVisible(false);
        ClientesView2.background.setVisible(true);
    }//GEN-LAST:event_lblAtrasMouseClicked

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
    private javax.swing.JPanel background;
    protected static javax.swing.JButton btnActualizar;
    protected static javax.swing.JButton btnGuardar;
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

}
