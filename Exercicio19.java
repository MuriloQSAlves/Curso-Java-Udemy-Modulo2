/*
Fa�a um programa  para verificar se um determinado n�mero inteiro � divis�vel por 3 ou 5, mas n�o simult�neamente pelos dois.
*/
package Modulo2;
import java.util.*;
public class Exercicio19 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um n�mero: ");
		double num = leitor.nextDouble();
		if(num % 3 == 0 && num % 5 == 0)
		{
			System.out.println("O n�mero n�o � divisivel por 3 ou 5.");
		}
		else if(num % 3 == 0)
		{
			System.out.println("Este n�mero � divisivel por 3.");
		}
		else if(num % 5 == 0)
		{
			System.out.println("Este n�mero � divisivel por 5.");
		}
		else
		{
			System.out.println("O n�mero n�o � divisivel por 3 ou 5.");
		}
		leitor.close();
	}
}
