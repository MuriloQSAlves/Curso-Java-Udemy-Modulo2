package Modulo2;
/*
Faça um programa que leia um número e, caso ele seja positivo, calcule e mostre:
O número digitado ao quadrado
A raiz quadrada do número digitado
*/
import java.util.*;
public class Exercicio04 {
public static void main(String[]args)
{
	double num;
	Scanner leitor = new Scanner(System.in);
	System.out.println("Informe um número: ");
	num = leitor.nextDouble();
	if(num > 0)
	{	
	    System.out.println("O quadrado é: " + (Math.pow(num, 2)) + " e a raiz quadrada é: " + (Math.sqrt(num)));
	}
	leitor.close();
 }
}
