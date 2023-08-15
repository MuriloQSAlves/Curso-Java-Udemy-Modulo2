/*
Escreva um programa que leia um n�mero maior do que 0 e devolva, na tela a soma de todos os seus algarismos. Por exemplo: o n�mero 251 corresponder� o valor 8 (2+5+1). Se o n�mero lido n�o for maior que 0, o programa terminar� com a mensagem: N�mero inv�lido.
*/
package Modulo2;
import java.util.Scanner;
public class Exercicio11 {
	public static void main(String[]args)
	{
		int soma = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um n�mero: ");
		int num = leitor.nextInt();
		if(num > 0)
		{
			 while(num > 0)
			 {
				 soma += (num % 10);
			     num /= 10;      
			 }
			 System.out.println("A soma de todos algarismos �: " + soma);
		}
		else
		{
			System.out.println("N�meor inv�lido.");
		}
		leitor.close();
	}
}
