/*
Fa�a um programa que leia 3 n�meros inteiros positivos e efetue o c�lculo de uma das seguintes m�dias de acordo com o valor num�rico digitado pelo usu�rio:
a) Geom�trica: Math.cbrt((x * y * z))
b) Ponderada: (x + 2 * y + 3 * z) / 6
c) Harm�nica: ((1/x) + (1/y) + (1/z)) / 1
d) Aritim�tica: (x + y + z) / 3
*/
package Modulo2;
import java.util.*;
public class Exercicio28 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o primeiro n�mero: ");
		double numA = leitor.nextDouble();
		System.out.println("Informe o segundo n�mero: ");
		double numB = leitor.nextDouble();
		System.out.println("Informe o terceiro n�mero: ");
		double numC = leitor.nextDouble();
		System.out.println("Informe qual c�lculo ser� efetuado: ");
		System.out.println("1- M�dia Geom�trica");		
		System.out.println("2- M�dia Ponderada");		
		System.out.println("3- M�dia Harm�nica");
		System.out.println("4- M�dia Aritim�tica");
		int ops = leitor.nextInt();
		switch (ops) {
		case 1:
			System.out.println("A m�dia geom�trica �: " + Math.cbrt(numA * numB * numC));			
			break;
		case 2:
			System.out.println("A m�dia ponderada �: " + ((numA + 2 * numB + 3 * numC) / 6));			
			break;
		case 3:
			System.out.println("A m�dia ponderada �: " + (((1/numA) + (1/numB) + (1/numC)) / 1));			
			break;
		case 4:
			System.out.println("A m�dia ponderada �: " + ((numA + numB + numC) / 3));			
			break;
		default:
			System.out.println("Erro de entrada.");
			break;
		}	
		leitor.close();
	}
}
