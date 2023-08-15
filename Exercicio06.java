package Modulo2;
/*
Escreva um programa que, dado dois números inteiros, mostre na tela o maior deles, assim como a diferença entre ambos.
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
			System.out.println(num1 + " é maior que " + num2 + " e a diferença é de: " + (num1 - num2));
		}
		else if(num1 < num2)
		{
			System.out.println(num2 + " é maior que " + num1 + " e a diferença é de " + (num2 - num1));
		}
		leitor.close();
	}

}
