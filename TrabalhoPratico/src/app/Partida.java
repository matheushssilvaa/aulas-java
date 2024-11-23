package app;

import java.util.ArrayList;
import java.util.List;

public class Partida {
	private Time time1;
	private Time time2;
	private List<Arbitro> arbitros;
	private int golsTime1;
	private int golsTime2;
	private ArrayList<Jogador> golsDeTime1;
	private ArrayList<Jogador> golsDeTime2;
	
	public Partida(Time time1, Time time2, List<Arbitro> arbitros) {
		this.time1 = time1;
		this.time2 = time2;
		this.arbitros = new ArrayList<>();
	}
	
	public void adicionarArbitro(List<Arbitro> arbitros){
		this.arbitros.addAll(arbitros);
	}
	
	public void adicionarPlacar(int golsTime1, int golsTime2, Jogador jogadorTime1, Jogador jogadorTime2) {
		if (golsDeTime1 == null) {
	        golsDeTime1 = new ArrayList<>();
	    }
	    if (golsDeTime2 == null) {
	        golsDeTime2 = new ArrayList<>();
	    }

	    if (jogadorTime1 != null) {
	        golsDeTime1.add(jogadorTime1);
	        this.golsTime1 = golsTime1;
	    }

	    if (jogadorTime2 != null) {
	        golsDeTime2.add(jogadorTime2);
	        this.golsTime2 = golsTime2;
	    }
	}
	
	public void exibirDados() {
		System.out.println("\n====== Partida ======\n");
		System.out.println("Time 1: " + this.time1.getNome() + " X " + "Time 2: " + this.time2.getNome());
		System.out.println("\n====== Placar e Jogadores ======\n");
		for (Jogador jogador : golsDeTime1) {
	        System.out.println("Gols do time: " + this.time1.getNome() + " " + this.golsTime1 + " Jogador: " + jogador.getNome());
	    }
		
		for (Jogador jogador : golsDeTime2) {
	        System.out.println("Gols do time: " + this.time2.getNome() + " " + this.golsTime2 + " Jogador: " + jogador.getNome());
	    }
			
		System.out.println("\n====== Arbitros ======\n");
		if(arbitros.size() > 3) {
			System.out.println("Limite de 3 arbitros atingidos");
			return;
		}
		
		for(Arbitro a: arbitros) {
			if(arbitros.size() == 0) {
				System.out.println("Nenhum arbitro adicionado");
			}
			System.out.println("Nome do arbitro: " + a.getNome() + " tipo: " + a.getTipo());
		}
	}
}
