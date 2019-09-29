package Dao;

import Conexion.ConexionMySQL;
import Modelo.ModelProductos;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DaoProductos extends ConexionMySQL {

    public int salvarProdutosDAO(ModelProductos pModelProdutos) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_producto ("
                    + "pro_nombre,"
                    + "pro_valor,"
                    + "pro_stock"
                    + ") VALUES ("
                    + "'" + pModelProdutos.getDescripcion()+ "',"
                    + "'" + pModelProdutos.getProValor() + "',"
                    + "'" + pModelProdutos.getProStock() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean excluirProdutoDAO(int pIdProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_producto WHERE pk_id_producto = '" + pIdProduto + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean alterarProdutoDAO(ModelProductos pModelProdutos) {
        try {
            this.conectar();
//            return this.executarUpdateDeleteSQL(
//                    "UPDATE tbl_producto SET "
//                    + "pro_nombre = '" + pModelProdutos.getDescripcion()+ "',"
//                    + "pro_valor = '" + pModelProdutos.getProValor() + "',"
//                    + "pro_stock = '" + pModelProdutos.getProStock() + "'"
//                    + " WHERE pk_id_producto = '" + pModelProdutos.getIdProductos() + "'"
//            );
            return  this.executarUpdateDeleteSQL("call Modificar_producto('" + pModelProdutos.getIdProductos() + "','" + pModelProdutos.getDescripcion()+ "','" + pModelProdutos.getProValor() + "','" + pModelProdutos.getProStock() +"')");

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }

    }

    public ModelProductos retornarProdutoDAO(int pIdProduto) {
        ModelProductos modelProdutos = new ModelProductos();
        try {
            this.conectar();
//            this.executarSQL("SELECT "
//                    + "pk_id_producto, "
//                    + "pro_nombre,"
//                    + "pro_valor,"
//                    + "pro_stock "
//                    + "FROM tbl_producto WHERE pk_id_producto = '" + pIdProduto + "';");
            ResultSet rs = this.getCon().createStatement().executeQuery("SELECT * FROM tbl_producto;");
            while (rs.next()) {
                modelProdutos = new ModelProductos();
                modelProdutos.setIdProductos(rs.getInt(1));
                modelProdutos.setDescripcion(rs.getString(2));
                modelProdutos.setProValor(rs.getDouble(3));
                modelProdutos.setProStock(rs.getInt(4));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }

    public ArrayList<ModelProductos> retornarListaProdutosDAO() {
        ArrayList<ModelProductos> listaModelProdutos = new ArrayList<>();
        ModelProductos modelProdutos = new ModelProductos();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_productos;");
//            System.out.println(this);
            ResultSet rs = this.getCon().createStatement().executeQuery("SELECT * FROM tbl_producto;");
            while (rs.next()) {
                modelProdutos = new ModelProductos();
                modelProdutos.setIdProductos(rs.getInt(1));
                modelProdutos.setDescripcion(rs.getString(2));
                modelProdutos.setProValor(rs.getDouble(3));
                modelProdutos.setProStock(rs.getInt(4));
                listaModelProdutos.add(modelProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
//            System.out.println("Error " + e);
        } finally {
            this.fecharConexao();
        }
        return listaModelProdutos;
    }
}
