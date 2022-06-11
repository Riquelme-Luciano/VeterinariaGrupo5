/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteData;
import controller.MascotaData;

import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Conexion;
import model.Mascota;
import model.TipoMascota;
import static view.MascotasView.tablaMascotas;

/**
 *
 * @author danib
 */
public class MascotaInsertarView extends javax.swing.JPanel {

    Conexion con = new Conexion();
    MascotaData data = new MascotaData(con);
    ClienteData dataCliente = new ClienteData(con);
    Mascota m = new Mascota();

    ArrayList<Mascota> lista = new ArrayList();
    ArrayList<Mascota> listaFiltro = new ArrayList();

    public MascotaInsertarView() {
        initComponents();
        llenarComboEspecies();
        llenarComboDueños();
    }

    public void llenarComboEspecies() {
        comboEspecies.removeAllItems();
        TipoMascota[] tipoMascList = TipoMascota.values();
        for (TipoMascota tipoMascota : tipoMascList) {
            comboEspecies.addItem(tipoMascota);
        }
    }

    public void llenarComboDueños() {
        comboDueño.removeAllItems();
        Vector<Cliente> clientes = new Vector<Cliente>(dataCliente.listar());
//        DefaultComboBoxModel modeloMaterias = new DefaultComboBoxModel(clientes);
//        comboDueño.setModel(modeloMaterias);
        for (Cliente cliente : clientes) {
            comboDueño.addItem(cliente);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnesSexo = new javax.swing.ButtonGroup();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        lblDoc1 = new javax.swing.JLabel();
        lblDoc2 = new javax.swing.JLabel();
        lblDoc = new javax.swing.JLabel();
        lblDoc3 = new javax.swing.JLabel();
        lblDoc5 = new javax.swing.JLabel();
        lblDoc4 = new javax.swing.JLabel();
        lblDoc6 = new javax.swing.JLabel();
        rbMacho = new javax.swing.JRadioButton();
        rbHembra = new javax.swing.JRadioButton();
        comboDueño = new javax.swing.JComboBox<>();
        calendarNacimiento = new com.toedter.calendar.JDateChooser();
        comboEspecies = new javax.swing.JComboBox<>();
        txtAlias = new javax.swing.JTextField();
        lblAtras = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setBackground(new java.awt.Color(11, 95, 93));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setBackground(new java.awt.Color(0, 153, 51));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Insertar");
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 120, 40));

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
        add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 120, 40));

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigo.setBorder(null);
        add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 90, -1));

        txtColor.setBackground(new java.awt.Color(255, 255, 255));
        txtColor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtColor.setForeground(new java.awt.Color(0, 0, 0));
        txtColor.setBorder(null);
        add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 283, -1));

        txtRaza.setBackground(new java.awt.Color(255, 255, 255));
        txtRaza.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtRaza.setForeground(new java.awt.Color(0, 0, 0));
        txtRaza.setBorder(null);
        add(txtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 283, -1));

        lblDoc1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblDoc1.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc1.setText("Sexo:");
        add(lblDoc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        lblDoc2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblDoc2.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc2.setText("Especie:");
        add(lblDoc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        lblDoc.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblDoc.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc.setText("Alias");
        add(lblDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        lblDoc3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblDoc3.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc3.setText("Raza:");
        add(lblDoc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        lblDoc5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblDoc5.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc5.setText("Color:");
        add(lblDoc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        lblDoc4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblDoc4.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc4.setText("Nacimiento:");
        add(lblDoc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        lblDoc6.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblDoc6.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc6.setText("Dueño:");
        add(lblDoc6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        btnesSexo.add(rbMacho);
        rbMacho.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rbMacho.setForeground(new java.awt.Color(255, 255, 255));
        rbMacho.setText("Macho");
        add(rbMacho, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));

        btnesSexo.add(rbHembra);
        rbHembra.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rbHembra.setForeground(new java.awt.Color(255, 255, 255));
        rbHembra.setText("Hembra");
        add(rbHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, -1, -1));

        comboDueño.setBackground(new java.awt.Color(255, 255, 255));
        comboDueño.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        comboDueño.setForeground(new java.awt.Color(0, 0, 0));
        comboDueño.setMaximumRowCount(100);
        add(comboDueño, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 280, 30));
        add(calendarNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 280, 30));

        comboEspecies.setBackground(new java.awt.Color(255, 255, 255));
        comboEspecies.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        comboEspecies.setForeground(new java.awt.Color(0, 0, 0));
        add(comboEspecies, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 280, 30));

        txtAlias.setBackground(new java.awt.Color(255, 255, 255));
        txtAlias.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtAlias.setForeground(new java.awt.Color(0, 0, 0));
        txtAlias.setBorder(null);
        add(txtAlias, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 283, -1));

        lblAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha-rellena.png"))); // NOI18N
        lblAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtrasMouseClicked(evt);
            }
        });
        add(lblAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //long codigo = Long.parseLong(txtCodigo.getText());
        String alias = txtAlias.getText();
        char sexo = 'X';
        if (rbMacho.isSelected()) {
            sexo = 'M';
        } else if (rbHembra.isSelected()) {
            sexo = 'H';
        }

        String especie = comboEspecies.getSelectedItem().toString();
        String raza = txtRaza.getText();
        String color = txtColor.getText();
        Date nacimiento = calendarNacimiento.getDate();
        Cliente cliente = (Cliente) comboDueño.getSelectedItem();
        boolean activo = true;

        m.setAlias(alias);
        m.setSexo(sexo);
        m.setEspecie(Mascota.validarTipoMascota(especie));
        m.setRaza(raza);
        m.setColorPelaje(color);
        m.setNacimiento(nacimiento);
        m.setCliente(cliente);
        m.setActivo(activo);

        System.out.println(m);
        int r = data.insertarMascota(m);

        if (r == 1) {
            JOptionPane.showMessageDialog(this, "Mascota agregada");
            limpiarCampos();
            listar(MascotasView.tablaMascotas);
        } else {
            JOptionPane.showMessageDialog(this, "Error al insertar mascota");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int id = Integer.parseInt(txtCodigo.getText());
        String alias = txtAlias.getText();
        char sexo = 'X';
        if (rbMacho.isSelected()) {
            sexo = 'M';
        } else if (rbHembra.isSelected()) {
            sexo = 'H';
        }

        String especie = comboEspecies.getSelectedItem().toString();
        String raza = txtRaza.getText();
        String color = txtColor.getText();
        Date nacimiento = calendarNacimiento.getDate();
        Cliente cliente = (Cliente) comboDueño.getSelectedItem();
        boolean activo = true;
        
        m.setCodigo(id);
        m.setAlias(alias);
        m.setSexo(sexo);
        m.setEspecie(Mascota.validarTipoMascota(especie));
        m.setRaza(raza);
        m.setColorPelaje(color);
        m.setNacimiento(nacimiento);
        m.setCliente(cliente);
        m.setActivo(activo);

        int r = data.actualizarMascota(m);

        if (r == 1) {
            JOptionPane.showMessageDialog(this, "Mascota actualizada");
            listar(MascotasView.tablaMascotas);
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar mascota");
        }
    
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void lblAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseClicked
        this.setVisible(false);
        MascotasView.background.setVisible(true);
    }//GEN-LAST:event_lblAtrasMouseClicked

    public void limpiarCampos() {
        txtAlias.setText("");
        txtRaza.setText("");
        txtColor.setText("");
        calendarNacimiento.setDate(null);
        btnesSexo.clearSelection();
    }

    public void listar(JTable tabla) {
        MascotasView.modelo.setRowCount(0);
        MascotasView.modelo = (DefaultTableModel) tabla.getModel();
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
            MascotasView.modelo.addRow(object);
        }
        tablaMascotas.setModel(MascotasView.modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JButton btnActualizar;
    protected static javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup btnesSexo;
    protected static com.toedter.calendar.JDateChooser calendarNacimiento;
    protected static javax.swing.JComboBox<Cliente> comboDueño;
    protected static javax.swing.JComboBox<TipoMascota> comboEspecies;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblDoc;
    private javax.swing.JLabel lblDoc1;
    private javax.swing.JLabel lblDoc2;
    private javax.swing.JLabel lblDoc3;
    private javax.swing.JLabel lblDoc4;
    private javax.swing.JLabel lblDoc5;
    private javax.swing.JLabel lblDoc6;
    protected static javax.swing.JRadioButton rbHembra;
    protected static javax.swing.JRadioButton rbMacho;
    protected static javax.swing.JTextField txtAlias;
    protected static javax.swing.JTextField txtCodigo;
    protected static javax.swing.JTextField txtColor;
    protected static javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
