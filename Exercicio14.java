/*
A nota final de um estudante � calculada a partir de 3 notas atribu�das entre o intervalo de 0 at� 10, respectivamente, a um trabalho de laborat�rio, a uma avalia��o semestral e a um exame final. A m�dia das 3 notas mencionadas anteriormente obedece aos pesos: Trabalho de Laborat�rio: 2; Avalia��o: 3; Exame Final: 5. De acordo com o resultado, mostre na tela se o aluno est� reprovado (m�dia entre 0 e 2,9), de recupera��o (entre 3 e 4,9), ou se foi aprovado. Fa�a todas as verifica��es necess�rias.
*/
package Modulo2;
import java.util.*;
public class Exercicio14 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a nota do traalho de lavorat�rio: ");
		double notaLab = leitor.nextDouble();		
		System.out.println("Informe a nota da avalia��o semestral: ");
		double notaSem = leitor.nextDouble();
		System.out.println("Informe a nota da avalia��o final: ");
		double notaFin = leitor.nextDouble();
		double media = ((notaLab * 2) + (notaSem * 3) + (notaFin * 5)) / 10;
		if (media >= 0 && media <= 2.9)
		{			
		    System.out.println("O aluno foi reprovado! Com a m�dia de:" + media);
		}
		else if(media >= 3 && media <= 4.9)
		{
		    System.out.println("O aluno est� de recupera��o! Com a m�dia de: " + media);
		}
		else if (media >= 5)
		{
		    System.out.println("O aluno est� aprovado! Com a m�dia de: " + media);
		}
		else
		{
			System.out.println("Erro de entrada.");
		}
		leitor.close();
	}
}
