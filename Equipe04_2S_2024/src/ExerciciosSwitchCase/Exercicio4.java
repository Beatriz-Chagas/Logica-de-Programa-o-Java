package ExerciciosSwitchCase;

import java.util.Scanner;

public class Exercicio4 {
//Menu de Op��es 

//Implemente um menu de op��es onde o usu�rio pode escolher entre 3 op��es: 
//Exibir "Ol�, Mundo!" 
//Exibir "Bem-vindo ao C#" 
//Sair do programa 
//Utilize switch case para executar a op��o escolhida. 
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("-------------------------------------");
		System.out.println("          MENU DE OP��ES");
		System.out.println("-------------------------------------");
		System.out.println("Escolha umas das op��es: ");
		System.out.println("|1 - Primeira Sauda��o|"	+ " 2 - Segunda sauda��o|"+ " 3 - Sair do programa|");
	
		int escolha = scan.nextInt();
		
		switch (escolha) {
		case 1:
			System.out.println("Voc� escolheu a sauda��o 1. Ol� MUndo!");
			break;
		case 2:
			System.out.println("Voc� escolheu a sauda��o 2. Seja bem vindo ao Java!");
			break;
		case 3:
			System.out.println("Voc� escolheu a op��o sa�da. At� mais!");
			break;
		 default:
			 System.out.println("Esta n�o � uma op��o de escolha v�lida, tente novamente.");
			
		}
	
	}

}
