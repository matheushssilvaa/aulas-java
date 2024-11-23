package app;

public class Curso {

	private String nome;
	private int cargaHoraria;	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public int getCargaHoraria() {
		return this.cargaHoraria;
	}
	
	public void exibirDados() {
		System.out.println("Curso: " + this.getNome());
		System.out.println("CH: " + this.getCargaHoraria());
	}
}
