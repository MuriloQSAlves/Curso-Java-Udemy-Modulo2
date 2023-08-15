/*
Escreva um programa que dada a idade de um nadador, classifiuque-o em uma das categorias:
CATEGORIA         IDADE   
infantil A        5 a 7
Infantil B        8 a 10
Juvenil A         11 a 13
Juvenil B         14 a 17
Sênior            Maior de 18
*/
package Modulo2;
import java.util.*;
public class Exercicio27 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a idade do nadador: ");
		int idade = leitor.nextInt();
		if(idade >= 5 && idade <= 7)
		{
			System.out.println("Infantil A");
		}
		else if(idade >= 8 && idade <= 10)
		{
			System.out.println("Infantil B");
		}
		else if(idade >= 11 && idade <= 13)
		{
			System.out.println("Juvenil A");
		}
		else if(idade >= 14 && idade <= 17)
		{
			System.out.println("Juvenil B");
		}
		else if(idade >= 18)
		{
			System.out.println("Sênior");
		}
		else
		{
			System.out.println("O nadador não tem idade suficiente.");
		}
		leitor.close();
	}
}
