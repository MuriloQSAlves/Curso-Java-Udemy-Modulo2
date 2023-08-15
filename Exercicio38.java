/*
Leia uma data de nascimento de uma pessoa fornecida atrav�s de tr�s n�meros inteiros: Dia, M�s e Ano. Teste a validade desta data para saber se esta � v�lida. Teste se o dia fornecido � um dia v�lido: dia > 0, dia <= 28 para o m�s de fevereiro (29 se for bissexto), dia <= 30 em abril, junho, setembro e novembro, dia <=31 nos outros meses. Teste avalidade do m�s: m�s > 0 e m�s < 13. Teste a validade do ano: ano <= ano atual. Imprima a "data v�lida" ou "data inv�lida" no final da execu��o.
*/
package Modulo2;
import java.util.*;
public class Exercicio38 {
	public static void main(String[]args)
	{
		
		Scanner leitor = new Scanner(System.in);
		//coleta de dados
		System.out.println("Informe o dia de nascimento: ");
		int dia = leitor.nextInt();
		System.out.println("Informe o m�s de nascimento: ");
		int mes = leitor.nextInt();
		System.out.println("Informe o ano de nascimentos: ");
		int ano = leitor.nextInt();
		
		//valida��es
		if(ano <= 2023)
		{
			if(mes == 2)
			{
				if(ano %400 == 0 || ano %4 ==0 && ano %100 != 0)
				{
					if(dia > 0 && dia <= 29)
					{
						System.out.println("Sua data de nascimento � v�lida: " + dia + "/" + mes + "/" + ano );
					}
					else
					{
						System.out.println("Erro de entrada");
					}
				}
			}
			else if(mes == 4 || mes == 6 || mes == 9 || mes == 11)
			{
				if(dia > 0 && dia <= 30)
				{
					System.out.println("Sua data de nascimento � v�lida: " + dia + "/" + mes + "/" + ano );
				}
				else
				{
					System.out.println("Data inv�lida!");
				}
			}
			else if(mes == 1 || mes == 3 || mes == 5|| mes == 7 || mes == 8 || mes == 10 || mes == 12)
			{
				if(dia > 0 && dia <= 31)
				{
					System.out.println("Sua data de nascimento � v�lida: " + dia + "/" + mes + "/" + ano );
				}
				else
				{
					System.out.println("Data inv�lida!");
				}
			}
		}
		else
		{
			System.out.println("Data inv�lida!");
		}
		leitor.close();		
	}

}
