/*
Escreva um programa que, dado o valor da venda, imprima a comissão que deverá ser
paga ao vendedor. Para calcular a comissão, considere a tabela abaixo:
VENDA MENSAL                      COMISSÃO
>= 100.000,00                 700,00 + 16% DAS VENDAS
< 100.000,00 E >= 80.000,00   650,00 + 14% DAS VENDAS
< 80.0000,00 E >= 60.000,00   600,00 + 14% DAS VENDAS
< 60.000,00 E >= 40.000,00    550,00 + 14% DAS VENDAS
< 40.000,00 E >= 20.000,00    500,00 + 14% DAS VENDAS
< 20.000,00                   400,00 + 14% DAS VENDAS
*/
package Modulo2;
import java.util.Scanner;
public class Exercicio36 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o valor da venda mensal:");
		double valor = leitor.nextDouble();
		if(valor >= 100000 )
		{
			double comissao = 700 + (16 * valor / 100);
			System.out.println("A comissão do vendedor será de: R$" + comissao);
		}
		leitor.close();
		if(valor < 100000 && valor >= 80000)
		{
			double comissao = 650 + (14 * valor / 100);
			System.out.println("A comissão do vendedor será de: R$" + comissao);
		}
		if(valor < 80000 && valor >= 60000)
		{
			double comissao = 600 + (14 * valor / 100);
			System.out.println("A comissão do vendedor será de: R$" + comissao);
		}
		else if(valor < 60000 && valor >= 40000)
		{
			double comissao = 550 + (14 * valor / 100);
			System.out.println("A comissão do vendedor será de: R$" + comissao);
		}
		else if(valor < 40000 && valor >= 20000)
		{
			double comissao = 500 + (14 * valor / 100);
			System.out.println("A comissão do vendedor será de: R$" + comissao);
		}
		else if(valor < 20000)
		{
			double comissao = 400 + (14 * valor / 100);
			System.out.println("A comissao do vendedor será de: R$" + comissao);
		}		
	}

}
