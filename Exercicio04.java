package Modulo2;
/*
Fa�a um programa que leia um n�mero e, caso ele seja positivo, calcule e mostre:
O n�mero digitado ao quadrado
A raiz quadrada do n�mero digitado
*/
import java.util.*;
public class Exercicio04 {
public static void main(String[]args)
{
	double num;
	Scanner leitor = new Scanner(System.in);
	System.out.println("Informe um n�mero: ");
	num = leitor.nextDouble();
	if(num > 0)
	{	
	    System.out.println("O quadrado �: " + (Math.pow(num, 2)) + " e a raiz quadrada �: " + (Math.sqrt(num)));
	}
	leitor.close();
 }
}
