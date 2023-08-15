/*
Uma empresa vende o mesmo produto para 4 diferentes Estados. Cada Estado possui uma taxa diferente de imposto sobre o produto (MG 7%; SP 12%; RJ 15%; MS 8%). Fa�a um programa em que o usu�rio entre com o valor e o Estado de destino do produto e o programa retorne o pre�o final do produto, acrescido do imposto do Estado em que ele ser� vendido. Se o Estado digitado n�o for v�lido, mostrar a mens�gem de erro.
*/
package Modulo2;
import java.util.*;
public class Exercicio24 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o valor: ");
		double valor = leitor.nextDouble();
		System.out.println("Informe o Estado destino: (MG, SP, RJ ou MS)");
		String est = leitor.next();
		switch (est) {
		case "MG":
			System.out.println("O pre�o final da mercadoria ficr� em: R$" + (valor + (valor * 7 / 100)));			
			break;
		case "SP":
			System.out.println("O pre�o final da mercadoria ficr� em: R$" + (valor + (valor * 12 / 100)));			
			break;
		case "RJ":
			System.out.println("O pre�o final da mercadoria ficr� em: R$" + (valor + (valor * 15 / 100)));			
			break;
		case "MS":
			System.out.println("O pre�o final da mercadoria ficr� em: R$" + (valor + (valor * 8 / 100)));			
			break;
		default:
			System.out.println("Erro de entrada.");
			break;
		}
		leitor.close();
	}

}
