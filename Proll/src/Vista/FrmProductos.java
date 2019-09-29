package Vista;

import Controlador.ControllerProductos;
import Modelo.ModelProductos;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import proll.Formateador;

public class FrmProductos extends javax.swing.JFrame {
    
    ArrayList<ModelProductos> listaModelProductos = new ArrayList();
    ControllerProductos controllerProductos = new ControllerProductos();
    ModelProductos modelProductos = new ModelProductos();
    Formateador formateador = new Formateador();
    String guardarActualizar;
    
    public FrmProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
        QuitarBordeBoton();
        guardarProductos();
        habilitarDasabilitarCampos(false);
    }
    
    private void habilitarDasabilitarCampos(boolean condicion) {
        txtDescripcion.setEnabled(condicion);
        txtStck.setEnabled(condicion);
        txtPrecio.setEnabled(condicion);
    }
    
    private void limpiarCampos() {
        txtDescripcion.setText("");
        txtStck.setText("");
        txtPrecio.setText("");
        txtCodigo.setText("");
    }
    
    public void cerrar() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    confirmarSalida();
                }
            });
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void confirmarSalida() {
        int valor = JOptionPane.showConfirmDialog(this, "¿Estas Seguro de Salir?", "Mensaje del Sistema", JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Gracias por su Visita", "Mensaje del Sistema", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
            
        }
    }
    
    public void QuitarBordeBoton() {
        btnSalirPro.setOpaque(false);
        btnSalirPro.setContentAreaFilled(false);
        btnSalirPro.setBorderPainted(false);
        btnSalirPro.setOpaque(false);
        
        btnBuscar.setOpaque(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setOpaque(false);
        
        btnGuardar.setOpaque(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setOpaque(false);
        
        btnCancelar.setOpaque(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setOpaque(false);
        
        btnAgregar.setOpaque(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setOpaque(false);
        
        btnEliminar.setOpaque(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setOpaque(false);
        
    }
    
    private void guardarProducto() {
//        guardarActualizar = "guardar";
        modelProductos.setDescripcion(txtDescripcion.getText());
        modelProductos.setProStock(Integer.parseInt(txtStck.getText()));
        modelProductos.setProValor(formateador.convertDecimal(txtPrecio.getText()));
        if (controllerProductos.salvarProductoController(modelProductos) > 0) {
            JOptionPane.showMessageDialog(this, "¡ Producto Agregado Satisfactoriamente !", "Agregado de Productos", JOptionPane.INFORMATION_MESSAGE);
            guardarProductos();
            limpiarCampos();
            habilitarDasabilitarCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "¡ Error al Agregar Producto !", "Agregado de Productos", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
    public void actualizarProducto() {
//        guardarActualizar = "guardar";
        // falta la id para actulizar, seguia un video y asi lo haci el docente, si gustas puedes ver la bd
        modelProductos.setIdProductos(Integer.parseInt(txtCodigo.getText()));
        modelProductos.setDescripcion(txtDescripcion.getText());
        modelProductos.setProStock(Integer.parseInt(txtStck.getText()));
        modelProductos.setProValor(formateador.convertDecimal(txtPrecio.getText()));
        if (controllerProductos.alterarProductoController(modelProductos)) {
            JOptionPane.showMessageDialog(this, "¡ Producto Actualizado Satisfactoriamente !", "Actuilizado de Productos", JOptionPane.INFORMATION_MESSAGE);
            guardarProductos();
            // aqui aqui tiene que poner el listar tambie
            limpiarCampos();
            habilitarDasabilitarCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "¡ Error al Actualizar Producto !", "Agregado de Productos", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtBuscarProducto = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductosSS = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnSalirPro = new javax.swing.JButton();
        btnCancelar = new rojerusan.RSButtonIconI();
        btnEliminar = new rojerusan.RSButtonIconI();
        btnAgregar = new rojerusan.RSButtonIconI();
        btnGuardar = new rojerusan.RSButtonIconI();
        txtStck = new javax.swing.JFormattedTextField();
        txtPrecio = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(35, 162, 77));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel11.setText(" Código");

        txtCodigo.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel12.setText("Descripcion");

        jLabel13.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel13.setText("Stock");

        jLabel14.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel14.setText("Precio");

        jLabel15.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel15.setText("Buscar Producto");

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/search (1).png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jtProductosSS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                " Código", "Descripcion", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProductosSS.getTableHeader().setResizingAllowed(false);
        jtProductosSS.getTableHeader().setReorderingAllowed(false);
        jtProductosSS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProductosSSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProductosSS);
        if (jtProductosSS.getColumnModel().getColumnCount() > 0) {
            jtProductosSS.getColumnModel().getColumn(0).setResizable(false);
            jtProductosSS.getColumnModel().getColumn(0).setPreferredWidth(5);
            jtProductosSS.getColumnModel().getColumn(1).setResizable(false);
            jtProductosSS.getColumnModel().getColumn(1).setPreferredWidth(200);
            jtProductosSS.getColumnModel().getColumn(2).setResizable(false);
            jtProductosSS.getColumnModel().getColumn(2).setPreferredWidth(10);
            jtProductosSS.getColumnModel().getColumn(3).setResizable(false);
            jtProductosSS.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        jPanel3.setBackground(new java.awt.Color(35, 162, 77));

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Productos");

        btnSalirPro.setBackground(new java.awt.Color(35, 162, 77));
        btnSalirPro.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        btnSalirPro.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirPro.setText("x");
        btnSalirPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirProActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalirPro))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnSalirPro)))
        );

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/x-button.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setColorHover(new java.awt.Color(35, 162, 77));
        btnCancelar.setColorText(new java.awt.Color(0, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/close.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setColorHover(new java.awt.Color(35, 162, 77));
        btnEliminar.setColorText(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/add.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setColorHover(new java.awt.Color(35, 162, 77));
        btnAgregar.setColorText(new java.awt.Color(0, 0, 0));
        btnAgregar.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save (1).png"))); // NOI18N
        btnGuardar.setText("guardar");
        btnGuardar.setColorHover(new java.awt.Color(35, 162, 77));
        btnGuardar.setColorText(new java.awt.Color(0, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtStck.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txtPrecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(74, 74, 74)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(txtStck, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(jLabel14))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStck, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecio)))
                .addGap(19, 19, 19)
                .addComponent(jLabel15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirProActionPerformed
        System.exit(0);
        

    }//GEN-LAST:event_btnSalirProActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (btnGuardar.getText().equals("guardar")) {
            guardarProducto();
        } else if (btnGuardar.getText().equals("actualizar")) {
            actualizarProducto();
//            guardarProductos();
        }

//        }
//        guardarProducto();
//        actualizarProducto();

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int linea = this.jtProductosSS.getSelectedRow();
        int codigoProducto = (int) this.jtProductosSS.getValueAt(linea, 0);
        if (controllerProductos.excluirProductoController(codigoProducto)) {
            JOptionPane.showMessageDialog(this, "¡ Producto Eliminado Con Exito !", "Eliminacion de Productos", JOptionPane.WARNING_MESSAGE);
            guardarProductos();
            limpiarCampos();
            habilitarDasabilitarCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "¡ Error al Eliminar Producto !", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        habilitarDasabilitarCampos(true);
        limpiarCampos();
        guardarActualizar = "guardar";
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        habilitarDasabilitarCampos(false);
        limpiarCampos();
        btnGuardar.setText("guardar");
//        habilitarDasabilitarCampos(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jtProductosSSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosSSMouseClicked
        
        int filas = jtProductosSS.getRowCount();
        String codigo, descripcion, stock, precio;
        codigo = String.valueOf(jtProductosSS.getModel().getValueAt(jtProductosSS.getSelectedRow(), 0));
        descripcion = String.valueOf(jtProductosSS.getModel().getValueAt(jtProductosSS.getSelectedRow(), 1));
        stock = String.valueOf(jtProductosSS.getModel().getValueAt(jtProductosSS.getSelectedRow(), 2));
        precio = String.valueOf(jtProductosSS.getModel().getValueAt(jtProductosSS.getSelectedRow(), 3));
        
        txtCodigo.setText(codigo);
        txtDescripcion.setText(descripcion);
        txtStck.setText(stock);
        txtPrecio.setText(precio);
        btnGuardar.setText("actualizar");

    }//GEN-LAST:event_jtProductosSSMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.jtProductosSS.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtProductosSS.setRowSorter(classificador);
        String texto = txtBuscarProducto.getText();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
//        guardarProducto();

    }//GEN-LAST:event_btnBuscarActionPerformed
    
    private void guardarProductos() {
        listaModelProductos = controllerProductos.retornarListaProductoController();
        DefaultTableModel modelo = (DefaultTableModel) jtProductosSS.getModel();
        modelo.setNumRows(0);
        
        int cont = listaModelProductos.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelProductos.get(i).getIdProductos(),
                listaModelProductos.get(i).getDescripcion(),
                listaModelProductos.get(i).getProStock(),
                listaModelProductos.get(i).getProValor()
            });
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonIconI btnAgregar;
    private javax.swing.JButton btnBuscar;
    private rojerusan.RSButtonIconI btnCancelar;
    private rojerusan.RSButtonIconI btnEliminar;
    private rojerusan.RSButtonIconI btnGuardar;
    private javax.swing.JButton btnSalirPro;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtProductosSS;
    private javax.swing.JTextField txtBuscarProducto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JFormattedTextField txtPrecio;
    private javax.swing.JFormattedTextField txtStck;
    // End of variables declaration//GEN-END:variables
}
