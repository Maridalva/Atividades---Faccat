package exerciciodafaccat;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		 Scanner ler= new Scanner(System.in);
		 
		 double numCarrosVendidos, salarioFixo, comissao, salarioFinal,totalVendas;
		 
		 System.out.println("Informe o valor do salário fixo:");
		 salarioFixo=ler.nextDouble();
		 
		 System.out.println("Informe o total de vendas:");
		 totalVendas = ler.nextDouble();
		 
		 System.out.println("Informe o numero de carros vendidos :");
		 numCarrosVendidos = ler.nextDouble();
		 
		 System.out.println("Informe a comissão:");
		 comissao = ler.nextDouble();
		 
		 salarioFinal =(numCarrosVendidos*comissao)+(totalVendas*0.05)+salarioFixo;
		 System.out.println("Salario final:"+salarioFinal );
		 
		 ler.close();
		 
		 }
	

}
