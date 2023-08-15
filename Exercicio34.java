/*
Leia a nota e o número de faltas de um aluno, e escreva seu conceito. De acordo com a
tabela abaixo, quando o aluno tem mais de 20 faltas ocorre uma redução no conceito.
NOTA            CONCEITO     CONCEITO mais de 20 faltas
9.0 até 10.0        A           B
7.5 até 8.9         B           C
5.0 até 7.4         C           D
4.0 até 4.9         D           E
0.0 até 3.9         E           E
*/
package Modulo2;
import java.util.*;
public class Exercicio34 {
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a nota do aluno:");
		double notas = leitor.nextDouble();
		System.out.println("Informe a quantidade faltas do aluno: ");
		int faltas = leitor.nextInt();
		if(faltas <= 20)
		{
			if(notas >= 0 && notas <= 3.9)
			{
				System.out.println("Conceito E");
			}
			else if(notas >= 4 && notas <= 4.9)
			{
				System.out.println("Conceito D");
			}
			else if(notas >= 5 && notas <= 7.4)
			{
				System.out.println("Conceito C");
			}
			else if(notas >= 7.5 && notas <= 8.9)
			{
			    System.out.println("Conceito B");
			}
			else if(notas >= 9 && notas <= 10)
			{
				System.out.println("Conceito A");
			}
			else
			{
				System.out.println("Errode Entrada!");
			}
		}
		else if(faltas > 20)
		{
			if(notas >= 0 && notas <= 3.9)
			{
				System.out.println("Conceito E");
			}
			else if(notas >= 4 && notas <= 4.9)
			{
				System.out.println("Conceito E");
			}
			else if(notas >= 5 && notas <= 7.4)
			{
				System.out.println("Conceito D");
			}
			else if(notas >= 7.5 && notas <= 8.9)
			{
			    System.out.println("Conceito C");
			}
			else if(notas >= 9 && notas <= 10)
			{
				System.out.println("Conceito B");
			}
			else
			{
				System.out.println("Errode Entrada!");
			}
		}
		else
		{
			System.out.println("Errode Entrada!");
		}
		leitor.close();
	}

}
