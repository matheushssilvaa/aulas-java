package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Insira o numero: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		int antecessor = number -1;
		int sucessor = number + 1;
		
		System.out.println("O antecessor de " + number + " eh " + antecessor + " e o sucessor eh " + sucessor);
	
	}
}
