package exerciciodafaccat;

import java.util.Scanner;

public class Exercicio14 {
	/* Ler  um  valor  e  escrever  a  mensagem 
	 *  É  MAIOR  QUE  10!  se  o  valor  lido  for  maior  que  10,  
	 * caso contrário escrever NÃO É MAIOR QUE 10! 
	 */
	
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int valor = ler. nextInt();
		
		if( valor < 10){
		System.out.println("Não é maior que 10!");
	
	}else if (valor ==10) {
		System.out.println(" igual a 10!");
	} else {
		
		System.out.println("É maior que 10!");
	}
		ler.close();
	} 

}
