package Modulo2;
/*
Leia um n�mero real. Se o n�mero for positivo, imprima a raiz quadrada, do contr�rio imprima o n�mero ao quadrado
*/
import java.util.*;
public class Exercicio03 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um n�mero: ");
		double num = leitor.nextDouble();
		if (num > 0)
		{
			num = Math.sqrt(num);
		    System.out.println(num);
		}
		else
		{
			num = Math.pow(num, 2);
		    System.out.println(num);
		}
		leitor.close();
	}

}
