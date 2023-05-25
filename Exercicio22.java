package exerciciodafaccat;

import java.util.Scanner;

public class Exercicio22 {

	/*22) A jornada de trabalho semanal de um funcionário é de 40 horas.
	 *  O funcionário que trabalhar mais de  40  horas  receberá  hora  extra,  
	 *  cujo  cálculo  é  o  valor  da  hora  regular  com  um  acréscimo  de  50%.
	 *   Escreva um algoritmo que leia o número de horas trabalhadas em um mês,
	 *    o salário por hora e escreva o salário total do funcionário,
	 *     que deverá ser acrescido das horas extras, 
	 * caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas). 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de horas trabalhadas em um mês:");
		int quantidadeHorasTrabalhadas = sc.nextInt();

		System.out.println("digite o valor recebido por cada hora trabalhada:");
		float valorHora = sc.nextFloat();

		if (quantidadeHorasTrabalhadas < 161) {
			float salarioFinal = quantidadeHorasTrabalhadas * valorHora;
			System.out.println("O valor serrecebido é :R$ " + salarioFinal);

		} else {
			float salarioFinal = (160 * valorHora + valorHora + valorHora * 50 / 100);
			System.out.println("O valor  a ser recebido é R$" + salarioFinal);

		}
		  
		   
		 
	}
	
	
	
	
	
	
	
	
	
	
	
}
