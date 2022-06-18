/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteData;
import java.awt.BorderLayout;
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
public class ClientesView2 extends javax.swing.JPanel {

    public ClientesView2() {
        initComponents();
        listar(tablaClientes);
    }

    Conexion con = new Conexion();
    ClienteData data = new ClienteData(con);
    Cliente c = new Cliente();

    static DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Cliente> lista = new ArrayList();
    ArrayList<Cliente> listaFiltro = new ArrayList();

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

    public void listar(JTable tabla, ArrayList<Cliente> l) {
        modelo.setRowCount(0);//Borras todas las filas
        modelo = (DefaultTableModel) tabla.getModel();
        Object[] object = new Object[6];

        for (int i = 0; i < l.size(); i++) {
            object[0] = l.get(i).getDni();
            object[1] = l.get(i).getNombre();
            object[2] = l.get(i).getApellido();
            object[3] = l.get(i).getTelefono();
            object[4] = l.get(i).getDireccion();
            object[5] = l.get(i).getAlternativa();
            modelo.addRow(object);
        }
        tablaClientes.setModel(modelo);
    }    //filtrar

    public void filtrar() {
        String filtro = txtBuscar.getText();

        if (filtro.isEmpty()) {
            listar(tablaClientes);
        } else {
            this.listaFiltro.clear();

            for (Cliente cl : this.lista) {
                if (cl.getNombre().toLowerCase().contains(filtro.toLowerCase())) {
                    this.listaFiltro.add(cl);
                }
            }

            listar(tablaClientes, listaFiltro);
        }
    }

    public void seleccionar() {
//        limpiarContenido();
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

            ClienteInsertarView.txtDocumento.setText("" + documento);
            ClienteInsertarView.txtNombre.setText(nombre);
            ClienteInsertarView.txtApellido.setText(apellido);
            ClienteInsertarView.txtDireccion.setText(direccion);
            ClienteInsertarView.txtTelefono.setText("" + telefono);
            ClienteInsertarView.txtAlternativo.setText(alternativo);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        backgroundInsert = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(11, 95, 93));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaClientes.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tablaClientes.setForeground(new java.awt.Color(11, 95, 93));
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombre", "Apellido", "Telefono", "Direccion", "Alternativo"
            }
        ));
        jScrollPane1.setViewportView(tablaClientes);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 740, 330));

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtBuscar.setBorder(null);
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        background.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 12, 130, 25));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 12, 30, 25));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clientes");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        background.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 170, 40));

        btnGuardar.setBackground(new java.awt.Color(0, 153, 51));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Insertar/Actualizar");
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        background.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 170, 40));

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout backgroundInsertLayout = new javax.swing.GroupLayout(backgroundInsert);
        backgroundInsert.setLayout(backgroundInsertLayout);
        backgroundInsertLayout.setHorizontalGroup(
            backgroundInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        backgroundInsertLayout.setVerticalGroup(
            backgroundInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        add(backgroundInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));
    }// </editor-fold>//GEN-END:initComponents


    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtrar();
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tablaClientes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un cliente");
        } else {
            int id = Integer.parseInt(tablaClientes.getValueAt(fila, 0).toString());
            data.eliminarCliente(id);
            data.eliminarClienteSinMascota(id);
            JOptionPane.showMessageDialog(this, "Cliente dado de baja");
        }
        listar(tablaClientes);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        ClienteInsertarView v = new ClienteInsertarView();
        v.setSize(800, 500);
        v.setLocation(0, 0);

        //this.background.removeAll();//limpia el contenedor
        this.background.setVisible(false);
        backgroundInsert.setVisible(true);

        this.backgroundInsert.add(v, BorderLayout.CENTER);
        this.background.revalidate();
        this.background.repaint();

        if (tablaClientes.getSelectedRow() != -1) {
            seleccionar();
            ClienteInsertarView.btnGuardar.setEnabled(false);
            ClienteInsertarView.btnActualizar.setEnabled(true);
            ClienteInsertarView.txtDocumento.setEnabled(false);
        } else {
            ClienteInsertarView.btnGuardar.setEnabled(true);
            ClienteInsertarView.btnActualizar.setEnabled(false);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JPanel background;
    private javax.swing.JPanel backgroundInsert;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    protected static javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
