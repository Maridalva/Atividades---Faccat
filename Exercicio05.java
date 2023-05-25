package exerciciodafaccat;

import java.util.Scanner;

public class Exercicio05 {

public static void main (String []args) {
	/*Escreva um algoritmo para ler um valor (do teclado) e
	 *  escrever (na tela) o seu antecessor. 
	 */
	Scanner sc=  new Scanner (System.in);
	
	
	System.out.println("Informe um numero:");
	int valor =sc. nextInt();
	int resultado = valor -1;
	
	System.out.println("O numero antecessor digitado "+ resultado);
	sc.close();
	
}
	
	
	
	
	
	
	
	}


