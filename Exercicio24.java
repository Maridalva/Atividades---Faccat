/* 24 Ler o salário fixo e o valor das vendas efetuadas pelo vendedor
	 * de uma empresa. Sabendo-se que ele  recebe  uma  comissão  de  3%
	 * sobre  o  total  das  vendas  até  R$  1.500,00  
	 * mais  5%  sobre  o  que ultrapassar
	 * este valor, calcular e escrever o seu salário total. 
	 * 
	 */

package exerciciodafaccat;
import java.util.Scanner;
public class Exercicio24 {


public static void main(String[] args) {
Scanner ler = new Scanner(System .in);

System.out.println("Digite o salário fixo do vendedor: R$ ");
double salarioFixo = ler.nextDouble();

	        
System.out.println("Digite o valor das vendas efetuadas: R$ ");
double valorVendas = ler.nextDouble();
double comissao;

if (valorVendas <= 1500) {
	
comissao = valorVendas *0.03; 
}
	       

else {
double valorExcedente = valorVendas - 1500;
comissao = 1500 * 0.03 + valorExcedente * 0.05;
	        
double salarioTotal = salarioFixo + comissao;
System.out.println("Salário total do vendedor: R$ " + salarioTotal);

	        ler.close();
	    }
	}


}
	


