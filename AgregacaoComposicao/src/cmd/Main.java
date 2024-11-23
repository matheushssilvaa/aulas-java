package cmd;

import app.Administrativo;
import app.Aluno;
import app.Curso;
import app.Departamento;
import app.Professor;
import app.Administrativo;

public class Main {

	public static void main(String[] args) {
		
		/*Professor p1 = new Professor();
		p1.setNome("Joao");
		p1.setEspecialidade("Banco de dados");
		
		Professor p2 = new Professor();
		p2.setNome("Pedro");
		p2.setEspecialidade("Programação");
		
		//-------------------------------------
		
		Curso c1 = new Curso();
		c1.setNome("ADS");
		c1.setCargaHoraria(2000);
		
		//-------------------------------------
		
		Departamento d1 = new Departamento();
		d1.setNome("Computacao");
		d1.setAreaAtuacao("Exatas");
		d1.addCurso("ADS2", 2000); // composição (não passa os objetos prontos)
		d1.addCurso("Eng", 4000); // composição
		d1.addCurso("Ciencia da computacao", 4000); // composição
		d1.addCurso("Gestão de TI", 4000); // composição
		d1.addProfessor(p1); // agregação
		d1.addProfessor(p2);
		d1.exibirDados(); // Agregação*/
		
		//--------------------------------------
		
		/*Aluno a1 = new Aluno("Nome do aluno 1", "1234-SP", "101235");
		a1.exibirDados();
		a1.setNome("Novo nome do aluno");
		a1.setRa("445455");
		a1.exibirDados();*/
		
		/*Administrativo adm = new Administrativo("Nome", "rg1238SP", "conv-14658");
		System.out.println("Nome... " + adm.getNome());
		System.out.println("Nome... " + adm.getFuncao());
		System.out.println("Nome... " + adm.getCodConvenio());*/
		
		// criar professores e funcionarios
		
		
		Administrativo adm1 = new Administrativo("Nome adm-1", "rg-123", "conv-123");
		Administrativo adm2 = new Administrativo("Nome adm-2", "rg-1124", "conv-1112");
		Administrativo adm3 = new Administrativo("Nome adm-3", "rg-178", "conv-144");

		Professor p1 = new Professor("Nome prof-1", "rg-5554", "conv-4546");
		Professor p2 = new Professor("Nome prof-2", "rg-5588", "conv-4570");
		
		Departamento dpto1 = new Departamento();
		dpto1.setNome("Computacao e Matemática");
		dpto1.setAreaAtuacao("Exatas");
		dpto1.addCurso("ADS", 2000);
		dpto1.addCurso("Fisica", 4000);
		
		dpto1.addFuncionario(adm1);
		dpto1.addFuncionario(adm2);
		dpto1.addFuncionario(adm3);
		dpto1.addFuncionario(p1);
		dpto1.addFuncionario(p2);
		
		dpto1.exibirDados();
	
		
	}

}
