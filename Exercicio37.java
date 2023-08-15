/*
As tarifas de certo parque de estacionamento são as seguintes:
* 1ª e 2ª hora - R$1,00 cada
* 3ª e 4ª hora - R$1,40 cada
* 5ª hora e seguintes - R$2,00 cada
O número de horas a pagar é sempre inteiro e arrendondado por excesso. Deste modo,
quem estacionar durante 61 minutos pagará por duas horas, que é o mesmo que pagaria
se tivesse permanecido 120 minutos. Os momentos de chegada ao parque e partida
deste são apresentados na forma de pares de inteiros, representando horas e minutos.
Por exemplo, o par 12 50 representará "dez para uma da tarde". Pretende-se criar um
programa que, lido pelo teclado os momentos de chegada e de partida. escreva na tela 
o preço cobrado pelo estacionamento. Admite-se que a chegada e a partida se dão com
intervalo não superior a 24 horas. Portanto, se uma data hora de chegada for superior 
à da partida, isso não é uma situação de erro, antes significará que a partida ocorreu 
no dia seguinte ao da chegada.
*/
package Modulo2;
import java.util.Scanner;
public class Exercicio37 {
	public static void main (String[]args)
	{
		double valor = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o dia: ");
		int diaEntrada = leitor.nextInt();
		System.out.println("Informe a hora da entrada: ");
		int horaEntrada = leitor.nextInt();
		System.out.println("Informe os minuto da entrada: ");
		int minutoEntrada = leitor.nextInt();
				
		System.out.println("Informe o dia da saida: ");
		int diaSaida = leitor.nextInt();
		System.out.println("Informe a hora da saída: ");
		int horaSaida = leitor.nextInt();
		System.out.println("Informe os minutos da saída: ");
		int minutoSaida = leitor.nextInt();
				
		System.out.println("Hora da entrada: " + horaEntrada + ":" + minutoEntrada);
		System.out.println("Hora da saída: " + horaSaida + ":" + minutoSaida);
		int calcDia = diaSaida - diaEntrada;
		int calcHora = horaSaida - horaEntrada;
	    int calcMin = calcHora * 60;
	    int minTotal = calcMin + (minutoEntrada - minutoSaida);
	    System.out.println("Tempo total: " + calcDia + " Dias, " + calcHora + " Horas, " + (minutoEntrada - minutoSaida) + " Minutos.");
	    
	    if (calcDia == 0)
	    {
	    	if (calcMin <= 120){
	    	      if(minTotal <= 60){
	    	        valor = 1.00;
	    	        System.out.println("O total a pagar é de: R$" + valor);
	    	      }
	    	      else{
	    	        valor = 2.00;
	    	        System.out.println("O total a pagar é de: R$" + valor);
	    	      }      
	    	    }
	    	    else if(calcMin <= 240){
	    	      if(minTotal <= 180){
	    	        valor = 1.40 + 2.00;
	    	        System.out.println("O total a pagar é de: R$" + valor);
	    	      }
	    	      else{
	    	        valor = 2.80 + 2.00;
	    	        System.out.println("O total a pagar é de: R$" + valor);
	    	      }
	    	    }
	    	    else{
	    	      if(minTotal %60 == 0){
	    	        valor = 2.00 + 2.80 + (calcHora - 4) * 2.00;
	    	        System.out.println("O total a pagar é de: R$" + valor);
	    	      } 
	    	      else{
	    	        valor = 2.00 + 2.80 + 2.00 + (calcHora - 4) * 2.00; //2.00(2 primeiras horas) + 2.80 (3ª e 4ª hora) + 2.00 (fração de hora excedente) + (total de horas - 4 horas) * 2.00
	    	        System.out.println("O total a pagar é de: R$" + valor);
	    	      }    
	    	    }
	    }
	    else if (calcDia >= 1)
	    {
	    	 if(minTotal %60 == 0){
	    	        valor = 2.00 + 2.80 + (calcHora - 4 + (calcDia * 24)) * 2.00;
	    	        System.out.println("O total a pagar é de: R$" + valor);
	    	      } 
	    	      else{
	    	        valor = 2.00 + 2.80 + 2.00 + (calcHora - 4 + (calcDia * 24)) * 2.00; //2.00(2 primeiras horas) + 2.80 (3ª e 4ª hora) + 2.00 (fração de hora excedente) + (total de horas - 4 horas) * 2.00
	    	        System.out.println("O total a pagar é de: R$" + valor);
	    	      }    
	    }
	    else
	    {
	    	System.out.println("Erro!");
	    }

	    leitor.close();
	    }	    
	  }
	
