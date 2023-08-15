/*
Faça um programa que leia 3 números inteiros positivos e efetue o cálculo de uma das seguintes médias de acordo com o valor numérico digitado pelo usuário:
a) Geométrica: Math.cbrt((x * y * z))
b) Ponderada: (x + 2 * y + 3 * z) / 6
c) Harmônica: ((1/x) + (1/y) + (1/z)) / 1
d) Aritimética: (x + y + z) / 3
*/
package Modulo2;
import java.util.*;
public class Exercicio28 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o primeiro número: ");
		double numA = leitor.nextDouble();
		System.out.println("Informe o segundo número: ");
		double numB = leitor.nextDouble();
		System.out.println("Informe o terceiro número: ");
		double numC = leitor.nextDouble();
		System.out.println("Informe qual cálculo será efetuado: ");
		System.out.println("1- Média Geométrica");		
		System.out.println("2- Média Ponderada");		
		System.out.println("3- Média Harmônica");
		System.out.println("4- Média Aritimética");
		int ops = leitor.nextInt();
		switch (ops) {
		case 1:
			System.out.println("A média geométrica é: " + Math.cbrt(numA * numB * numC));			
			break;
		case 2:
			System.out.println("A média ponderada é: " + ((numA + 2 * numB + 3 * numC) / 6));			
			break;
		case 3:
			System.out.println("A média ponderada é: " + (((1/numA) + (1/numB) + (1/numC)) / 1));			
			break;
		case 4:
			System.out.println("A média ponderada é: " + ((numA + numB + numC) / 3));			
			break;
		default:
			System.out.println("Erro de entrada.");
			break;
		}	
		leitor.close();
	}
}
