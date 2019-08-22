package Formulario;

import Conexion.Conexion;
import Modelo.Clientes;
import Modelo.FormatoDecimal;
import ModeloClases.Cliente;
import ModeloClases.Eventos;
import java.awt.Color;
import java.awt.Image;
import java.awt.TextField;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {

    Eventos evento = new Eventos();
    Cliente cliente = new Cliente();
    FormatoDecimal formato = new FormatoDecimal();
    List<Clientes> NumeroClientes;
    DefaultTableModel TablaModeloCliente, TablaReporteDeClientes;
    private String accion = "Insert", Dia, Fecha, Mes, Año, FuncionCadaDepartamento, IDCategoria, Departamento, pago, DeudaActual;
    private int PaginaSize = 10, Tab, MaxReg, PaginaCount, CurrentPage, NumeroPag;
    private int StarRec, EndRec, NumRegistro = 0, NumPagi = 0, IDCliente, idRegistro;
    Pattern pattern;
    Matcher matcher;

    public Menu() {
        Calendar calendario = new GregorianCalendar();
        Dia = Integer.toString(calendario.get(Calendar.DAY_OF_MONTH));
        Mes = Integer.toString(calendario.get(Calendar.MONTH));
        Año = Integer.toString(calendario.get(Calendar.YEAR));
        Fecha = Dia + "/" + Mes + "/" + Año;
        initComponents();
        OcultarMensajesValidaciones();
        new Conexion();
        ImageIcon imagen = new ImageIcon("C:\\Users\\J Cardoza\\Documents\\NetBeansProjects\\POS\\src\\Iconos\\WhatsApp Image 2019-07-29 at 9.37.26 PM.jpeg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_DEFAULT));
        lblLogo.setIcon(icono);
        this.repaint();

        RadioAgreagarCliente.setSelected(true);
        RadioAgreagarCliente.setForeground(new Color(51, 103, 214));
        txtPagosClientes.setEnabled(false);
        cliente.reportesCliente(TablaReporteClientes, IDCliente);

    }

    private void CargarDatos() {
        switch (Tab) {
            case 1:
                NumeroClientes = cliente.getClientes();
                cliente.BuscarCliente(TablaClientes, "", NumRegistro, PaginaSize);
                MaxReg = NumeroClientes.size();
                break;
        }
        PaginaCount = (MaxReg / PaginaSize);
        if ((MaxReg % PaginaSize) > 0) {
            PaginaCount += 1;
        }
        lblPaginaClientes.setText("Paginas " + "1" + "/ " + String.valueOf(PaginaCount));
    }

    public void OcultarMensajesValidaciones() {
        lblImagenID.setVisible(false);
        lblImagenNombres.setVisible(false);
        lblImagenApellidos.setVisible(false);
        lblImagenDireccion.setVisible(false);
        lblImagenTelefono.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Table_Clientes1 =   TablaClientes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        Button_PrimeroCLT2 = new javax.swing.JButton();
        btnPrimeroVentas = new rojeru_san.RSButtonRiple();
        btnSiguienteVentas = new rojeru_san.RSButtonRiple();
        btnUltimoVentas = new rojeru_san.RSButtonRiple();
        btnAnteriorVentas = new rojeru_san.RSButtonRiple();
        jPanel25 = new javax.swing.JPanel();
        Label_NombreCliente1 = new javax.swing.JLabel();
        Label_ApellidoCliente1 = new javax.swing.JLabel();
        Label_DireccionCliente1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        Label_ApellidoCliente2 = new javax.swing.JLabel();
        Label_DireccionCliente2 = new javax.swing.JLabel();
        Label_ApellidoCliente3 = new javax.swing.JLabel();
        Label_DireccionCliente3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        rSMTextFull6 = new rojeru_san.RSMTextFull();
        rSButtonRiple10 = new rojeru_san.RSButtonRiple();
        rSButtonRiple11 = new rojeru_san.RSButtonRiple();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        Table_ReportesCLT1 = TablaReporteClientes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        rSMTextFull8 = new rojeru_san.RSMTextFull();
        jPanel27 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        rSMTextFull7 = new rojeru_san.RSMTextFull();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lblPagoClientes = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        RadioButton_IngresarCliente = new javax.swing.JRadioButton();
        RadioButton_PagosCliente = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblNombreClientes = new javax.swing.JLabel();
        lblApellidosClientes = new javax.swing.JLabel();
        lblDireccionClientes = new javax.swing.JLabel();
        lblTelefonoClientes = new javax.swing.JLabel();
        txtNombre = new rojeru_san.RSMTextFull();
        txtApellidos = new rojeru_san.RSMTextFull();
        txtDireccion = new rojeru_san.RSMTextFull();
        txtPagosClientes = new rojeru_san.RSMTextFull();
        btnCancelarClientes = new rojeru_san.RSButtonRiple();
        btnGuardarClientes = new rojeru_san.RSButtonRiple();
        btnEliminarClientes = new rojeru_san.RSButtonRiple();
        RadioPagosCliente = new javax.swing.JRadioButton();
        RadioAgreagarCliente = new javax.swing.JRadioButton();
        lblIDCliente = new javax.swing.JLabel();
        txtID = new rojeru_san.RSMTextFull();
        jLabel52 = new javax.swing.JLabel();
        txtTelefono = new rojeru_san.RSMTextFull();
        lblImagenTelefono = new javax.swing.JLabel();
        lblImagenID = new javax.swing.JLabel();
        lblImagenNombres = new javax.swing.JLabel();
        lblImagenApellidos = new javax.swing.JLabel();
        lblImagenDireccion = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaClientes =   TablaClientes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        btnFacturaClientes = new javax.swing.JButton();
        btnPrimeroClientes = new rojeru_san.RSButtonRiple();
        btnAneriorClientes = new rojeru_san.RSButtonRiple();
        btnSiguienteClientes = new rojeru_san.RSButtonRiple();
        btnUltimoClientes = new rojeru_san.RSButtonRiple();
        lblPaginaClientes = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaReporteClientes = TablaReporteClientes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        txtBuscarClientes = new rojeru_san.RSMTextFull();
        jLabel46 = new javax.swing.JLabel();
        Panel_ReciboCliente = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        Label_SaldoActualCLT = new javax.swing.JLabel();
        Label_NombreCLT = new javax.swing.JLabel();
        Label_ApellidoCLT = new javax.swing.JLabel();
        Label_UltimoPagoCLT = new javax.swing.JLabel();
        Label_FechaPagoCLT = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        rSButtonRiple33 = new rojeru_san.RSButtonRiple();
        rSButtonRiple34 = new rojeru_san.RSButtonRiple();
        rSButtonRiple35 = new rojeru_san.RSButtonRiple();
        jPanel39 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        RadioButton_IngresarCliente2 = new javax.swing.JRadioButton();
        RadioButton_PagosCliente2 = new javax.swing.JRadioButton();
        rSMTextFull2 = new rojeru_san.RSMTextFull();
        RadioAgreagarCliente1 = new javax.swing.JRadioButton();
        RadioAgreagarCliente2 = new javax.swing.JRadioButton();
        lblIDCliente1 = new javax.swing.JLabel();
        rSMTextFull3 = new rojeru_san.RSMTextFull();
        lblIDCliente2 = new javax.swing.JLabel();
        rSMTextFull4 = new rojeru_san.RSMTextFull();
        lblIDCliente3 = new javax.swing.JLabel();
        rSMTextFull5 = new rojeru_san.RSMTextFull();
        lblIDCliente4 = new javax.swing.JLabel();
        rSMTextFull9 = new rojeru_san.RSMTextFull();
        lblIDCliente5 = new javax.swing.JLabel();
        rSMTextFull11 = new rojeru_san.RSMTextFull();
        lblIDCliente6 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tablaProveedores =   Table_ComprasPDT = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        btnPrimeroProveedores = new rojeru_san.RSButtonRiple();
        btnSegundoProveedores = new rojeru_san.RSButtonRiple();
        btnSiguienteProveedores = new rojeru_san.RSButtonRiple();
        btnUltimoProveedores = new rojeru_san.RSButtonRiple();
        lblPaginaProveedores = new javax.swing.JLabel();
        btnFacturaClientes1 = new javax.swing.JButton();
        jPanel41 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        Table_BodegaPDT1 = Table_BodegaPDT = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        jPanel42 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        txtBuscarProveedores = new rojeru_san.RSMTextFull();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        Label_CodigoPDT = new javax.swing.JLabel();
        TextField_CodigoPDT = new javax.swing.JTextField();
        Label_DescripcionPDT = new javax.swing.JLabel();
        TextField_DescripcionPDT = new javax.swing.JTextField();
        TextField_PrecioUnidadPDT = new javax.swing.JTextField();
        TextField_PrecioMayoreoPDT = new javax.swing.JTextField();
        ComboBox_Departamento = new javax.swing.JComboBox();
        ComboBox_Categoria = new javax.swing.JComboBox();
        jPanel14 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Label_DescripcionPDT1 = new javax.swing.JLabel();
        Label_DescripcionPDT2 = new javax.swing.JLabel();
        Label_DescripcionPDT3 = new javax.swing.JLabel();
        Label_DescripcionPDT4 = new javax.swing.JLabel();
        rSButtonRiple27 = new rojeru_san.RSButtonRiple();
        rSButtonRiple28 = new rojeru_san.RSButtonRiple();
        rSButtonRiple29 = new rojeru_san.RSButtonRiple();
        jPanel34 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        RadioButton_IngresarCliente1 = new javax.swing.JRadioButton();
        RadioButton_PagosCliente1 = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Table_ComprasPDT =   Table_ComprasPDT = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        jLabel49 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Table_BodegaPDT = Table_BodegaPDT = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        Label = new javax.swing.JLabel();
        rSMTextFull10 = new rojeru_san.RSMTextFull();
        jLabel50 = new javax.swing.JLabel();
        rSButtonRiple20 = new rojeru_san.RSButtonRiple();
        rSButtonRiple21 = new rojeru_san.RSButtonRiple();
        rSButtonRiple22 = new rojeru_san.RSButtonRiple();
        rSButtonRiple23 = new rojeru_san.RSButtonRiple();
        jPanel33 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        RadioButton_Dpt = new javax.swing.JRadioButton();
        jPanel22 = new javax.swing.JPanel();
        TextField_Categoria = new javax.swing.JTextField();
        Label_Dpt1 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        Label_Dpt = new javax.swing.JLabel();
        TextField_Departamento = new javax.swing.JTextField();
        RadioButton_Dpt1 = new javax.swing.JRadioButton();
        rSButtonRiple30 = new rojeru_san.RSButtonRiple();
        rSButtonRiple31 = new rojeru_san.RSButtonRiple();
        rSButtonRiple32 = new rojeru_san.RSButtonRiple();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Table_Dpt =   Table_Dpt = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        jPanel24 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        Table_Cat =   Table_Cat = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        jPanel35 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        RadioButton_Unidad = new javax.swing.JRadioButton();
        RadioButton_Mayoreo = new javax.swing.JRadioButton();
        Label_DescripcionCP = new javax.swing.JLabel();
        TextField_DescripcionCP = new javax.swing.JTextField();
        rSButtonRiple24 = new rojeru_san.RSButtonRiple();
        rSButtonRiple25 = new rojeru_san.RSButtonRiple();
        rSButtonRiple26 = new rojeru_san.RSButtonRiple();
        jPanel20 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Label_DescripcionCP1 = new javax.swing.JLabel();
        Label_DescripcionCP2 = new javax.swing.JLabel();
        TextField_DescripcionCP1 = new javax.swing.JTextField();
        Label_DescripcionCP3 = new javax.swing.JLabel();
        TextField_DescripcionCP2 = new javax.swing.JTextField();
        Label_DescripcionCP4 = new javax.swing.JLabel();
        TextField_DescripcionCP3 = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        Table_Compras =   Table_Compras = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        rSButtonRiple37 = new rojeru_san.RSButtonRiple();
        rSButtonRiple38 = new rojeru_san.RSButtonRiple();
        rSButtonRiple39 = new rojeru_san.RSButtonRiple();
        rSButtonRiple40 = new rojeru_san.RSButtonRiple();
        jPanel19 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TextField_BuscarCompras = new javax.swing.JTextField();
        jPanel28 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnClientes = new rojeru_san.RSButtonRiple();
        btnVentas = new rojeru_san.RSButtonRiple();
        btnProductos = new rojeru_san.RSButtonRiple();
        btnConfiguracion = new rojeru_san.RSButtonRiple();
        btnCategorias = new rojeru_san.RSButtonRiple();
        btnProveedores = new rojeru_san.RSButtonRiple();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCompras = new rojeru_san.RSButtonRiple();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Table_Clientes1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Table_Clientes1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Table_Clientes1.setRowHeight(20);
        Table_Clientes1.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane7.setViewportView(Table_Clientes1);

        Button_PrimeroCLT2.setBackground(new java.awt.Color(204, 204, 204));
        Button_PrimeroCLT2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        Button_PrimeroCLT2.setForeground(new java.awt.Color(255, 255, 255));
        Button_PrimeroCLT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/iconfinder_BT_printer_905556.png"))); // NOI18N
        Button_PrimeroCLT2.setText("Factura");

        btnPrimeroVentas.setText("Primero");
        btnPrimeroVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroVentasActionPerformed(evt);
            }
        });

        btnSiguienteVentas.setText("Siguiente");
        btnSiguienteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteVentasActionPerformed(evt);
            }
        });

        btnUltimoVentas.setText("Ultimo");
        btnUltimoVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoVentasActionPerformed(evt);
            }
        });

        btnAnteriorVentas.setText("Anterior");
        btnAnteriorVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane7)
                .addGap(10, 10, 10))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(btnPrimeroVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnteriorVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSiguienteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUltimoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button_PrimeroCLT2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_PrimeroCLT2)
                    .addComponent(btnPrimeroVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiguienteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUltimoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnteriorVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_NombreCliente1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        Label_NombreCliente1.setForeground(new java.awt.Color(236, 82, 82));
        Label_NombreCliente1.setText("Pagó con");
        Label_NombreCliente1.setToolTipText("");
        jPanel25.add(Label_NombreCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        Label_ApellidoCliente1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        Label_ApellidoCliente1.setForeground(new java.awt.Color(236, 82, 82));
        Label_ApellidoCliente1.setText("Total a Pagar");
        jPanel25.add(Label_ApellidoCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        Label_DireccionCliente1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 48)); // NOI18N
        Label_DireccionCliente1.setText("0.00");
        Label_DireccionCliente1.setToolTipText("");
        jPanel25.add(Label_DireccionCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 110, -1));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 204, 0));
        jCheckBox1.setText("Credito");
        jPanel25.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        Label_ApellidoCliente2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        Label_ApellidoCliente2.setForeground(new java.awt.Color(236, 82, 82));
        Label_ApellidoCliente2.setText(" Total");
        jPanel25.add(Label_ApellidoCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        Label_DireccionCliente2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 48)); // NOI18N
        Label_DireccionCliente2.setText("0.00");
        Label_DireccionCliente2.setToolTipText("");
        jPanel25.add(Label_DireccionCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 120, -1));

        Label_ApellidoCliente3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        Label_ApellidoCliente3.setForeground(new java.awt.Color(236, 82, 82));
        Label_ApellidoCliente3.setText("Vuelto");
        jPanel25.add(Label_ApellidoCliente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        Label_DireccionCliente3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 48)); // NOI18N
        Label_DireccionCliente3.setText("0.00");
        Label_DireccionCliente3.setToolTipText("");
        jPanel25.add(Label_DireccionCliente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 110, -1));

        jLabel24.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 48)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 204, 0));
        jLabel24.setText("$");
        jPanel25.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 30, -1));

        jLabel38.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 48)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 204, 0));
        jLabel38.setText("$");
        jPanel25.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 30, -1));

        jLabel39.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 48)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 204, 0));
        jLabel39.setText("$");
        jPanel25.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 30, -1));

        jPanel17.setBackground(new java.awt.Color(44, 189, 165));

        jLabel16.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Detalles de Venta");
        jLabel16.setToolTipText("");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel16)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        jPanel25.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 50));

        jLabel44.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 48)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 204, 0));
        jLabel44.setText("$");
        jPanel25.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 30, -1));

        rSMTextFull6.setForeground(new java.awt.Color(204, 51, 0));
        rSMTextFull6.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        rSMTextFull6.setBotonColor(new java.awt.Color(255, 0, 102));
        rSMTextFull6.setPlaceholder("");
        jPanel25.add(rSMTextFull6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 140, -1));

        rSButtonRiple10.setBackground(new java.awt.Color(236, 82, 82));
        rSButtonRiple10.setText("Cancelar (Ctrl + X)");
        rSButtonRiple10.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jPanel25.add(rSButtonRiple10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 290, 70));

        rSButtonRiple11.setBackground(new java.awt.Color(0, 204, 0));
        rSButtonRiple11.setText("Cobrar (Ctrl + Space)");
        rSButtonRiple11.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jPanel25.add(rSButtonRiple11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 290, 70));

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table_ReportesCLT1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Table_ReportesCLT1.setRowHeight(20);
        Table_ReportesCLT1.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane10.setViewportView(Table_ReportesCLT1);

        jPanel26.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 57, 1318, 70));
        jPanel26.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 15, -1, 35));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/iconfinder_search_326690 (1).png"))); // NOI18N
        jPanel26.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(976, 15, 44, 35));

        rSMTextFull8.setForeground(new java.awt.Color(0, 0, 0));
        rSMTextFull8.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        rSMTextFull8.setBordeColorNoFocus(new java.awt.Color(0, 0, 0));
        rSMTextFull8.setBotonColor(new java.awt.Color(255, 51, 0));
        rSMTextFull8.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        rSMTextFull8.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        rSMTextFull8.setPlaceholder("Busqueda de CLIENTE");
        jPanel26.add(rSMTextFull8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 530, -1));

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel17.setText("Detalles de Venta");

        jLabel26.setText("Nombre:");

        jLabel27.setText("Deuda:");

        jLabel28.setText("Deuda anterior:");

        jLabel29.setText("Deuda actual:");

        jLabel30.setText("Ultimo pago:");

        jLabel31.setText("Fecha:");

        jLabel32.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel32.setText("0.00");

        jLabel33.setText("Nombre");

        jLabel34.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel34.setText("0.00");

        jLabel35.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel35.setText("0.00");

        jLabel36.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel36.setText("0.00");

        jLabel37.setText("Fecha");

        jLabel40.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 204, 0));
        jLabel40.setText("$");

        jLabel41.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 204, 0));
        jLabel41.setText("$");

        jLabel42.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 204, 0));
        jLabel42.setText("$");

        jLabel43.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 204, 0));
        jLabel43.setText("$");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel17))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel26)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addGap(1, 9, Short.MAX_VALUE)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel27Layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(jLabel42))
                                        .addGroup(jPanel27Layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(jLabel43))
                                        .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel37)))
                            .addComponent(jLabel33))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel34)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel32)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel35)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel36)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel37)))
        );

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/iconfinder_search_326690 (1).png"))); // NOI18N

        jPanel29.setBackground(new java.awt.Color(44, 189, 165));

        jLabel15.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Ventas");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(870, 870, 870))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        rSMTextFull7.setForeground(new java.awt.Color(0, 0, 0));
        rSMTextFull7.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        rSMTextFull7.setBordeColorNoFocus(new java.awt.Color(0, 0, 0));
        rSMTextFull7.setBotonColor(new java.awt.Color(255, 51, 0));
        rSMTextFull7.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        rSMTextFull7.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        rSMTextFull7.setPlaceholder("Busqueda por TECLADO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(125, 125, 125))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(735, 735, 735)
                .addComponent(rSMTextFull7, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSMTextFull7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
        jPanel7.setLayout(null);

        lblPagoClientes.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblPagoClientes.setText("Pagos de Deudas");
        lblPagoClientes.setToolTipText("");
        jPanel7.add(lblPagoClientes);
        lblPagoClientes.setBounds(20, 490, 158, 21);

        jPanel30.setBackground(new java.awt.Color(44, 189, 165));

        jLabel25.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Datos Clientes");
        jLabel25.setToolTipText("");

        RadioButton_IngresarCliente.setBackground(new java.awt.Color(44, 189, 165));
        RadioButton_IngresarCliente.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        RadioButton_IngresarCliente.setForeground(new java.awt.Color(255, 255, 255));
        RadioButton_IngresarCliente.setText("Ingresar cliente");

        RadioButton_PagosCliente.setBackground(new java.awt.Color(44, 189, 165));
        RadioButton_PagosCliente.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        RadioButton_PagosCliente.setForeground(new java.awt.Color(255, 255, 255));
        RadioButton_PagosCliente.setText("Pagos de cliente");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RadioButton_IngresarCliente)
                .addGap(18, 18, 18)
                .addComponent(RadioButton_PagosCliente)
                .addContainerGap())
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButton_IngresarCliente)
                    .addComponent(RadioButton_PagosCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel30);
        jPanel30.setBounds(2, 2, 406, 50);

        jPanel6.setBackground(new java.awt.Color(236, 82, 82));

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingresa la Informacion del Cliente*");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(37, 37, 37))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel7.add(jPanel6);
        jPanel6.setBounds(2, 52, 406, 40);

        lblNombreClientes.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblNombreClientes.setText("Nombres");
        lblNombreClientes.setToolTipText("");
        jPanel7.add(lblNombreClientes);
        lblNombreClientes.setBounds(20, 210, 100, 21);

        lblApellidosClientes.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblApellidosClientes.setText("Apellidos");
        lblApellidosClientes.setToolTipText("");
        jPanel7.add(lblApellidosClientes);
        lblApellidosClientes.setBounds(20, 260, 110, 21);

        lblDireccionClientes.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblDireccionClientes.setText("Direccion");
        lblDireccionClientes.setToolTipText("");
        jPanel7.add(lblDireccionClientes);
        lblDireccionClientes.setBounds(20, 330, 110, 21);

        lblTelefonoClientes.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblTelefonoClientes.setText("Teléfono");
        lblTelefonoClientes.setToolTipText("");
        jPanel7.add(lblTelefonoClientes);
        lblTelefonoClientes.setBounds(20, 400, 100, 21);

        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBordeColorFocus(new java.awt.Color(51, 51, 51));
        txtNombre.setBotonColor(new java.awt.Color(255, 51, 0));
        txtNombre.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        txtNombre.setPlaceholder("Escribe Nombre de Cliente");
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel7.add(txtNombre);
        txtNombre.setBounds(20, 220, 330, 40);

        txtApellidos.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidos.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtApellidos.setBordeColorNoFocus(new java.awt.Color(204, 204, 204));
        txtApellidos.setBotonColor(new java.awt.Color(255, 51, 0));
        txtApellidos.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtApellidos.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        txtApellidos.setPlaceholder("Escribe Apellidos de Cliente");
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        jPanel7.add(txtApellidos);
        txtApellidos.setBounds(20, 280, 330, 40);

        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccion.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtDireccion.setBotonColor(new java.awt.Color(255, 51, 0));
        txtDireccion.setPlaceholder("Escribe Direccion de Cliente");
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        jPanel7.add(txtDireccion);
        txtDireccion.setBounds(20, 350, 330, 40);

        txtPagosClientes.setForeground(new java.awt.Color(0, 0, 0));
        txtPagosClientes.setBordeColorFocus(new java.awt.Color(236, 82, 82));
        txtPagosClientes.setBotonColor(new java.awt.Color(255, 0, 0));
        txtPagosClientes.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        txtPagosClientes.setPlaceholder("");
        txtPagosClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPagosClientesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagosClientesKeyTyped(evt);
            }
        });
        jPanel7.add(txtPagosClientes);
        txtPagosClientes.setBounds(210, 480, 160, 40);

        btnCancelarClientes.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelarClientes.setText("Cancelar");
        btnCancelarClientes.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        btnCancelarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClientesActionPerformed(evt);
            }
        });
        jPanel7.add(btnCancelarClientes);
        btnCancelarClientes.setBounds(120, 670, 170, 40);

        btnGuardarClientes.setBackground(new java.awt.Color(0, 119, 145));
        btnGuardarClientes.setText("Guardar (Enter)");
        btnGuardarClientes.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        btnGuardarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClientesActionPerformed(evt);
            }
        });
        jPanel7.add(btnGuardarClientes);
        btnGuardarClientes.setBounds(40, 540, 320, 60);

        btnEliminarClientes.setBackground(new java.awt.Color(236, 82, 82));
        btnEliminarClientes.setText("Eliminar");
        btnEliminarClientes.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        btnEliminarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClientesActionPerformed(evt);
            }
        });
        jPanel7.add(btnEliminarClientes);
        btnEliminarClientes.setBounds(70, 610, 260, 50);

        RadioPagosCliente.setBackground(new java.awt.Color(255, 255, 255));
        RadioPagosCliente.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        RadioPagosCliente.setText("Pagos de Cliente");
        RadioPagosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioPagosClienteActionPerformed(evt);
            }
        });
        jPanel7.add(RadioPagosCliente);
        RadioPagosCliente.setBounds(202, 102, 181, 29);

        RadioAgreagarCliente.setBackground(new java.awt.Color(255, 255, 255));
        RadioAgreagarCliente.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        RadioAgreagarCliente.setText("Agregar Cliente");
        RadioAgreagarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioAgreagarClienteActionPerformed(evt);
            }
        });
        jPanel7.add(RadioAgreagarCliente);
        RadioAgreagarCliente.setBounds(22, 102, 169, 29);

        lblIDCliente.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblIDCliente.setText("ID");
        lblIDCliente.setToolTipText("");
        lblIDCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblIDClienteKeyReleased(evt);
            }
        });
        jPanel7.add(lblIDCliente);
        lblIDCliente.setBounds(20, 150, 180, 21);

        txtID.setForeground(new java.awt.Color(0, 0, 0));
        txtID.setBordeColorFocus(new java.awt.Color(51, 51, 51));
        txtID.setBotonColor(new java.awt.Color(255, 51, 0));
        txtID.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        txtID.setPlaceholder("");
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });
        jPanel7.add(txtID);
        txtID.setBounds(20, 170, 120, 40);

        jLabel52.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 48)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(236, 82, 82));
        jLabel52.setText("$");
        jPanel7.add(jLabel52);
        jLabel52.setBounds(180, 470, 30, 56);

        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtTelefono.setBotonColor(new java.awt.Color(255, 0, 0));
        txtTelefono.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        txtTelefono.setPlaceholder("Escribe Numero Tel/Cel");
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel7.add(txtTelefono);
        txtTelefono.setBounds(20, 420, 330, 40);

        lblImagenTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/exclamation-mark.png"))); // NOI18N
        jPanel7.add(lblImagenTelefono);
        lblImagenTelefono.setBounds(360, 430, 24, 30);

        lblImagenID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/exclamation-mark.png"))); // NOI18N
        jPanel7.add(lblImagenID);
        lblImagenID.setBounds(150, 180, 24, 30);

        lblImagenNombres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/exclamation-mark.png"))); // NOI18N
        jPanel7.add(lblImagenNombres);
        lblImagenNombres.setBounds(360, 230, 24, 30);

        lblImagenApellidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/exclamation-mark.png"))); // NOI18N
        jPanel7.add(lblImagenApellidos);
        lblImagenApellidos.setBounds(360, 290, 24, 30);

        lblImagenDireccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/exclamation-mark.png"))); // NOI18N
        jPanel7.add(lblImagenDireccion);
        lblImagenDireccion.setBounds(360, 360, 24, 30);

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 98, 410, 720));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        TablaClientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaClientes.setRowHeight(20);
        TablaClientes.setSelectionBackground(new java.awt.Color(102, 204, 255));
        TablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaClientesMouseClicked(evt);
            }
        });
        TablaClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TablaClientesKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(TablaClientes);

        btnFacturaClientes.setText("Factura");
        btnFacturaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaClientesActionPerformed(evt);
            }
        });

        btnPrimeroClientes.setText("Primero");
        btnPrimeroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroClientesActionPerformed(evt);
            }
        });

        btnAneriorClientes.setText("Anterior");
        btnAneriorClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAneriorClientesActionPerformed(evt);
            }
        });

        btnSiguienteClientes.setText("Siguiente");
        btnSiguienteClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteClientesActionPerformed(evt);
            }
        });

        btnUltimoClientes.setText("Ultimo");
        btnUltimoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoClientesActionPerformed(evt);
            }
        });

        lblPaginaClientes.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblPaginaClientes.setText("Registro");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(lblPaginaClientes)
                .addGap(125, 125, 125)
                .addComponent(btnPrimeroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAneriorClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSiguienteClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUltimoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(btnFacturaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrimeroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSiguienteClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUltimoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAneriorClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblPaginaClientes))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnFacturaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 1480, 500));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        TablaReporteClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaReporteClientes.setRowHeight(20);
        TablaReporteClientes.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane3.setViewportView(TablaReporteClientes);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Reportes");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addContainerGap(860, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 607, 1220, 150));

        jPanel32.setBackground(new java.awt.Color(44, 189, 165));

        jLabel45.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Clientes");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(964, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addGap(870, 870, 870))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 1930, -1));

        txtBuscarClientes.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscarClientes.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtBuscarClientes.setBordeColorNoFocus(new java.awt.Color(0, 0, 0));
        txtBuscarClientes.setBotonColor(new java.awt.Color(255, 51, 0));
        txtBuscarClientes.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtBuscarClientes.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        txtBuscarClientes.setPlaceholder("Busqueda CLIENTES");
        txtBuscarClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarClientesKeyReleased(evt);
            }
        });
        jPanel2.add(txtBuscarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 500, 40));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/iconfinder_search_326690 (1).png"))); // NOI18N
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 50, -1, -1));

        Panel_ReciboCliente.setBackground(new java.awt.Color(255, 255, 255));
        Panel_ReciboCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel77.setText("Recibo");

        jLabel78.setText("Nombre:");

        jLabel79.setText("Apellido:");

        jLabel80.setText("Deuda actual:");

        jLabel81.setText("Ultimo pago:");

        jLabel83.setText("Fecha:");

        Label_SaldoActualCLT.setText("$0.00");

        Label_NombreCLT.setText("Nombre");

        Label_ApellidoCLT.setText("Apellido");

        Label_UltimoPagoCLT.setText("$0.00");

        Label_FechaPagoCLT.setText("Fecha");

        javax.swing.GroupLayout Panel_ReciboClienteLayout = new javax.swing.GroupLayout(Panel_ReciboCliente);
        Panel_ReciboCliente.setLayout(Panel_ReciboClienteLayout);
        Panel_ReciboClienteLayout.setHorizontalGroup(
            Panel_ReciboClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ReciboClienteLayout.createSequentialGroup()
                .addGroup(Panel_ReciboClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_ReciboClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel_ReciboClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel78)
                            .addComponent(jLabel79)
                            .addComponent(jLabel80)
                            .addComponent(jLabel81)
                            .addComponent(jLabel83))
                        .addGap(15, 15, 15)
                        .addGroup(Panel_ReciboClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_NombreCLT)
                            .addComponent(Label_ApellidoCLT, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_SaldoActualCLT)
                            .addComponent(Label_UltimoPagoCLT)
                            .addComponent(Label_FechaPagoCLT)))
                    .addGroup(Panel_ReciboClienteLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel77)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        Panel_ReciboClienteLayout.setVerticalGroup(
            Panel_ReciboClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ReciboClienteLayout.createSequentialGroup()
                .addComponent(jLabel77)
                .addGap(18, 18, 18)
                .addGroup(Panel_ReciboClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(Label_NombreCLT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_ReciboClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(Label_ApellidoCLT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel_ReciboClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(Label_SaldoActualCLT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_ReciboClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(Label_UltimoPagoCLT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_ReciboClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(Label_FechaPagoCLT)))
        );

        jPanel2.add(Panel_ReciboCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 620, 250, -1));

        jTabbedPane1.addTab("tab2", jPanel2);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel36.setBackground(new java.awt.Color(44, 189, 165));

        jLabel53.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Proveedores");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53)
                .addContainerGap(1768, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel31.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 1930, -1));

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
        jPanel37.setPreferredSize(new java.awt.Dimension(310, 352));
        jPanel37.setLayout(null);

        jPanel38.setBackground(new java.awt.Color(236, 82, 82));

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingresa la Informacion del Proveedor*");
        jLabel6.setToolTipText("");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jPanel37.add(jPanel38);
        jPanel38.setBounds(0, 50, 410, 40);

        rSButtonRiple33.setBackground(new java.awt.Color(0, 119, 145));
        rSButtonRiple33.setText("Guardar (Enter)");
        rSButtonRiple33.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        rSButtonRiple33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple33ActionPerformed(evt);
            }
        });
        jPanel37.add(rSButtonRiple33);
        rSButtonRiple33.setBounds(50, 580, 290, 50);

        rSButtonRiple34.setBackground(new java.awt.Color(236, 82, 82));
        rSButtonRiple34.setText("Eliminar");
        rSButtonRiple34.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jPanel37.add(rSButtonRiple34);
        rSButtonRiple34.setBounds(70, 640, 250, 50);

        rSButtonRiple35.setBackground(new java.awt.Color(204, 204, 204));
        rSButtonRiple35.setText("Cancelar");
        rSButtonRiple35.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jPanel37.add(rSButtonRiple35);
        rSButtonRiple35.setBounds(100, 700, 200, 40);

        jPanel39.setBackground(new java.awt.Color(44, 189, 165));

        jLabel54.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Informacion Proveedores");
        jLabel54.setToolTipText("");

        RadioButton_IngresarCliente2.setBackground(new java.awt.Color(44, 189, 165));
        RadioButton_IngresarCliente2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        RadioButton_IngresarCliente2.setForeground(new java.awt.Color(255, 255, 255));
        RadioButton_IngresarCliente2.setText("Ingresar cliente");

        RadioButton_PagosCliente2.setBackground(new java.awt.Color(44, 189, 165));
        RadioButton_PagosCliente2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        RadioButton_PagosCliente2.setForeground(new java.awt.Color(255, 255, 255));
        RadioButton_PagosCliente2.setText("Pagos de cliente");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RadioButton_IngresarCliente2)
                .addGap(18, 18, 18)
                .addComponent(RadioButton_PagosCliente2)
                .addContainerGap())
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButton_IngresarCliente2)
                    .addComponent(RadioButton_PagosCliente2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel37.add(jPanel39);
        jPanel39.setBounds(0, 0, 410, 50);

        rSMTextFull2.setForeground(new java.awt.Color(0, 0, 0));
        rSMTextFull2.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        rSMTextFull2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        rSMTextFull2.setPlaceholder("");
        jPanel37.add(rSMTextFull2);
        rSMTextFull2.setBounds(30, 160, 100, 30);

        RadioAgreagarCliente1.setBackground(new java.awt.Color(255, 255, 255));
        RadioAgreagarCliente1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        RadioAgreagarCliente1.setText("Pagos Cliente");
        RadioAgreagarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioAgreagarCliente1ActionPerformed(evt);
            }
        });
        jPanel37.add(RadioAgreagarCliente1);
        RadioAgreagarCliente1.setBounds(200, 100, 169, 29);

        RadioAgreagarCliente2.setBackground(new java.awt.Color(255, 255, 255));
        RadioAgreagarCliente2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        RadioAgreagarCliente2.setText("Agregar Cliente");
        RadioAgreagarCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioAgreagarCliente2ActionPerformed(evt);
            }
        });
        jPanel37.add(RadioAgreagarCliente2);
        RadioAgreagarCliente2.setBounds(20, 100, 169, 29);

        lblIDCliente1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblIDCliente1.setText("ID");
        lblIDCliente1.setToolTipText("");
        lblIDCliente1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblIDCliente1KeyReleased(evt);
            }
        });
        jPanel37.add(lblIDCliente1);
        lblIDCliente1.setBounds(40, 130, 19, 21);

        rSMTextFull3.setForeground(new java.awt.Color(0, 0, 0));
        rSMTextFull3.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        rSMTextFull3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        rSMTextFull3.setPlaceholder("");
        jPanel37.add(rSMTextFull3);
        rSMTextFull3.setBounds(30, 230, 260, 30);

        lblIDCliente2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblIDCliente2.setText("Nombres");
        lblIDCliente2.setToolTipText("");
        lblIDCliente2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblIDCliente2KeyReleased(evt);
            }
        });
        jPanel37.add(lblIDCliente2);
        lblIDCliente2.setBounds(30, 200, 79, 21);

        rSMTextFull4.setForeground(new java.awt.Color(0, 0, 0));
        rSMTextFull4.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        rSMTextFull4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        rSMTextFull4.setPlaceholder("");
        jPanel37.add(rSMTextFull4);
        rSMTextFull4.setBounds(30, 300, 260, 30);

        lblIDCliente3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblIDCliente3.setText("Apellidos");
        lblIDCliente3.setToolTipText("");
        lblIDCliente3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblIDCliente3KeyReleased(evt);
            }
        });
        jPanel37.add(lblIDCliente3);
        lblIDCliente3.setBounds(30, 270, 100, 21);

        rSMTextFull5.setForeground(new java.awt.Color(0, 0, 0));
        rSMTextFull5.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        rSMTextFull5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        rSMTextFull5.setPlaceholder("");
        jPanel37.add(rSMTextFull5);
        rSMTextFull5.setBounds(30, 370, 260, 30);

        lblIDCliente4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblIDCliente4.setText("Direccion");
        lblIDCliente4.setToolTipText("");
        lblIDCliente4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblIDCliente4KeyReleased(evt);
            }
        });
        jPanel37.add(lblIDCliente4);
        lblIDCliente4.setBounds(30, 340, 110, 21);

        rSMTextFull9.setForeground(new java.awt.Color(0, 0, 0));
        rSMTextFull9.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        rSMTextFull9.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        rSMTextFull9.setPlaceholder("");
        jPanel37.add(rSMTextFull9);
        rSMTextFull9.setBounds(30, 440, 260, 30);

        lblIDCliente5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblIDCliente5.setText("Telefono");
        lblIDCliente5.setToolTipText("");
        lblIDCliente5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblIDCliente5KeyReleased(evt);
            }
        });
        jPanel37.add(lblIDCliente5);
        lblIDCliente5.setBounds(30, 410, 79, 21);

        rSMTextFull11.setForeground(new java.awt.Color(0, 0, 0));
        rSMTextFull11.setBordeColorFocus(new java.awt.Color(236, 82, 82));
        rSMTextFull11.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        rSMTextFull11.setPlaceholder("");
        jPanel37.add(rSMTextFull11);
        rSMTextFull11.setBounds(160, 520, 130, 30);

        lblIDCliente6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblIDCliente6.setText("Pagos Deudas");
        lblIDCliente6.setToolTipText("");
        lblIDCliente6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblIDCliente6KeyReleased(evt);
            }
        });
        jPanel37.add(lblIDCliente6);
        lblIDCliente6.setBounds(30, 480, 150, 21);

        jLabel71.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 48)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(236, 82, 82));
        jLabel71.setText("$");
        jPanel37.add(jLabel71);
        jLabel71.setBounds(130, 500, 30, 56);

        jPanel31.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 73, 410, 750));

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));
        jPanel40.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel40.setLayout(null);

        tablaProveedores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaProveedores.setRowHeight(20);
        tablaProveedores.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane11.setViewportView(tablaProveedores);

        jPanel40.add(jScrollPane11);
        jScrollPane11.setBounds(20, 20, 1408, 314);

        btnPrimeroProveedores.setText("Primero");
        jPanel40.add(btnPrimeroProveedores);
        btnPrimeroProveedores.setBounds(280, 350, 200, 40);

        btnSegundoProveedores.setText("Anterior");
        jPanel40.add(btnSegundoProveedores);
        btnSegundoProveedores.setBounds(490, 350, 200, 40);

        btnSiguienteProveedores.setText("Siguiente");
        jPanel40.add(btnSiguienteProveedores);
        btnSiguienteProveedores.setBounds(700, 350, 200, 40);

        btnUltimoProveedores.setText("Ultimo");
        jPanel40.add(btnUltimoProveedores);
        btnUltimoProveedores.setBounds(910, 350, 200, 40);

        lblPaginaProveedores.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblPaginaProveedores.setText("Registro");
        jPanel40.add(lblPaginaProveedores);
        lblPaginaProveedores.setBounds(60, 360, 75, 21);

        btnFacturaClientes1.setText("Factura");
        btnFacturaClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaClientes1ActionPerformed(evt);
            }
        });
        jPanel40.add(btnFacturaClientes1);
        btnFacturaClientes1.setBounds(1205, 350, 200, 40);

        jPanel31.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 123, 1440, 410));

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Table_BodegaPDT1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Table_BodegaPDT1.setRowHeight(20);
        Table_BodegaPDT1.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane12.setViewportView(Table_BodegaPDT1);

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 1187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel31.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 552, 1220, 200));

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));
        jPanel42.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel22.setText("Detalles de Venta");

        jLabel55.setText("Nombre:");

        jLabel56.setText("Deuda:");

        jLabel57.setText("Deuda anterior:");

        jLabel58.setText("Deuda actual:");

        jLabel59.setText("Ultimo pago:");

        jLabel60.setText("Fecha:");

        jLabel61.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel61.setText("0.00");

        jLabel62.setText("Nombre");

        jLabel63.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel63.setText("0.00");

        jLabel64.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel64.setText("0.00");

        jLabel65.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel65.setText("0.00");

        jLabel66.setText("Fecha");

        jLabel67.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 204, 0));
        jLabel67.setText("$");

        jLabel68.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 204, 0));
        jLabel68.setText("$");

        jLabel69.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 204, 0));
        jLabel69.setText("$");

        jLabel70.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 204, 0));
        jLabel70.setText("$");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel22))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(jLabel57)
                            .addComponent(jLabel55)
                            .addComponent(jLabel58)
                            .addComponent(jLabel59)
                            .addComponent(jLabel60))
                        .addGap(1, 9, Short.MAX_VALUE)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel42Layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(jLabel69))
                                        .addGroup(jPanel42Layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(jLabel70))
                                        .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel65)
                                    .addComponent(jLabel64)
                                    .addComponent(jLabel61)
                                    .addComponent(jLabel63)
                                    .addComponent(jLabel66)))
                            .addComponent(jLabel62))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jLabel62))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jLabel63)
                    .addComponent(jLabel67))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jLabel61)
                    .addComponent(jLabel69))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jLabel64)
                    .addComponent(jLabel70))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jLabel65)
                    .addComponent(jLabel68))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jLabel66)))
        );

        jPanel31.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 570, -1, -1));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/iconfinder_search_326690 (1).png"))); // NOI18N
        jPanel31.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 70, -1, -1));

        txtBuscarProveedores.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscarProveedores.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtBuscarProveedores.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        txtBuscarProveedores.setPlaceholder("Busqueda de PROVEEDORES");
        txtBuscarProveedores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarProveedoresKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarProveedoresKeyReleased(evt);
            }
        });
        jPanel31.add(txtBuscarProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 60, 430, -1));

        jTabbedPane1.addTab("tab3", jPanel31);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
        jPanel11.setPreferredSize(new java.awt.Dimension(310, 352));
        jPanel11.setLayout(null);

        Label_CodigoPDT.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        Label_CodigoPDT.setText("Código de barra");
        Label_CodigoPDT.setToolTipText("");
        jPanel11.add(Label_CodigoPDT);
        Label_CodigoPDT.setBounds(10, 120, 121, 16);
        Label_CodigoPDT.getAccessibleContext().setAccessibleName("Código de barraS");

        jPanel11.add(TextField_CodigoPDT);
        TextField_CodigoPDT.setBounds(140, 114, 251, 30);

        Label_DescripcionPDT.setBackground(new java.awt.Color(44, 189, 165));
        Label_DescripcionPDT.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        Label_DescripcionPDT.setForeground(new java.awt.Color(44, 189, 165));
        Label_DescripcionPDT.setText("Categoria");
        jPanel11.add(Label_DescripcionPDT);
        Label_DescripcionPDT.setBounds(150, 350, 170, 28);
        jPanel11.add(TextField_DescripcionPDT);
        TextField_DescripcionPDT.setBounds(140, 150, 250, 30);
        jPanel11.add(TextField_PrecioUnidadPDT);
        TextField_PrecioUnidadPDT.setBounds(140, 190, 250, 30);
        jPanel11.add(TextField_PrecioMayoreoPDT);
        TextField_PrecioMayoreoPDT.setBounds(140, 230, 250, 30);

        jPanel11.add(ComboBox_Departamento);
        ComboBox_Departamento.setBounds(10, 310, 380, 30);
        jPanel11.add(ComboBox_Categoria);
        ComboBox_Categoria.setBounds(4, 389, 390, 30);

        jPanel14.setBackground(new java.awt.Color(236, 82, 82));

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingresa la Informacion del Producto *");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel11.add(jPanel14);
        jPanel14.setBounds(0, 50, 410, 40);

        Label_DescripcionPDT1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        Label_DescripcionPDT1.setText("Descripción");
        jPanel11.add(Label_DescripcionPDT1);
        Label_DescripcionPDT1.setBounds(30, 170, 100, 16);

        Label_DescripcionPDT2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        Label_DescripcionPDT2.setText("Precio Unidad");
        jPanel11.add(Label_DescripcionPDT2);
        Label_DescripcionPDT2.setBounds(20, 200, 102, 16);

        Label_DescripcionPDT3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        Label_DescripcionPDT3.setText("Precio Mayoreo");
        jPanel11.add(Label_DescripcionPDT3);
        Label_DescripcionPDT3.setBounds(10, 240, 120, 16);

        Label_DescripcionPDT4.setBackground(new java.awt.Color(44, 189, 165));
        Label_DescripcionPDT4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        Label_DescripcionPDT4.setForeground(new java.awt.Color(44, 189, 165));
        Label_DescripcionPDT4.setText("Departamento");
        jPanel11.add(Label_DescripcionPDT4);
        Label_DescripcionPDT4.setBounds(140, 270, 170, 28);

        rSButtonRiple27.setBackground(new java.awt.Color(0, 119, 145));
        rSButtonRiple27.setText("Guardar (Enter)");
        rSButtonRiple27.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jPanel11.add(rSButtonRiple27);
        rSButtonRiple27.setBounds(50, 470, 290, 50);

        rSButtonRiple28.setBackground(new java.awt.Color(236, 82, 82));
        rSButtonRiple28.setText("Eliminar");
        rSButtonRiple28.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jPanel11.add(rSButtonRiple28);
        rSButtonRiple28.setBounds(70, 530, 250, 50);

        rSButtonRiple29.setBackground(new java.awt.Color(204, 204, 204));
        rSButtonRiple29.setText("Cancelar");
        rSButtonRiple29.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jPanel11.add(rSButtonRiple29);
        rSButtonRiple29.setBounds(100, 590, 200, 40);

        jPanel34.setBackground(new java.awt.Color(44, 189, 165));

        jLabel48.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Informacion Productos");
        jLabel48.setToolTipText("");

        RadioButton_IngresarCliente1.setBackground(new java.awt.Color(44, 189, 165));
        RadioButton_IngresarCliente1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        RadioButton_IngresarCliente1.setForeground(new java.awt.Color(255, 255, 255));
        RadioButton_IngresarCliente1.setText("Ingresar cliente");

        RadioButton_PagosCliente1.setBackground(new java.awt.Color(44, 189, 165));
        RadioButton_PagosCliente1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        RadioButton_PagosCliente1.setForeground(new java.awt.Color(255, 255, 255));
        RadioButton_PagosCliente1.setText("Pagos de cliente");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RadioButton_IngresarCliente1)
                .addGap(18, 18, 18)
                .addComponent(RadioButton_PagosCliente1)
                .addContainerGap())
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButton_IngresarCliente1)
                    .addComponent(RadioButton_PagosCliente1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel34);
        jPanel34.setBounds(0, 0, 410, 50);

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 73, 410, 685));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Table_ComprasPDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Table_ComprasPDT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Table_ComprasPDT.setRowHeight(20);
        Table_ComprasPDT.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane4.setViewportView(Table_ComprasPDT);

        jLabel49.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(51, 51, 51));
        jLabel49.setText("Productos Comprados");
        jLabel49.setToolTipText("");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(490, 490, 490)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 83, 1440, 400));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Table_BodegaPDT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Table_BodegaPDT.setRowHeight(20);
        Table_BodegaPDT.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane5.setViewportView(Table_BodegaPDT);

        Label.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        Label.setText("Productos en Bodega");

        rSMTextFull10.setForeground(new java.awt.Color(0, 0, 0));
        rSMTextFull10.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        rSMTextFull10.setBordeColorNoFocus(new java.awt.Color(0, 0, 0));
        rSMTextFull10.setBotonColor(new java.awt.Color(255, 51, 0));
        rSMTextFull10.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        rSMTextFull10.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        rSMTextFull10.setPlaceholder("Busqueda PRODUCTOS");

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/iconfinder_search_326690 (1).png"))); // NOI18N

        rSButtonRiple20.setText("Ultimo");

        rSButtonRiple21.setText("Primero");

        rSButtonRiple22.setText("Anterior");

        rSButtonRiple23.setText("Siguiente");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1412, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(516, 516, 516)
                        .addComponent(Label)
                        .addGap(111, 111, 111)
                        .addComponent(rSMTextFull10, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel50)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSButtonRiple21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonRiple22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonRiple23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonRiple20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(318, 318, 318))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Label)
                        .addComponent(rSMTextFull10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonRiple21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonRiple23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonRiple20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonRiple22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 482, 1440, 270));

        jPanel33.setBackground(new java.awt.Color(44, 189, 165));

        jLabel47.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Productos");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap(899, Short.MAX_VALUE)
                .addComponent(jLabel47)
                .addGap(870, 870, 870))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 1887, -1));

        jTabbedPane1.addTab("tab4", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

        RadioButton_Dpt.setBackground(new java.awt.Color(255, 255, 255));
        RadioButton_Dpt.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        RadioButton_Dpt.setForeground(new java.awt.Color(44, 189, 165));
        RadioButton_Dpt.setText("Departamento");

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        TextField_Categoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Label_Dpt1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        Label_Dpt1.setText("Departamento");
        Label_Dpt1.setToolTipText("");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_Dpt1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                    .addComponent(TextField_Categoria))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(Label_Dpt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Label_Dpt.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        Label_Dpt.setText("Departamento");
        Label_Dpt.setToolTipText("");

        TextField_Departamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(Label_Dpt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(TextField_Departamento))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Dpt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        RadioButton_Dpt1.setBackground(new java.awt.Color(255, 255, 255));
        RadioButton_Dpt1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        RadioButton_Dpt1.setForeground(new java.awt.Color(44, 189, 165));
        RadioButton_Dpt1.setText("Categoria");

        rSButtonRiple30.setBackground(new java.awt.Color(0, 119, 145));
        rSButtonRiple30.setText("Guardar (Enter)");
        rSButtonRiple30.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N

        rSButtonRiple31.setBackground(new java.awt.Color(236, 82, 82));
        rSButtonRiple31.setText("Eliminar");
        rSButtonRiple31.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N

        rSButtonRiple32.setBackground(new java.awt.Color(204, 204, 204));
        rSButtonRiple32.setText("Cancelar");
        rSButtonRiple32.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RadioButton_Dpt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(RadioButton_Dpt1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonRiple30, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(rSButtonRiple31, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(rSButtonRiple32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButton_Dpt)
                    .addComponent(RadioButton_Dpt1))
                .addGap(18, 18, 18)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(rSButtonRiple30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(rSButtonRiple31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(rSButtonRiple32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 74, -1, 691));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Table_Dpt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Table_Dpt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Table_Dpt.setRowHeight(20);
        Table_Dpt.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane6.setViewportView(Table_Dpt);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 75, 1120, 690));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Table_Cat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Table_Cat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Table_Cat.setRowHeight(20);
        Table_Cat.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane8.setViewportView(Table_Cat);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1526, 74, -1, -1));

        jPanel35.setBackground(new java.awt.Color(44, 189, 165));

        jLabel51.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Departamentos - Categorias");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(771, 771, 771)
                .addComponent(jLabel51)
                .addContainerGap(789, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 1887, 50));

        jTabbedPane1.addTab("tab5", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RadioButton_Unidad.setBackground(new java.awt.Color(255, 255, 255));
        RadioButton_Unidad.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        RadioButton_Unidad.setForeground(new java.awt.Color(0, 153, 153));
        RadioButton_Unidad.setSelected(true);
        RadioButton_Unidad.setText("Por Unidad");
        jPanel10.add(RadioButton_Unidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 146, 139, -1));

        RadioButton_Mayoreo.setBackground(new java.awt.Color(255, 255, 255));
        RadioButton_Mayoreo.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        RadioButton_Mayoreo.setForeground(new java.awt.Color(51, 51, 51));
        RadioButton_Mayoreo.setText("Por Mayoreo");
        jPanel10.add(RadioButton_Mayoreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 146, 150, -1));

        Label_DescripcionCP.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        Label_DescripcionCP.setText("Tipo de Compra");
        Label_DescripcionCP.setToolTipText("");
        jPanel10.add(Label_DescripcionCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 121, -1, -1));

        TextField_DescripcionCP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(TextField_DescripcionCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 218, 321, 30));

        rSButtonRiple24.setBackground(new java.awt.Color(0, 119, 145));
        rSButtonRiple24.setText("Guardar");
        rSButtonRiple24.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jPanel10.add(rSButtonRiple24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 295, 52));

        rSButtonRiple25.setBackground(new java.awt.Color(236, 82, 82));
        rSButtonRiple25.setText("Eliminar");
        rSButtonRiple25.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jPanel10.add(rSButtonRiple25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 220, -1));

        rSButtonRiple26.setBackground(new java.awt.Color(204, 204, 204));
        rSButtonRiple26.setText("Cancelar");
        rSButtonRiple26.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jPanel10.add(rSButtonRiple26, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 158, -1));

        jPanel20.setBackground(new java.awt.Color(0, 119, 145));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingresa Informacion de Productos");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        Label_DescripcionCP1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        Label_DescripcionCP1.setText("Descripción");
        Label_DescripcionCP1.setToolTipText("");
        jPanel10.add(Label_DescripcionCP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 62, -1, -1));

        Label_DescripcionCP2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        Label_DescripcionCP2.setText("Cantidad");
        Label_DescripcionCP2.setToolTipText("");
        jPanel10.add(Label_DescripcionCP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 190, 103, -1));

        TextField_DescripcionCP1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(TextField_DescripcionCP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 90, 321, 30));

        Label_DescripcionCP3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        Label_DescripcionCP3.setText("Importe");
        Label_DescripcionCP3.setToolTipText("");
        jPanel10.add(Label_DescripcionCP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 337, 80, -1));

        TextField_DescripcionCP2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(TextField_DescripcionCP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 294, 183, 30));

        Label_DescripcionCP4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        Label_DescripcionCP4.setText("Precio");
        Label_DescripcionCP4.setToolTipText("");
        jPanel10.add(Label_DescripcionCP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 260, 103, -1));

        TextField_DescripcionCP3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(TextField_DescripcionCP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 361, 183, 30));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Table_Compras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Table_Compras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Table_Compras.setRowHeight(20);
        Table_Compras.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane9.setViewportView(Table_Compras);

        rSButtonRiple37.setText("Anterior");

        rSButtonRiple38.setText("Primero");

        rSButtonRiple39.setText("Siguiente");

        rSButtonRiple40.setText("Ultimo");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 1474, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(rSButtonRiple38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonRiple37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonRiple39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonRiple40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 432, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rSButtonRiple40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonRiple39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rSButtonRiple37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonRiple38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setText("Compras");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Buscar");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(204, 204, 204)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(TextField_BuscarCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(TextField_BuscarCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab6", jPanel5);

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));

        btnClientes.setBackground(new java.awt.Color(66, 103, 178));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/users.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnVentas.setBackground(new java.awt.Color(66, 103, 178));
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/sale (1).png"))); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N

        btnProductos.setBackground(new java.awt.Color(66, 103, 178));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/product (1).png"))); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N

        btnConfiguracion.setBackground(new java.awt.Color(66, 103, 178));
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/settings (1).png"))); // NOI18N
        btnConfiguracion.setText("Configuracion");
        btnConfiguracion.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N

        btnCategorias.setBackground(new java.awt.Color(66, 103, 178));
        btnCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/list (1).png"))); // NOI18N
        btnCategorias.setText("Categorias");
        btnCategorias.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N

        btnProveedores.setBackground(new java.awt.Color(66, 103, 178));
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/fast-delivery.png"))); // NOI18N
        btnProveedores.setText("Proveedores");
        btnProveedores.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel2.setText("Le Atiende:");

        btnCompras.setBackground(new java.awt.Color(66, 103, 178));
        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/fast-delivery.png"))); // NOI18N
        btnCompras.setText("Compras");
        btnCompras.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel28Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel28Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1920, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        jTabbedPane1.setSelectedIndex(1);
        Tab = 1;
        btnVentas.setEnabled(true);
        btnClientes.setEnabled(false);
        btnProductos.setEnabled(true);
        btnCategorias.setEnabled(true);
        btnCompras.setEnabled(true);
        btnProveedores.setEnabled(true);
        accion = "Insert";
        CargarDatos();

    }//GEN-LAST:event_btnClientesActionPerformed

    private void RadioAgreagarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioAgreagarClienteActionPerformed
        RadioAgreagarCliente.setForeground(new Color(0, 153, 51));
        RadioPagosCliente.setForeground(Color.black);
        txtNombre.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtPagosClientes.setEnabled(false);
        txtID.setEnabled(true);
        RadioPagosCliente.setSelected(false);
    }//GEN-LAST:event_RadioAgreagarClienteActionPerformed

    private void RadioPagosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioPagosClienteActionPerformed
        RadioAgreagarCliente.setForeground(new Color(0, 153, 51));
        RadioPagosCliente.setForeground(Color.black);
        txtPagosClientes.setEnabled(true);
        txtNombre.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtID.setEnabled(false);
        RadioAgreagarCliente.setSelected(false);
    }//GEN-LAST:event_RadioPagosClienteActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        if (txtNombre.getText().equals("")) {
            lblNombreClientes.setForeground(new Color(187, 187, 187));
        } else {
            lblNombreClientes.setText("Nombres ");
            lblNombreClientes.setForeground(new Color(44, 189, 165));
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        evento.textKeyPress(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyReleased
        if (txtApellidos.getText().equals("")) {
            lblApellidosClientes.setForeground(new Color(187, 187, 187));
        } else {
            lblApellidosClientes.setText("Apellidos");
            lblApellidosClientes.setForeground(new Color(44, 189, 165));
        }
    }//GEN-LAST:event_txtApellidosKeyReleased

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        evento.textKeyPress(evt);

    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        if (txtDireccion.getText().equals("")) {
            lblDireccionClientes.setForeground(new Color(187, 187, 187));
        } else {
            lblDireccionClientes.setText("Direccion");
            lblDireccionClientes.setForeground(new Color(44, 189, 165));
        }
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped

    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtPagosClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagosClientesKeyReleased
        if (TablaReporteClientes.getRowCount() == 0) {
            lblPagoClientes.setText("Selecciona el Cliente...");
            lblPagoClientes.setForeground(Color.RED);
        } else {
            if (!txtPagosClientes.getText().equalsIgnoreCase("")) {
                lblPagoClientes.setText("Pagos de Deudas");
                lblPagoClientes.setForeground(new Color(0, 153, 51));
                String deuda1;
                double deuda2, deuda3, deudaTotal;
                deuda1 = (String) TablaReporteClientes.getValueAt(0, 3);
                pattern = Pattern.compile("[$]");
                matcher = pattern.matcher(deuda1);
                deuda1 = matcher.replaceAll("");
                deuda2 = formato.reconstruir(deuda1);
                deuda3 = Double.parseDouble(txtPagosClientes.getText());
                pago = formato.decimal(deuda3);
                deudaTotal = deuda2 - deuda3;
                DeudaActual = formato.decimal(deudaTotal);

            }

        }
        if (txtPagosClientes.getText().equals("")) {
            txtPagosClientes.setForeground(new Color(187, 187, 187));
        } else {
            lblPagoClientes.setText("Pago de Clientes");
            lblPagoClientes.setForeground(new Color(44, 189, 165));
        }
    }//GEN-LAST:event_txtPagosClientesKeyReleased

    private void txtPagosClientesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagosClientesKeyTyped
        evento.NumberKeyPress(evt);
    }//GEN-LAST:event_txtPagosClientesKeyTyped

    private void txtIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyReleased
        if (txtID.getText().equals("")) {
            lblIDCliente.setForeground(new Color(187, 187, 187));

        } else {
            lblIDCliente.setText("ID");
            lblIDCliente.setForeground(new Color(44, 189, 165));
        }
    }//GEN-LAST:event_txtIDKeyReleased

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped


    }//GEN-LAST:event_txtIDKeyTyped

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        if (txtTelefono.getText().equals("")) {
            lblTelefonoClientes.setForeground(new Color(187, 187, 187));
        } else {
            lblTelefonoClientes.setText("Telefono");
            lblTelefonoClientes.setForeground(new Color(44, 189, 165));
        }
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        evento.NumberKeyPress(evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void lblIDClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblIDClienteKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblIDClienteKeyReleased

    private void btnGuardarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClientesActionPerformed
        if (RadioAgreagarCliente.isSelected()) {
            GuardarClientes();

        } else {
            GuardarReportes();
        }
    }//GEN-LAST:event_btnGuardarClientesActionPerformed

    private void btnPrimeroVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroVentasActionPerformed

    }//GEN-LAST:event_btnPrimeroVentasActionPerformed

    private void btnAnteriorVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorVentasActionPerformed

    }//GEN-LAST:event_btnAnteriorVentasActionPerformed

    private void btnSiguienteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteVentasActionPerformed

    }//GEN-LAST:event_btnSiguienteVentasActionPerformed

    private void btnUltimoVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoVentasActionPerformed

    }//GEN-LAST:event_btnUltimoVentasActionPerformed

    private void btnPrimeroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroClientesActionPerformed
        NumPagi = 0;
        lblPaginaClientes.setText("Paginas " + "1" + "/" + String.valueOf(PaginaCount));
        cliente.BuscarCliente(TablaClientes, "", NumPagi, PaginaSize);
    }//GEN-LAST:event_btnPrimeroClientesActionPerformed

    private void btnAneriorClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAneriorClientesActionPerformed
        if (PaginaCount != 1) {
            if (NumPagi > 0) {
                if (PaginaCount == NumPagi) {
                    NumPagi -= 1;

                }
                lblPaginaClientes.setText("Paginas " + String.valueOf(NumPagi)
                        + "/ " + String.valueOf(PaginaCount));
                NumPagi -= 1;
                NumRegistro = PaginaSize * NumPagi;
                cliente.BuscarCliente(TablaClientes, "", NumRegistro, PaginaSize);
            }
        }
    }//GEN-LAST:event_btnAneriorClientesActionPerformed

    private void btnSiguienteClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteClientesActionPerformed
        if (PaginaCount != 1) {
            if (NumPagi < PaginaCount) {
                if (NumPagi == 0) {
                    NumPagi += 1;
                }
                NumRegistro = PaginaSize * NumPagi;
                cliente.BuscarCliente(TablaClientes, "", NumRegistro, PaginaSize);
                NumPagi += 1;
                lblPaginaClientes.setText("Paginas " + String.valueOf(NumPagi)
                        + "/ " + String.valueOf(PaginaCount));
            }

        }
    }//GEN-LAST:event_btnSiguienteClientesActionPerformed

    private void btnUltimoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoClientesActionPerformed
        NumPagi = PaginaCount;
        NumPagi--;
        NumRegistro = PaginaSize * NumPagi;
        lblPaginaClientes.setText("Paginas " + String.valueOf(PaginaCount)
                + "/ " + String.valueOf(PaginaCount));
        cliente.BuscarCliente(TablaClientes, "", NumRegistro, PaginaSize);
        NumPagi = PaginaCount;
    }//GEN-LAST:event_btnUltimoClientesActionPerformed

    private void btnCancelarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClientesActionPerformed
        RestablecerCamposClientes();
    }//GEN-LAST:event_btnCancelarClientesActionPerformed

    private void TablaClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablaClientesKeyReleased

    }//GEN-LAST:event_TablaClientesKeyReleased

    private void TablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaClientesMouseClicked
        if (TablaClientes.getSelectedRows().length > 0) {
            InformacionClientes();

        }
    }//GEN-LAST:event_TablaClientesMouseClicked

    private void btnEliminarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClientesActionPerformed
        if (IDCliente == 0) {
            JOptionPane.showMessageDialog(null, "Selecciona Un Cliente para Eliminar");
        } else {
            if (JOptionPane.YES_NO_OPTION == JOptionPane.showConfirmDialog(null, "¿Deseas Eliminar los Registros? " + " ", "Eliminar Registros ",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)) {
                cliente.EliminarCliente(IDCliente, idRegistro);
                RestablecerCamposClientes();

            }
        }
    }//GEN-LAST:event_btnEliminarClientesActionPerformed

    private void btnFacturaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaClientesActionPerformed
        cliente.ImprimirRecibo(Panel_ReciboCliente);
    }//GEN-LAST:event_btnFacturaClientesActionPerformed

    private void RadioAgreagarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioAgreagarCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioAgreagarCliente1ActionPerformed

    private void RadioAgreagarCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioAgreagarCliente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioAgreagarCliente2ActionPerformed

    private void lblIDCliente1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblIDCliente1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblIDCliente1KeyReleased

    private void lblIDCliente2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblIDCliente2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblIDCliente2KeyReleased

    private void lblIDCliente3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblIDCliente3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblIDCliente3KeyReleased

    private void lblIDCliente4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblIDCliente4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblIDCliente4KeyReleased

    private void lblIDCliente5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblIDCliente5KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblIDCliente5KeyReleased

    private void lblIDCliente6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblIDCliente6KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblIDCliente6KeyReleased

    private void txtBuscarProveedoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProveedoresKeyReleased

    }//GEN-LAST:event_txtBuscarProveedoresKeyReleased

    private void txtBuscarProveedoresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProveedoresKeyPressed

    }//GEN-LAST:event_txtBuscarProveedoresKeyPressed

    private void txtBuscarClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarClientesKeyReleased
        cliente.BuscarCliente(TablaClientes, txtBuscarClientes.getText(), NumeroPag, PaginaSize);
    }//GEN-LAST:event_txtBuscarClientesKeyReleased

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        jTabbedPane1.setSelectedIndex(2);
        Tab = 2;
        btnVentas.setEnabled(true);
        btnClientes.setEnabled(true);
        btnProductos.setEnabled(true);
        btnCategorias.setEnabled(true);
        btnCompras.setEnabled(true);
        btnProveedores.setEnabled(false);
        accion = "Insert";
        CargarDatos();
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnFacturaClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaClientes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFacturaClientes1ActionPerformed

    private void rSButtonRiple33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRiple33ActionPerformed

    private void InformacionClientes() {
        accion = "Update";
        TablaModeloCliente = cliente.getModelo();
        int filas = TablaClientes.getSelectedRow();
        IDCliente = Integer.valueOf((String) TablaModeloCliente.getValueAt(filas, 0));
        txtID.setText((String) TablaModeloCliente.getValueAt(filas, 1));
        txtNombre.setText((String) TablaModeloCliente.getValueAt(filas, 2));
        txtApellidos.setText((String) TablaModeloCliente.getValueAt(filas, 3));
        txtDireccion.setText((String) TablaModeloCliente.getValueAt(filas, 4));
        txtTelefono.setText((String) TablaModeloCliente.getValueAt(filas, 5));
        TablaReporteDeClientes = cliente.reportesCliente(TablaReporteClientes, IDCliente);
        idRegistro = Integer.valueOf((String) TablaReporteDeClientes.getValueAt(0, 0));
        Label_NombreCLT.setText((String) TablaReporteDeClientes.getValueAt(0, 1));
        Label_ApellidoCLT.setText((String) TablaReporteDeClientes.getValueAt(0, 2));
        Label_SaldoActualCLT.setText((String) TablaReporteDeClientes.getValueAt(0, 3));
        Label_UltimoPagoCLT.setText((String) TablaReporteDeClientes.getValueAt(0, 5));
        Label_FechaPagoCLT.setText((String) TablaReporteDeClientes.getValueAt(0, 6));
    }

    public void RestablecerCamposClientes() {
        accion = "Insert";
        IDCliente = 0;
        idRegistro = 0;
        NumRegistro = 0;
        NumPagi = 0;
        txtID.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtPagosClientes.setText("");

        txtID.setEnabled(true);
        txtNombre.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtPagosClientes.setEditable(false);
        lblIDCliente.setForeground(new Color(236, 82, 82));
        lblIDCliente.setText("ID");
        lblNombreClientes.setForeground(new Color(236, 82, 82));
        lblNombreClientes.setText("Nombre Completo");
        lblApellidosClientes.setForeground(new Color(236, 82, 82));
        lblApellidosClientes.setText("Apellidos");
        lblDireccionClientes.setForeground(new Color(236, 82, 82));
        lblDireccionClientes.setText("Direccion");
        lblTelefonoClientes.setForeground(new Color(236, 82, 82));
        lblTelefonoClientes.setText("Telefono");
        lblPagoClientes.setForeground(new Color(236, 82, 82));
        lblPagoClientes.setText("Pagos de Deudas");
        RadioAgreagarCliente.setSelected(true);
        RadioPagosCliente.setSelected(false);
        RadioAgreagarCliente.setForeground(new Color(0, 153, 51));
        RadioPagosCliente.setForeground(Color.black);
        CargarDatos();
        cliente.reportesCliente(TablaReporteClientes, IDCliente);
        Label_NombreCLT.setText("Nombres");
        Label_ApellidoCLT.setText("Apellidos");
        Label_SaldoActualCLT.setText("$0.00");
        Label_UltimoPagoCLT.setText("$0.00");
        Label_FechaPagoCLT.setText("Fecha");

    }

    private void GuardarClientes() {
        if (txtID.getText().equals("")) {
            lblIDCliente.setText("Ingresa ID");
            lblIDCliente.setForeground(new Color(236, 82, 82));
            txtID.requestFocus();
        } else {
            if (txtNombre.getText().equals("")) {
                lblNombreClientes.setText("Ingresa los Nombres");
                lblNombreClientes.setForeground(new Color(236, 82, 82));
                txtNombre.requestFocus();

            } else {
                if (txtApellidos.getText().equals("")) {
                    lblApellidosClientes.setText("Ingresa los Apellidos");
                    lblApellidosClientes.setForeground(new Color(236, 82, 82));
                    txtApellidos.requestFocus();
                } else {
                    if (txtDireccion.getText().equals("")) {
                        lblDireccionClientes.setText("Ingresa la Direccion");
                        lblDireccionClientes.setForeground(new Color(236, 82, 82));
                        txtDireccion.requestFocus();
                    } else {

                        if (txtTelefono.getText().equals("")) {
                            lblTelefonoClientes.setText("Ingresa el Numero de Telefono/Celular");
                            lblTelefonoClientes.setForeground(new Color(236, 82, 82));
                            txtTelefono.requestFocus();
                        } else {
                            String ID = txtID.getText();
                            String Nombre = txtNombre.getText();
                            String Apellido = txtApellidos.getText();
                            String Direccion = txtDireccion.getText();
                            String Telefono = txtTelefono.getText();
                            boolean valor;
                            if (accion.equals("Insert")) {
                                cliente.InsertarCliente(ID, Nombre, Apellido, Direccion, Telefono);
                            }
                            if (accion.equals("Update")) {
                                cliente.ActualizarClientes(ID, Nombre, Apellido, Direccion, Telefono, IDCliente);

                            }
                            RestablecerCamposClientes();
                        }
                    }
                }
            }
        }
    }
    ///revisar el codigo

    private void GuardarReportes() {
        if (txtPagosClientes.getText().equals("")) {
            lblPagoClientes.setText("Ingresa el Pago");
            lblPagoClientes.setForeground(Color.RED);
            txtPagosClientes.requestFocus();

        } else {
            cliente.ActualizarReportes(DeudaActual, Fecha, pago, IDCliente);
            RestablecerCamposClientes();
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_PrimeroCLT2;
    private javax.swing.JComboBox ComboBox_Categoria;
    private javax.swing.JComboBox ComboBox_Departamento;
    private javax.swing.JLabel Label;
    private javax.swing.JLabel Label_ApellidoCLT;
    private javax.swing.JLabel Label_ApellidoCliente1;
    private javax.swing.JLabel Label_ApellidoCliente2;
    private javax.swing.JLabel Label_ApellidoCliente3;
    private javax.swing.JLabel Label_CodigoPDT;
    private javax.swing.JLabel Label_DescripcionCP;
    private javax.swing.JLabel Label_DescripcionCP1;
    private javax.swing.JLabel Label_DescripcionCP2;
    private javax.swing.JLabel Label_DescripcionCP3;
    private javax.swing.JLabel Label_DescripcionCP4;
    private javax.swing.JLabel Label_DescripcionPDT;
    private javax.swing.JLabel Label_DescripcionPDT1;
    private javax.swing.JLabel Label_DescripcionPDT2;
    private javax.swing.JLabel Label_DescripcionPDT3;
    private javax.swing.JLabel Label_DescripcionPDT4;
    private javax.swing.JLabel Label_DireccionCliente1;
    private javax.swing.JLabel Label_DireccionCliente2;
    private javax.swing.JLabel Label_DireccionCliente3;
    private javax.swing.JLabel Label_Dpt;
    private javax.swing.JLabel Label_Dpt1;
    private javax.swing.JLabel Label_FechaPagoCLT;
    private javax.swing.JLabel Label_NombreCLT;
    private javax.swing.JLabel Label_NombreCliente1;
    private javax.swing.JLabel Label_SaldoActualCLT;
    private javax.swing.JLabel Label_UltimoPagoCLT;
    private javax.swing.JPanel Panel_ReciboCliente;
    private javax.swing.JRadioButton RadioAgreagarCliente;
    private javax.swing.JRadioButton RadioAgreagarCliente1;
    private javax.swing.JRadioButton RadioAgreagarCliente2;
    private javax.swing.JRadioButton RadioButton_Dpt;
    private javax.swing.JRadioButton RadioButton_Dpt1;
    private javax.swing.JRadioButton RadioButton_IngresarCliente;
    private javax.swing.JRadioButton RadioButton_IngresarCliente1;
    private javax.swing.JRadioButton RadioButton_IngresarCliente2;
    private javax.swing.JRadioButton RadioButton_Mayoreo;
    private javax.swing.JRadioButton RadioButton_PagosCliente;
    private javax.swing.JRadioButton RadioButton_PagosCliente1;
    private javax.swing.JRadioButton RadioButton_PagosCliente2;
    private javax.swing.JRadioButton RadioButton_Unidad;
    private javax.swing.JRadioButton RadioPagosCliente;
    private javax.swing.JTable TablaClientes;
    private javax.swing.JTable TablaReporteClientes;
    private javax.swing.JTable Table_BodegaPDT;
    private javax.swing.JTable Table_BodegaPDT1;
    private javax.swing.JTable Table_Cat;
    private javax.swing.JTable Table_Clientes1;
    private javax.swing.JTable Table_Compras;
    private javax.swing.JTable Table_ComprasPDT;
    private javax.swing.JTable Table_Dpt;
    private javax.swing.JTable Table_ReportesCLT1;
    private javax.swing.JTextField TextField_BuscarCompras;
    private javax.swing.JTextField TextField_Categoria;
    private javax.swing.JTextField TextField_CodigoPDT;
    private javax.swing.JTextField TextField_Departamento;
    private javax.swing.JTextField TextField_DescripcionCP;
    private javax.swing.JTextField TextField_DescripcionCP1;
    private javax.swing.JTextField TextField_DescripcionCP2;
    private javax.swing.JTextField TextField_DescripcionCP3;
    private javax.swing.JTextField TextField_DescripcionPDT;
    private javax.swing.JTextField TextField_PrecioMayoreoPDT;
    private javax.swing.JTextField TextField_PrecioUnidadPDT;
    private rojeru_san.RSButtonRiple btnAneriorClientes;
    private rojeru_san.RSButtonRiple btnAnteriorVentas;
    private rojeru_san.RSButtonRiple btnCancelarClientes;
    private rojeru_san.RSButtonRiple btnCategorias;
    private rojeru_san.RSButtonRiple btnClientes;
    private rojeru_san.RSButtonRiple btnCompras;
    private rojeru_san.RSButtonRiple btnConfiguracion;
    private rojeru_san.RSButtonRiple btnEliminarClientes;
    private javax.swing.JButton btnFacturaClientes;
    private javax.swing.JButton btnFacturaClientes1;
    private rojeru_san.RSButtonRiple btnGuardarClientes;
    private rojeru_san.RSButtonRiple btnPrimeroClientes;
    private rojeru_san.RSButtonRiple btnPrimeroProveedores;
    private rojeru_san.RSButtonRiple btnPrimeroVentas;
    private rojeru_san.RSButtonRiple btnProductos;
    private rojeru_san.RSButtonRiple btnProveedores;
    private rojeru_san.RSButtonRiple btnSegundoProveedores;
    private rojeru_san.RSButtonRiple btnSiguienteClientes;
    private rojeru_san.RSButtonRiple btnSiguienteProveedores;
    private rojeru_san.RSButtonRiple btnSiguienteVentas;
    private rojeru_san.RSButtonRiple btnUltimoClientes;
    private rojeru_san.RSButtonRiple btnUltimoProveedores;
    private rojeru_san.RSButtonRiple btnUltimoVentas;
    private rojeru_san.RSButtonRiple btnVentas;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblApellidosClientes;
    private javax.swing.JLabel lblDireccionClientes;
    private javax.swing.JLabel lblIDCliente;
    private javax.swing.JLabel lblIDCliente1;
    private javax.swing.JLabel lblIDCliente2;
    private javax.swing.JLabel lblIDCliente3;
    private javax.swing.JLabel lblIDCliente4;
    private javax.swing.JLabel lblIDCliente5;
    private javax.swing.JLabel lblIDCliente6;
    private javax.swing.JLabel lblImagenApellidos;
    private javax.swing.JLabel lblImagenDireccion;
    private javax.swing.JLabel lblImagenID;
    private javax.swing.JLabel lblImagenNombres;
    private javax.swing.JLabel lblImagenTelefono;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombreClientes;
    private javax.swing.JLabel lblPaginaClientes;
    private javax.swing.JLabel lblPaginaProveedores;
    private javax.swing.JLabel lblPagoClientes;
    private javax.swing.JLabel lblTelefonoClientes;
    private rojeru_san.RSButtonRiple rSButtonRiple10;
    private rojeru_san.RSButtonRiple rSButtonRiple11;
    private rojeru_san.RSButtonRiple rSButtonRiple20;
    private rojeru_san.RSButtonRiple rSButtonRiple21;
    private rojeru_san.RSButtonRiple rSButtonRiple22;
    private rojeru_san.RSButtonRiple rSButtonRiple23;
    private rojeru_san.RSButtonRiple rSButtonRiple24;
    private rojeru_san.RSButtonRiple rSButtonRiple25;
    private rojeru_san.RSButtonRiple rSButtonRiple26;
    private rojeru_san.RSButtonRiple rSButtonRiple27;
    private rojeru_san.RSButtonRiple rSButtonRiple28;
    private rojeru_san.RSButtonRiple rSButtonRiple29;
    private rojeru_san.RSButtonRiple rSButtonRiple30;
    private rojeru_san.RSButtonRiple rSButtonRiple31;
    private rojeru_san.RSButtonRiple rSButtonRiple32;
    private rojeru_san.RSButtonRiple rSButtonRiple33;
    private rojeru_san.RSButtonRiple rSButtonRiple34;
    private rojeru_san.RSButtonRiple rSButtonRiple35;
    private rojeru_san.RSButtonRiple rSButtonRiple37;
    private rojeru_san.RSButtonRiple rSButtonRiple38;
    private rojeru_san.RSButtonRiple rSButtonRiple39;
    private rojeru_san.RSButtonRiple rSButtonRiple40;
    private rojeru_san.RSMTextFull rSMTextFull10;
    private rojeru_san.RSMTextFull rSMTextFull11;
    private rojeru_san.RSMTextFull rSMTextFull2;
    private rojeru_san.RSMTextFull rSMTextFull3;
    private rojeru_san.RSMTextFull rSMTextFull4;
    private rojeru_san.RSMTextFull rSMTextFull5;
    private rojeru_san.RSMTextFull rSMTextFull6;
    private rojeru_san.RSMTextFull rSMTextFull7;
    private rojeru_san.RSMTextFull rSMTextFull8;
    private rojeru_san.RSMTextFull rSMTextFull9;
    private javax.swing.JTable tablaProveedores;
    private rojeru_san.RSMTextFull txtApellidos;
    private rojeru_san.RSMTextFull txtBuscarClientes;
    private rojeru_san.RSMTextFull txtBuscarProveedores;
    private rojeru_san.RSMTextFull txtDireccion;
    private rojeru_san.RSMTextFull txtID;
    private rojeru_san.RSMTextFull txtNombre;
    private rojeru_san.RSMTextFull txtPagosClientes;
    private rojeru_san.RSMTextFull txtTelefono;
    // End of variables declaration//GEN-END:variables
}
