/*
Fa�a um programa que mostre ao usus�rio um menu com 4 op��es de opera��es matem�tica (as b�sicas por exemplo). O usu�rio escolhe uma das op��es e seu programa ent�o pede 2 n�meros e realiza a opera��o, mostrando o resultado e saindo.
*/
package Modulo2;
import java.util.*;
public class Exercicio18 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escolha a opera��o desejada: ");
		System.out.println("(1) Soma");
		System.out.println("(2) Subtra��o");
		System.out.println("(3) Multiplica��o");
		System.out.println("(4) Divis�o");
		int ops = leitor.nextInt();
		switch (ops) {
		case 1:
			System.out.println("Informe o primeiro n�mero: ");
			int num1 = leitor.nextInt();
			System.out.println("Informe o segundo n�mero: ");
			int num2 = leitor.nextInt();
			double total = num1 + num2;
			System.out.println("A soma de: " + num1 + " mais " + num2 + " �: " + total);
			break;
		case 2:
			System.out.println("Informe o primeiro n�mero: ");
			num1 = leitor.nextInt();
			System.out.println("Informe o segundo n�mero: ");
			num2 = leitor.nextInt();
			total = num1 - num2;
			System.out.println("A subtra��o de: " + num1 + " menos " + num2 + " �: " + total);
			break;
		case 3:
			System.out.println("Informe o primeiro n�mero: ");
			num1 = leitor.nextInt();
			System.out.println("Informe o segundo n�mero: ");
			num2 = leitor.nextInt();
			total = num1 * num2;
			System.out.println("A multiplica��o de: " + num1 + " por " + num2 + " �: " + total);
			break;
		case 4:
			System.out.println("Informe o primeiro n�mero: ");
			num1 = leitor.nextInt();
			System.out.println("Informe o segundo n�mero: ");
			num2 = leitor.nextInt();
			total = num1 / num2;
			System.out.println("A divis�o de: " + num1 + " por " + num2 + " �: " + total);
			break;
		default:
			System.out.println("Erro de entrada.");
			break;
		}
		leitor.close();
	}	

}
