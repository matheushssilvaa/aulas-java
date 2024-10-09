package application;

public class Professor {
	
	private String nome;
	private String titulacao;
	private int ra;
	
	// Métodos acessores
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public String getTitulacao() {
		return this.titulacao;
	}
	
	public void setRa(int ra) {
		this.ra = ra;
	}
	
	public int getRa() {
		return this.ra;
	}
	
	public void exibirDados() {
		System.out.println("++++++ Professor ++++++");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Titulacao: " + this.getTitulacao());
		System.out.println("R.A: " + this.getRa());
	}

}
