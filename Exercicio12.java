/*
Ler um n�mero inteiro. Se o n�mero for negativo escreva a mensagem: N�mero inv�lido. Se o n�mero for positivo calcular o logaritimo deste n�mero
*/
package Modulo2;
import java.util.Scanner;
public class Exercicio12 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um n�mero: ");
		int num = leitor.nextInt();
		if (num < 0)
		{
			System.out.println("N�mero inv�lido.");
		}
		else
		{
			System.out.println("O logaritimo de " + num + " �: " + Math.log(num));
		}
		leitor.close();
	}

}
