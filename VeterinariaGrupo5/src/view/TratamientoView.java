package view;

import controller.TratamientoData;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Conexion;
import model.Tratamiento;

/**
 *
 * @author danib
 */
public class TratamientoView extends javax.swing.JPanel {

    Conexion con = new Conexion();
    TratamientoData data = new TratamientoData(con);
    Tratamiento tratamiento = new Tratamiento();

    ArrayList<Tratamiento> lista = new ArrayList();
    ArrayList<Tratamiento> listaFiltro = new ArrayList();

    static DefaultTableModel modelo = new DefaultTableModel();

    public TratamientoView() {
        initComponents();
        listar(tablaTratamientos);
    }

    public void listar(JTable tabla) {
        modelo.setRowCount(0);
        modelo = (DefaultTableModel) tabla.getModel();
        lista = (ArrayList<Tratamiento>) data.listar();
        Object[] object = new Object[5];

        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getIdTratamiento();
            object[1] = lista.get(i).getTipo();
            object[2] = lista.get(i).getDescripcion();
            object[3] = lista.get(i).getMedicamento();
            object[4] = lista.get(i).getImporte();
            modelo.addRow(object);
        }
        tablaTratamientos.setModel(modelo);
    }

    public void listar(JTable tabla, ArrayList<Tratamiento> l) {
        modelo.setRowCount(0);
        modelo = (DefaultTableModel) tabla.getModel();
        Object[] object = new Object[5];

        for (int i = 0; i < l.size(); i++) {
            object[0] = l.get(i).getIdTratamiento();
            object[1] = l.get(i).getTipo();
            object[2] = l.get(i).getDescripcion();
            object[3] = l.get(i).getMedicamento();
            object[4] = l.get(i).getImporte();
            modelo.addRow(object);
        }
        tablaTratamientos.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTratamientos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnNewTratamiento = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        backgroundInsert = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(11, 95, 93));

        tablaTratamientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Descripcion", "Medicamento", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaTratamientos);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tratamientos");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtBuscar.setBorder(null);
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        btnNewTratamiento.setBackground(new java.awt.Color(0, 153, 51));
        btnNewTratamiento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNewTratamiento.setForeground(new java.awt.Color(255, 255, 255));
        btnNewTratamiento.setText("Insertar/Actualizar");
        btnNewTratamiento.setBorder(null);
        btnNewTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewTratamientoActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel1)
                        .addGap(99, 99, 99)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(btnNewTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(btnNewTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 812, 512));

        javax.swing.GroupLayout backgroundInsertLayout = new javax.swing.GroupLayout(backgroundInsert);
        backgroundInsert.setLayout(backgroundInsertLayout);
        backgroundInsertLayout.setHorizontalGroup(
            backgroundInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        backgroundInsertLayout.setVerticalGroup(
            backgroundInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        add(backgroundInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtrar();
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnNewTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewTratamientoActionPerformed
        TratamientoInsertarView v = new TratamientoInsertarView();
        v.setSize(800, 500);
        v.setLocation(0, 0);

        //this.background.removeAll();//limpia el contenedor
        this.background.setVisible(false);
        this.backgroundInsert.setVisible(true);

        this.backgroundInsert.add(v, BorderLayout.CENTER);
        this.background.revalidate();
        this.background.repaint();

        if (tablaTratamientos.getSelectedRow() != -1) {
            seleccionar();
            TratamientoInsertarView.btnGuardar.setEnabled(false);
            TratamientoInsertarView.btnActualizar.setEnabled(true);
        } else {
            TratamientoInsertarView.btnGuardar.setEnabled(true);
            TratamientoInsertarView.btnActualizar.setEnabled(false);
        }
    }//GEN-LAST:event_btnNewTratamientoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tablaTratamientos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un tratamiento");
        } else {
            int id = Integer.parseInt(tablaTratamientos.getValueAt(fila, 0).toString());
            data.eliminarTratamiento(id);
            JOptionPane.showMessageDialog(this, "Tratamiento eliminado");
        }
        listar(tablaTratamientos);
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void seleccionar() {
        int fila = tablaTratamientos.getSelectedRow();

        int id = Integer.parseInt(tablaTratamientos.getValueAt(fila, 0).toString());
        String tipo = (String) tablaTratamientos.getValueAt(fila, 1);
        String descripcion = tablaTratamientos.getValueAt(fila, 2).toString();
        String medicamento = tablaTratamientos.getValueAt(fila, 3).toString();
        double importe = Double.parseDouble(tablaTratamientos.getValueAt(fila, 4).toString());

        TratamientoInsertarView.comboTipoTratamiento.setSelectedItem(tipo);
        TratamientoInsertarView.comboMedicamento.setSelectedItem(medicamento);
        TratamientoInsertarView.txtID.setText("" + id);
        TratamientoInsertarView.txtAreaDescripcion.setText(descripcion);
        TratamientoInsertarView.txtImporte.setText("" + importe);
    }

    public void filtrar() {
        String filtro = txtBuscar.getText();

        if (filtro.isEmpty()) {
            listar(tablaTratamientos);
        } else {
            this.listaFiltro.clear();

            for (Tratamiento tr : this.lista) {
                if (tr.getTipo().toLowerCase().contains(filtro.toLowerCase())) {
                    this.listaFiltro.add(tr);
                }
            }

            listar(tablaTratamientos, listaFiltro);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JPanel background;
    protected static javax.swing.JPanel backgroundInsert;
    private javax.swing.JButton btnEliminar;
    protected static javax.swing.JButton btnNewTratamiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    protected static javax.swing.JTable tablaTratamientos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
