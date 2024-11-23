package app;

public class Arbitro {
	private String nome;
	private String tipo;
	
	public Arbitro(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	public String getNome() {
		return this.nome;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String toString() {
		return "nome: " + nome + "\n" + "tipo: " + tipo ;
	}
}
