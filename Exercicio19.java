/*
Faça um programa  para verificar se um determinado número inteiro é divisível por 3 ou 5, mas não simultâneamente pelos dois.
*/
package Modulo2;
import java.util.*;
public class Exercicio19 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número: ");
		double num = leitor.nextDouble();
		if(num % 3 == 0 && num % 5 == 0)
		{
			System.out.println("O número não é divisivel por 3 ou 5.");
		}
		else if(num % 3 == 0)
		{
			System.out.println("Este número é divisivel por 3.");
		}
		else if(num % 5 == 0)
		{
			System.out.println("Este número é divisivel por 5.");
		}
		else
		{
			System.out.println("O número não é divisivel por 3 ou 5.");
		}
		leitor.close();
	}
}
