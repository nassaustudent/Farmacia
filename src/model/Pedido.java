package model;

import java.util.HashMap;

public class Pedido {

    private HashMap<Produto, Integer> 
produtos = new HashMap<Produto, Integer>();
	
private Funcionario funcionario;
	private Cliente cliente;
	private double total;

//construtor do pedido
public Pedido(Funcionario funcionario, Cliente cliente) {
		this.funcionario = funcionario;
		this.cliente = cliente;
		total = 0;
	}
	
	

//Essa classe faz uma verificação no estoque do Produto e na quantidade
// se tiver produto, return true, senao, retorna false
//se for true, ajeita a comissão do funcionário

public Boolean adicionarProduto(Produto produto, int quantidade){
	if(produto.getQuantidadeEstoque() >= quantidade) {
	 produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidade);
		    total += (produto.getValorUnitario() * quantidade);

		    if (produtos.containsKey(produto)){
		    	quantidade += produtos.get(produto);
		    	produtos.replace(produto, quantidade);
		    }

		    else {
			    produtos.put(produto, quantidade);
		    }
		    return true;

//retornou positivo		
}else{

//retornou falso
			return false;
		}
	}



//finaliza a Comissão
	public void finalizar(){
		funcionario.setComissao(0.1*total);
		cliente.adicionarPedido(this);
	}

	
	public double getTotal(){
		return this.total;
	}
}
