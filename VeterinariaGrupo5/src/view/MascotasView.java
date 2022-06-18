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
        this.panelSubMenuFiltrarPor.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        btnNewMascota = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        backgroundInsert = new javax.swing.JPanel();

        setBackground(new java.awt.Color(11, 95, 93));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(11, 95, 93));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSubMenuFiltrarPor.setBackground(new java.awt.Color(102, 0, 102));
        panelSubMenuFiltrarPor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFiltroItemStateChanged(evt);
            }
        });
        panelSubMenuFiltrarPor.add(comboFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, 20));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cliente");
        panelSubMenuFiltrarPor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 7, -1, 20));

        background.add(panelSubMenuFiltrarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 190, 60));

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Filtrar por");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, 30));

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
        jScrollPane1.setViewportView(tablaMascotas);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 770, 330));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mascotas");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        btnNewMascota.setBackground(new java.awt.Color(0, 153, 51));
        btnNewMascota.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNewMascota.setForeground(new java.awt.Color(255, 255, 255));
        btnNewMascota.setText("Insertar/Actualizar");
        btnNewMascota.setBorder(null);
        btnNewMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewMascotaActionPerformed(evt);
            }
        });
        background.add(btnNewMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 180, 40));

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
        background.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 120, 40));

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtBuscar.setBorder(null);
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        background.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 12, 130, 25));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 12, 30, 25));

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

    private void btnNewMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewMascotaActionPerformed
        MascotaInsertarView v = new MascotaInsertarView();
        v.setSize(800, 500);
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
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtrar();
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void comboFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFiltroItemStateChanged
        clienteFiltro = (Cliente) comboFiltro.getSelectedItem();
        if (clienteFiltro == null) {
            listar(tablaMascotas);
        } else {
            listarPorCliente(tablaMascotas, clienteFiltro);
        }
    }//GEN-LAST:event_comboFiltroItemStateChanged

    private int nMenu = 1;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (nMenu == 1) {
            llenarComboDueños();
            this.panelSubMenuFiltrarPor.setVisible(true);
            nMenu = 0;
        } else if (nMenu == 0) {
            this.panelSubMenuFiltrarPor.setVisible(false);
            nMenu = 1;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelSubMenuFiltrarPor;
    protected static javax.swing.JTable tablaMascotas;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
