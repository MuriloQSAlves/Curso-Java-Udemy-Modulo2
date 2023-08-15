/*
Faça um programa que mostre ao ususário um menu com 4 opções de operações matemática (as básicas por exemplo). O usuário escolhe uma das opções e seu programa então pede 2 números e realiza a operação, mostrando o resultado e saindo.
*/
package Modulo2;
import java.util.*;
public class Exercicio18 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escolha a operação desejada: ");
		System.out.println("(1) Soma");
		System.out.println("(2) Subtração");
		System.out.println("(3) Multiplicação");
		System.out.println("(4) Divisão");
		int ops = leitor.nextInt();
		switch (ops) {
		case 1:
			System.out.println("Informe o primeiro número: ");
			int num1 = leitor.nextInt();
			System.out.println("Informe o segundo número: ");
			int num2 = leitor.nextInt();
			double total = num1 + num2;
			System.out.println("A soma de: " + num1 + " mais " + num2 + " é: " + total);
			break;
		case 2:
			System.out.println("Informe o primeiro número: ");
			num1 = leitor.nextInt();
			System.out.println("Informe o segundo número: ");
			num2 = leitor.nextInt();
			total = num1 - num2;
			System.out.println("A subtração de: " + num1 + " menos " + num2 + " é: " + total);
			break;
		case 3:
			System.out.println("Informe o primeiro número: ");
			num1 = leitor.nextInt();
			System.out.println("Informe o segundo número: ");
			num2 = leitor.nextInt();
			total = num1 * num2;
			System.out.println("A multiplicação de: " + num1 + " por " + num2 + " é: " + total);
			break;
		case 4:
			System.out.println("Informe o primeiro número: ");
			num1 = leitor.nextInt();
			System.out.println("Informe o segundo número: ");
			num2 = leitor.nextInt();
			total = num1 / num2;
			System.out.println("A divisão de: " + num1 + " por " + num2 + " é: " + total);
			break;
		default:
			System.out.println("Erro de entrada.");
			break;
		}
		leitor.close();
	}	

}
