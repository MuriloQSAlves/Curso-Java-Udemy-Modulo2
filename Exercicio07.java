package Modulo2;
/*
Fa�a um programa que receba dois n�meros e mostre o maior. Se por acaso os dois n�meros forem iguais, apresente a mensagem: n�meros iguais.
*/
import java.util.*;
public class Exercicio07 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o primeiro valor: ");
		int num1 = leitor.nextInt();
		System.out.println("Informe o segundo valor: ");
		int num2 = leitor.nextInt();
		if(num1 > num2)
		{
			System.out.println(num1 + " e amior que " + num2);
		}
		else if(num1 < num2)
		{
			System.out.println(num2 + " � maior que " + num1);
		}
		else
		{
			System.out.println("Os n�meros s�o iguais.");
		}
		leitor.close();
	}

}
