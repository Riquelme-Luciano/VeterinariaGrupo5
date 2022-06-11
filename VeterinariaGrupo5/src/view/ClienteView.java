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
public class ClienteView extends javax.swing.JInternalFrame {

    Conexion con = new Conexion();
    ClienteData data = new ClienteData(con);
    Cliente c = new Cliente();

    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Cliente> lista = new ArrayList();

    public ClienteView() {
        initComponents();
        listar(tablaClientes);
    }

    public void insertar() {
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
            limpiarContenido();
        } else {
            JOptionPane.showMessageDialog(this, "Error");
        }

    }

    public void actualizar() {
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
            listar(tablaClientes);
            limpiarContenido();
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar");
        }
    }

    public void limpiarContenido() {
        txtDocumento.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtAlternativo.setText("");
    }

    public void listar(JTable tabla) {
        modelo.setRowCount(0);
        modelo = (DefaultTableModel) tabla.getModel();
        lista = (ArrayList<Cliente>) data.listar();
        Object[] object = new Object[6];

        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getDni();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getApellido();
            object[3] = lista.get(i).getTelefono();
            object[4] = lista.get(i).getDireccion();
            object[5] = lista.get(i).getAlternativa();
            modelo.addRow(object);
        }
        tablaClientes.setModel(modelo);
    }

    public void seleccionar() {
        limpiarContenido();
        int fila = this.tablaClientes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        } else {
            long documento = Long.parseLong(tablaClientes.getValueAt(fila, 0).toString());
            String nombre = (String) tablaClientes.getValueAt(fila, 1);
            String apellido = (String) tablaClientes.getValueAt(fila, 2);
            long telefono = Long.parseLong(tablaClientes.getValueAt(fila, 3).toString());
            String direccion = tablaClientes.getValueAt(fila, 4).toString();
            String alternativo = tablaClientes.getValueAt(fila, 5).toString();

            txtDocumento.setText("" + documento);
            txtNombre.setText(nombre);
            txtApellido.setText(apellido);
            txtDireccion.setText(direccion);
            txtTelefono.setText("" + telefono);
            txtAlternativo.setText(alternativo);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtApellido = new javax.swing.JTextField();
        lblDoc = new javax.swing.JLabel();
        lblDoc1 = new javax.swing.JLabel();
        lblDoc2 = new javax.swing.JLabel();
        lblDoc3 = new javax.swing.JLabel();
        lblDoc4 = new javax.swing.JLabel();
        txtAlternativo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        lblDoc5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar3 = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(11, 95, 93));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido.setBorder(null);
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 283, -1));

        lblDoc.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblDoc.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc.setText("Documento:");
        jPanel1.add(lblDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        lblDoc1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblDoc1.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc1.setText("Nombre:");
        jPanel1.add(lblDoc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        lblDoc2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblDoc2.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc2.setText("Apellido:");
        jPanel1.add(lblDoc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        lblDoc3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblDoc3.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc3.setText("Direccion:");
        jPanel1.add(lblDoc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        lblDoc4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblDoc4.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc4.setText("Persona alternativa:");
        jPanel1.add(lblDoc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        txtAlternativo.setBackground(new java.awt.Color(255, 255, 255));
        txtAlternativo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtAlternativo.setForeground(new java.awt.Color(0, 0, 0));
        txtAlternativo.setBorder(null);
        jPanel1.add(txtAlternativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 283, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 283, -1));

        txtDocumento.setBackground(new java.awt.Color(255, 255, 255));
        txtDocumento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtDocumento.setForeground(new java.awt.Color(0, 0, 0));
        txtDocumento.setBorder(null);
        jPanel1.add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 283, -1));

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccion.setBorder(null);
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 283, -1));

        lblDoc5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblDoc5.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc5.setText("Telefono:");
        jPanel1.add(lblDoc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.setBorder(null);
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 283, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 102, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 120, 40));

        btnGuardar3.setBackground(new java.awt.Color(0, 153, 51));
        btnGuardar3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar3.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar3.setText("Guardar");
        btnGuardar3.setBorder(null);
        btnGuardar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 120, 40));

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
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 120, 40));

        tablaClientes.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tablaClientes.setForeground(new java.awt.Color(11, 95, 93));
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombre", "Apellido", "Telefono", "Direccion", "Alternativo"
            }
        ));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 800, 200));

        btnEliminar.setBackground(new java.awt.Color(131, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarContenido();
         this.tablaClientes.clearSelection();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar3ActionPerformed
        insertar();
        listar(tablaClientes);
    }//GEN-LAST:event_btnGuardar3ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        int fila = tablaClientes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Cliente");
        } else {
            int documento = Integer.parseInt(tablaClientes.getValueAt(fila, 0).toString());
            System.out.println(documento);
            seleccionar();
        }
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tablaClientes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Cliente");
        } else {
            int doc = Integer.parseInt(tablaClientes.getValueAt(fila, 0).toString());
            data.eliminarCliente(doc);
            JOptionPane.showMessageDialog(this, "Cliente eliminado");
            listar(tablaClientes);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDoc;
    private javax.swing.JLabel lblDoc1;
    private javax.swing.JLabel lblDoc2;
    private javax.swing.JLabel lblDoc3;
    private javax.swing.JLabel lblDoc4;
    private javax.swing.JLabel lblDoc5;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtAlternativo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
