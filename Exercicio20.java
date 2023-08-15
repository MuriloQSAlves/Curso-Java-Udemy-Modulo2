/*
Dado 3 valores A, B, C, verificar se eles podem ser valores dos lados de um tri�ngulo escaleno, equil�tero ou is�sceles, considerando os seguintes conceitos.
O comprimento de cada lado de um tri�ngulo � menor do que a somados outros dois lados
Chama-se equil�tero o tri�ngulo que tem 3 lados iguais
denominam-se is�sceles o tri�ngulo que tem o comprimento de dois lados iguais
Recebe o nome de escaleno o tri�gulo que tem os tr�s lados diferentes
*/
package Modulo2;
import java.util.*;
public class Exercicio20 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o primeiro valor: ");
		double ladoA = leitor.nextDouble();
		System.out.println("Informe o segundo valor: ");
		double ladoB = leitor.nextDouble();
		System.out.println("Informe o terceiro valor: ");
		double ladoC = leitor.nextDouble();
		if(ladoA == ladoB && ladoB == ladoC)
		{
			System.out.println("� um tri�ngulo equil�tero.");
		}
		else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC)
		{
			System.out.println("� um tri�ngulo is�sceles.");
		}
		else if(ladoA != ladoB || ladoA != ladoC || ladoB != ladoC )
		{
			System.out.println("� um tri�ngulo escaleno.");
		}
		else
		{
			System.out.println("Errode entrada.");
		}
		leitor.close();
	}

}
