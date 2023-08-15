/*
Escreva um programa que leia um número maior do que 0 e devolva, na tela a soma de todos os seus algarismos. Por exemplo: o número 251 corresponderá o valor 8 (2+5+1). Se o número lido não for maior que 0, o programa terminará com a mensagem: Número inválido.
*/
package Modulo2;
import java.util.Scanner;
public class Exercicio11 {
	public static void main(String[]args)
	{
		int soma = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int num = leitor.nextInt();
		if(num > 0)
		{
			 while(num > 0)
			 {
				 soma += (num % 10);
			     num /= 10;      
			 }
			 System.out.println("A soma de todos algarismos é: " + soma);
		}
		else
		{
			System.out.println("Númeor inválido.");
		}
		leitor.close();
	}
}
