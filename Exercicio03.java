package Modulo2;
/*
Leia um número real. Se o número for positivo, imprima a raiz quadrada, do contrário imprima o número ao quadrado
*/
import java.util.*;
public class Exercicio03 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número: ");
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
