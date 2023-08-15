/*
Fa�a um programa que calcule e mostre a �rea de um trap�sio. Sabe-se que: A = ((baseMaior + baesMenor) * altura) / 2.
Lembre-se que a base maior e menor devem ser n�meros maiores que zero.
*/
package Modulo2;
import java.util.Scanner;
public class Exercicio17 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a altura do trap�sio: ");
		double altura = leitor.nextDouble();		
		System.out.println("Informe a largura da base maior: ");
		double baseMaior = leitor.nextDouble();
		if(baseMaior < 0)
		{
			System.out.println("Erro de entrada.");
		}
		else
		{
			System.out.println("Informe a largura da base menor: ");
			double baseMenor = leitor.nextDouble();
			if(baseMenor < 0 || baseMenor == baseMaior || baseMenor > baseMaior)
			{
				System.out.println("Erros de entrada.");
			}
			else
			{
				double area = ((baseMaior + baseMenor) * altura) / 2;
				System.out.println("A �rea do trap�sio � de: " + area);
			}
		}
		leitor.close();		
	}
}