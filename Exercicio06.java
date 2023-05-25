package exerciciodafaccat;

import java.util.Scanner;


/*Escreva  um  algoritmo  para  ler  as  dimensões  de  um  retângulo  (base  e  altura),  calcular 
 *  e  escrever  a área do retângulo. 
 */ 
 

public class Exercicio06 {
	public static void main(String[] args) {
		
	
	Scanner ler= new Scanner(System.in);
	
	System.out.println("digite a base do valor do retangulo:");
	double base= ler.nextDouble();
	
	System.out.println("digite o valor da altura do retangulo: ");
	double altura= ler.nextDouble();
	
	if (base==altura) {
		System.out.println("Você digitou valores iguais, por favor digite outro valor!");
	}else {
		
		double area= base*altura;
		System.out.println(" o valor da area corresponde a:" + area);// chama contatenaçaõ mistura de textos com variável.
		
		// com numeros diferentes, a base não e a soma da area mais a lateral é perimetro!
	}
	
	
	
	

	}

}
