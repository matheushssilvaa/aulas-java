package application;

public class Disciplina {
	
	// Atributos
	private String nome;
	private int cargaHoraria;
	private Professor professor;
	
	// Métodos acessores
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	String getNome() {
		return nome;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Professor getProfessor() {
		return this.professor;
	}
	
	public void exibirDados() {
		System.out.println("++++++ Disciplina ++++++");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Carga Horaria: " + this.getCargaHoraria());
		//System.out.println("Professor: " + this.getProfessor().getNome());
	
		Professor prof = this.getProfessor();
		if(prof != null) {
			prof.exibirDados();
		}
	}

}
