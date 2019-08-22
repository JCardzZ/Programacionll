package ModeloClases;

import Conexion.Consulta;
import Modelo.Clientes;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Cliente extends Consulta {

    private Consulta consulta = new Consulta();
    private DefaultTableModel modelo;
    private List<Clientes> cliente, clienteFilter;
    private int IDCliente;
    private String Id;
    private String Sql;
    private Object[] object;

    public void InsertarCliente(String ID, String Nombre, String Apellido, String Direccion, String Telefono) {
        Sql = "Insert Into Clientes(ID,Nombres,Apellidos,Direccion,Telefono)" + "Values(?,?,?,?,?)";
        object = new Object[]{ID, Nombre, Apellido, Direccion, Telefono};
        Insertar(Sql, object);
        cliente = clientes();
        cliente.forEach(item -> {
            IDCliente = item.getIdCliente();
            Id = item.getID();
        });
        Sql = "Insert Into ReporteClientes (IDCliente,SaldoActual,FechaActual,"
                + "UltimoPago,FechaPago,ID)"
                + "Values(?,?,?,?,?,?)";
        object = new Object[]{IDCliente, "$0.00", "Sin Fecha", "$0.00", "Sin Fecha", Id};
        Insertar(Sql, object);
    }

    public List<Clientes> getClientes() {
        return clientes();
    }

   public void BuscarCliente(JTable table, String campo, int num_registro, int reg_por_pagina) {
        String[] registros = new String[6];
        String[] titulos = {"Id", "ID", "Nombre", "Apellido", "Direccion", "Telefono"};
        modelo = new DefaultTableModel(null, titulos);
        cliente = clientes();
        if (campo.equals("")) {
            clienteFilter = cliente.stream()
                    .skip(num_registro).limit(reg_por_pagina)
                    .collect(Collectors.toList());
        } else {
            clienteFilter = cliente.stream()
                    .filter(C -> C.getID().startsWith(campo) || C.getNombres().startsWith(campo)
                    || C.getApellidos().startsWith(campo))
                    .skip(num_registro).limit(reg_por_pagina)
                    .collect(Collectors.toList());
        }
        clienteFilter.forEach(item -> {
            registros[0] = String.valueOf(item.getIdCliente());
            registros[1] = item.getID();
            registros[2] = item.getNombres();
            registros[3] = item.getApellidos();
            registros[4] = item.getDireccion();
            registros[5] = item.getTelefono();
            modelo.addRow(registros);
        });
        table.setModel(modelo);
        table.setRowHeight(30);
        table.getColumnModel().getColumn(0).setMaxWidth(0);
        table.getColumnModel().getColumn(0).setMinWidth(0);
        table.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

}
