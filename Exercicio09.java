/*
Leia o salário de um trabalhador e o valor da prestação de um empréstimo. Se a prestação for maior que 20% do valor do salário imprima: Empréstimo não concedido., caso contrário imprima: Empréstimo concedido.
*/
package Modulo2;
import java.util.*;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o salário do trabalhador: ");
		double salario = leitor.nextDouble();
		System.out.println("Informe o valor da prestação: ");
		double prestacao = leitor.nextDouble();
		if (prestacao > (salario * 20 / 100))
		{
			System.out.println("Empréstimo não concedido.");
		}
		else
		{
			System.out.println("Empréstimo concedido.");
		}
		leitor.close();
	}
}
