/*
Faça um algoritmo que calcule a média ponderada das notas de 3 provas. a primeira e segunda prova em peso 1 e a terceira tem peso 2. Ao final, mostrar a média do aluno e indicar se o aluno foi aprovado ou reprovado. A nota para a aprovação deve ser igual ou superior a 60 pontos.
*/
package Modulo2;
import java.util.*;
public class Exercicio13 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("informe a primeira nota: ");
		double nota1 = leitor.nextDouble();
		System.out.println("Informe a segunda nota: ");
		double nota2 = leitor.nextDouble();
		System.out.println("Informe a treceira nota");
		double nota3 = leitor.nextDouble();		
		double media = (nota1 + nota2 + (nota3 * 2)) / 4;
		System.out.println("A média do aluno foi: " + media);
		if (media >= 60)
		{
			System.out.println("O aluno foi aprovado.");
		}
		else
		{
			System.out.println("O aluno foi reprovado.");
		}
		leitor.close();
	}

}
