/*
Determine se um determinado ano lido � bissexto. Sendo que um ano � bissexto se for divis�vel por 400, ou se for divis�vel por 4 e n�o for divis�vel por 100.
*/
package Modulo2;
import java.util.Scanner;
public class Exercicio23 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o ano com 4 d�gitos: ");
		int ano = leitor.nextInt();
		if(ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0)
		{
			System.out.println("O ano � bisexto.");
		}
		else
		{
			System.out.println("O ano n�o � bisexto.");
		}
		leitor.close();
	}

}
