/*
Uma empresa decide dar um aumento aos seus funcionários de acordo com uma tabela
que considera o salário atual e o tempo de serviço de cada funcionário. Os funcionários
com menor salário terão um aumento proporcionalmente maior do que os funcionários
com um salário maior, e conforme o tempo de serviço na empresa, cada funcionário irá
receber um bonus adicional de salário. Faça um programa que leia:
* O valor do salário atual do funcionário;
* O tempo de serviço desse funcionário na empresa (Nº de anos)
Use as tabelas abaixo para calcular o salário reajustado deste funcionário e imprima o
valor do salário final reajustado, ou uma mensagem caso o funcionário não tenha direito
a nenhum aumento.

SALÁRIO ATUAL     REAJUSTE(%)   TEMPO DE SERVIÇO    BONUS
Até 500,00            25%       Abaixo de 1 ano   Sem bonus
Até 500,00            20%       De 1 a 3 anos     100,00
Até 500,00            15%       De 4 a 6 anos     200,00
Até 500,00            10%       De 7 a 10 anos    300,00

Até 1000,00           25%       Abaixo de 1 ano   Sem bonus
Até 1000,00           20%       De 1 a 3 anos     100,00
Até 1000,00           15%       De 4 a 6 anos     200,00
Até 1000,00           10%       De 7 a 10 anos    300,00

Até 1500,00           25%       Abaixo de 1 ano   Sem bonus
Até 1500,00           20%       De 1 a 3 anos     100,00
Até 1500,00           15%       De 4 a 6 anos     200,00
Até 1500,00           10%       De 7 a 10 anos    300,00


Acima de 2000,00  Sem reajuste  Abaixo de 1 ano   Sem bonus
Acima de 2000,00  Sem reajuste  De 1 a 3 anos     100,00
Acima de 2000,00  Sem reajuste  De 4 a 6 anos     200,00
Acima de 2000,00  Sem reajuste  De 7 a 10 anos    300,00
*/
package Modulo2;
import java.util.*;
public class Exercicio39 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o valor do salário do funcionário: ");
		double salAtual = leitor.nextDouble();
		System.out.println("Informe o tempo de serviço do funcionário (anos): ");
		int tempServico = leitor.nextInt();
		
		if(salAtual <= 500.00)
		{
			if(tempServico < 1)
			{
				System.out.println("O Salário do funcionário será de: " + (salAtual + (salAtual * 25 / 100)));
			}
			 else if(tempServico >= 1 && tempServico <= 3)
			 {
				System.out.println("O Salário do funcionário será de: " + (salAtual + (salAtual * 25 / 100) + 100));
			 }				
		     else if(tempServico >= 4 && tempServico <= 6)
		     {
		        System.out.println("O Salário do funcionário será de: " + (salAtual + (salAtual * 25 / 100) + 200));
		     }
		     else if(tempServico >= 7 && tempServico <= 10)
		     {
		        System.out.println("O Salário do funcionário será de: " + (salAtual + (salAtual * 25 / 100) + 300));
		     }
		}
		else if(salAtual > 500 && salAtual <= 1000)
		{
			 if(tempServico < 1)
		      {
		        System.out.println("O Salário do funcionário será de: " + (salAtual + (salAtual * 20 / 100)));       
		      }
		      else if(tempServico >= 1 && tempServico <= 3)
		      {
		        System.out.println("O Salário do funcionário será de: " + (salAtual + (salAtual * 20 / 100) + 100));
		      }
		      else if(tempServico >=4 && tempServico <= 6)
		      {
		        System.out.println("O Salário do funcionário será de: " + (salAtual + (salAtual * 20 / 100) + 200));
		      }
		      else if(tempServico >= 7 && tempServico <= 10)
		      {
		        System.out.println("O Salário do funcionário será de: " + (salAtual + (salAtual * 20 / 100) + 300));
		      }
		}
		else if(salAtual <= 1500)
	    {
	    	if(tempServico < 1)
	    	{
		        System.out.println("O Salário do funcionário será de: " + (salAtual + (salAtual * 15 / 100)));     
	    	}
	    	else if(tempServico >= 1 && tempServico <= 3)
	    	{
	    		System.out.println("O Salário do funcionário será de: " + (salAtual + (salAtual * 15 / 100) + 100));
	    	}
	    	else if(tempServico >=4 && tempServico <= 6)
	    	{
	    		System.out.println("O Salário do funcionário será de: " + (salAtual + (salAtual * 15 / 100) + 200));
	    	}
	    	else if(tempServico >= 7 && tempServico <= 10)
	    	{
	    		System.out.println("O Salário do funcionário será de: " + (salAtual + (salAtual * 15 / 100) + 300));
		    }
	    }
		else if(salAtual <= 2000)
	    {
	    	if(tempServico < 1)
	    	{
	    		System.out.println("O Salário do funcionário será de: " + (salAtual + (salAtual * 10 / 100)));
	    	}
	    	else if(tempServico >= 1 && tempServico <= 3)
	    	{
		        System.out.println("O Salário do funcionário será de: " + (salAtual + (salAtual * 10 / 100) + 100));
		    }
	    	else if(tempServico >= 4 && tempServico <= 6)
	    	{
		        System.out.println("O Salário do funcionário será de: " + (salAtual + (salAtual * 10 / 100) + 200));
		    }
	    	else if(tempServico >= 7 && tempServico <= 10)
	    	{
		        System.out.println("O Salário do funcionário será de: " + (salAtual + (salAtual * 10 / 100) + 300));
		    }	    	
	    }
		else
		{
			if(tempServico < 1)
			{
				System.out.println("O Salário do funcionário será de: " + (salAtual));
			}
			else if(tempServico >= 1 && tempServico <= 3)
			{
		        System.out.println("O Salário do funcionário será de: " + (salAtual + 100)); 
			}
			else if(tempServico >= 4 && tempServico <= 6)
			{
				System.out.println("O Salário do funcionário será de: " + (salAtual + 200));
			}
			else if(tempServico >= 7 && tempServico <= 10)
			{
				System.out.println("O Salário do funcionário será de: " + (salAtual + 300));
			}
			 else
			 {
				 System.out.println("O Salário do funcionário será de: " + (salAtual + 500)); 
			 }
		}
		leitor.close();
	  }
	}