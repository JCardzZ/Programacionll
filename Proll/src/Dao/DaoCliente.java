package Dao;

import Conexion.ConexionMySQL;
import Modelo.ModelClientes;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DaoCliente extends ConexionMySQL {

    public int guardarClienteDAO(ModelClientes pModelCliente) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_cliente ("
                    + "pk_id_cliente,"
                    + "cli_nombre,"
                    + "cli_direccion,"
                    + "cli_barrio,"
                    + "cli_ciudad,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefono"
                    + ") VALUES ("
                    + "'" + pModelCliente.getIdCliente() + "',"
                    + "'" + pModelCliente.getCliNomnbre() + ","
                    + "'" + pModelCliente.getCliDireccion() + "',"
                    + "'" + pModelCliente.getCliBarrio() + "',"
                    + "'" + pModelCliente.getCliCiudad() + "',"
                    + "'" + pModelCliente.getCliUf() + "',"
                    + "'" + pModelCliente.getCliCep() + "',"
                    + "'" + pModelCliente.getCliTelefono() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    public ModelClientes getClienteDao(int pIdCliente) {
        ModelClientes modelCliente = new ModelClientes();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT"
                    + "pk_id_cliente,"
                    + "cli_nombre,"
                    + "cli_direccion,"
                    + "cli_barrio,"
                    + "cli_ciudad,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefono"
                    + "FROM"
                    + "tbl_cliente"
                    + "WHERE"
                    + "pk_id_cliente = '" + pIdCliente + "'"
                    + ";"
            );
            while (this.getResultSet().next()) {
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setCliNomnbre(this.getResultSet().getString(2));
                modelCliente.setCliDireccion(this.getResultSet().getString(3));
                modelCliente.setCliBarrio(this.getResultSet().getString(4));
                modelCliente.setCliCiudad(this.getResultSet().getString(5));
                modelCliente.setCliUf(this.getResultSet().getString(6));
                modelCliente.setCliCep(this.getResultSet().getString(7));
                modelCliente.setCliTelefono(this.getResultSet().getString(8));

            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            this.fecharConexao();
        }
        return modelCliente;
    }

    public ArrayList<ModelClientes> getListaClienteDao() {
        ArrayList<ModelClientes> listaModelCliente = new ArrayList();
        ModelClientes modelCliente = new ModelClientes();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_productos;");
            ResultSet rs = this.getCon().createStatement().executeQuery("SELECT * FROM tbl_producto;");
            while (rs.next()) {
                modelCliente = new ModelClientes();
                modelCliente.setCliNomnbre(rs.getString(1));
                modelCliente.setCliDireccion(rs.getString(2));
                modelCliente.setCliBarrio(rs.getString(3));
                modelCliente.setCliCiudad(rs.getString(4));
                modelCliente.setCliUf(rs.getString(5));
                modelCliente.setCliCep(rs.getString(6));
                modelCliente.setCliTelefono(rs.getString(7));

                listaModelCliente.add(modelCliente);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelCliente;
    }

    public boolean actualizarClienteDAO(ModelClientes pModelCliente) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_cliente SET "
                    + "pk_id_cliente = '" + pModelCliente.getIdCliente() + "',"
                    + "cli_nombre = '" + pModelCliente.getCliNomnbre() + "',"
                    + "cli_direccion = '" + pModelCliente.getCliDireccion() + "',"
                    + "cli_barrio = '" + pModelCliente.getCliBarrio() + "',"
                    + "cli_ciudad = '" + pModelCliente.getCliCiudad() + "',"
                    + "cli_uf = '" + pModelCliente.getCliUf() + "',"
                    + "cli_cep ='" + pModelCliente.getCliCep() + "',"
                    + "cli_telefono ='" + pModelCliente.getCliTelefono() + "'"
                    + " WHERE "
                    + "pk_id_cliente = '" + pModelCliente.getIdCliente() + "'"
                    + ";"
            );

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }

    }

    public boolean eliminarClienteDao(int pIdCliente) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_cliente "
                    + "WHERE "
                    + "pk_id_cliente ='" + pIdCliente + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

}
