package app;

import java.util.ArrayList;

import app.Curso;

public class Departamento {
	
	private String nome;
	private String areaAtuacao;
	private ArrayList<Curso> cursos = new ArrayList<Curso>();
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public String getNome() {
		return this.nome;
	}
	
	public String getAreaAtuacao() {
		return this.areaAtuacao;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
	
	public void addFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	
	public ArrayList<Funcionario> getFuncionarios() {
		return this.funcionarios;
	}
	
	// Aqui muda para a composição
	// recebemos os dados do objeto
	public void addCurso(String nome, int cargaHoraria) {
		Curso c = new Curso();
		c.setNome(nome);
		c.setCargaHoraria(cargaHoraria);
		this.cursos.add(c);
	}
	
	public ArrayList<Curso> getCursos() {
		return this.cursos;
	}
	
	public void exibirDados() {
		System.out.println("****** CURSO ******");
		
		if(this.getCursos().size() == 0) {
			System.out.println("Não ha cursos cadastrados");
			return;
		} else {
			for(Curso c : cursos) {
				c.exibirDados();
			}
		}
		
		System.out.println("****** PROFESSORES ******");
		if(this.funcionarios.size() == 0) {
			System.out.println("Não ha professores cadastrados");
		} else {
			for(Funcionario f : this.funcionarios) {
				System.out.println("Nome: " + f.getNome());
				System.out.println("RG: " + f.getRg());
				System.out.println("Funcionario: " + f.getFuncao());
				System.out.println("");
			}
		}
	}

}
