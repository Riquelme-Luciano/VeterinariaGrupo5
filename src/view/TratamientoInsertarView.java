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
        comboMedicamento.addItem("Ninguno");
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
        jLabel1 = new javax.swing.JLabel();
        asterisco3 = new javax.swing.JLabel();
        asterisco4 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(970, 620));
        setMinimumSize(new java.awt.Dimension(970, 620));
        setPreferredSize(new java.awt.Dimension(970, 620));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(228, 249, 245));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDoc.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc.setForeground(new java.awt.Color(64, 81, 78));
        lblDoc.setText("Importe");
        background.add(lblDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 170, -1));

        txtAreaDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtAreaDescripcion.setColumns(1);
        txtAreaDescripcion.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        txtAreaDescripcion.setForeground(new java.awt.Color(64, 81, 78));
        txtAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescripcion);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 340, 240));

        lblDoc2.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc2.setForeground(new java.awt.Color(64, 81, 78));
        lblDoc2.setText("Medicamento");
        background.add(lblDoc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 240, -1));

        comboTipoTratamiento.setBackground(new java.awt.Color(255, 255, 255));
        comboTipoTratamiento.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        comboTipoTratamiento.setForeground(new java.awt.Color(64, 81, 78));
        comboTipoTratamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        background.add(comboTipoTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 280, 40));

        comboMedicamento.setBackground(new java.awt.Color(255, 255, 255));
        comboMedicamento.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        comboMedicamento.setForeground(new java.awt.Color(64, 81, 78));
        comboMedicamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        background.add(comboMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 280, 40));

        txtImporte.setBackground(new java.awt.Color(255, 255, 255));
        txtImporte.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        txtImporte.setForeground(new java.awt.Color(64, 81, 78));
        txtImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImporteKeyTyped(evt);
            }
        });
        background.add(txtImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 170, 40));

        lblDoc3.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc3.setForeground(new java.awt.Color(64, 81, 78));
        lblDoc3.setText("Descripcion:");
        background.add(lblDoc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 150, -1));

        btnAgregarMedicamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addIcon.png"))); // NOI18N
        btnAgregarMedicamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMedicamentoMouseClicked(evt);
            }
        });
        background.add(btnAgregarMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, 40));

        btnAgregarTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addIcon.png"))); // NOI18N
        btnAgregarTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarTipoMouseClicked(evt);
            }
        });
        background.add(btnAgregarTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 50, 40));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha-rellena.png"))); // NOI18N
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasMouseClicked(evt);
            }
        });
        background.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, 50, 30));

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

        lblDoc4.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc4.setForeground(new java.awt.Color(64, 81, 78));
        lblDoc4.setText("Tipo");
        background.add(lblDoc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 160, -1));

        txtID.setEditable(false);
        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setForeground(new java.awt.Color(64, 81, 78));
        txtID.setPreferredSize(new java.awt.Dimension(100, 22));
        background.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, -1, -1));
        txtID.setVisible(false);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 153, 158));
        jLabel1.setText("Campos obligatorios *");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, 30));

        asterisco3.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        asterisco3.setForeground(new java.awt.Color(64, 81, 78));
        asterisco3.setText("*");
        background.add(asterisco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 20, 20));

        asterisco4.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        asterisco4.setForeground(new java.awt.Color(64, 81, 78));
        asterisco4.setText("*");
        background.add(asterisco4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 20, 20));

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 620));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarTipoMouseClicked
        String tipo = JOptionPane.showInputDialog("Ingrese el tipo de tratamiento:");
        if (tipo != null) {
            //El usuario coloco algo que no sea solo espacios
            if (!tipo.trim().equals("")) {
                comboTipoTratamiento.addItem(tipo);
                comboTipoTratamiento.setSelectedItem(tipo);
            } else {
                JOptionPane.showMessageDialog(this, "No se permiten valores vacios");
            }
        } else {
            //El usuario le dio al boton cancelar.
        }
    }//GEN-LAST:event_btnAgregarTipoMouseClicked

    private void btnAgregarMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMedicamentoMouseClicked
        String medicamento = JOptionPane.showInputDialog("Ingrese el medicamento:");

        if (medicamento != null) {
            //El usuario coloco algo que no sea solo espacios
            if (!medicamento.trim().equals("")) {
                comboMedicamento.addItem(medicamento);
                comboMedicamento.setSelectedItem(medicamento);
            } else {
                JOptionPane.showMessageDialog(this, "No se permiten valores vacios");
            }
        } else {
            //El usuario le dio al boton cancelar.
        }
    }//GEN-LAST:event_btnAgregarMedicamentoMouseClicked

    private void btnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseClicked
        this.setVisible(false);
        TratamientoView.background.setVisible(true);
    }//GEN-LAST:event_btnAtrasMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //validar que rellene campos obligatorios
        if (validacionesVacias() == 1) {
            JOptionPane.showMessageDialog(this, "Debe llenar los campos requeridos");
        } else {
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
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (validacionesVacias() == 1) {
            JOptionPane.showMessageDialog(this, "Debe llenar los campos requeridos");
        } else {
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
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtImporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImporteKeyTyped
        int key = evt.getKeyChar();//Devuelve el carácter asociado a la clave en este evento.
        boolean numeros = key >= 48 && key <= 57;
        boolean punto = key == 46;
        if (!(numeros || punto)) {
            evt.consume();
        }
        if (txtImporte.getText().trim().length() == 6) {
            evt.consume();
        }
    }//GEN-LAST:event_txtImporteKeyTyped

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

    public int validacionesVacias() {
        String a = txtImporte.getText();
        String b = comboTipoTratamiento.getSelectedItem().toString();

        if (a.isEmpty() || b.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asterisco3;
    private javax.swing.JLabel asterisco4;
    protected static javax.swing.JPanel background;
    protected static javax.swing.JButton btnActualizar;
    private javax.swing.JLabel btnAgregarMedicamento;
    private javax.swing.JLabel btnAgregarTipo;
    protected static javax.swing.JLabel btnAtras;
    protected static javax.swing.JButton btnGuardar;
    protected static javax.swing.JComboBox<String> comboMedicamento;
    protected static javax.swing.JComboBox<String> comboTipoTratamiento;
    private javax.swing.JLabel jLabel1;
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
