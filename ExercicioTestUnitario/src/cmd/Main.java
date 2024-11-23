package cmd;

import application.Calculadora;

public class Main {

	public static void main(String[] args)  {
		Calculadora c = new Calculadora();
	
		System.out.println(c.precoFinal(125.50, 5, false, "DES"));
	}

}
