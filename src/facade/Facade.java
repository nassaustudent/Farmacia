package facade;

import com.sun.security.ntlm.Client;
import control.ClienteControl;
import java.util.ArrayList;
import model.Cliente;

public class Facade {
    
//Cadastrar usuário

    public static boolean cadastrarCliente(Cliente cliente){
        return ClienteControl.cadastrarCliente(cliente);
    }
    
//Deletar usuário
    public static boolean deletarCliente(Cliente cliente){
        return ClienteControl.deletarCliente(cliente);
    }
    

//editar um usuário    
    public static boolean editarCliente(Cliente cliente){
        return ClienteControl.editarCliente(cliente);
    }
    

//Listar todos usuarios
    public static ArrayList<Cliente> listarCliente(){
        return ClienteControl.listarCliente();
    }
          
    
}
