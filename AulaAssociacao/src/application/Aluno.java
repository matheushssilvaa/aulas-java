package application;

import java.util.ArrayList;

public class Aluno {
	// 1 - Definir os atributos
	private String nome;
	private int ra;
	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	// 2 - Definir os construtores (se houver)!
	
	// 3 - Definir os métodos acessores
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setRa(int ra) {
		this.ra = ra;
	}
	
	public int getRa() {
		return ra;
	}
	
	// RELACIONAMENTO DO TIPO AGREGAÇÃO
	public void matricular(Disciplina d) {
		// método ADD ArrayList
		this.disciplinas.add(d);
	}
	
	public ArrayList<Disciplina> getMatricula() {
		return this.disciplinas;
	}
	
	// 4 - Definir os métodos de função (se houver)!
	
	public void exibirDados() {
		System.out.println("++++++ Aluno ++++++");
		System.out.println("Nome: " + this.getNome());
		System.out.println("R.A: " + this.getRa());
		
		for(Disciplina d : this.getMatricula()) {
			d.exibirDados();
		}
	}
}
