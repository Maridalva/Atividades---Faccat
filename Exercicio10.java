package exerciciodafaccat;

import java.util.Scanner;
public class Exercicio10 {

	/*

	* O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um

	*carro, calcular e escrever o custo final ao consumidor.

	*/

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	System.out.print("Digite o custo de fábrica do carro: ");

	double custoFabrica = scanner.nextDouble();

	// Percentual do distribuidor e dos impostos

	double percentualDistribuidor = 0.28;

	double percentualImpostos = 0.45;

	// Cálculo do custo final ao consumidor

	double custoConsumidor = custoFabrica + (custoFabrica * percentualDistribuidor) + (custoFabrica * percentualImpostos);

	System.out.println("Custo final ao consumidor: " + custoConsumidor);

	}

	}
	
	


