package exerciciodafaccat;

import java.util.Scanner;

public class Exercicio21 {
	/*21) Ler a hora de início e a hora de fim de um jogo de Xadrez 
	 * (considere apenas horas inteiras, sem os minutos)
	 *  e calcule a duração do jogo em horas, sabendo-se que 
	 *  o tempo máximo de duração do jogo é de 24 horas
	 *  e que o jogo pode iniciar em um dia e terminar no dia seguinte. 
	 */ 
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
		int horaInicial;
		int horaFinal;
		int duracaoJogo;
		System.out.println("qual foi o inicio do jogo de Xadrez:");
		horaInicial= ler. nextInt();
		
		System.out.println("qual foi o fim do jogo de xadrez:");
		horaFinal=ler.nextInt();
		
		if (horaFinal<horaInicial) {
		

		System.out.println("o tempo maximo:"+horaFinal+horaInicial); 

	}else { 
			System.out.println("o tempo excedeu o limite"); 


		
		}
	
		
		
		
	}

}
