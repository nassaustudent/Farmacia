package model;
import java.util.ArrayList;

public class Cliente extends Pessoa{
 
//listando o histórico dos Pedidos
  private ArrayList<Pedido> historicoCompras = new ArrayList<Pedido>();


    //construtor com os atributos da classe pessoa
	public Cliente(String nome, String cpf, String endereco, String telefone) {
		super(nome, cpf, endereco, telefone);
	}


	//adicionando pedido
	public void adicionarPedido(Pedido pedido) {
		historicoCompras.add(pedido);
	}
}
