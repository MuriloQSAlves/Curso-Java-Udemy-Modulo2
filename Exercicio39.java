/*
Uma empresa decide dar um aumento aos seus funcion�rios de acordo com uma tabela
que considera o sal�rio atual e o tempo de servi�o de cada funcion�rio. Os funcion�rios
com menor sal�rio ter�o um aumento proporcionalmente maior do que os funcion�rios
com um sal�rio maior, e conforme o tempo de servi�o na empresa, cada funcion�rio ir�
receber um bonus adicional de sal�rio. Fa�a um programa que leia:
* O valor do sal�rio atual do funcion�rio;
* O tempo de servi�o desse funcion�rio na empresa (N� de anos)
Use as tabelas abaixo para calcular o sal�rio reajustado deste funcion�rio e imprima o
valor do sal�rio final reajustado, ou uma mensagem caso o funcion�rio n�o tenha direito
a nenhum aumento.

SAL�RIO ATUAL     REAJUSTE(%)   TEMPO DE SERVI�O    BONUS
At� 500,00            25%       Abaixo de 1 ano   Sem bonus
At� 500,00            20%       De 1 a 3 anos     100,00
At� 500,00            15%       De 4 a 6 anos     200,00
At� 500,00            10%       De 7 a 10 anos    300,00

At� 1000,00           25%       Abaixo de 1 ano   Sem bonus
At� 1000,00           20%       De 1 a 3 anos     100,00
At� 1000,00           15%       De 4 a 6 anos     200,00
At� 1000,00           10%       De 7 a 10 anos    300,00

At� 1500,00           25%       Abaixo de 1 ano   Sem bonus
At� 1500,00           20%       De 1 a 3 anos     100,00
At� 1500,00           15%       De 4 a 6 anos     200,00
At� 1500,00           10%       De 7 a 10 anos    300,00


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
		System.out.println("Informe o valor do sal�rio do funcion�rio: ");
		double salAtual = leitor.nextDouble();
		System.out.println("Informe o tempo de servi�o do funcion�rio (anos): ");
		int tempServico = leitor.nextInt();
		
		if(salAtual <= 500.00)
		{
			if(tempServico < 1)
			{
				System.out.println("O Sal�rio do funcion�rio ser� de: " + (salAtual + (salAtual * 25 / 100)));
			}
			 else if(tempServico >= 1 && tempServico <= 3)
			 {
				System.out.println("O Sal�rio do funcion�rio ser� de: " + (salAtual + (salAtual * 25 / 100) + 100));
			 }				
		     else if(tempServico >= 4 && tempServico <= 6)
		     {
		        System.out.println("O Sal�rio do funcion�rio ser� de: " + (salAtual + (salAtual * 25 / 100) + 200));
		     }
		     else if(tempServico >= 7 && tempServico <= 10)
		     {
		        System.out.println("O Sal�rio do funcion�rio ser� de: " + (salAtual + (salAtual * 25 / 100) + 300));
		     }
		}
		else if(salAtual > 500 && salAtual <= 1000)
		{
			 if(tempServico < 1)
		      {
		        System.out.println("O Sal�rio do funcion�rio ser� de: " + (salAtual + (salAtual * 20 / 100)));       
		      }
		      else if(tempServico >= 1 && tempServico <= 3)
		      {
		        System.out.println("O Sal�rio do funcion�rio ser� de: " + (salAtual + (salAtual * 20 / 100) + 100));
		      }
		      else if(tempServico >=4 && tempServico <= 6)
		      {
		        System.out.println("O Sal�rio do funcion�rio ser� de: " + (salAtual + (salAtual * 20 / 100) + 200));
		      }
		      else if(tempServico >= 7 && tempServico <= 10)
		      {
		        System.out.println("O Sal�rio do funcion�rio ser� de: " + (salAtual + (salAtual * 20 / 100) + 300));
		      }
		}
		else if(salAtual <= 1500)
	    {
	    	if(tempServico < 1)
	    	{
		        System.out.println("O Sal�rio do funcion�rio ser� de: " + (salAtual + (salAtual * 15 / 100)));     
	    	}
	    	else if(tempServico >= 1 && tempServico <= 3)
	    	{
	    		System.out.println("O Sal�rio do funcion�rio ser� de: " + (salAtual + (salAtual * 15 / 100) + 100));
	    	}
	    	else if(tempServico >=4 && tempServico <= 6)
	    	{
	    		System.out.println("O Sal�rio do funcion�rio ser� de: " + (salAtual + (salAtual * 15 / 100) + 200));
	    	}
	    	else if(tempServico >= 7 && tempServico <= 10)
	    	{
	    		System.out.println("O Sal�rio do funcion�rio ser� de: " + (salAtual + (salAtual * 15 / 100) + 300));
		    }
	    }
		else if(salAtual <= 2000)
	    {
	    	if(tempServico < 1)
	    	{
	    		System.out.println("O Sal�rio do funcion�rio ser� de: " + (salAtual + (salAtual * 10 / 100)));
	    	}
	    	else if(tempServico >= 1 && tempServico <= 3)
	    	{
		        System.out.println("O Sal�rio do funcion�rio ser� de: " + (salAtual + (salAtual * 10 / 100) + 100));
		    }
	    	else if(tempServico >= 4 && tempServico <= 6)
	    	{
		        System.out.println("O Sal�rio do funcion�rio ser� de: " + (salAtual + (salAtual * 10 / 100) + 200));
		    }
	    	else if(tempServico >= 7 && tempServico <= 10)
	    	{
		        System.out.println("O Sal�rio do funcion�rio ser� de: " + (salAtual + (salAtual * 10 / 100) + 300));
		    }	    	
	    }
		else
		{
			if(tempServico < 1)
			{
				System.out.println("O Sal�rio do funcion�rio ser� de: " + (salAtual));
			}
			else if(tempServico >= 1 && tempServico <= 3)
			{
		        System.out.println("O Sal�rio do funcion�rio ser� de: " + (salAtual + 100)); 
			}
			else if(tempServico >= 4 && tempServico <= 6)
			{
				System.out.println("O Sal�rio do funcion�rio ser� de: " + (salAtual + 200));
			}
			else if(tempServico >= 7 && tempServico <= 10)
			{
				System.out.println("O Sal�rio do funcion�rio ser� de: " + (salAtual + 300));
			}
			 else
			 {
				 System.out.println("O Sal�rio do funcion�rio ser� de: " + (salAtual + 500)); 
			 }
		}
		leitor.close();
	  }
	}