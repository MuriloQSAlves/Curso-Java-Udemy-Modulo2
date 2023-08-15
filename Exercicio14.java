/*
A nota final de um estudante é calculada a partir de 3 notas atribuídas entre o intervalo de 0 até 10, respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a um exame final. A média das 3 notas mencionadas anteriormente obedece aos pesos: Trabalho de Laboratório: 2; Avaliação: 3; Exame Final: 5. De acordo com o resultado, mostre na tela se o aluno está reprovado (média entre 0 e 2,9), de recuperação (entre 3 e 4,9), ou se foi aprovado. Faça todas as verificações necessárias.
*/
package Modulo2;
import java.util.*;
public class Exercicio14 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a nota do traalho de lavoratório: ");
		double notaLab = leitor.nextDouble();		
		System.out.println("Informe a nota da avaliação semestral: ");
		double notaSem = leitor.nextDouble();
		System.out.println("Informe a nota da avaliação final: ");
		double notaFin = leitor.nextDouble();
		double media = ((notaLab * 2) + (notaSem * 3) + (notaFin * 5)) / 10;
		if (media >= 0 && media <= 2.9)
		{			
		    System.out.println("O aluno foi reprovado! Com a média de:" + media);
		}
		else if(media >= 3 && media <= 4.9)
		{
		    System.out.println("O aluno está de recuperação! Com a média de: " + media);
		}
		else if (media >= 5)
		{
		    System.out.println("O aluno está aprovado! Com a média de: " + media);
		}
		else
		{
			System.out.println("Erro de entrada.");
		}
		leitor.close();
	}
}
