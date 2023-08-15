/*
Um produto vai sofrer aumento de acordo com a tabela abaixo. Leia o preço antigo,
calcule e escreva o preço novo, e escreva uma mensagem em função do preço novo(de 
acordo com a segunda tela).
PREÇO ANTIGO				PREÇO NOVO
Até 50,00						5%
Entre 50,00 e 100,00			10%
Acima de 100,00					15%
*/
package Modulo2;
import java.util.*;
public class Exercicio33 {
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o preço do produto: ");
		double preco = leitor.nextDouble();
		if(preco < 50)
		{
			System.out.println("O preço do produto com o acrescimo de 5% é de: R$" + (preco + (preco * 5 / 100)));
		}
		else if(preco >= 50 && preco <= 100)
		{
			System.out.println("O preço do produto com o acrescimo de 10% é de: R$" + (preco + (preco * 10 / 100)));
		}
		else
		{
			System.out.println("O preço do produto com o acrescimo de 15% é de: R$" + (preco + (preco * 15 / 100)));
		}
		leitor.close();
	}
}
