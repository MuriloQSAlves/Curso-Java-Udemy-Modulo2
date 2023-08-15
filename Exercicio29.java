/*
Fa�a uma prova de matem�tica para crian�as que est�o aprendendo a somar n�meros inteiros menores que 100. Escolha n�mros aleat�rios entre 1 e 100 e mostre na tela a pergunta: Qual a soma entre a e b, onde a e b s�o os n�meros aleat�rios. Pe�a a resposta. Fa�a 5 perguntas ao aluno e mostre para ele as perguntas e as respostas corretas, al�m de quantas vezes o aluno acertou.
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
			System.out.println("Quanto � " + random_a + " + " + random_b + "?");
			resp = leitor.nextInt();
			total = random_a + random_b;
			if ( resp == total){
		        System.out.println("Resposta certa!");
		        acer ++;
		      }
			else
			{
				System.out.println("Resposta errada! O correto �: " + total);
				erro ++;
			}			
		}
		System.out.println("Voc� acertou " + acer + " e errou " + erro);
		leitor.close();
	}
}
