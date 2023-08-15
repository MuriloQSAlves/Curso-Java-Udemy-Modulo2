package Modulo2;
/*
Faça um programa que leia duas notas de um aluno, verifique se as notas são válidas e exiba na tela a média das notas. Uma nota válida deve ser um valor entre 0.0 e 10.0, onde caso a nota não possua um valor válido, este fato deve ser informado ao ususário e o programa deve terminar. 
*/
import java.util.*;
public class Exercicio08 {
	public static void main(String[]args){
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a primeira nota do aluno:");
		double nota1 = leitor.nextDouble();		
		if (nota1 < 0)
		{
			System.out.println("Entrada inválida.");
		}
		else
		{
			System.out.println("Informe a segunda nota do aluno: ");
			double nota2 = leitor.nextDouble();
			if (nota2 < 0)
			{
				System.out.println("Entrada inválida.");
			}
			else
			{				
				System.out.println("A média do aluno é: " + ((nota1 + nota2) / 2));												
			}				
		}
		
		leitor.close();		
	}

}

