package br.com.erickfreire.juroscompostos;

/**
 * Programa em Java que calcula juros compostos
 * @author Erick Freire
 * @version 1 - Criado em 15-04-2021 as 15:06
 */

public class JurosCompostos {
	public static void main(String[] args) {
		
		double total;
		double principal = 1000.00;
		double taxaDeJuros = 0.05;
		
		System.out.printf("%s%20s %n", "Ano", "Total de Deposito");
		
		for(int ano = 1; ano <= 10; ano++) {
			
			total = principal * Math.pow(1.0 + taxaDeJuros, ano);
			
			System.out.printf("%4d%,20.2f%n", ano, total);
			
		}
		
		
	}

}
