package Modulo2;
/*
Fa�a um programa que receba 2 n�meros e mostre quais deles � o maior
*/
import java.util.*;
public class Exercicio01 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o primeiro n�mero: ");
		int num1 = leitor.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		int num2 = leitor.nextInt();
		if (num1 > num2)
		{
			System.out.println(num1 + " � maior.");
		}
		else if (num1 < num2)
		{
			System.out.println(num2 + " � maior.");
		}
		else
		{
			System.out.println("Os n�meros s�o iguais.");
		}
			leitor.close();		
	}

}
