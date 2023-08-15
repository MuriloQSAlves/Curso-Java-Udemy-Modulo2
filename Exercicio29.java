/*
Faça uma prova de matemática para crianças que estão aprendendo a somar números inteiros menores que 100. Escolha númros aleatórios entre 1 e 100 e mostre na tela a pergunta: Qual a soma entre a e b, onde a e b são os números aleatórios. Peça a resposta. Faça 5 perguntas ao aluno e mostre para ele as perguntas e as respostas corretas, além de quantas vezes o aluno acertou.
*/
package Modulo2;
import java.util.Scanner;
import java.util.Random;
public class Exercicio29 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int total, resp, acer = 0, erro = 0;
		Random a = new Random();
		Random b = new Random();
		for(int i = 0; i <= 5; i++)
		{
			int random_a = a.nextInt(100);
			int random_b = b.nextInt(100);
			System.out.println("Quanto é " + random_a + " + " + random_b + "?");
			resp = leitor.nextInt();
			total = random_a + random_b;
			if ( resp == total){
		        System.out.println("Resposta certa!");
		        acer ++;
		      }
			else
			{
				System.out.println("Resposta errada! O correto é: " + total);
				erro ++;
			}			
		}
		System.out.println("Você acertou " + acer + " e errou " + erro);
		leitor.close();
	}
}
