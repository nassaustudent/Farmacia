package banco_de_dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;


public class CadastroClienteCRUD {
     public void cadastroCliente(Cliente cliente){
    Connection connetcion = new BancoAcesso().Conexao();

    String sql = "INSERT INTO usuario(nome, cpf, endereco, telefone) VALUES (?,?,?,?);";
    
    PreparedStatement stmt;
        try {
            stmt = connetcion.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getEndereco());
            stmt.setString(4, cliente.getTelefone());
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroClienteCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    
    
}
