package exerciciodafaccat;

import java.util.Scanner;

public class Exercicio07 {
	/*
	 * FAÇA UM ALGORITMO QUE LEIA A IDADE DE UMA PESSOA EXPRESSA EM ANOS ,MESES ,DIAS 
	 *E ESCREVA A IDADE DESSA PESSOA EXPRESSA APENAS EM DIAS
	 *CONSIDERAR  ANO COM 365 DIAS E MES COM 30 DIAS.
	 */
	
	public static void main(String[] args) {
		Scanner ler= new Scanner(System. in);
		int anos, dias, mes;
		int diasVividos;
		
		System.out.println("digite a idade apenas em anos :");
		anos = ler.nextInt();

		System.out.println("digite a quantidade de  meses que passou  do seu último mesversario :");
		mes = ler.nextInt();

		System.out.println("Digite a  quantiade de dias  que passou do seu ultimo aniversario :");

		dias = ler.nextInt();
		
		System.out.println();// pula linha
		System.out.println();
		
		diasVividos = anos* 365 + mes * 30 + dias;
		
		
		System.out.println("A quantidade de dias vividos corresponde a:" + diasVividos);
		ler.close(); 
	}
}
