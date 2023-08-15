package Modulo2;
/*
Fa�a um programa que leia duas notas de um aluno, verifique se as notas s�o v�lidas e exiba na tela a m�dia das notas. Uma nota v�lida deve ser um valor entre 0.0 e 10.0, onde caso a nota n�o possua um valor v�lido, este fato deve ser informado ao usus�rio e o programa deve terminar. 
*/
import java.util.*;
public class Exercicio08 {
	public static void main(String[]args){
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a primeira nota do aluno:");
		double nota1 = leitor.nextDouble();		
		if (nota1 < 0)
		{
			System.out.println("Entrada inv�lida.");
		}
		else
		{
			System.out.println("Informe a segunda nota do aluno: ");
			double nota2 = leitor.nextDouble();
			if (nota2 < 0)
			{
				System.out.println("Entrada inv�lida.");
			}
			else
			{				
				System.out.println("A m�dia do aluno �: " + ((nota1 + nota2) / 2));												
			}				
		}
		
		leitor.close();		
	}

}

