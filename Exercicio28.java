/*28) Ler 3 valores (considere que não serão informados valores iguais)
	 *  e escrever o maior deles. 
	 */
package exerciciodafaccat;
import java.util.Scanner;
public class Exercicio28 {

public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	
	
  
	System.out.print("Digite o primeiro valor: ");
	int v1 = ler.nextInt();

	System.out.print("Digite o segundo valor: ");
	int v2 = ler.nextInt();

	System.out.print("Digite o terceiro valor: ");
	int v3 = ler.nextInt();

	int maiorValor = v1;

	if (v2 > maiorValor) {
		maiorValor = v2;
	  
		maiorValor = v3;
	

	System.out.println("O maior valor é: " + maiorValor);

	ler.close();
}
}}


