/*
Ler um número inteiro. Se o número for negativo escreva a mensagem: Número inválido. Se o número for positivo calcular o logaritimo deste número
*/
package Modulo2;
import java.util.Scanner;
public class Exercicio12 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int num = leitor.nextInt();
		if (num < 0)
		{
			System.out.println("Número inválido.");
		}
		else
		{
			System.out.println("O logaritimo de " + num + " é: " + Math.log(num));
		}
		leitor.close();
	}

}
