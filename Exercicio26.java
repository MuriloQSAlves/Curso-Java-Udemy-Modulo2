/*
Leia a dist�ncia em Km e a quantidade de litros de gasolina consumidos por um carro em um percurso, calcule o consumo em Km/L e escreva uma mensagem de acordo com a tabela abaixo:
CONSUMO      KM/L     MENSAGEM
Menor que     8       Venda o carro
Entre       8 e 14    Econ�mico
Maior que     14      Super econ�mico
*/
package Modulo2;
import java.util.Scanner;
public class Exercicio26 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a dist�ncia percorrida: ");
		double dist = leitor.nextDouble();
		System.out.println("Informe a quantidade de gasolina consumida: ");
		double cons = leitor.nextDouble();
		double consumo = dist / cons;
		if(consumo < 8)
		{
			 System.out.println("O carro possui uma autonomia de " + consumo + " Km/L, Venda o Carro.");
		}
		else if(consumo >= 8 && consumo <= 14)
		{
			System.out.println("O carro possui uma autonomia de " + consumo + " Km/L, O Carro � econ�mico.");
		}
		else if(consumo > 14)
		{
			System.out.println("O carro possui uma autonomia de " + consumo + " Km/L, O Carro super econ�mico.");      
		}
		else
		{
			System.out.println("Erro!");
		}
		leitor.close();		
	}
}
