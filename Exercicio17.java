package exerciciodafaccat;

import java.util.Scanner;

public class Exercicio17 {
	/*
	 * Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética
	 * simples e escrever uma mensagem que diga se o aluno foi ou não aprovado
	 * (considerar que nota igual ou maior que 6 o aluno é aprovado) . Escrever
	 * também a média calculada.
	 * 
	 */

	public static void main(String[] args) {
		try {
			
		
			
		
		Scanner ler = new Scanner(System.in);
		System.out.println("digite o valor da 1° nota :");
		float nota1 = ler.nextFloat();

		System.out.println("digite o valor da 2° nota :");
		float nota2 = ler.nextFloat();
		float media = (nota1 + nota2) / 2;

		if ((media < 0) || (media > 10)) {
			System.out.println("o programa aceita somente numeros entre 0 e 10,inclusive!");
		} else if (media >= 6) {
			System.out.println("Aluno(a) aprovado(a)com sucesso.Sua media foi: " + media);
		} else {
			System.out.println("Aluno(a) reprovado(a).Sua media foi: " + media);

		}ler.close();
          }catch (Exception e) { 	
		System.out.println("Caro amigo(a),não sei se percebeu, mas não aceitamos caracteres para efetuar operações matematicas!"+ e );
		
	}

	}
}
