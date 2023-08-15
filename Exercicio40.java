/*
O custo ao consumidor de um carro novo � a soma do custo de f�brica, da comiss�o
do distribuidor, e dos impostos. A comiss�o e os impostos sobre o custo
de f�brica, de acordo com a tabela abaixo. Leia o custo de f�brica e escreva o custo ao
consumidor.

CUSTO DE F�BRICA      % DO DISTRIBUIDOR % DOS IMPOSTOS
At� 12.000,00                 5               isento
De 12.000,00 a 25.000,00      10              15
Acima 25.000,00               15              20
*/
package Modulo2;
import java.util.Scanner;
public class Exercicio40 {
	public static void main(String[] Args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o custo de f�brica: ");
		double custoFabrica = leitor.nextDouble();
		
		if(custoFabrica < 12000)
		{
			System.out.println("O custo ao consumido do ve�culo ser� de: " + (custoFabrica + (custoFabrica * 5 / 100)) + " acrescido de 5% de taxa do distribuidor e isento de imposto");
		}
		else if (custoFabrica >= 12000 && custoFabrica <= 25000)
		{
			System.out.println("O custo ao consumido do ve�culo ser� de: " + (custoFabrica + (custoFabrica * 10 / 100) + (custoFabrica * 15 / 100)) + " acrescido de 5% de taxa do distribuidor e isento de imposto");
		}
		else if (custoFabrica > 25000)
		{
			System.out.println("O custo ao consumido do ve�culo ser� de: " + (custoFabrica + (custoFabrica * 15 / 100) + (custoFabrica * 20 / 100)) + " acrescido de 5% de taxa do distribuidor e isento de imposto");
		}
		leitor.close();
	}
}
