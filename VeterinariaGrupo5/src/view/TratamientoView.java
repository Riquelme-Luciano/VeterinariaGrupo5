package view;

import controller.TratamientoData;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
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

    //Para el filtro liste cuando este en eliminados e inversa
    private String botonFiltro = "todos";

    public TratamientoView() {
        initComponents();
        listar(tablaTratamientos);

        panelSubMenuFiltrarPor.setVisible(false);
        btnTodos.setVisible(false);
        lblEliminados.setVisible(false);
        btnActivarCliente.setVisible(false);
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

    public void listarEliminados(JTable tabla) {
        modelo.setRowCount(0);
        modelo = (DefaultTableModel) tabla.getModel();
        lista = (ArrayList<Tratamiento>) data.listarEliminados();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTratamientos = new javax.swing.JTable();
        btnActivarCliente = new javax.swing.JButton();
        btnNewTratamiento = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        panelSubMenuFiltrarPor = new javax.swing.JPanel();
        btnTratamientosEliminados = new javax.swing.JLabel();
        btnTodos = new javax.swing.JLabel();
        lblEliminados = new javax.swing.JLabel();
        lblTodos = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        contLupa = new javax.swing.JPanel();
        lupa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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

        tablaTratamientos.setBackground(new java.awt.Color(228, 249, 245));
        tablaTratamientos.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        tablaTratamientos.setForeground(new java.awt.Color(64, 81, 78));
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
        tablaTratamientos.setFocusable(false);
        tablaTratamientos.setGridColor(new java.awt.Color(48, 227, 202));
        tablaTratamientos.setSelectionBackground(new java.awt.Color(228, 249, 245));
        tablaTratamientos.setSelectionForeground(new java.awt.Color(17, 153, 158));
        tablaTratamientos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        //alto de fila
        tablaTratamientos.setRowHeight(30);

        tablaTratamientos.setGridColor(new java.awt.Color(48, 227, 202));
        tablaTratamientos.setSelectionBackground(new java.awt.Color(228, 249, 245));

        //lineas horizontales
        tablaTratamientos.setShowHorizontalLines(false);

        //modificaciones header
        tablaTratamientos.getTableHeader().setFont(new java.awt.Font("Roboto Medium", 0, 22));
        tablaTratamientos.getTableHeader().setBackground(new java.awt.Color(48, 227, 202));
        tablaTratamientos.getTableHeader().setForeground(new java.awt.Color(64, 81, 78));

        //alinear al centro los datos
        javax.swing.table.DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        for(int i=0;i<5;i++){
            tablaTratamientos.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
        //color fondo
        tablaTratamientos.setFillsViewportHeight(true);
        tablaTratamientos.setBackground(new java.awt.Color(228, 249, 245));
        jScrollPane1.setViewportView(tablaTratamientos);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 950, 430));

        btnActivarCliente.setBackground(new java.awt.Color(0, 153, 153));
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
        background.add(btnActivarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 180, 40));

        btnNewTratamiento.setBackground(new java.awt.Color(31, 171, 137));
        btnNewTratamiento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNewTratamiento.setForeground(new java.awt.Color(255, 255, 255));
        btnNewTratamiento.setText("Insertar/Actualizar");
        btnNewTratamiento.setBorder(null);
        btnNewTratamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNewTratamiento.setFocusable(false);
        btnNewTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewTratamientoActionPerformed(evt);
            }
        });
        background.add(btnNewTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 180, 40));

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

        panelSubMenuFiltrarPor.setBackground(new java.awt.Color(17, 153, 158));
        panelSubMenuFiltrarPor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTratamientosEliminados.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnTratamientosEliminados.setForeground(new java.awt.Color(255, 255, 255));
        btnTratamientosEliminados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTratamientosEliminados.setText("Tratamientos dados de baja");
        btnTratamientosEliminados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTratamientosEliminados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTratamientosEliminadosMouseClicked(evt);
            }
        });
        panelSubMenuFiltrarPor.add(btnTratamientosEliminados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 30));

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
        panelSubMenuFiltrarPor.add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 30));

        background.add(panelSubMenuFiltrarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 200, 30));

        lblEliminados.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lblEliminados.setForeground(new java.awt.Color(17, 153, 158));
        lblEliminados.setText("Dados de baja");
        background.add(lblEliminados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        lblTodos.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lblTodos.setForeground(new java.awt.Color(17, 153, 158));
        lblTodos.setText("Todos");
        background.add(lblTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

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
        jLabel2.setText("Tratamientos");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 300, -1));

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

    private void btnNewTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewTratamientoActionPerformed
        TratamientoInsertarView v = new TratamientoInsertarView();
        v.setSize(970, 620);
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

    private int nMenu = 1;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (nMenu == 1) {
            panelSubMenuFiltrarPor.setVisible(true);
            nMenu = 0;
        } else if (nMenu == 0) {
            panelSubMenuFiltrarPor.setVisible(false);
            nMenu = 1;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnTratamientosEliminadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTratamientosEliminadosMouseClicked
        listarEliminados(tablaTratamientos);
        btnTratamientosEliminados.setVisible(false);
        btnTodos.setVisible(true);

        lblTodos.setVisible(false);
        lblEliminados.setVisible(true);

        btnNewTratamiento.setVisible(false);
        btnEliminar.setVisible(false);
        btnActivarCliente.setVisible(true);

        botonFiltro = "eliminados";
    }//GEN-LAST:event_btnTratamientosEliminadosMouseClicked

    private void btnTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTodosMouseClicked
        listar(tablaTratamientos);
        btnTodos.setVisible(false);
        btnTratamientosEliminados.setVisible(true);

        lblEliminados.setVisible(false);
        lblTodos.setVisible(true);

        btnActivarCliente.setVisible(false);
        btnNewTratamiento.setVisible(true);
        btnEliminar.setVisible(true);

        botonFiltro = "todos";
    }//GEN-LAST:event_btnTodosMouseClicked

    private void btnActivarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarClienteActionPerformed
        int fila = tablaTratamientos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Tratamiento");
        } else {
            int id = Integer.parseInt(tablaTratamientos.getValueAt(fila, 0).toString());
            data.activarTratamiento(id);
            JOptionPane.showMessageDialog(this, "Tratamiento activado");
        }
        listarEliminados(tablaTratamientos);
    }//GEN-LAST:event_btnActivarClienteActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtrar();
    }//GEN-LAST:event_txtBuscarKeyReleased

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
            if (botonFiltro.contains("todos")) {
                listar(tablaTratamientos);
            }
            if (botonFiltro.contains("eliminados")) {
                listarEliminados(tablaTratamientos);
            }
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
    private javax.swing.JButton btnActivarCliente;
    private javax.swing.JButton btnEliminar;
    protected static javax.swing.JButton btnNewTratamiento;
    private javax.swing.JLabel btnTodos;
    private javax.swing.JLabel btnTratamientosEliminados;
    private javax.swing.JPanel contLupa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEliminados;
    private javax.swing.JLabel lblTodos;
    private javax.swing.JLabel lupa;
    private javax.swing.JPanel panelSubMenuFiltrarPor;
    protected static javax.swing.JTable tablaTratamientos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
