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
        lblDoc11 = new javax.swing.JLabel();
        comboFormaPago = new javax.swing.JComboBox<>();
        btnVerDetalles = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        asterisco3 = new javax.swing.JLabel();
        asterisco4 = new javax.swing.JLabel();
        asterisco5 = new javax.swing.JLabel();
        backgroundDetalles = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(970, 620));
        setMinimumSize(new java.awt.Dimension(970, 620));
        setPreferredSize(new java.awt.Dimension(970, 620));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(228, 249, 245));
        background.setMaximumSize(new java.awt.Dimension(970, 620));
        background.setMinimumSize(new java.awt.Dimension(970, 620));
        background.setPreferredSize(new java.awt.Dimension(970, 620));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backDetalles.setMaximumSize(new java.awt.Dimension(500, 400));
        backDetalles.setMinimumSize(new java.awt.Dimension(500, 400));
        backDetalles.setPreferredSize(new java.awt.Dimension(500, 400));

        javax.swing.GroupLayout backDetallesLayout = new javax.swing.GroupLayout(backDetalles);
        backDetalles.setLayout(backDetallesLayout);
        backDetallesLayout.setHorizontalGroup(
            backDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        backDetallesLayout.setVerticalGroup(
            backDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        background.add(backDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, 400));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha-rellena.png"))); // NOI18N
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasMouseClicked(evt);
            }
        });
        background.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, 50, 30));

        comboTratamientos.setBackground(new java.awt.Color(255, 255, 255));
        comboTratamientos.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        comboTratamientos.setForeground(new java.awt.Color(64, 81, 78));
        comboTratamientos.setFocusable(false);
        comboTratamientos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTratamientosItemStateChanged(evt);
            }
        });
        background.add(comboTratamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 340, 40));

        comboClientes.setBackground(new java.awt.Color(255, 255, 255));
        comboClientes.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        comboClientes.setForeground(new java.awt.Color(64, 81, 78));
        comboClientes.setFocusable(false);
        comboClientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboClientesItemStateChanged(evt);
            }
        });
        background.add(comboClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 340, 40));

        calendarVisita.setBackground(new java.awt.Color(255, 255, 255));
        calendarVisita.setForeground(new java.awt.Color(64, 81, 78));
        calendarVisita.setFocusable(false);
        calendarVisita.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        calendarVisita.setMaxSelectableDate(new java.util.Date(2177467294000L));
        background.add(calendarVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 280, 40));
        //fecha actual
        Date date = new Date();
        calendarVisita.setMaxSelectableDate(date);

        txtAreaDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtAreaDescripcion.setColumns(20);
        txtAreaDescripcion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtAreaDescripcion.setForeground(new java.awt.Color(64, 81, 78));
        txtAreaDescripcion.setRows(5);
        txtAreaDescripcion.setBorder(null);
        jScrollPane1.setViewportView(txtAreaDescripcion);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 380, 190));

        lblDoc4.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc4.setForeground(new java.awt.Color(64, 81, 78));
        lblDoc4.setText("Forma de pago");
        background.add(lblDoc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, -1, -1));

        comboMascotas.setBackground(new java.awt.Color(255, 255, 255));
        comboMascotas.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        comboMascotas.setForeground(new java.awt.Color(64, 81, 78));
        comboMascotas.setFocusable(false);
        comboMascotas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboMascotasItemStateChanged(evt);
            }
        });
        background.add(comboMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 340, 40));

        lblDoc5.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc5.setForeground(new java.awt.Color(64, 81, 78));
        lblDoc5.setText("Fecha");
        background.add(lblDoc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        lblDoc6.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc6.setForeground(new java.awt.Color(64, 81, 78));
        lblDoc6.setText("Mascota");
        background.add(lblDoc6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        lblDoc7.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc7.setForeground(new java.awt.Color(64, 81, 78));
        lblDoc7.setText("Tratamiento");
        background.add(lblDoc7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        lblDoc8.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc8.setForeground(new java.awt.Color(64, 81, 78));
        lblDoc8.setText("Cliente");
        background.add(lblDoc8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        lblDoc9.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc9.setForeground(new java.awt.Color(64, 81, 78));
        lblDoc9.setText("Detalles");
        background.add(lblDoc9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(31, 171, 137));
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
        background.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 550, 180, 40));

        lblDoc10.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc10.setForeground(new java.awt.Color(64, 81, 78));
        lblDoc10.setText("Peso");
        background.add(lblDoc10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        txtImporte.setEditable(false);
        txtImporte.setBackground(new java.awt.Color(255, 255, 255));
        txtImporte.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        txtImporte.setForeground(new java.awt.Color(64, 81, 78));
        txtImporte.setBorder(null);
        background.add(txtImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 420, 130, 30));

        lblDoc11.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblDoc11.setForeground(new java.awt.Color(64, 81, 78));
        lblDoc11.setText("Importe");
        background.add(lblDoc11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, -1, -1));

        comboFormaPago.setBackground(new java.awt.Color(255, 255, 255));
        comboFormaPago.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        comboFormaPago.setForeground(new java.awt.Color(64, 81, 78));
        comboFormaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta Debito", "Tarjeta Credito" }));
        background.add(comboFormaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 210, 30));

        btnVerDetalles.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        btnVerDetalles.setForeground(new java.awt.Color(17, 153, 158));
        btnVerDetalles.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnVerDetalles.setText("Ver detalles");
        btnVerDetalles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerDetalles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerDetallesMouseClicked(evt);
            }
        });
        background.add(btnVerDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        txtPeso.setBackground(new java.awt.Color(255, 255, 255));
        txtPeso.setFont(new java.awt.Font("Roboto", 0, 28)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(0, 0, 0));
        txtPeso.setBorder(null);
        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKeyTyped(evt);
            }
        });
        background.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 100, 40));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 153, 158));
        jLabel1.setText("Campos obligatorios *");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, 30));

        asterisco3.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        asterisco3.setForeground(new java.awt.Color(64, 81, 78));
        asterisco3.setText("*");
        background.add(asterisco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 20, 20));

        asterisco4.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        asterisco4.setForeground(new java.awt.Color(64, 81, 78));
        asterisco4.setText("*");
        background.add(asterisco4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 30, 20));

        asterisco5.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        asterisco5.setForeground(new java.awt.Color(64, 81, 78));
        asterisco5.setText("*");
        background.add(asterisco5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 20, 20));

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 620));

        backgroundDetalles.setBackground(new java.awt.Color(228, 249, 245));
        backgroundDetalles.setMaximumSize(new java.awt.Dimension(970, 620));
        backgroundDetalles.setMinimumSize(new java.awt.Dimension(970, 620));

        javax.swing.GroupLayout backgroundDetallesLayout = new javax.swing.GroupLayout(backgroundDetalles);
        backgroundDetalles.setLayout(backgroundDetallesLayout);
        backgroundDetallesLayout.setHorizontalGroup(
            backgroundDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        backgroundDetallesLayout.setVerticalGroup(
            backgroundDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        add(backgroundDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 620));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseClicked
        this.setVisible(false);
        VisitaView.background.setVisible(true);
    }//GEN-LAST:event_btnAtrasMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
//validar que rellene campos obligatorios
        if (validacionesVacias() == 1) {
            JOptionPane.showMessageDialog(this, "Debe llenar los campos requeridos");
        } else {
            Cliente cliente = (Cliente) comboClientes.getSelectedItem();
            Mascota mascota = (Mascota) comboMascotas.getSelectedItem();
            Tratamiento tratamiento = (Tratamiento) comboTratamientos.getSelectedItem();
            int peso = Integer.parseInt(txtPeso.getText());
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
                    v.setLocation(270, 50);

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
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void limpiarCampos() {
        comboClientes.setSelectedIndex(0);
//        comboMascotas.setSelectedIndex(0);
        comboTratamientos.setSelectedIndex(0);
        txtPeso.setText("0");
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
            calendarVisita.setEnabled(false);
            //------------------------------------------------------------

            MascotaDetallesView detallesMascota = new MascotaDetallesView();
            detallesMascota.setSize(500, 400);
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

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped
        int key = evt.getKeyChar();//Devuelve el carácter asociado a la clave en este evento.
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        if (txtPeso.getText().trim().length() == 2) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPesoKeyTyped

    public int validacionesVacias() {
        Mascota a = (Mascota) comboMascotas.getSelectedItem();
        String b = txtPeso.getText(); 
        
        if (a == null || b.isEmpty() || calendarVisita.getDate() == null) {
            return 1;
        } else {
            return 0;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asterisco3;
    private javax.swing.JLabel asterisco4;
    private javax.swing.JLabel asterisco5;
    protected static javax.swing.JPanel backDetalles;
    protected static javax.swing.JPanel background;
    protected static javax.swing.JPanel backgroundDetalles;
    protected static javax.swing.JLabel btnAtras;
    protected static javax.swing.JButton btnGuardar;
    private javax.swing.JLabel btnVerDetalles;
    private javax.swing.ButtonGroup buttonGroup1;
    protected static com.toedter.calendar.JDateChooser calendarVisita;
    protected static javax.swing.JComboBox<Cliente> comboClientes;
    private javax.swing.JComboBox<String> comboFormaPago;
    protected static javax.swing.JComboBox<Mascota> comboMascotas;
    protected static javax.swing.JComboBox<Tratamiento> comboTratamientos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDoc10;
    private javax.swing.JLabel lblDoc11;
    private javax.swing.JLabel lblDoc4;
    private javax.swing.JLabel lblDoc5;
    private javax.swing.JLabel lblDoc6;
    private javax.swing.JLabel lblDoc7;
    private javax.swing.JLabel lblDoc8;
    private javax.swing.JLabel lblDoc9;
    protected static javax.swing.JTextArea txtAreaDescripcion;
    private javax.swing.JTextField txtImporte;
    protected static javax.swing.JTextField txtPeso;
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
