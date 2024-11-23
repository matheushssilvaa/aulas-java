package app;

// classe aluno herda todos os atributos e métodos
// publicos da classe pessoa

public class Aluno extends Pessoa { // acessa os metodos de Pessoa
	private String ra;
	
	public Aluno(String nome, String rg, String ra) {
		super(nome, rg);
		this.ra = ra;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	public String getRa() {
		return this.ra;
	}
	
	public void exibirDados() {
		System.out.println("------ Aluno ------");
		System.out.println("Nome: " + this.getNome()); // método herdado por outra classe
		System.out.println("RG: " + this.getRg()); // método herdado por outra classe
		System.out.println("RA: " + this.getRa());
	}
 }
