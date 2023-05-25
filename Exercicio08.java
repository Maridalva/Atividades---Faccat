package exerciciodafaccat;

import java.util.Scanner;

     public class Exercicio08 {
	/*ESCREVA UM ALGORISMO PARA LER O NUMERO TOTAL DE ELEITORES DE UM MUNICIPIO,
	 * NUMERO DE VOTOS , BRANCOS,NULOS, E VALIDOS. CALCULAR O PERCENTUAL DE CADA 
	 * UM REPRESENTA EM RELAÇÃO AO TOTAL DE ELEITORES.
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double totalEleitores, brancos, validos,nulos, brancoPercentual,nulosPercentual,validosPercentual;
		
		System.out.println("Digite o numero total de eleitores do municipio:\n");
		totalEleitores = ler. nextDouble();
		
		System.out.printf("\nInforme o numero total de votos brancos:");
		brancos= ler.nextDouble();
		
		System.out.printf("\nInforme o numero total de votos nulos:");
		nulos= ler.nextDouble();
		
		validos= totalEleitores - brancos - nulos;
		/*200-100
		 * 20 -x
		 * x= 100.20/200
		 */
		
		 brancoPercentual= 100*brancos/totalEleitores;
		 System.out.println("\nPorcentagem de votos em brancos: " +  brancoPercentual);
		
		 nulosPercentual= 100* nulos/totalEleitores;
		 System.out.println("\nPorcentagem de votos nulos: " +  nulosPercentual);
		
		validosPercentual = 100*validos/totalEleitores;
		 System.out.println("\nPorcentagem de votos validos: " +  validosPercentual);
		
	}

}
