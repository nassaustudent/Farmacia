
package model;

public class Funcionario extends Pessoa {

private double salarioBase;
    private double comissao;
    
//Construtor
 da classe Funcionário que extende Pessoa
public Funcionario(String nome, String cpf, String endereco, String telefone, double salarioBase) {
		super(nome, cpf, endereco, telefone);
		this.salarioBase = salarioBase;

	}

public void setComissao(double valor) {
		comissao += valor;
	}
	
//Coloca a comissao no salário do Funcionário
public double salario() {
		
return salarioBase + comissao;
	}
}
