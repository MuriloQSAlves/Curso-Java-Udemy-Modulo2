/*
Fa�a um programa que receba um n�mero inteiro e verifique se este � par ou �mpar.
*/
package Modulo2;
import java.util.Scanner;
public class Exercicio05 {
	public static void main (String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um n�mero: ");
		int num = leitor.nextInt();
		if(num % 2 == 0)
		{
			System.out.println("O n�mero � par");
		}
		else
		{
			System.out.println("O n�meor � �mpar");
		}
		leitor.close();
	}

}
