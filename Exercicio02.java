package Modulo2;
/*
Leia um número fornecido pelo usuário. S esse número for positivo, calcule a raiz quadrada deste número. Se o número for negativo, mostre uma mensagem dizendo que o número é iválido.
*/
import java.util.*;
public class Exercicio02 {	
		public static void main(String[]args)
		{
			Scanner leitor = new Scanner(System.in);
			System.out.println("Informe um número:");
			double num = leitor.nextDouble();
			if (num > 0)
			{
				 num = Math.sqrt(num);
			     System.out.println(num);
			}
			else
			{
				System.out.println("O número é inválido.");
			}
			leitor.close();
		}	

}
