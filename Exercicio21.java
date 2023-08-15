/*
Escreva o menu de opções abaixo. Leia a opção do usuário e execute a operação escolhida. Escreva uma mensagem de erro se a opção for inválida.
Escolha a opção:
1- soma de 2 números
2- Diferença de 2 números(maior pelomenor)
3- produto entre 2 números
4- divisão enre 2 números(O denominador não pode ser 0)
*/
package Modulo2;
import java.util.*;
public class Exercicio21 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		System.out.println("Escolha a opção: ");
		System.out.println("1 - Soma de 2 números");
		System.out.println("2 - Diferença de 2 números");
		System.out.println("3 - Produto entre 2 números");
		System.out.println("4 - Divisão entre 2 números");
		int ops = leitor.nextInt();
		switch (ops) {
		case 1:
			System.out.println("Informe o primeiro valor: ");
			double num1 = leitor.nextDouble();
			System.out.println("Informe o segundo valor:");
			double num2 = leitor.nextDouble();
			System.out.println("O resultado da soma é: " + (num1 + num2));
			break;
		case 2:
			System.out.println("Informe o primeiro valor: ");
			num1 = leitor.nextDouble();
			System.out.println("Informe o segundo valor:");
			num2 = leitor.nextDouble();
			if (num1 > num2)
			{
				System.out.println("O resultado da subtração é: " + (num1 - num2));
			}
			else
			{
				System.out.println("Erro de entrada");
			}
			break;
		case 3:
			System.out.println("Informe o primeiro valor: ");
			num1 = leitor.nextDouble();
			System.out.println("Informe o segundo valor:");
			num2 = leitor.nextDouble();
			System.out.println("O resultado da multiplicação é: " + (num1 * num2));
			break;
		case 4:
			System.out.println("Informe o primeiro valor: ");
			num1 = leitor.nextDouble();
			System.out.println("Informe o segundo valor:");
			num2 = leitor.nextDouble();
			if (num2 > 0)
			{
				System.out.println("O resultado da subtração é: " + (num1 / num2));
			}
			else
			{
				System.out.println("Erro de entrada");
			}
			break;
		default:
			System.out.println("Erro de entrada.");
			break;
		}
		leitor.close();
	}

}
