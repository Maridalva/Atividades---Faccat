package exerciciodafaccat;

import java.util.Scanner;

public class Exercicio13 {
	/*Faça  um  algoritmo  que  leia  três  notas  de  um  aluno,  calcule  e  escreva  a  média  final  deste  aluno. 
	 * Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5.
	 *  Fórmula para o cálculo da média final é:
	 *   
	 *   mediafinal  =  n1 * 2 + n2 * 3 + n3 * 5 
	 *            ----------------------------------- 
	 *                          10
	 */

public static void main(String[] args) {
	Scanner ler =new Scanner(System .in);
	Double  n1,n2,n3,Media;
	
	System.out.println("Digite a primeira nota:");
	n1=ler.nextDouble(); 
	
	System.out.println("Digite a segunda nota:");
	n2=ler.nextDouble();
	
	System.out.println("Digite a terceira nota:");
	n3=ler.nextDouble();
	
	n1=n1*2;
	n2=n2*3;
	n3=n3*5;
	
	Media= (n1 + n2+n3)/10;
	System.out.println("A media final é : "+Media);
}
}
