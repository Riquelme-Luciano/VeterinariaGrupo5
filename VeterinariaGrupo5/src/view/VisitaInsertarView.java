package view;

import controller.ClienteData;
import controller.ConsultaData;
import controller.MascotaData;
import controller.TratamientoData;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Conexion;
import model.Mascota;
import model.Tratamiento;
import model.Visita;
import static view.MascotasView.tablaMascotas;
import static view.VisitaView.modelo;
import static view.VisitaView.tablaVisitas;

/**
 *
 * @author danib
 */
public class VisitaInsertarView extends javax.swing.JPanel {

    Conexion con = new Conexion();
    ConsultaData data = new ConsultaData(con);
    ClienteData dataCliente = new ClienteData(con);
    MascotaData dataMascota = new MascotaData(con);
    TratamientoData dataTratamiento = new TratamientoData(con);

    Visita visita = new Visita();
    ArrayList<Visita> lista = new ArrayList();
    ArrayList<Visita> listaFiltro = new ArrayList();

    //para traer los detalles de la mascota
    Mascota mascotaDeVisita = new Mascota();

    public VisitaInsertarView() {
        initComponents();
        llenarComboDueños();
        llenarComboTratamientos();
        backDetalles.setVisible(false);
    }

    public void llenarComboDueños() {
        comboClientes.removeAllItems();
        Vector<Cliente> clientes = new Vector<Cliente>(dataCliente.listar());
        for (Cliente cliente : clientes) {
            comboClientes.addItem(cliente);
        }
    }

    public void llenarComboMascotas(Cliente cl) {
        comboMascotas.removeAllItems();
        Vector<Mascota> mascotas = new Vector<Mascota>(dataMascota.listarDepCliente(cl));
        for (Mascota mascota : mascotas) {
            comboMascotas.addItem(mascota);
        }
    }

    public void llenarComboTratamientos() {
        comboTratamientos.removeAllItems();
        Vector<Tratamiento> tratamientos = new Vector<Tratamiento>(dataTratamiento.listar());
        for (Tratamiento tr : tratamientos) {
            comboTratamientos.addItem(tr);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        background = new javax.swing.JPanel();
        backDetalles = new javax.swing.JPanel();
        btnAtras = new javax.swing.JLabel();
        comboTratamientos = new javax.swing.JComboBox<>();
        comboClientes = new javax.swing.JComboBox<>();
        calendarVisita = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescripcion = new javax.swing.JTextArea();
        spinnerPeso = new javax.swing.JSpinner();
        lblDoc4 = new javax.swing.JLabel();
        comboMascotas = new javax.swing.JComboBox<>();
        lblDoc5 = new javax.swing.JLabel();
        lblDoc6 = new javax.swing.JLabel();
        lblDoc7 = new javax.swing.JLabel();
        lblDoc8 = new javax.swing.JLabel();
        lblDoc9 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        lblDoc10 = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        btnVerDetalles = new javax.swing.JLabel();
        lblDoc11 = new javax.swing.JLabel();
        comboFormaPago = new javax.swing.JComboBox<>();
        backgroundDetalles = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(11, 95, 93));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backDetalles.setMaximumSize(new java.awt.Dimension(300, 200));
        backDetalles.setMinimumSize(new java.awt.Dimension(300, 200));
        backDetalles.setPreferredSize(new java.awt.Dimension(300, 200));

        javax.swing.GroupLayout backDetallesLayout = new javax.swing.GroupLayout(backDetalles);
        backDetalles.setLayout(backDetallesLayout);
        backDetallesLayout.setHorizontalGroup(
            backDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        backDetallesLayout.setVerticalGroup(
            backDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        background.add(backDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha-rellena.png"))); // NOI18N
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasMouseClicked(evt);
            }
        });
        background.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, 50, 30));

        comboTratamientos.setBackground(new java.awt.Color(255, 255, 255));
        comboTratamientos.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        comboTratamientos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTratamientosItemStateChanged(evt);
            }
        });
        background.add(comboTratamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 280, 40));

        comboClientes.setBackground(new java.awt.Color(255, 255, 255));
        comboClientes.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        comboClientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboClientesItemStateChanged(evt);
            }
        });
        background.add(comboClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 280, 40));

        calendarVisita.setBackground(new java.awt.Color(255, 255, 255));
        calendarVisita.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        background.add(calendarVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 280, 40));

        txtAreaDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtAreaDescripcion.setColumns(20);
        txtAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescripcion);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 280, 140));

        spinnerPeso.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        background.add(spinnerPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 120, 40));

        lblDoc4.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc4.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc4.setText("Forma de pago:");
        background.add(lblDoc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        comboMascotas.setBackground(new java.awt.Color(255, 255, 255));
        comboMascotas.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        comboMascotas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboMascotasItemStateChanged(evt);
            }
        });
        background.add(comboMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 280, 40));

        lblDoc5.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc5.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc5.setText("Fecha");
        background.add(lblDoc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        lblDoc6.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc6.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc6.setText("Mascota");
        background.add(lblDoc6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        lblDoc7.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc7.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc7.setText("Tratamiento");
        background.add(lblDoc7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        lblDoc8.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc8.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc8.setText("Cliente");
        background.add(lblDoc8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        lblDoc9.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc9.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc9.setText("Detalles");
        background.add(lblDoc9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 153, 51));
        btnGuardar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Registrar");
        btnGuardar.setBorder(null);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        background.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 180, 40));

        lblDoc10.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc10.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc10.setText("Peso");
        background.add(lblDoc10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        txtImporte.setEditable(false);
        txtImporte.setBackground(new java.awt.Color(255, 255, 255));
        txtImporte.setForeground(new java.awt.Color(0, 0, 0));
        background.add(txtImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 120, 30));

        btnVerDetalles.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        btnVerDetalles.setForeground(new java.awt.Color(204, 204, 255));
        btnVerDetalles.setText("Ver detalles");
        btnVerDetalles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerDetalles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerDetallesMouseClicked(evt);
            }
        });
        background.add(btnVerDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        lblDoc11.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc11.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc11.setText("Importe");
        background.add(lblDoc11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, -1));

        comboFormaPago.setBackground(new java.awt.Color(255, 255, 255));
        comboFormaPago.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        comboFormaPago.setForeground(new java.awt.Color(0, 0, 0));
        comboFormaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta Debito", "Tarjeta Credito" }));
        background.add(comboFormaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 393, 170, 30));

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        backgroundDetalles.setBackground(new java.awt.Color(11, 95, 93));

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

    private void btnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseClicked
        this.setVisible(false);
        VisitaView.background.setVisible(true);
    }//GEN-LAST:event_btnAtrasMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Cliente cliente = (Cliente) comboClientes.getSelectedItem();
        Mascota mascota = (Mascota) comboMascotas.getSelectedItem();
        Tratamiento tratamiento = (Tratamiento) comboTratamientos.getSelectedItem();
        int peso = (int) spinnerPeso.getValue();
        Date fecha = calendarVisita.getDate();
        String detalles = txtAreaDescripcion.getText();
        double importe = Double.parseDouble(txtImporte.getText());
        String formaPago = (String) comboFormaPago.getSelectedItem();
        
        visita.setMascota(mascota);
        visita.setTratamiento(tratamiento);
        visita.setPesoMedido(peso);
        visita.setFecha(fecha);
        visita.setDetalle(detalles);
        visita.setCobro(importe);
        visita.setFormaPago(formaPago);
        
        int r = data.insertarVisita(visita);

        if (r == 1) {
            JOptionPane.showMessageDialog(this, "Visita cargada con exito");
            listar(VisitaView.tablaVisitas);

//CUADRO DIALOGO SI QUIERE IMPRIMIR TICKET
            int seleccion = JOptionPane.showOptionDialog(null, "Desea entregar comprobante?",
                    "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,// null para icono por defecto.
                    new Object[]{"Si", "No"}, "Si");

            if (seleccion == 0) {
                System.out.println("seleccionada opcion 1");

                VisitaDetallesView v = new VisitaDetallesView();
                v.setSize(390, 500);
                v.setLocation(200, 0);

                //this.background.removeAll();//limpia el contenedor
                this.background.setVisible(false);
                this.backgroundDetalles.setVisible(true);

                this.backgroundDetalles.add(v, BorderLayout.CENTER);
                this.background.revalidate();
                this.background.repaint();

                //cargar datos a la hoja para imprimir
                VisitaDetallesView.lblCodigo.setText("" + data.ultimaVisitaId()); //TRAER ID DE LA VISITA QUE CARGO
                //fecha
                int year = calendarVisita.getCalendar().get(Calendar.YEAR);
                int month = calendarVisita.getCalendar().get(Calendar.MARCH);
                int day = calendarVisita.getCalendar().get(Calendar.DAY_OF_MONTH);
                VisitaDetallesView.lblFecha.setText(day + "/" + month + "/" + year);
                //----------------
                VisitaDetallesView.lblTratamiento.setText(tratamiento.toString());
                VisitaDetallesView.txtAreaDetalles.setText(detalles);
                VisitaDetallesView.lblDni.setText("" + cliente.getDni());
                VisitaDetallesView.lblNombre.setText(cliente.getNombre() + " " + cliente.getApellido());
                VisitaDetallesView.lblMascCodigo.setText("" + mascota.getCodigo());
                VisitaDetallesView.lblEspecie.setText(mascota.getEspecie().toString());
                VisitaDetallesView.lblMascRaza.setText(mascota.getRaza());
                VisitaDetallesView.lblMascAlias.setText(mascota.getAlias());
                VisitaDetallesView.lblImporte.setText("" + importe);
                VisitaDetallesView.lblFormaPago.setText(formaPago);

                limpiarCampos();
            } else if (seleccion == 1) {
                this.setVisible(false);
                VisitaView.background.setVisible(true);
            }

//-------------------------------------
        } else {
            JOptionPane.showMessageDialog(this, "Error al insertar visita");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void limpiarCampos() {
        comboClientes.setSelectedIndex(0);
//        comboMascotas.setSelectedIndex(0);
        comboTratamientos.setSelectedIndex(0);
        spinnerPeso.setValue(0);
        calendarVisita.setDate(null);
        txtAreaDescripcion.setText("");
        txtImporte.setText("");
    }


    private void comboClientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboClientesItemStateChanged
        llenarComboMascotas((Cliente) comboClientes.getSelectedItem());
    }//GEN-LAST:event_comboClientesItemStateChanged

    private void comboTratamientosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTratamientosItemStateChanged
        Tratamiento tr = new Tratamiento();
        tr = (Tratamiento) comboTratamientos.getSelectedItem();
        txtImporte.setText(tr.getImporte() + "");
    }//GEN-LAST:event_comboTratamientosItemStateChanged

    private void comboMascotasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboMascotasItemStateChanged


    }//GEN-LAST:event_comboMascotasItemStateChanged

    private void btnVerDetallesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerDetallesMouseClicked
        if (comboMascotas.getSelectedItem() != null) {
            mascotaDeVisita = (Mascota) comboMascotas.getSelectedItem();

            backDetalles.setVisible(true);

            //Pasaba que cuando quedaba seleccionado combo, se superponia en el panel, por eso se le saca el foco
            comboMascotas.setFocusable(false);
            comboTratamientos.setFocusable(false);
            comboClientes.setFocusable(false);
            
            //desabilito para que al cargar el jpanel de detalles de mascota no haya errores, ni se superpongan los elementos de atras
            comboClientes.setEnabled(false);
            comboMascotas.setEnabled(false);
            comboTratamientos.setEnabled(false);
            txtAreaDescripcion.setEnabled(false);
            btnGuardar.setEnabled(false);
            //------------------------------------------------------------

            MascotaDetallesView detallesMascota = new MascotaDetallesView();
            detallesMascota.setSize(300, 200);
            detallesMascota.setLocation(0, 0);

            this.backDetalles.removeAll();
            this.backDetalles.add(detallesMascota, BorderLayout.CENTER);

            MascotaDetallesView.lblAlias.setText(mascotaDeVisita.getAlias());
            MascotaDetallesView.lblEspecie.setText(mascotaDeVisita.getEspecie().toString());
            MascotaDetallesView.lblSexo.setText(String.valueOf(mascotaDeVisita.getSexo()));
            MascotaDetallesView.lblRaza.setText(mascotaDeVisita.getRaza());
            MascotaDetallesView.lblColor.setText(mascotaDeVisita.getColorPelaje());

            //fecha
            SimpleDateFormat getYearFormat = new SimpleDateFormat("dd/MM/yyyy");
            String currentYear = getYearFormat.format(mascotaDeVisita.getNacimiento());
            MascotaDetallesView.lblNacimiento.setText(currentYear);
            MascotaDetallesView.lblPeso.setText(dataMascota.ultimoPesoMedido(mascotaDeVisita) + "kg");
            MascotaDetallesView.lblPesoPromedio.setText(dataMascota.pesoPromedio(mascotaDeVisita) + "kg");
        }
    }//GEN-LAST:event_btnVerDetallesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JPanel backDetalles;
    protected static javax.swing.JPanel background;
    protected static javax.swing.JPanel backgroundDetalles;
    protected static javax.swing.JLabel btnAtras;
    protected static javax.swing.JButton btnGuardar;
    private javax.swing.JLabel btnVerDetalles;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser calendarVisita;
    protected static javax.swing.JComboBox<Cliente> comboClientes;
    private javax.swing.JComboBox<String> comboFormaPago;
    protected static javax.swing.JComboBox<Mascota> comboMascotas;
    protected static javax.swing.JComboBox<Tratamiento> comboTratamientos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDoc10;
    private javax.swing.JLabel lblDoc11;
    private javax.swing.JLabel lblDoc4;
    private javax.swing.JLabel lblDoc5;
    private javax.swing.JLabel lblDoc6;
    private javax.swing.JLabel lblDoc7;
    private javax.swing.JLabel lblDoc8;
    private javax.swing.JLabel lblDoc9;
    private javax.swing.JSpinner spinnerPeso;
    protected static javax.swing.JTextArea txtAreaDescripcion;
    private javax.swing.JTextField txtImporte;
    // End of variables declaration//GEN-END:variables

    public void listar(JTable tabla) {
        VisitaView.modelo.setRowCount(0);
        VisitaView.modelo = (DefaultTableModel) tabla.getModel();
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
            VisitaView.modelo.addRow(object);
        }
        VisitaView.tablaVisitas.setModel(modelo);
    }
}
