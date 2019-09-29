
package Controlador;

import Dao.DaoCliente;
import Modelo.ModelClientes;
import java.util.ArrayList;


public class ControllerCliente  {
    
    private DaoCliente daoCliente = new DaoCliente();
    
    public int guardarClienteController(ModelClientes pModelCliente){
        return this.daoCliente.guardarClienteDAO(pModelCliente);
        
    }
    public ModelClientes getClienteController(int pIdCliente){
        return this.daoCliente.getClienteDao(pIdCliente);
    }
   public ArrayList<ModelClientes> getListaClienteController(){
      return this.daoCliente.getListaClienteDao();
      
   }
   public boolean actualizarClienteController(ModelClientes pModelCliente){
       return this.daoCliente.actualizarClienteDAO(pModelCliente);
   }
   public boolean eliminarClienteController(int pIdCliente){
       return this.daoCliente.eliminarClienteDao(pIdCliente);
   }
}
