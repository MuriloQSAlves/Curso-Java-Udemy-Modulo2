/*
Faça um programa que receba a altura e o peso de uma pessoa. De acordo com a tabela
a seguir, verifique e mostre qual a classificação dessa pessoa.
*/
package Modulo2;
import java.util.*;
public class Exercicio31 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe sua altura:");
		double altura = leitor.nextDouble();
		System.out.println("Informe seu peso:");
		double peso = leitor.nextDouble();
		if(altura < 1.20)
		{
			if(peso < 60)
			{
				System.out.println("Categoria A");
			}
			else if(peso >= 60 && peso <= 90)
			{
				System.out.println("Categoria D");
			}
			else
			{
				System.out.println("Categoria G");
			}
		}
		else if(altura >= 1.20 && peso <= 1.70)
		{
			if(peso < 60)
			{
				System.out.println("Categoria B");
			}
			else if(peso >= 60 && peso <= 90)
			{
				System.out.println("Categoria E");
			}
			else
			{
				System.out.println("Categoria H");
			}
		}
		else
		{
			if(peso < 60)
			{
				System.out.println("Categoria C");
			}
			else if(peso >= 60 && peso <= 90)
			{
				System.out.println("Categoria F");
			}
			else
			{
				System.out.println("Categoria I");
			}
		}
		leitor.close();
	}

}
