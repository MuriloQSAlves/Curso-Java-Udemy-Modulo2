/*
Leia a idade e o tempo de serviço de um trabalhador e escreva se ele pode ou não se aposentar. As condições para a aposentadoria é:
Ter pelo menos 65 anos
Ou ter trabalhado pelo menos 30 anos
Ou ou ter pelo menos 60 anos e ter trabalhado 25 anos
*/
package Modulo2;
import java.util.*;
public class Exercicio22 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a idade do trabalhador: ");
		int idade = leitor.nextInt();
		System.out.println("Informe o tempo (anos) de serviço do trabalhador:");
		int tempServ = leitor.nextInt();
		if(idade >= 65 || tempServ >= 30 || idade >= 60 && tempServ >= 25)
		{
			System.out.println("O trabalhador pode se aposentar.");
		}
		else
		{
			System.out.println("O traalhador não pode se aposentar.");
		}
		leitor.close();
	}
}
