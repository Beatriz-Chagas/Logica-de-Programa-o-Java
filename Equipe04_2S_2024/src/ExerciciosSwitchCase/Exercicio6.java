package ExerciciosSwitchCase;

import java.util.Scanner;

public class Exercicio6 {
	//Escolha de Bebida 

	//Crie um programa onde o usuário escolhe uma bebida pelo número: 
	//Café, Chá, Suco 
	//Refrigerante Use switch case para exibir a bebida escolhida. 

	  
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Escolha uma das opções de bebida: ");
	System.out.println("|1 - Café |2 - Chá |3 - Suco|");
	int num = scan.nextInt();
			
	switch (num) {
	case 1:
		System.out.println("Você escolheu café!");
		break;
	case 2:
		System.out.println("Você escolheu chá!");
		break;
	case 3:
		System.out.println("Você escolheu suco!");
		break;
		default:
			System.out.println("Essa bebida não está disponível.");
	}
	}

}
