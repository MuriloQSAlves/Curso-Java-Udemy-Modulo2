/*
Usando um switch, escreva um programa que leia um inteiro entre 1 e 12 e imprima o mês correspondente aeste número. Isto é Janeiro = 1, Fevereiro = 2, e assim por diante.
*/
package Modulo2;
import java.util.*;
public class Exercicio16 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o mês (1 a 12)");
		int mes = leitor.nextInt();
		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
		      System.out.println("Fevereiro");
		      break;		      
		case 3:
		      System.out.println("Março");
		      break;
		case 4:
		      System.out.println("Abril");
		      break;
		case 5:
		      System.out.println("Maio");
		      break;
		case 6:
		      System.out.println("junho");
		      break;
		case 7:
		      System.out.println("Julho");
		      break;
		case 8:
		      System.out.println("Agosto");
		      break;
		case 9:
		      System.out.println("Setembro");
		      break;
		case 10:
		      System.out.println("Outubro");
		      break;
		case 11:
		      System.out.println("Novembro");
		      break;
		case 12:
		      System.out.println("Dezembro");
		      break;
		default:
		      System.out.println("Erro de entrada.");
		      break;
		}
		leitor.close();
	}
}
