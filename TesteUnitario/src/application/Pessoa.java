package application;

import Util.ValidaCpf;

/* Classe Pessoa
 * Possui os atributos:
 * Nome; RG; CPF
 * Nome não pode ser vazio
 * CPF precisa ser válido
 */

public class Pessoa {
	
	// atributos
	private String nome;
	private String rg;
	private String cpf;
	
	// construtor
	public Pessoa() {};
	
	//setters and getters
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome( String nome ) throws Exception {
		if(nome.split(" ").length < 2) {
			throw new Exception("Nome Inválido");
		}
		this.nome = nome;
	}
	
	public String getrg() {
		return this.rg;
	}
	
	public void setrg( String rg ) {
		this.rg = rg;
	}
	
	public String getcpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) throws Exception {
		//String cpfStr = Long.toString(cpf); // conversão de long para string
		ValidaCpf.isCPF(cpf);
		this.cpf = cpf;
	}
	
	public Pessoa(String nome, String cpf) throws Exception {
		setNome(nome);
		this.cpf = cpf;
	}

}
