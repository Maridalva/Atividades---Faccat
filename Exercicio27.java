package exerciciodafaccat;

import java.util.Scanner;

public class Exercicio27 {

	


	

	/*LER UM VALOR  E ESCREVER  SE É POSITIVO ,NEGATIVO,

	 * OU ZERO

	 */


	public static void main(String[] args) {

	Scanner ler =new Scanner (System .in);


	System.out.println(" digite um valor :");

	int valor= ler.nextInt();



	if ( valor>0) {

	System.out.println(" positivo");

	}  else if (valor == 0) {

	System.out.println("O número é zero");

	} else {

	System.out.println("negativo");

	}

	}}




