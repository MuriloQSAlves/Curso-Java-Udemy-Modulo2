package Modulo2;
/*
Escreva um programa que, dado dois n�meros inteiros, mostre na tela o maior deles, assim como a diferen�a entre ambos.
*/
import java.util.*;
public class Exercicio06 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o primeiro valor: ");
		int num1 = leitor.nextInt();
		System.out.println("Informe o segundo valor: ");
		int num2 = leitor.nextInt();
		if(num1 > num2)
		{
			System.out.println(num1 + " � maior que " + num2 + " e a diferen�a � de: " + (num1 - num2));
		}
		else if(num1 < num2)
		{
			System.out.println(num2 + " � maior que " + num1 + " e a diferen�a � de " + (num2 - num1));
		}
		leitor.close();
	}

}
