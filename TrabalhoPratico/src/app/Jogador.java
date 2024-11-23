package app;

public class Jogador {
	public String nome;
	public int numero;
	public String posicao;
	
	public Jogador() {};
	
	public Jogador(String nome, int numero, String posicao) {
		this.nome = nome;
		this.numero = numero;
		this.posicao = posicao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getPosicao() {
		return posicao;
	}
	
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	public void exibirDados() {
		System.out.println("====== Jogador ======");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Numero: " + this.getNumero());
		System.out.println("Posição: " + this.getPosicao());
	}
	
}
