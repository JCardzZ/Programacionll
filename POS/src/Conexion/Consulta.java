package Conexion;

import Modelo.Clientes;
import Modelo.ReporteClientes;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

public class Consulta extends Conexion {

    private QueryRunner QR = new QueryRunner();
    private List<Clientes> cliente;
    private List<ReporteClientes> reportescliente;

    public List<Clientes> clientes() {
        try {
            cliente = (List<Clientes>) QR.query(getConn(),
                    "Select * From Clientes",
                    new BeanListHandler(Clientes.class));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error : " + ex);
        }
        return cliente;
    }

    public void Insertar(String sql, Object[] data) {
        try {
            final QueryRunner qr = new QueryRunner(true);
            qr.insert(getConn(), sql, new ColumnListHandler(), data);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error : " + ex);

        }
    }

    public List<ReporteClientes> reportesClientes(int idCliente) {
        String condicion = " Clientes.IDCliente = reporteclientes.IDCliente ";
        String campos = "Clientes.IDCliente,Clientes.ID,Clientes.Nombres,"
                + "Clientes.Apellidos,reporteclientes.IDRegistro,reporteclientes.SaldoActual,"
                + "reporteclientes.FechaActual,reporteclientes.UltimoPago,reporteclientes.FechaPago ";
        try {
            reportescliente = (List<ReporteClientes>) QR.query(getConn(),
                    "SELECT " + campos + " From reporteclientes Inner Join Clientes ON "
                    + condicion + " WHERE reporteclientes.IDCliente ="
                    + idCliente, new BeanListHandler(ReporteClientes.class));
        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }
        return reportescliente;
    }

    public void Actualizar(String sql, Object[] data) {
        try {
            final QueryRunner qr = new QueryRunner(true);
            qr.update(getConn(), sql, data);

        } catch (SQLException ex) {
            System.out.println("Error : " + ex);
        }
    }

    public void Eliminar(String sql, int id) {
        try {
            final QueryRunner qr = new QueryRunner(true);
            qr.update(getConn(), sql, "%" + id + "%");
        } catch (SQLException ex) {
            System.out.println("Error : " + ex);

        }

    }
}
