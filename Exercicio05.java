/*
Faça um programa que receba um número inteiro e verifique se este é par ou ímpar.
*/
package Modulo2;
import java.util.Scanner;
public class Exercicio05 {
	public static void main (String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int num = leitor.nextInt();
		if(num % 2 == 0)
		{
			System.out.println("O número é par");
		}
		else
		{
			System.out.println("O númeor é ímpar");
		}
		leitor.close();
	}

}
