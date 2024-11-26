package ExerciciosSwitchCase;

import java.util.Scanner;

public class Exercicio4 {
//Menu de Opções 

//Implemente um menu de opções onde o usuário pode escolher entre 3 opções: 
//Exibir "Olá, Mundo!" 
//Exibir "Bem-vindo ao C#" 
//Sair do programa 
//Utilize switch case para executar a opção escolhida. 
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("-------------------------------------");
		System.out.println("          MENU DE OPÇÕES");
		System.out.println("-------------------------------------");
		System.out.println("Escolha umas das opções: ");
		System.out.println("|1 - Primeira Saudação|"	+ " 2 - Segunda saudação|"+ " 3 - Sair do programa|");
	
		int escolha = scan.nextInt();
		
		switch (escolha) {
		case 1:
			System.out.println("Você escolheu a saudação 1. Olá MUndo!");
			break;
		case 2:
			System.out.println("Você escolheu a saudação 2. Seja bem vindo ao Java!");
			break;
		case 3:
			System.out.println("Você escolheu a opção saída. Até mais!");
			break;
		 default:
			 System.out.println("Esta não é uma opção de escolha válida, tente novamente.");
			
		}
	
	}

}
