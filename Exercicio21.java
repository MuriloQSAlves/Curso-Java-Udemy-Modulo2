/*
Escreva o menu de op��es abaixo. Leia a op��o do usu�rio e execute a opera��o escolhida. Escreva uma mensagem de erro se a op��o for inv�lida.
Escolha a op��o:
1- soma de 2 n�meros
2- Diferen�a de 2 n�meros(maior pelomenor)
3- produto entre 2 n�meros
4- divis�o enre 2 n�meros(O denominador n�o pode ser 0)
*/
package Modulo2;
import java.util.*;
public class Exercicio21 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		System.out.println("Escolha a op��o: ");
		System.out.println("1 - Soma de 2 n�meros");
		System.out.println("2 - Diferen�a de 2 n�meros");
		System.out.println("3 - Produto entre 2 n�meros");
		System.out.println("4 - Divis�o entre 2 n�meros");
		int ops = leitor.nextInt();
		switch (ops) {
		case 1:
			System.out.println("Informe o primeiro valor: ");
			double num1 = leitor.nextDouble();
			System.out.println("Informe o segundo valor:");
			double num2 = leitor.nextDouble();
			System.out.println("O resultado da soma �: " + (num1 + num2));
			break;
		case 2:
			System.out.println("Informe o primeiro valor: ");
			num1 = leitor.nextDouble();
			System.out.println("Informe o segundo valor:");
			num2 = leitor.nextDouble();
			if (num1 > num2)
			{
				System.out.println("O resultado da subtra��o �: " + (num1 - num2));
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
			System.out.println("O resultado da multiplica��o �: " + (num1 * num2));
			break;
		case 4:
			System.out.println("Informe o primeiro valor: ");
			num1 = leitor.nextDouble();
			System.out.println("Informe o segundo valor:");
			num2 = leitor.nextDouble();
			if (num2 > 0)
			{
				System.out.println("O resultado da subtra��o �: " + (num1 / num2));
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
