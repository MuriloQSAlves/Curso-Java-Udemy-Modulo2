package Modulo2;
/*
Leia um n�mero fornecido pelo usu�rio. S esse n�mero for positivo, calcule a raiz quadrada deste n�mero. Se o n�mero for negativo, mostre uma mensagem dizendo que o n�mero � iv�lido.
*/
import java.util.*;
public class Exercicio02 {	
		public static void main(String[]args)
		{
			Scanner leitor = new Scanner(System.in);
			System.out.println("Informe um n�mero:");
			double num = leitor.nextDouble();
			if (num > 0)
			{
				 num = Math.sqrt(num);
			     System.out.println(num);
			}
			else
			{
				System.out.println("O n�mero � inv�lido.");
			}
			leitor.close();
		}	

}
