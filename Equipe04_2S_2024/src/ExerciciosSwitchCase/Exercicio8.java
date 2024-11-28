package ExerciciosSwitchCase;

import java.util.Scanner;

public class Exercicio8 {
// Conversor de Temperatura 

//Crie um programa que converta a temperatura de Celsius para Fahrenheit e vice-versa. O usu�rio deve escolher a convers�o: 

//Celsius para Fahrenheit 
//Fahrenheit para Celsius 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("----------------------------");
		System.out.println("   CONVERS�O DE TEMPERATURA");
		System.out.println("----------------------------");

		System.out.println("Qual convers�o voc� gostaria de fazer? ");
		System.out.println("|1 - Celcius para Farenheit|2 - Farenheint para Celcius|");
		int conversao = scan.nextInt();
		System.out.println("Qual o valor da convers�o?");
		double temperatura = scan.nextDouble();
		double resultado = 0;

		switch (conversao) {
		case 1:
			resultado = temperatura * 1.8 + 32;
			System.out.println("O resultado da convers�o � "+ resultado + " �F");
			break;
		case 2:
			resultado = (temperatura - 32) / 1.8;
			System.out.println("O resultado da convers�o � "+ resultado+ "�C");
			break;
		default:
			System.out.println("Convers�o inv�lida!");
		}


	}

}
