package app;

import java.util.ArrayList;
import java.util.List;

public class Time {
	private String nome;
	private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Jogador> getJogador() {
		return jogadores;
	}
	
	public void addJogador(List<Jogador> jogador ) {
		this.jogadores.addAll(jogador);
	}
	
	public void exibirDados(){
		
		if(jogadores.size() > 11) {
			System.out.println("O numero de jogadores do time " + this.getNome() + " é maior que 11");
			return;
		}
		
		System.out.println("====== Time ======");
		System.out.println("\nNome do time: " + this.getNome() + "\n");
		System.out.println("====== Jogadores ======\n");
		if(jogadores.size() == 0) {
			System.out.println("Não existe jogadores cadastrados.");
		}
		for(Jogador j: jogadores) {
			if(jogadores.size() == 0) {
				System.out.println("Nenhum jogador cadastrado");
			}
			System.out.println("Nome do jogador: " + j.nome + " Numero do jogador: " + j.numero + " Função/Posição: " + j.posicao);
		}
	} 
}