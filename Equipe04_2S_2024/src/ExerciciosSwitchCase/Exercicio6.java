package ExerciciosSwitchCase;

import java.util.Scanner;

public class Exercicio6 {
	//Escolha de Bebida 

	//Crie um programa onde o usu�rio escolhe uma bebida pelo n�mero: 
	//Caf�, Ch�, Suco 
	//Refrigerante Use switch case para exibir a bebida escolhida. 

	  
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Escolha uma das op��es de bebida: ");
	System.out.println("|1 - Caf� |2 - Ch� |3 - Suco|");
	int num = scan.nextInt();
			
	switch (num) {
	case 1:
		System.out.println("Voc� escolheu caf�!");
		break;
	case 2:
		System.out.println("Voc� escolheu ch�!");
		break;
	case 3:
		System.out.println("Voc� escolheu suco!");
		break;
		default:
			System.out.println("Essa bebida n�o est� dispon�vel.");
	}
	}

}
