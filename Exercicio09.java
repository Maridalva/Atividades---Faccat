package exerciciodafaccat;

import java.util.Scanner;

public class Exercicio09 {
	/*Escreva um algoritmo para ler o salário
	 *  mensal atual de um funcionário e 
	 *  o percentual de reajuste. 
	 *  Calcular e escrever
	 *  o valor do novo salário. 
	 */
	 public static void main(String[] args) {
		Scanner ler = new Scanner (System .in);
		
		System.out.println("Digite o valor do salario");
		double salario = ler.nextDouble();
		
		System.out.println(" O valor do reajuste:");
		double reajuste = ler.nextDouble();
		
		System.out.println("valor do salario atual:");
		double salarioAtual= ler.nextDouble();
		
		double valorRealDoReajuste = salario* reajuste /100;
		double salarioFinal=salario + valorRealDoReajuste;
		
		System.out.println("O novo salario com reajuste é :R$"+salarioFinal);
		
		
		
	}

}
