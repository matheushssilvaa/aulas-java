package cmd;

import app.Arbitro;
import app.Jogador;
import app.Partida;
import app.Time;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		List<Arbitro> arbitrosList = new ArrayList<>();
		Time time1 = new Time();
		Time time2 = new Time();
		Partida partida = new Partida(time1, time2, arbitrosList);
		List<Jogador> jogadoresTime1 = new ArrayList<>();
		List<Jogador> jogadoresTime2 = new ArrayList<>();
		
		arbitrosList.add(new Arbitro("Arbitro1", "bandeira"));
		arbitrosList.add(new Arbitro("Arbitro2", "bandeira"));
		arbitrosList.add(new Arbitro("Arbitro3", "bandeira"));
		
		jogadoresTime1.add(new Jogador("Nome jogador 1", 8, "Goleiro"));
		jogadoresTime1.add(new Jogador("Nome jogador2", 8, "Goleiro"));
		jogadoresTime1.add(new Jogador("Nome jogador3", 8, "Goleiro"));
		jogadoresTime1.add(new Jogador("Nome jogador 4", 8, "Goleiro"));
		jogadoresTime1.add(new Jogador("Nome jogador 5", 8, "Goleiro"));
		jogadoresTime1.add(new Jogador("Nome jogador 6", 8, "Goleiro"));
		jogadoresTime1.add(new Jogador("Nome jogador 7", 8, "Goleiro"));
		jogadoresTime1.add(new Jogador("Nome jogador 8", 8, "Goleiro"));
		jogadoresTime1.add(new Jogador("Nome jogador 9", 8, "Goleiro"));
		jogadoresTime1.add(new Jogador("Nome jogador 10", 8, "Goleiro"));
		jogadoresTime1.add(new Jogador("Nome jogador 11", 8, "Goleiro"));
		
		jogadoresTime2.add(new Jogador("Nome jogador1 time2", 8, "Atacante"));
		jogadoresTime2.add(new Jogador("Nome jogador2 time2", 8, "Atacante"));
		jogadoresTime2.add(new Jogador("Nome jogador3 time2", 8, "Atacante"));
		jogadoresTime2.add(new Jogador("Nome jogador4 time2", 8, "Atacante"));
		jogadoresTime2.add(new Jogador("Nome jogador5 time2", 8, "Atacante"));
		jogadoresTime2.add(new Jogador("Nome jogador6 time2", 8, "Atacante"));
		jogadoresTime2.add(new Jogador("Nome jogador7 time2", 8, "Atacante"));
		jogadoresTime2.add(new Jogador("Nome jogador8 time2", 8, "Atacante"));
		jogadoresTime2.add(new Jogador("Nome jogador9 time2", 8, "Atacante"));
		jogadoresTime2.add(new Jogador("Nome jogador10 time2", 8, "Atacante"));
		jogadoresTime2.add(new Jogador("Nome jogador11 time2", 8, "Atacante"));
		
		time1.setNome("Santos");
		time2.setNome("São paulo");
		
		time1.addJogador(jogadoresTime1);
		time2.addJogador(jogadoresTime2);
		
		partida.adicionarArbitro(arbitrosList);
		
		// adicionando dados de placar
		partida.adicionarPlacar(2,2,jogadoresTime1.get(1),jogadoresTime2.get(5));
		
		time1.exibirDados();
		time2.exibirDados();
		
		partida.exibirDados();
	}
}
