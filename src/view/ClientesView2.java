/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteData;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
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

        panelSubMenuFiltrarPor.setVisible(false);
        btnTodos.setVisible(false);
        lblEliminados.setVisible(false);
        btnActivarCliente.setVisible(false);
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

    public void listarEliminados(JTable tabla) {
        modelo.setRowCount(0);
        modelo = (DefaultTableModel) tabla.getModel();
        lista = (ArrayList<Cliente>) data.listarEliminados();
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
        btnActivarCliente = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        panelSubMenuFiltrarPor = new javax.swing.JPanel();
        btnClientesEliminados = new javax.swing.JLabel();
        btnTodos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        contLupa = new javax.swing.JPanel();
        lupa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnFiltrar = new javax.swing.JButton();
        lblTodos = new javax.swing.JLabel();
        lblEliminados = new javax.swing.JLabel();
        backgroundInsert = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(970, 620));
        setMinimumSize(new java.awt.Dimension(970, 620));
        setPreferredSize(new java.awt.Dimension(970, 620));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(228, 249, 245));
        background.setMaximumSize(new java.awt.Dimension(970, 620));
        background.setMinimumSize(new java.awt.Dimension(970, 620));
        background.setPreferredSize(new java.awt.Dimension(970, 620));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActivarCliente.setBackground(new java.awt.Color(98, 210, 162));
        btnActivarCliente.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnActivarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnActivarCliente.setText("Activar");
        btnActivarCliente.setBorder(null);
        btnActivarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActivarCliente.setFocusable(false);
        btnActivarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarClienteActionPerformed(evt);
            }
        });
        background.add(btnActivarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 120, 40));

        btnEliminar.setBackground(new java.awt.Color(249, 76, 102));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFocusable(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        background.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 170, 40));

        btnGuardar.setBackground(new java.awt.Color(31, 171, 137));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Insertar/Actualizar");
        btnGuardar.setBorder(null);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setFocusable(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        background.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 180, 40));

        panelSubMenuFiltrarPor.setBackground(new java.awt.Color(17, 153, 158));
        panelSubMenuFiltrarPor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClientesEliminados.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnClientesEliminados.setForeground(new java.awt.Color(255, 255, 255));
        btnClientesEliminados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClientesEliminados.setText("Clientes dados de baja");
        btnClientesEliminados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientesEliminados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClientesEliminadosMouseClicked(evt);
            }
        });
        panelSubMenuFiltrarPor.add(btnClientesEliminados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 30));

        btnTodos.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnTodos.setForeground(new java.awt.Color(255, 255, 255));
        btnTodos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTodos.setText("Todos");
        btnTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTodosMouseClicked(evt);
            }
        });
        panelSubMenuFiltrarPor.add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 30));

        background.add(panelSubMenuFiltrarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 170, 30));

        tablaClientes.setBackground(new java.awt.Color(228, 249, 245));
        tablaClientes.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        tablaClientes.setForeground(new java.awt.Color(64, 81, 78));
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombre", "Apellido", "Telefono", "Direccion", "Alternativo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientes.setFocusable(false);
        tablaClientes.setGridColor(new java.awt.Color(228, 249, 245));
        tablaClientes.setMaximumSize(new java.awt.Dimension(940, 0));
        tablaClientes.setSelectionBackground(new java.awt.Color(228, 249, 245));
        tablaClientes.setSelectionForeground(new java.awt.Color(17, 153, 158));
        tablaClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaClientes.getColumnModel().getColumn(0).setPreferredWidth(40);
        tablaClientes.setRowHeight(30);
        tablaClientes.setGridColor(new java.awt.Color(48, 227, 202));
        tablaClientes.setSelectionBackground(new java.awt.Color(228, 249, 245));
        tablaClientes.setShowHorizontalLines(false);

        //modificaciones header
        tablaClientes.getTableHeader().setFont(new java.awt.Font("Roboto Medium", 0, 22));
        tablaClientes.getTableHeader().setBackground(new java.awt.Color(48, 227, 202));
        tablaClientes.getTableHeader().setForeground(new java.awt.Color(64, 81, 78));
        jScrollPane1.setViewportView(tablaClientes);
        //alinear al centro los datos
        javax.swing.table.DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        for(int i=0;i<6;i++){
            tablaClientes.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
        //color fondo
        tablaClientes.setFillsViewportHeight(true);
        tablaClientes.setBackground(new java.awt.Color(228, 249, 245));

        //
        tablaClientes.setIntercellSpacing(new java.awt.Dimension(0,0));

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 940, 450));

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(64, 81, 78));
        txtBuscar.setBorder(null);
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        background.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 210, 30));

        contLupa.setBackground(new java.awt.Color(255, 255, 255));

        lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N

        javax.swing.GroupLayout contLupaLayout = new javax.swing.GroupLayout(contLupa);
        contLupa.setLayout(contLupaLayout);
        contLupaLayout.setHorizontalGroup(
            contLupaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contLupaLayout.createSequentialGroup()
                .addComponent(lupa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        contLupaLayout.setVerticalGroup(
            contLupaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contLupaLayout.createSequentialGroup()
                .addComponent(lupa)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        background.add(contLupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 40, 30));

        jLabel2.setBackground(new java.awt.Color(17, 153, 158));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 81, 78));
        jLabel2.setText("Clientes");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 240, -1));

        btnFiltrar.setBackground(new java.awt.Color(17, 153, 158));
        btnFiltrar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnFiltrar.setForeground(new java.awt.Color(255, 255, 255));
        btnFiltrar.setText("Filtrar por");
        btnFiltrar.setBorder(null);
        btnFiltrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFiltrar.setFocusable(false);
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });
        background.add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        lblTodos.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lblTodos.setForeground(new java.awt.Color(17, 153, 158));
        lblTodos.setText("Todos");
        background.add(lblTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        lblEliminados.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lblEliminados.setForeground(new java.awt.Color(17, 153, 158));
        lblEliminados.setText("Dados de baja");
        background.add(lblEliminados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 620));

        backgroundInsert.setMaximumSize(new java.awt.Dimension(970, 620));
        backgroundInsert.setMinimumSize(new java.awt.Dimension(970, 620));
        backgroundInsert.setPreferredSize(new java.awt.Dimension(970, 620));

        javax.swing.GroupLayout backgroundInsertLayout = new javax.swing.GroupLayout(backgroundInsert);
        backgroundInsert.setLayout(backgroundInsertLayout);
        backgroundInsertLayout.setHorizontalGroup(
            backgroundInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        backgroundInsertLayout.setVerticalGroup(
            backgroundInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        add(backgroundInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 620));
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
        v.setSize(970, 620);
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

    private int nMenu = 1;
    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        if (nMenu == 1) {
            panelSubMenuFiltrarPor.setVisible(true);
            nMenu = 0;
        } else if (nMenu == 0) {
            panelSubMenuFiltrarPor.setVisible(false);
            nMenu = 1;
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnClientesEliminadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesEliminadosMouseClicked
        listarEliminados(tablaClientes);
        btnClientesEliminados.setVisible(false);
        btnTodos.setVisible(true);

        lblTodos.setVisible(false);
        lblEliminados.setVisible(true);

        btnGuardar.setVisible(false);
        btnEliminar.setVisible(false);
        btnActivarCliente.setVisible(true);
    }//GEN-LAST:event_btnClientesEliminadosMouseClicked

    private void btnTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTodosMouseClicked
        listar(tablaClientes);
        btnTodos.setVisible(false);
        btnClientesEliminados.setVisible(true);

        lblEliminados.setVisible(false);
        lblTodos.setVisible(true);

        btnActivarCliente.setVisible(false);
        btnGuardar.setVisible(true);
        btnEliminar.setVisible(true);
    }//GEN-LAST:event_btnTodosMouseClicked

    private void btnActivarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarClienteActionPerformed
        int fila = tablaClientes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un cliente");
        } else {
            int dni = Integer.parseInt(tablaClientes.getValueAt(fila, 0).toString());
            data.activarCliente(dni);
            JOptionPane.showMessageDialog(this, "Cliente activado");
        }
        listarEliminados(tablaClientes);
    }//GEN-LAST:event_btnActivarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JPanel background;
    private javax.swing.JPanel backgroundInsert;
    private javax.swing.JButton btnActivarCliente;
    private javax.swing.JLabel btnClientesEliminados;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel btnTodos;
    private javax.swing.JPanel contLupa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEliminados;
    private javax.swing.JLabel lblTodos;
    private javax.swing.JLabel lupa;
    private javax.swing.JPanel panelSubMenuFiltrarPor;
    protected static javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
