package view;

import controller.ConsultaData;
import controller.MascotaData;
import controller.TratamientoData;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Conexion;
import model.Mascota;
import model.Tratamiento;
import model.Visita;

/**
 *
 * @author danib
 */
public class VisitaView extends javax.swing.JPanel {

    Conexion con = new Conexion();
    ConsultaData data = new ConsultaData(con);
    MascotaData dataMascota = new MascotaData(con);
    TratamientoData dataTratamiento = new TratamientoData(con);

    static DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Visita> lista = new ArrayList();
    ArrayList<Visita> listaFiltro = new ArrayList();

    //Filtros
    Mascota mascotaFiltro = new Mascota();
    Tratamiento tratamientoFiltro = new Tratamiento();

    public VisitaView() {
        initComponents();
        listar(tablaVisitas);
        panelSubMenuFiltrarPor.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        background = new javax.swing.JPanel();
        panelSubMenuFiltrarPor = new javax.swing.JPanel();
        panelElegirFiltroCombo = new javax.swing.JPanel();
        comboFiltroMascotas = new javax.swing.JComboBox<>();
        comboFiltroTratamientos = new javax.swing.JComboBox<>();
        comboFiltro = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVisitas = new javax.swing.JTable();
        btnEliminarVisita = new javax.swing.JButton();
        btnNewVisita = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        backgroundInsert = new javax.swing.JPanel();
        backgroundDetalles = new javax.swing.JPanel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(11, 95, 93));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSubMenuFiltrarPor.setBackground(new java.awt.Color(102, 0, 102));

        panelElegirFiltroCombo.setBackground(new java.awt.Color(102, 0, 102));
        panelElegirFiltroCombo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboFiltroMascotas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFiltroMascotasItemStateChanged(evt);
            }
        });
        panelElegirFiltroCombo.add(comboFiltroMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, -1));

        comboFiltroTratamientos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFiltroTratamientosItemStateChanged(evt);
            }
        });
        panelElegirFiltroCombo.add(comboFiltroTratamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, -1));

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Mascota", "Tratamiento" }));
        comboFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFiltroItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelSubMenuFiltrarPorLayout = new javax.swing.GroupLayout(panelSubMenuFiltrarPor);
        panelSubMenuFiltrarPor.setLayout(panelSubMenuFiltrarPorLayout);
        panelSubMenuFiltrarPorLayout.setHorizontalGroup(
            panelSubMenuFiltrarPorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelElegirFiltroCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelSubMenuFiltrarPorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelSubMenuFiltrarPorLayout.setVerticalGroup(
            panelSubMenuFiltrarPorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSubMenuFiltrarPorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelElegirFiltroCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(panelSubMenuFiltrarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 190, 110));

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

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 12, -1, -1));

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtBuscar.setBorder(null);
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        background.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 12, 130, 25));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Visitas");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 130, -1));

        tablaVisitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Mascota", "Tratamiento", "Fecha", "Detalle", "Peso Medido", "Importe", "Pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaVisitas);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 760, 320));

        btnEliminarVisita.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminarVisita.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminarVisita.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarVisita.setText("Eliminar");
        btnEliminarVisita.setBorder(null);
        btnEliminarVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVisitaActionPerformed(evt);
            }
        });
        background.add(btnEliminarVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 180, 40));

        btnNewVisita.setBackground(new java.awt.Color(0, 153, 51));
        btnNewVisita.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNewVisita.setForeground(new java.awt.Color(255, 255, 255));
        btnNewVisita.setText("Nueva");
        btnNewVisita.setBorder(null);
        btnNewVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewVisitaActionPerformed(evt);
            }
        });
        background.add(btnNewVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 180, 40));

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

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        backgroundInsert.setBackground(new java.awt.Color(255, 51, 0));

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

        javax.swing.GroupLayout backgroundDetallesLayout = new javax.swing.GroupLayout(backgroundDetalles);
        backgroundDetalles.setLayout(backgroundDetallesLayout);
        backgroundDetallesLayout.setHorizontalGroup(
            backgroundDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        backgroundDetallesLayout.setVerticalGroup(
            backgroundDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        add(backgroundDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtrar();
    }//GEN-LAST:event_txtBuscarKeyReleased

    public void filtrar() {
        String filtro = txtBuscar.getText();

        if (filtro.isEmpty()) {
            listar(tablaVisitas);
        } else {
            this.listaFiltro.clear();

            for (Visita vs : this.lista) {
                if (vs.getDetalle().toLowerCase().contains(filtro.toLowerCase())) {
                    this.listaFiltro.add(vs);
                }
            }

            listar(tablaVisitas, listaFiltro);
        }
    }

    private void btnEliminarVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVisitaActionPerformed
        int fila = tablaVisitas.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una visita");
        } else {
            //CUADRO DIALOGO SI QUIERE IMPRIMIR TICKET
            int seleccion = JOptionPane.showOptionDialog(null, "Estas seguro de eliminar este registro de visita?",
                    "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,// null para icono por defecto.
                    new Object[]{"Si", "No"}, "Si");

            if (seleccion == 0) {
                int id = Integer.parseInt(tablaVisitas.getValueAt(fila, 0).toString());
                data.eliminarVisita(id);
                JOptionPane.showMessageDialog(this, "Visita eliminada");
            }
        }
        listar(tablaVisitas);
    }//GEN-LAST:event_btnEliminarVisitaActionPerformed

    private void btnNewVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewVisitaActionPerformed
        VisitaInsertarView v = new VisitaInsertarView();
        v.setSize(800, 500);
        v.setLocation(0, 0);

        //this.background.removeAll();//limpia el contenedor
        this.background.setVisible(false);
        this.backgroundInsert.setVisible(true);

        this.backgroundInsert.add(v, BorderLayout.CENTER);
        this.background.revalidate();
        this.background.repaint();
    }//GEN-LAST:event_btnNewVisitaActionPerformed

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

    private void comboFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFiltroItemStateChanged
        if (comboFiltro.getSelectedItem().equals("Mascota")) {
            comboFiltroMascotas.setVisible(true);
            comboFiltroTratamientos.setVisible(false);
            llenarComboFiltroMascotas();

        } else if (comboFiltro.getSelectedItem().equals("Ninguno")) {
            listar(tablaVisitas);
            comboFiltroTratamientos.setVisible(false);
            comboFiltroMascotas.setVisible(false);

        } else if (comboFiltro.getSelectedItem().equals("Tratamiento")) {
            comboFiltroTratamientos.setVisible(true);
            comboFiltroMascotas.setVisible(false);
            llenarComboFiltroTratamientos();
        }
    }//GEN-LAST:event_comboFiltroItemStateChanged

    private void comboFiltroMascotasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFiltroMascotasItemStateChanged
        mascotaFiltro = (Mascota) comboFiltroMascotas.getSelectedItem();
        if (mascotaFiltro == null) {

        } else {
            listarPorMascota(tablaVisitas, mascotaFiltro);
        }
    }//GEN-LAST:event_comboFiltroMascotasItemStateChanged

    private void comboFiltroTratamientosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFiltroTratamientosItemStateChanged
        tratamientoFiltro = (Tratamiento) comboFiltroTratamientos.getSelectedItem();
        if (tratamientoFiltro == null) {

        } else {
            listarPorTratamiento(tablaVisitas, tratamientoFiltro);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_comboFiltroTratamientosItemStateChanged

    public void llenarComboFiltroMascotas() {
        comboFiltroMascotas.removeAllItems();
        Vector<Mascota> mascotas = new Vector<Mascota>(dataMascota.listar());
        for (Mascota mascota : mascotas) {
            comboFiltroMascotas.addItem(mascota);
        }
    }

    public void llenarComboFiltroTratamientos() {
        comboFiltroTratamientos.removeAllItems();
        Vector<Tratamiento> tratamientos = new Vector<Tratamiento>(dataTratamiento.listar());
        for (Tratamiento tr : tratamientos) {
            comboFiltroTratamientos.addItem(tr);
        }
    }

    public void listar(JTable tabla) {
        modelo.setRowCount(0);
        modelo = (DefaultTableModel) tabla.getModel();
        lista = (ArrayList<Visita>) data.listar();
        Object[] object = new Object[9];

        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getIdConsulta();
            object[1] = lista.get(i).getMascota().getCliente();
            object[2] = lista.get(i).getMascota();
            object[3] = lista.get(i).getTratamiento();
            object[4] = lista.get(i).getFecha();
            object[5] = lista.get(i).getDetalle();
            object[6] = lista.get(i).getPesoMedido();
            object[7] = lista.get(i).getTratamiento().getImporte();
            object[8] = lista.get(i).getFormaPago();
            modelo.addRow(object);
        }
        tablaVisitas.setModel(modelo);
    }

    public void listar(JTable tabla, ArrayList<Visita> l) {
        modelo.setRowCount(0);
        modelo = (DefaultTableModel) tabla.getModel();
        Object[] object = new Object[9];

        for (int i = 0; i < l.size(); i++) {
            object[0] = l.get(i).getIdConsulta();
            object[1] = l.get(i).getMascota().getCliente();
            object[2] = l.get(i).getMascota();
            object[3] = l.get(i).getTratamiento();
            object[4] = l.get(i).getFecha();
            object[5] = l.get(i).getDetalle();
            object[6] = l.get(i).getPesoMedido();
            object[7] = l.get(i).getTratamiento().getImporte();
            object[8] = l.get(i).getFormaPago();
            modelo.addRow(object);
        }
        tablaVisitas.setModel(modelo);
    }

    public void listarPorMascota(JTable tabla, Mascota masc) {
        modelo.setRowCount(0);
        modelo = (DefaultTableModel) tabla.getModel();
        lista = (ArrayList<Visita>) data.listarPorMascota(masc);
        Object[] object = new Object[9];

        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getIdConsulta();
            object[1] = lista.get(i).getMascota().getCliente();
            object[2] = lista.get(i).getMascota();
            object[3] = lista.get(i).getTratamiento();
            object[4] = lista.get(i).getFecha();
            object[5] = lista.get(i).getDetalle();
            object[6] = lista.get(i).getPesoMedido();
            object[7] = lista.get(i).getTratamiento().getImporte();
            object[8] = lista.get(i).getFormaPago();
            modelo.addRow(object);
        }
        tablaVisitas.setModel(modelo);
    }

    public void listarPorTratamiento(JTable tabla, Tratamiento trat) {
        modelo.setRowCount(0);
        modelo = (DefaultTableModel) tabla.getModel();
        lista = (ArrayList<Visita>) data.listarPorTratamiento(trat);
        Object[] object = new Object[9];

        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getIdConsulta();
            object[1] = lista.get(i).getMascota().getCliente();
            object[2] = lista.get(i).getMascota();
            object[3] = lista.get(i).getTratamiento();
            object[4] = lista.get(i).getFecha();
            object[5] = lista.get(i).getDetalle();
            object[6] = lista.get(i).getPesoMedido();
            object[7] = lista.get(i).getTratamiento().getImporte();
            object[8] = lista.get(i).getFormaPago();
            modelo.addRow(object);
        }
        tablaVisitas.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JPanel background;
    protected static javax.swing.JPanel backgroundDetalles;
    protected static javax.swing.JPanel backgroundInsert;
    protected static javax.swing.JButton btnEliminarVisita;
    protected static javax.swing.JButton btnNewVisita;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JComboBox<Mascota> comboFiltroMascotas;
    private javax.swing.JComboBox<Tratamiento> comboFiltroTratamientos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelElegirFiltroCombo;
    private javax.swing.JPanel panelSubMenuFiltrarPor;
    protected static javax.swing.JTable tablaVisitas;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
