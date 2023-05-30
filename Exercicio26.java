/* 26 Faça  um  algoritmo  para  ler:  quantidade  atual  em  estoque, 
	 * quantidade  máxima  em  estoque  e quantidade  mínima  em 
	 *  estoque  de  um  produto.  
	 *  Calcular  e  escrever  a  quantidade  média  
	 *  ((quantidade média = quantidade máxima + quantidade mínima)/2).
	 * Se a quantidade em estoque for maior ou igual a  quantidade 
	 *  média  escrever  a  mensagem  'Não  efetuar  compra', 
	 *  senão  escrever  a  mensagem  'Efetuar compra'. 
	 * 
	 */
package exerciciodafaccat;

import java.util.Scanner;

public class Exercicio26 {

	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a quntidade atual do estoque:");
		int qntdAtual = ler.nextInt();

		System.out.println("Digite a quantidade maxima em estoque:");
		int qntdMaxima = ler.nextInt();

		System.out.println("Digite a quntidade minima em estoque:");
		int qntdMinima = ler.nextInt();

		int qntdMedia = ((qntdMaxima + qntdMinima) / 2);
		System.out.println("Quantidade média: " + qntdMedia);

		if (qntdAtual >= qntdMedia) {
			System.out.println("Não efetuar compra!");

		} else {
			System.out.println("Efetuar compra!");
		}

			ler.close();

		}

	
}



