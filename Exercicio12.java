package exerciciodafaccat;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*Escreva  um  algoritmo  para  ler  uma  temperatura  em  graus  Fahrenheit,  calcular  e  escrever  o  valor correspondente em graus Celsius
		 *  (baseado na fórmula abaixo):
		 *  
		 *     C          F - 32    
		 * ----------= -----------  
		 *     5             9
		 */
		Scanner ler= new Scanner(System.in);
		
		
		double f,c;
		
		System.out.println("Informe a temperatura em Fahrenheit:");
		f = ler.nextDouble();
		
		System.out.println("Informe  o valor em graus Celsius:");
		c = ler.nextDouble();
		
		c = 5 *(f-32)/9;
		System.out.println("valor em graus Celsius:"+ c);
	
		ler.close();
	}

}
