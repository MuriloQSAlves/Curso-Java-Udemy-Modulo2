/*
Ecrever um programa que leia o c�digo do produto escolhido do card�pio de uma lan-
chonete e a quantidade. O programa deve calcular o valor a ser pago por aquele lanche.
Considerando que a cada execu��o somente ser� calculado um pedido. O card�pio da lan-
chonete segue o padr�o abaixo:
ESPECIFICA��O    c�digo  PRE�O
Cachorro Quente   100     1.20
Bauru Simples     101     1.30
Bauru com Ovo     102     1.50
Hamburguer        103     1.20
Cheeseburguer     104     1.70
Suco              105     2.20
Refrigerante      106     1.00
*/
package Modulo2;
import java.util.*;
public class Exercicio32 {
	public static void main(String[] args) {
		int i=1;
		double quantidade = 0, total = 0;
		Scanner leitor = new Scanner(System.in);
		
			 System.out.println("########Sistema de Lanchonete########");
				System.out.println("ESPECIFICA��O      C�DIGO     PRE�O  ");
				System.out.println("Cachorro Quente     100        1,20  ");
				System.out.println("Baur� Simples       101        1,30  ");
				System.out.println("Baur� com ovo       102        1,50  ");
				System.out.println("Hamburguer          103        1,20  ");
				System.out.println("Cheeseburguer       104        1,70  ");
				System.out.println("Suco                105        2,20  ");
				System.out.println("Refrigerante        106        1,00  ");
				 while (i > 0)
				 {
				System.out.println("Informe o pedido: ");
				int pedido = leitor.nextInt();
				switch(pedido)
				{
				case 0:
					System.out.println("Sair do Programa.");
					i = 0;
					break;
				case 100:
					System.out.println("Informe a quantidade: ");
					quantidade = leitor.nextInt();
					total = quantidade * 1.20;
					System.out.println("Foi pedido " + quantidade + " Cachorro(s) Quente(s), total a pagar: R$" + total);
					break;
				case 101:
					System.out.println("Informe a quantidade: ");
					quantidade = leitor.nextInt();
					total = quantidade * 1.30;
					System.out.println("Foi pedido " + quantidade + " Baur�(s) Simples, total a pagar: R$" + total);
					break;
				case 102:
					System.out.println("Informe a quantidade: ");
					quantidade = leitor.nextInt();
					total = quantidade * 1.50;
					System.out.println("Foi pedido " + quantidade + " Baur�(s) com Ovo(s), total a pagar: R$" + total);
					break;
				case 103:
					System.out.println("Informe a quantidade: ");
					quantidade = leitor.nextInt();
					total = quantidade * 1.20;
					System.out.println("Foi pedido " + quantidade + " Hamurguer(s), total a pagar: R$" + total);
					break;
				case 104:
					System.out.println("Informe a quantidade: ");
					quantidade = leitor.nextInt();
					total = quantidade * 1.70;
					System.out.println("Foi pedido " + quantidade + " Cheeseburger(s), total a pagar: R$" + total);
					break;
				case 105:
					System.out.println("Informe a quantidade: ");
					quantidade = leitor.nextInt();
					total = quantidade * 2.20;
					System.out.println("Foi pedido " + quantidade + " Suco(s), total a pagar: R$" + total);
					break;
				case 106:
					System.out.println("Informe a quantidade: ");
					quantidade = leitor.nextInt();
					total = quantidade * 1.00;
					System.out.println("Foi pedido " + quantidade + " Refrigerante(s), total a pagar: R$" + total);
					break;
				 default:
			        System.out.println("Erro de entrada:");              
			        break;
					
				}
		 }
		leitor.close();		
	}

}
