package Vista;

import Controlador.ControllerCliente;
import Modelo.ModelClientes;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmClientes extends javax.swing.JFrame {

    ControllerCliente controllerCliente = new ControllerCliente();
    ModelClientes modelCliente = new ModelClientes();
    ArrayList<ModelClientes> listaModelClientes = new ArrayList<>();

    public FrmClientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        QuitarBordeBoton();
        guardarCliente();
    }

    public void QuitarBordeBoton() {
        btnSalir.setOpaque(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setBorderPainted(false);
        btnSalir.setOpaque(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtCodigoCliente = new rojeru_san.RSMTextFull();
        jLabel12 = new javax.swing.JLabel();
        txtNombreCliente = new rojeru_san.RSMTextFull();
        jLabel14 = new javax.swing.JLabel();
        txtDireccionCliente = new rojeru_san.RSMTextFull();
        jLabel15 = new javax.swing.JLabel();
        txtBariioCliente = new rojeru_san.RSMTextFull();
        txtCiudadCliente = new rojeru_san.RSMTextFull();
        jLabel16 = new javax.swing.JLabel();
        cboUFCliente = new javax.swing.JComboBox<>();
        txtCepCliente = new rojeru_san.RSMTextFull();
        jLabel17 = new javax.swing.JLabel();
        txtTelefonoCliente = new rojeru_san.RSMTextFull();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        rSButtonIconI5 = new rojerusan.RSButtonIconI();
        rSButtonIconI6 = new rojerusan.RSButtonIconI();
        btnGuardar = new rojerusan.RSButtonIconI();
        rSButtonIconI8 = new rojerusan.RSButtonIconI();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel11.setText(" Código");

        txtCodigoCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigoCliente.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtCodigoCliente.setPlaceholder("");

        jLabel12.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel12.setText("Nombre");

        txtNombreCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreCliente.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtNombreCliente.setPlaceholder("Nombre CLIENTE");

        jLabel14.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel14.setText("Direccion");

        txtDireccionCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccionCliente.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtDireccionCliente.setPlaceholder("Direccion CLIENTE");

        jLabel15.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel15.setText("Municipio");

        txtBariioCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtBariioCliente.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtBariioCliente.setPlaceholder("Municipio CLIENTE");

        txtCiudadCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtCiudadCliente.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtCiudadCliente.setPlaceholder("Ciudad CLIENTE");

        jLabel16.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel16.setText("Ciudad");

        cboUFCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtCepCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtCepCliente.setBordeColorFocus(new java.awt.Color(0, 0, 0));

        jLabel17.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel17.setText("Cep");

        txtTelefonoCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefonoCliente.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtTelefonoCliente.setPlaceholder("Telefono CLIENTE");

        jLabel18.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel18.setText("Telefono");

        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                " Código", "Nombre Cliente", "Ciudad", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtClientes);
        if (jtClientes.getColumnModel().getColumnCount() > 0) {
            jtClientes.getColumnModel().getColumn(0).setResizable(false);
            jtClientes.getColumnModel().getColumn(1).setResizable(false);
            jtClientes.getColumnModel().getColumn(2).setResizable(false);
            jtClientes.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.setBackground(new java.awt.Color(44, 189, 165));

        jLabel13.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Clientes");

        btnSalir.setBackground(new java.awt.Color(104, 33, 122));
        btnSalir.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("x");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        rSButtonIconI5.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonIconI5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edit.png"))); // NOI18N
        rSButtonIconI5.setText("Actualizar");
        rSButtonIconI5.setColorHover(new java.awt.Color(44, 189, 165));
        rSButtonIconI5.setColorText(new java.awt.Color(0, 0, 0));
        rSButtonIconI5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N

        rSButtonIconI6.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonIconI6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/close.png"))); // NOI18N
        rSButtonIconI6.setText("Cancelar");
        rSButtonIconI6.setColorHover(new java.awt.Color(44, 189, 165));
        rSButtonIconI6.setColorText(new java.awt.Color(0, 0, 0));
        rSButtonIconI6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save (1).png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setColorHover(new java.awt.Color(44, 189, 165));
        btnGuardar.setColorText(new java.awt.Color(0, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        rSButtonIconI8.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonIconI8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/add.png"))); // NOI18N
        rSButtonIconI8.setText("Nuevo");
        rSButtonIconI8.setColorHover(new java.awt.Color(44, 189, 165));
        rSButtonIconI8.setColorText(new java.awt.Color(0, 0, 0));
        rSButtonIconI8.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(44, 189, 165));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jLabel19.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel19.setText("UF:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCiudadCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDireccionCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(cboUFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(txtBariioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(86, 86, 86))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(218, 218, 218)))
                        .addGap(83, 83, 83))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(rSButtonIconI6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rSButtonIconI8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(rSButtonIconI5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNombreCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(575, 575, 575))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(463, 463, 463))))
                        .addContainerGap(21, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBariioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCiudadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboUFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonIconI6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonIconI8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonIconI5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        modelCliente.setCliNomnbre(txtNombreCliente.getText());
        modelCliente.setCliNomnbre(txtDireccionCliente.getText());
        modelCliente.setCliNomnbre(txtBariioCliente.getText());
        modelCliente.setCliNomnbre(txtCiudadCliente.getText());
        modelCliente.setCliNomnbre(cboUFCliente.getSelectedItem().toString());
        modelCliente.setCliNomnbre(txtCepCliente.getText());
        modelCliente.setCliNomnbre(txtTelefonoCliente.getText());
        if (controllerCliente.guardarClienteController(modelCliente) > 0) {
            JOptionPane.showMessageDialog(this, "¡ Cliente Registrado Con Exito !", "CLIENTE GUARDADO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "¡Error al Guardar Cliente !", "ERROR AL GUARDAR", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    public void guardarCliente() {
        listaModelClientes = controllerCliente.getListaClienteController();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setNumRows(0);
        int cont = listaModelClientes.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelClientes.get(i).getIdCliente(),
                listaModelClientes.get(i).getCliNomnbre(),
                listaModelClientes.get(i).getCliCiudad(),
                listaModelClientes.get(i).getCliTelefono()
            });
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonIconI btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboUFCliente;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtClientes;
    private rojerusan.RSButtonIconI rSButtonIconI5;
    private rojerusan.RSButtonIconI rSButtonIconI6;
    private rojerusan.RSButtonIconI rSButtonIconI8;
    private rojeru_san.RSMTextFull txtBariioCliente;
    private rojeru_san.RSMTextFull txtCepCliente;
    private rojeru_san.RSMTextFull txtCiudadCliente;
    private rojeru_san.RSMTextFull txtCodigoCliente;
    private rojeru_san.RSMTextFull txtDireccionCliente;
    private rojeru_san.RSMTextFull txtNombreCliente;
    private rojeru_san.RSMTextFull txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
