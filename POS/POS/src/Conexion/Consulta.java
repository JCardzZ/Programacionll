package Conexion;

import Modelo.Clientes;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

public class Consulta extends Conexion {

    private QueryRunner QR = new QueryRunner();
    private List<Clientes> cliente;

    public List<Clientes> clientes() {
        try {
            cliente = (List<Clientes>) QR.query(getConn(), "Select * From Clientes",
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
}
