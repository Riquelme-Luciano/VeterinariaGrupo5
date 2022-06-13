/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.TratamientoData;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Conexion;
import model.Tratamiento;

/**
 *
 * @author danib
 */
public class TratamientoInsertarView extends javax.swing.JPanel {

    Conexion con = new Conexion();
    TratamientoData data = new TratamientoData(con);
    Tratamiento tratamiento = new Tratamiento();
    ArrayList<Tratamiento> lista = new ArrayList();

    public TratamientoInsertarView() {
        initComponents();
        llenarComboDueños();
        llenarComboTipos();
    }

    public void llenarComboDueños() {
        comboMedicamento.removeAllItems();
        Vector<String> medicamentos = new Vector<String>(data.medicamentos());
        for (String medicamento : medicamentos) {
            comboMedicamento.addItem(medicamento);
        }
    }

    public void llenarComboTipos() {
        comboTipoTratamiento.removeAllItems();
        Vector<String> tiposTratamientos = new Vector<String>(data.tipos());
        for (String tipo : tiposTratamientos) {
            comboTipoTratamiento.addItem(tipo);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        lblDoc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescripcion = new javax.swing.JTextArea();
        lblDoc2 = new javax.swing.JLabel();
        comboTipoTratamiento = new javax.swing.JComboBox<>();
        comboMedicamento = new javax.swing.JComboBox<>();
        txtImporte = new javax.swing.JTextField();
        lblDoc3 = new javax.swing.JLabel();
        btnAgregarMedicamento = new javax.swing.JLabel();
        btnAgregarTipo = new javax.swing.JLabel();
        btnAtras = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblDoc4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(11, 95, 93));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDoc.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc.setText("Importe");
        background.add(lblDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        txtAreaDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtAreaDescripcion.setColumns(1);
        txtAreaDescripcion.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        txtAreaDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        txtAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescripcion);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 340, 240));

        lblDoc2.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc2.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc2.setText("Medicamento");
        background.add(lblDoc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        comboTipoTratamiento.setBackground(new java.awt.Color(255, 255, 255));
        comboTipoTratamiento.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        background.add(comboTipoTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 280, 40));

        comboMedicamento.setBackground(new java.awt.Color(255, 255, 255));
        comboMedicamento.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        background.add(comboMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 280, 40));

        txtImporte.setBackground(new java.awt.Color(255, 255, 255));
        txtImporte.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        txtImporte.setForeground(new java.awt.Color(0, 0, 0));
        background.add(txtImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 170, 40));

        lblDoc3.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc3.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc3.setText("Descripcion:");
        background.add(lblDoc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        btnAgregarMedicamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addIcon.png"))); // NOI18N
        btnAgregarMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMedicamentoMouseClicked(evt);
            }
        });
        background.add(btnAgregarMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        btnAgregarTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addIcon.png"))); // NOI18N
        btnAgregarTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarTipoMouseClicked(evt);
            }
        });
        background.add(btnAgregarTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha-rellena.png"))); // NOI18N
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasMouseClicked(evt);
            }
        });
        background.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, 50, 30));

        btnActualizar.setBackground(new java.awt.Color(0, 156, 91));
        btnActualizar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(null);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        background.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 180, 40));

        btnGuardar.setBackground(new java.awt.Color(0, 153, 51));
        btnGuardar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        background.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 180, 40));

        lblDoc4.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc4.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc4.setText("Tipo");
        background.add(lblDoc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txtID.setEditable(false);
        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setPreferredSize(new java.awt.Dimension(100, 22));
        background.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarTipoMouseClicked
        String tipo = JOptionPane.showInputDialog("Ingrese el tipo de tratamiento:");
        comboTipoTratamiento.addItem(tipo);
        comboTipoTratamiento.setSelectedItem(tipo);
    }//GEN-LAST:event_btnAgregarTipoMouseClicked

    private void btnAgregarMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMedicamentoMouseClicked
        String medicamento = JOptionPane.showInputDialog("Ingrese el medicamento:");
        comboMedicamento.addItem(medicamento);
        comboMedicamento.setSelectedItem(medicamento);
    }//GEN-LAST:event_btnAgregarMedicamentoMouseClicked

    private void btnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseClicked
        this.setVisible(false);
        TratamientoView.background.setVisible(true);
    }//GEN-LAST:event_btnAtrasMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String tipo = comboTipoTratamiento.getSelectedItem().toString();
        String descripcion = txtAreaDescripcion.getText();
        String medicamento = comboMedicamento.getSelectedItem().toString();
        Double importe = Double.parseDouble(txtImporte.getText());
        boolean activo = true;

        tratamiento.setTipo(tipo);
        tratamiento.setDescripcion(descripcion);
        tratamiento.setMedicamento(medicamento);
        tratamiento.setImporte(importe);
        tratamiento.setActivo(activo);

        int r = data.insertarTratamiento(tratamiento);

        if (r == 1) {
            JOptionPane.showMessageDialog(this, "Tratamiento agregado");
            limpiarCampos();
            listar(TratamientoView.tablaTratamientos);
        } else {
            JOptionPane.showMessageDialog(this, "Error al insertar tratamiento");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int id = Integer.parseInt(txtID.getText());
        String tipo = comboTipoTratamiento.getSelectedItem().toString();
        String descripcion = txtAreaDescripcion.getText();
        String medicamento = comboMedicamento.getSelectedItem().toString();
        Double importe = Double.parseDouble(txtImporte.getText());
        boolean activo = true;

        tratamiento.setIdTratamiento(id);
        tratamiento.setTipo(tipo);
        tratamiento.setDescripcion(descripcion);
        tratamiento.setMedicamento(medicamento);
        tratamiento.setImporte(importe);
        tratamiento.setActivo(activo);

        int r = data.actualizarTratamiento(tratamiento);
        
        if (r == 1) {
            JOptionPane.showMessageDialog(this, "Tratamiento actualizado");
            listar(TratamientoView.tablaTratamientos);
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar tratamiento");
        }
    
    }//GEN-LAST:event_btnActualizarActionPerformed

    public void limpiarCampos() {
        txtAreaDescripcion.setText("");
        txtID.setText("");
        txtImporte.setText("");
        comboMedicamento.setSelectedItem(null);
        comboTipoTratamiento.setSelectedItem(null);
    }

    public void listar(JTable tabla) {
        TratamientoView.modelo.setRowCount(0);
        TratamientoView.modelo = (DefaultTableModel) tabla.getModel();
        lista = (ArrayList<Tratamiento>) data.listar();
        Object[] object = new Object[5];

        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getIdTratamiento();
            object[1] = lista.get(i).getTipo();
            object[2] = lista.get(i).getDescripcion();
            object[3] = lista.get(i).getMedicamento();
            object[4] = lista.get(i).getImporte();
            TratamientoView.modelo.addRow(object);
        }
        TratamientoView.tablaTratamientos.setModel(TratamientoView.modelo);
    }


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    protected static javax.swing.JButton btnActualizar;
    private javax.swing.JLabel btnAgregarMedicamento;
    private javax.swing.JLabel btnAgregarTipo;
    protected static javax.swing.JLabel btnAtras;
    protected static javax.swing.JButton btnGuardar;
    protected static javax.swing.JComboBox<String> comboMedicamento;
    protected static javax.swing.JComboBox<String> comboTipoTratamiento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDoc;
    private javax.swing.JLabel lblDoc2;
    private javax.swing.JLabel lblDoc3;
    private javax.swing.JLabel lblDoc4;
    protected static javax.swing.JTextArea txtAreaDescripcion;
    protected static javax.swing.JTextField txtID;
    protected static javax.swing.JTextField txtImporte;
    // End of variables declaration//GEN-END:variables
}
