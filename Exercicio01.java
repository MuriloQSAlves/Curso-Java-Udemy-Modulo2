package Modulo2;
/*
Faça um programa que receba 2 números e mostre quais deles é o maior
*/
import java.util.*;
public class Exercicio01 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o primeiro número: ");
		int num1 = leitor.nextInt();
		System.out.println("Informe o segundo número: ");
		int num2 = leitor.nextInt();
		if (num1 > num2)
		{
			System.out.println(num1 + " é maior.");
		}
		else if (num1 < num2)
		{
			System.out.println(num2 + " é maior.");
		}
		else
		{
			System.out.println("Os números são iguais.");
		}
			leitor.close();		
	}

}
