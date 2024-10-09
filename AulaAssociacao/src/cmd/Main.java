package cmd;

import application.Aluno;
import application.Disciplina;
import application.Professor;

public class Main {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		
		a1.setNome("Aluno 1");
		a1.setRa(8184943);
		//a1.exibirDados();
		
		Professor p1 = new Professor();
		p1.setNome("Professor 1");
		p1.setTitulacao("Mestre");
		p1.setRa(8184943);
		//p1.exibirDados();
		
		Disciplina d1 = new Disciplina();
		d1.setNome("Disciplina 1");
		d1.setCargaHoraria(1800);
		d1.setProfessor(p1);
		//d1.exibirDados();
		
		a1.matricular(d1);
		a1.exibirDados();
	}
	
}
