package application;

/*
	Descrição do Problema:
	Você está desenvolvendo um programa para calcular o preço de um produto em um sistema de vendas online.
	O preço do produto é influenciado por várias regras de negócio, como descontos, promoções e taxas adicionais. 
	Crie uma função chamada precoFinal que recebe o preço base do produto e algumas variáveis indicando as condições de venda.
	
	Regras de Negócio:
	Se o cliente for um cliente "prime", aplicar um desconto de 10% no preço base.
	Se a quantidade de produtos no carrinho for maior que 5, aplicar um desconto de 5%.
	Se um cupom de desconto válido for fornecido, aplicar o desconto correspondente. Os cupons válidos são "DESC15" (15% de desconto) e "PRIMEIRACOMPRA" (10% de desconto).
	
	obs: os descontos não são comulativos, ou seja, cada cliente só pode ter um dos 4 tipos de acima, e vai prevalecer o maior desconto.
*/


public class Calculadora {
	
	public double precoFinal(double precoBase, int quantidade, Boolean clientePrime, String cupomDesconto) {
		
		if (precoBase < 0) {
			throw new IllegalArgumentException("O preco base nao pode ser negativo");
        }
        if (quantidade < 0) {
        	throw new IllegalArgumentException("A quantidade nao pode ser negativa");
        }
        if (quantidade == 0) {
        	throw new IllegalArgumentException("A quantidade nao pode ser vazia.");
        }
        if (cupomDesconto != null && !cupomDesconto.isEmpty() && 
            !cupomDesconto.equals("DESC15") && !cupomDesconto.equals("PRIMEIRACOMPRA")) {
            throw new IllegalArgumentException("Cupom de desconto invalido.");
        }
	
	    double descontoClientePrime = 0;
        double descontoQuantidade = 0;
        double descontoCupom = 0;

        // Verifica se o cliente eh Prime e aplica 10% de desconto
        if (clientePrime != null && clientePrime) {
            descontoClientePrime = 0.10; // 10% de desconto
        }

        // Verifica se a quantidade no carrinho eh maior que 5 e aplica 5% de desconto
        if (quantidade > 5) {
            descontoQuantidade = 0.05; // 5% de desconto
        }

        // Verifica o cupom de desconto valido e aplica o desconto correspondente
        if (cupomDesconto != null) {
            if (cupomDesconto.equals("DESC15")) {
                descontoCupom = 0.15; // 15% de desconto
            } else if (cupomDesconto.equals("PRIMEIRACOMPRA")) {
                descontoCupom = 0.10; // 10% de desconto
            }
        }

        // Determina o maior desconto entre todos
        double maiorDesconto = Math.max(descontoClientePrime, Math.max(descontoQuantidade, descontoCupom));

        // Calcula o preco final aplicando o maior desconto
        return precoBase * (1 - maiorDesconto);
	}
}