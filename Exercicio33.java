/*
Um produto vai sofrer aumento de acordo com a tabela abaixo. Leia o pre�o antigo,
calcule e escreva o pre�o novo, e escreva uma mensagem em fun��o do pre�o novo(de 
acordo com a segunda tela).
PRE�O ANTIGO				PRE�O NOVO
At� 50,00						5%
Entre 50,00 e 100,00			10%
Acima de 100,00					15%
*/
package Modulo2;
import java.util.*;
public class Exercicio33 {
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o pre�o do produto: ");
		double preco = leitor.nextDouble();
		if(preco < 50)
		{
			System.out.println("O pre�o do produto com o acrescimo de 5% � de: R$" + (preco + (preco * 5 / 100)));
		}
		else if(preco >= 50 && preco <= 100)
		{
			System.out.println("O pre�o do produto com o acrescimo de 10% � de: R$" + (preco + (preco * 10 / 100)));
		}
		else
		{
			System.out.println("O pre�o do produto com o acrescimo de 15% � de: R$" + (preco + (preco * 15 / 100)));
		}
		leitor.close();
	}
}
