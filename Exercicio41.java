/*
Faça um algoritmo que calcule o IMC de uma pessoa e mostre sua classificação de
acordo com a tabela abaixo:
  IMC         CLASSIFICAÇÃO
< 18,5        Abaixo do Peso
18,6 - 24,9   Saudável
25,0 - 29,9   Peso em excesso
30,0 - 34,9   Obesidade Grau I
35,0 - 39,9   Obesidade Grau II (Severa)
>= 40,0       Obesidade Grau III (Morbida)
*/
package Modulo2;
import java.util.Scanner;
public class Exercicio41 {
	public static void main (String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe seu peso: ");
		double peso = leitor.nextDouble();
		System.out.println("Informe sua altura: ");
		double altura = leitor.nextDouble();
		
		double imc = peso / (altura * altura);
		//System.out.println(imc);
		
		if(imc <= 18.5)
		{
			System.out.println("Abaixo do peso.");
		}
		else if(imc > 18.5 && imc < 25 )
		{
			System.out.println("Saldável.");
		}
		else if(imc >= 25 && imc < 30)
		{
			System.out.println("Peso em excesso.");
		}
		else if(imc >= 30 && imc < 35)
		{
			System.out.println("Obesidade grau I");
		}
		else if(imc >=35 && imc < 59)
		{
			System.out.println("Obesidade grau II (Severa)");
		}
		else
		{
			System.out.println("Oesidade grau III (Mórbida");
		}
		leitor.close();
	}
}
