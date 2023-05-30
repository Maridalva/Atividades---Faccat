package exerciciodafaccat;

import java.util.Scanner;
public class Exercicio16 {

	/*16 As  maçãs  custam  R$  1,30  cada  se  forem  compradas  menos  de  uma  dúzia, 
	 * e  R$  1,00  se  forem compradas  pelo  menos  12. 
	 * Escreva  um  programa  que  leia  o  número  de  maçãs  compradas, 
	 * calcule  e escreva o custo total da compra. 
	 * 
	 */
	


	
		
	public static void main(String[] args) {
	Scanner ler= new Scanner(System.in);
		
		
		
		System.out.print("Digite o número de maçãs compradas: ");
		        int macaCompradas = ler.nextInt();
		        
		 System.out.println("digite o custo total da compra:");
		 double custoTotal= ler.nextDouble();
		 
	if (macaCompradas < 12) {
		
	custoTotal =   macaCompradas*1.30;

	} else {
	custoTotal =macaCompradas * 1.00;
		            
		 
	 }
	System.out.print("Custo total da compra: R$ " + custoTotal);

		         ler.close();
		     }
		 }

