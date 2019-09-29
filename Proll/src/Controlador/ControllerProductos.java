package Controlador;

import Dao.DaoProductos;
import Modelo.ModelProductos;
import java.util.ArrayList;

public class ControllerProductos {

    private DaoProductos daoProductos = new DaoProductos();

    public int salvarProductoController(ModelProductos pModelProductos) {
        return this.daoProductos.salvarProdutosDAO(pModelProductos);

    }

    public boolean excluirProductoController(int pCodigo) {
        return this.daoProductos.excluirProdutoDAO(pCodigo);
    }
    
    public boolean alterarProductoController(ModelProductos pModelProductos){
        return this.daoProductos.alterarProdutoDAO(pModelProductos);
        
    }
    public ModelProductos retornarProductoController(int pCodigo){
        return this.daoProductos.retornarProdutoDAO(pCodigo);
        
    }
    public ArrayList<ModelProductos> retornarListaProductoController(){
        return this.daoProductos.retornarListaProdutosDAO();
    }
}
