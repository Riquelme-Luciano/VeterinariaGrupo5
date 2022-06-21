/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteData;
import controller.MascotaData;
import java.awt.BorderLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Conexion;
import model.Mascota;
import model.TipoMascota;
import static view.MascotaInsertarView.comboDueño;
import static view.MascotaInsertarView.txtCodigo;

/**
 *
 * @author danib
 */
public class MascotasView extends javax.swing.JPanel {

    Conexion con = new Conexion();
    MascotaData data = new MascotaData(con);
    Mascota c = new Mascota();
    ClienteData dataCliente = new ClienteData(con);

    static DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Mascota> lista = new ArrayList();
    ArrayList<Mascota> listaFiltro = new ArrayList();

    Cliente clienteFiltro = new Cliente();

    public MascotasView() {
        initComponents();
        backgroundInsert.setVisible(false);
        listar(tablaMascotas);
        llenarComboDueños();

        this.panelSubMenuFiltrarPor.setVisible(false);
        lblCliente.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelSubMenuFiltrarPor = new javax.swing.JPanel();
        comboFiltro = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        btnNewMascota = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        contLupa = new javax.swing.JPanel();
        lupa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblTodos = new javax.swing.JLabel();
        backgroundInsert = new javax.swing.JPanel();

        setBackground(new java.awt.Color(11, 95, 93));
        setMaximumSize(new java.awt.Dimension(970, 620));
        setMinimumSize(new java.awt.Dimension(970, 620));
        setPreferredSize(new java.awt.Dimension(970, 620));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(228, 249, 245));
        background.setMaximumSize(new java.awt.Dimension(970, 620));
        background.setMinimumSize(new java.awt.Dimension(970, 620));
        background.setPreferredSize(new java.awt.Dimension(970, 620));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSubMenuFiltrarPor.setBackground(new java.awt.Color(17, 153, 158));
        panelSubMenuFiltrarPor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboFiltro.setFocusable(false);
        comboFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFiltroItemStateChanged(evt);
            }
        });
        panelSubMenuFiltrarPor.add(comboFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, 20));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cliente");
        panelSubMenuFiltrarPor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 7, -1, 20));

        background.add(panelSubMenuFiltrarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 190, 60));

        jButton1.setBackground(new java.awt.Color(17, 153, 158));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Filtrar por");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        tablaMascotas.setBackground(new java.awt.Color(228, 249, 245));
        tablaMascotas.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        tablaMascotas.setForeground(new java.awt.Color(64, 81, 78));
        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Alias", "Sexo", "Especie", "Raza", "Color", "Nacimiento", "Dueño"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMascotas.setToolTipText("");
        tablaMascotas.setFocusable(false);
        tablaMascotas.setGridColor(new java.awt.Color(48, 227, 202));
        tablaMascotas.setMaximumSize(new java.awt.Dimension(940, 0));
        tablaMascotas.setMinimumSize(new java.awt.Dimension(90, 0));
        tablaMascotas.setRowHeight(30);
        tablaMascotas.setSelectionBackground(new java.awt.Color(228, 249, 245));
        tablaMascotas.setSelectionForeground(new java.awt.Color(17, 153, 158));
        tablaMascotas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        //lineas horizontales
        tablaMascotas.setShowHorizontalLines(false);

        //modificaciones header
        tablaMascotas.getTableHeader().setFont(new java.awt.Font("Roboto Medium", 0, 22));
        tablaMascotas.getTableHeader().setBackground(new java.awt.Color(48, 227, 202));
        tablaMascotas.getTableHeader().setForeground(new java.awt.Color(64, 81, 78));

        //alinear al centro los datos
        javax.swing.table.DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        for(int i=0;i<8;i++){
            tablaMascotas.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }

        //color fondo
        tablaMascotas.setFillsViewportHeight(true);
        tablaMascotas.setBackground(new java.awt.Color(228, 249, 245));
        jScrollPane1.setViewportView(tablaMascotas);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 950, 450));

        btnNewMascota.setBackground(new java.awt.Color(31, 171, 137));
        btnNewMascota.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNewMascota.setForeground(new java.awt.Color(255, 255, 255));
        btnNewMascota.setText("Insertar/Actualizar");
        btnNewMascota.setBorder(null);
        btnNewMascota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNewMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewMascotaActionPerformed(evt);
            }
        });
        background.add(btnNewMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 180, 40));

        btnEliminar.setBackground(new java.awt.Color(249, 76, 102));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        background.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 170, 40));

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
        jLabel2.setText("Mascotas");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 240, -1));

        lblCliente.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(17, 153, 158));
        lblCliente.setText("Daniel Barros");
        background.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        lblTodos.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lblTodos.setForeground(new java.awt.Color(17, 153, 158));
        lblTodos.setText("Todos");
        background.add(lblTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 620));

        backgroundInsert.setMaximumSize(new java.awt.Dimension(970, 620));
        backgroundInsert.setMinimumSize(new java.awt.Dimension(970, 620));

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

    private void btnNewMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewMascotaActionPerformed
        MascotaInsertarView v = new MascotaInsertarView();
        v.setSize(970, 620);
        v.setLocation(0, 0);

        //this.background.removeAll();//limpia el contenedor
        MascotasView.background.setVisible(false);
        backgroundInsert.setVisible(true);

        this.backgroundInsert.add(v, BorderLayout.CENTER);
        MascotasView.background.revalidate();
        MascotasView.background.repaint();

        if (tablaMascotas.getSelectedRow() != -1) {
            seleccionar();
            MascotaInsertarView.btnGuardar.setEnabled(false);
            MascotaInsertarView.btnActualizar.setEnabled(true);
        } else {
            MascotaInsertarView.btnGuardar.setEnabled(true);
            MascotaInsertarView.btnActualizar.setEnabled(false);
        }

        llenarComboDueños();
    }//GEN-LAST:event_btnNewMascotaActionPerformed

    public void llenarComboDueños() {
        comboFiltro.removeAllItems();
        Vector<Cliente> clientes = new Vector<Cliente>(dataCliente.listar());
        comboFiltro.addItem(null);
        for (Cliente cliente : clientes) {
            comboFiltro.addItem(cliente);
        }
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tablaMascotas.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una mascota");
        } else {
            int id = Integer.parseInt(tablaMascotas.getValueAt(fila, 0).toString());
            data.eliminarMascota(id);
            JOptionPane.showMessageDialog(this, "Mascota dada de baja");
        }
        listar(tablaMascotas);
        llenarComboDueños();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void comboFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFiltroItemStateChanged
        clienteFiltro = (Cliente) comboFiltro.getSelectedItem();
        if (clienteFiltro == null) {
            listar(tablaMascotas);

            lblCliente.setVisible(false);
            lblTodos.setVisible(true);
        } else {
            listarPorCliente(tablaMascotas, clienteFiltro);

            lblTodos.setVisible(false);
            lblCliente.setVisible(true);
            lblCliente.setText("Mascotas de: "+clienteFiltro.getNombre() + " " + clienteFiltro.getApellido());
        }
    }//GEN-LAST:event_comboFiltroItemStateChanged

    private int nMenu = 1;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (nMenu == 1) {
            this.panelSubMenuFiltrarPor.setVisible(true);
            nMenu = 0;
        } else if (nMenu == 0) {
            this.panelSubMenuFiltrarPor.setVisible(false);
            nMenu = 1;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        comboFiltro.setSelectedIndex(0);
        filtrar();
    }//GEN-LAST:event_txtBuscarKeyReleased

    public void listar(JTable tabla) {
        modelo.setRowCount(0);
        modelo = (DefaultTableModel) tabla.getModel();
        lista = (ArrayList<Mascota>) data.listar();
        Object[] object = new Object[8];

        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getCodigo();
            object[1] = lista.get(i).getAlias();
            object[2] = lista.get(i).getSexo();
            object[3] = lista.get(i).getEspecie();
            object[4] = lista.get(i).getRaza();
            object[5] = lista.get(i).getColorPelaje();
            object[6] = lista.get(i).getNacimiento();
            object[7] = lista.get(i).getDueño();
            modelo.addRow(object);
        }
        tablaMascotas.setModel(modelo);
    }

    public void listar(JTable tabla, ArrayList<Mascota> l) {
        modelo.setRowCount(0);
        modelo = (DefaultTableModel) tabla.getModel();
        lista = (ArrayList<Mascota>) data.listar();
        Object[] object = new Object[8];

        for (int i = 0; i < l.size(); i++) {
            object[0] = l.get(i).getCodigo();
            object[1] = l.get(i).getAlias();
            object[2] = l.get(i).getSexo();
            object[3] = l.get(i).getEspecie();
            object[4] = l.get(i).getRaza();
            object[5] = l.get(i).getColorPelaje();
            object[6] = l.get(i).getNacimiento();
            object[7] = l.get(i).getDueño();
            modelo.addRow(object);
        }
        tablaMascotas.setModel(modelo);
    }

    public void listarPorCliente(JTable tabla, Cliente cliente) {
        modelo.setRowCount(0);
        modelo = (DefaultTableModel) tabla.getModel();
        lista = (ArrayList<Mascota>) data.listarDepCliente(cliente);
        Object[] object = new Object[8];

        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getCodigo();
            object[1] = lista.get(i).getAlias();
            object[2] = lista.get(i).getSexo();
            object[3] = lista.get(i).getEspecie();
            object[4] = lista.get(i).getRaza();
            object[5] = lista.get(i).getColorPelaje();
            object[6] = lista.get(i).getNacimiento();
            object[7] = lista.get(i).getDueño();
            modelo.addRow(object);
        }
        tablaMascotas.setModel(modelo);
    }

    public static void seleccionar() {
        int fila = tablaMascotas.getSelectedRow();

        int codigo = Integer.parseInt(tablaMascotas.getValueAt(fila, 0).toString());
        String alias = (String) tablaMascotas.getValueAt(fila, 1);
        char sexo = tablaMascotas.getValueAt(fila, 2).toString().charAt(0);
        TipoMascota especie = Mascota.validarTipoMascota(tablaMascotas.getValueAt(fila, 3).toString());
        String raza = (String) tablaMascotas.getValueAt(fila, 4);
        String color = (String) tablaMascotas.getValueAt(fila, 5);
        Date nacimiento = (Date) tablaMascotas.getValueAt(fila, 6);
        Cliente cliente = (Cliente) tablaMascotas.getValueAt(fila, 7);

        MascotaInsertarView.txtCodigo.setText("" + codigo);
        MascotaInsertarView.txtAlias.setText(alias);
        MascotaInsertarView.txtRaza.setText(raza);
        MascotaInsertarView.txtColor.setText(color);
        MascotaInsertarView.comboEspecies.setSelectedItem(especie);

        //pasar dueño a comboBox dueño
        for (int i = 0; i < MascotaInsertarView.comboDueño.getItemCount(); i++) {
            Cliente c = MascotaInsertarView.comboDueño.getItemAt(i);
            if (c.getNombre().equals(cliente.getNombre()) && c.getApellido().equals(cliente.getApellido())) {
                MascotaInsertarView.comboDueño.setSelectedIndex(i);
            }
        }

        if (sexo == 'M') {
            MascotaInsertarView.rbMacho.setSelected(true);
        } else if (sexo == 'H') {
            MascotaInsertarView.rbHembra.setSelected(true);
        }
        //INGRESAR EL DATE AL JCALENDAR
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd,MM,yyyy");
        Date fechaNac;
        try {
            fechaNac = formatoFecha.parse(formatoFecha.format(nacimiento));
            MascotaInsertarView.calendarNacimiento.setDate(fechaNac);
        } catch (ParseException ex) {
            System.out.println("Error al parsear el dato de la tabla fecha al textField");
        }
        //------------------
    }

    public void filtrar() {
        String filtro = txtBuscar.getText();

        if (filtro.isEmpty()) {
            listar(tablaMascotas);
        } else {
            this.listaFiltro.clear();

            for (Mascota cl : this.lista) {
                if (cl.getAlias().toLowerCase().contains(filtro.toLowerCase())) {
                    this.listaFiltro.add(cl);
                }
            }

            listar(tablaMascotas, listaFiltro);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel background;
    private javax.swing.JPanel backgroundInsert;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNewMascota;
    private javax.swing.JComboBox<Cliente> comboFiltro;
    private javax.swing.JPanel contLupa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblTodos;
    private javax.swing.JLabel lupa;
    private javax.swing.JPanel panelSubMenuFiltrarPor;
    protected static javax.swing.JTable tablaMascotas;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
