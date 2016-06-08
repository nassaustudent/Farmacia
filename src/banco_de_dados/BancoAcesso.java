
package banco_de_dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class BancoAcesso {
    
    private String driver = "com.mysql.jdbc.Driver";
	private String caminho = "jdbc:mysql://127.0.0.1/mydb";
	private String usuario = "root";
	private String senha = "elimorais";
	public static Connection conn = null;
	
	public Connection Conexao (){
		
		try {
			//System.setProperty("jdbc.Drivers", driver);
                        Class.forName(driver);
			conn = DriverManager.getConnection(caminho, usuario, senha);
			JOptionPane.showMessageDialog(null, "Conectado!");
		}catch(ClassNotFoundException ex){
                    Logger.getLogger(BancoAcesso.class.getName()).log(Level.SEVERE, null, ex);
			
		} catch (SQLException e){
                    throw new RuntimeException(e);
                }
                
                return conn;
        }
    
    
}
