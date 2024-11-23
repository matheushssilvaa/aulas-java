package app;

public class Professor extends Funcionario {
	private String especialidade;
	
	public Professor(String nome, String rg, String especialidade) {
		super(nome, rg, "Professor");
		this.especialidade = especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public String getEspecialidade() {
		return this.especialidade;
	}
	
}
