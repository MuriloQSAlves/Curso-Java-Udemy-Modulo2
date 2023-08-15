/*
Dado 3 valores A, B, C, verificar se eles podem ser valores dos lados de um triângulo escaleno, equilátero ou isósceles, considerando os seguintes conceitos.
O comprimento de cada lado de um triângulo é menor do que a somados outros dois lados
Chama-se equilátero o triângulo que tem 3 lados iguais
denominam-se isósceles o triângulo que tem o comprimento de dois lados iguais
Recebe o nome de escaleno o triâgulo que tem os três lados diferentes
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
			System.out.println("É um triângulo equilátero.");
		}
		else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC)
		{
			System.out.println("É um triângulo isósceles.");
		}
		else if(ladoA != ladoB || ladoA != ladoC || ladoB != ladoC )
		{
			System.out.println("É um triângulo escaleno.");
		}
		else
		{
			System.out.println("Errode entrada.");
		}
		leitor.close();
	}

}
