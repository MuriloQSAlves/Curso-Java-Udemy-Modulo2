/*
Faça um programa que receba a altura e o sexo de uma pessoa, calcule e mostre seu peso ideal. Utilize a seguinte fórmula:
Homens (72.7 * alt) - 58
Mulheres (62.1 * alt) - 44.7
*/
package Modulo2;
import java.util.*;
public class Exercicio10 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o sexo (H Homem, M Mulher): ");
		char sexo = leitor.next().charAt(0);
		System.out.println("Informe a altura: ");
		double altura = leitor.nextDouble();
		if (sexo == 'H' || sexo == 'h')
		{
			double peso = (72.7 * altura) - 58;
			System.out.println("O peso ideal é: " + peso);
		}
		else if (sexo == 'M' || sexo == 'm')
		{
			double peso = (62.1 * altura) - 44.7;
			System.out.println("O peso ideal é: " + peso);
		}
		else
		{
			System.out.println("error");
		}
		leitor.close();
	}

}
