/*
Leia o sal�rio de um trabalhador e o valor da presta��o de um empr�stimo. Se a presta��o for maior que 20% do valor do sal�rio imprima: Empr�stimo n�o concedido., caso contr�rio imprima: Empr�stimo concedido.
*/
package Modulo2;
import java.util.*;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o sal�rio do trabalhador: ");
		double salario = leitor.nextDouble();
		System.out.println("Informe o valor da presta��o: ");
		double prestacao = leitor.nextDouble();
		if (prestacao > (salario * 20 / 100))
		{
			System.out.println("Empr�stimo n�o concedido.");
		}
		else
		{
			System.out.println("Empr�stimo concedido.");
		}
		leitor.close();
	}
}
