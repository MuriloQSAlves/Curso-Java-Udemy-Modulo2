/*
Leia uma data e determine se ela � v�lida. Ou seja, verifique se o m�s est� entre 1 e 12,
e se o dia existe naquele m�s. Note que Fevereiro tem 29 dias em anos bissextos, e 28 dias em anos n�o bissextos.
*/
package Modulo2;

import java.util.*;
public class Exercicio35 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o dia: ");
		int dia = leitor.nextInt();
		System.out.println("Informe o m�s: ");
		int mes = leitor.nextInt();
		System.out.println("Informe o ano: ");
		int ano = leitor.nextInt();
		if(ano %400 == 0 || ano %4 == 0 && ano %100 != 0){
//bissexto
			switch(mes) {
			case 1:
				if(dia >= 1 && dia <= 31)
				{
					 System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
				}
				else{
		            System.out.println("Data inv�lida!");
		          }
				break;
			case 2:
				if(dia >= 1 && dia <= 28)
				{
					System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
				}
				else
				{
					System.out.println("Data inv�lida!");				
				}
				break;
			case 3:
				if(dia >= 1 && dia <= 31)
				{
					System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
				}
				else
				{
					System.out.println("Data inv�lida!");				
				}
				break;
			case 4:
				if(dia >= 1 && dia <= 30)
				{ 
					System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
				}
				else
				{
					System.out.println("Data inv�lida!");				
				}
				break;
			case 5:
				if(dia >= 1 && dia <= 31)
				{ 
					System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
				}
				else
				{
					System.out.println("Data inv�lida!");				
				}
				break;
				case 6:
			          if(dia > 0 && dia <= 30){
			            System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
			          }
			          else{
			            System.out.println("Data inv�lida!");
			          }
			          break;
			        case 7:
			          if(dia > 0 && dia <= 31){
			            System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
			          }
			          else{
			            System.out.println("Data inv�lida!");
			          }
			          break;
			        case 8:
			          if(dia > 0 && dia <= 31){
			            System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
			          }
			          else{
			            System.out.println("Data inv�lida!");
			          }       
			          break;
			        case 9:
			          if(dia > 0 && dia <= 30){
			            System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
			          }
			          else{
			            System.out.println("Data inv�lida!");
			          }
			          break;
			        case 10:
			          if(dia > 0 && dia <= 31){
			            System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
			          }
			          else{
			            System.out.println("Data inv�lida!");
			          }    
			          break;
			        case 11:
			          if(dia > 0 && dia <= 30){
			            System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
			          }
			          else{
			            System.out.println("Data inv�lida!");
			          }  
			          break;
			        case 12:
			          if(dia > 0 && dia <= 31){
			            System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
			          }
			          else{
			            System.out.println("Data inv�lida!");
			          }
			          break;
			        default:
			          System.out.println("Dados Incorretos!");
			          break;
			      }
			    }
			    else{
			      switch(mes){
			        case 1:
			          if(dia > 0 && dia <= 31){
			            System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
			          }
			          else{
			            System.out.println("Data inv�lida!");
			          }
			          break;
			        case 2:
			          if(dia > 0 && dia <= 28){
			            System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
			          }
			          else{
			            System.out.println("Data inv�lida!");
			          }
			          break;
			        case 3:
			          if(dia > 0 && dia <= 31){
			            System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
			          }
			          else{
			            System.out.println("Data inv�lida!");
			          }
			          break;    
			        case 4:
			          if(dia > 0 && dia <= 30){
			            System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
			          }
			          else{
			            System.out.println("Data inv�lida!");
			          }  
			          break;
			        case 5:
			          if(dia > 0 && dia <= 31){
			            System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
			          }
			          else{
			            System.out.println("Data inv�lida!");
			          } 
			          break;
			        case 6:
			          if(dia > 0 && dia <= 30){
			            System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
			          }
			          else{
			            System.out.println("Data inv�lida!");
			          }
			          break;
			        case 7:
			          if(dia > 0 && dia <= 31){
			            System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
			          }
			          else{
			            System.out.println("Data inv�lida!");
			          }
			          break;
			        case 8:
			          if(dia > 0 && dia <= 31){
			            System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
			          }
			          else{
			            System.out.println("Data inv�lida!");
			          }       
			          break;
			        case 9:
			          if(dia > 0 && dia <= 30){
			            System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
			          }
			          else{
			            System.out.println("Data inv�lida!");
			          }
			          break;
			        case 10:
			          if(dia > 0 && dia <= 31){
			            System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
			          }
			          else{
			            System.out.println("Data inv�lida!");
			          }    
			          break;
			        case 11:
			          if(dia > 0 && dia <= 30){
			            System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
			          }
			          else{
			            System.out.println("Data inv�lida!");
			          }  
			          break;
			        case 12:
			          if(dia > 0 && dia <= 31){
			            System.out.println("Dia: " + dia + ", M�s: " + mes + ", ano: " + ano);
			          }
			          else{
			            System.out.println("Data inv�lida!");
			          }
			          break;
			        default:
			          System.out.println("Dados Incorretos!");
			          break;
			      }
			    }
			    leitor.close();
			  }
			}	
		
