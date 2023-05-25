package exerciciodafaccat;

import java.util.Scanner;

public class Exercicio05A {

	
	public static void main(String[] args) {
		
	
	try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número:");
		int numero =sc .nextInt();
		int resultado = numero +1;
		
		System.out.println("O sucessor do numero "+ numero+" é :" + resultado);
	
		
	} catch (Exception e) {
		
	System.out.println("Favor inserir somente números"  +e);
	}
	
	}
		
	}


