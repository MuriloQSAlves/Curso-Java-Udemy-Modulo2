//Faça um programa que receba 3 números inteiros e mostre-os em ordem crescente
package Modulo2;
import java.util.*;
public class Exercicio30 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o primeiro número:");
		int num1 = leitor.nextInt();
		System.out.println("Informe o segundo número:");
		int num2 = leitor.nextInt();
		System.out.println("informe o terceito número:");
		int num3 = leitor.nextInt();
		if(num1 > num2 && num2 > num3)
		{
			System.out.println(num1+ "" + num2 + "" + num3);
		}
		else if(num1 > num3 && num3 > num2)
		{
			System.out.println(num1 + "" + num3 + "" + num2);
		}
		else if(num2 > num1 && num1 > num3)
		{
			System.out.println(num2 + "" + num1 + "" + num3);
		}
		else if(num2 > num3 && num3 > num1)
		{
			System.out.println(num2 + "" + num3 + "" + num1);
		}
		else if(num3 > num2 && num2 > num1)
		{
			System.out.println(num3 + "" + num2 + "" + num1);
		}
		else if(num3 > num1 && num1 > num2)
		{
			System.out.println(num3 + "" + num1 + "" + num2);
		}
		leitor.close();
	}
}
