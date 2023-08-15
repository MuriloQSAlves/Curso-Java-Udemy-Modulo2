/*
Determine se um determinado ano lido é bissexto. Sendo que um ano é bissexto se for divisível por 400, ou se for divisível por 4 e não for divisível por 100.
*/
package Modulo2;
import java.util.Scanner;
public class Exercicio23 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o ano com 4 dígitos: ");
		int ano = leitor.nextInt();
		if(ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0)
		{
			System.out.println("O ano é bisexto.");
		}
		else
		{
			System.out.println("O ano não é bisexto.");
		}
		leitor.close();
	}

}
