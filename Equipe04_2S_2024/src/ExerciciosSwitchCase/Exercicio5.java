package ExerciciosSwitchCase;

import java.util.Scanner;

public class Exercicio5 {
//Pe�a ao usu�rio para inserir uma nota de 0 a 10 e, com base na nota, imprima a classifica��o: 

//9 a 10: "A" 
//7 a 8: "B" 
//5 a 6: "C" 
//3 a 4: "D" 
//0 a 2: "F" 
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira um valor inteiro de uma nota de 0 � 10: ");
		int nota = scan.nextInt();
		
		switch (nota) {
		case 0, 1, 2:
			System.out.println("Esta nota est� na classifica��o F!");
		break;
		case 3, 4:
			System.out.println("Esta nota est� classificada como D!");
		break;
		case 5, 6:
			System.out.println("Esta nota est� classificada como C!");
		break;
		case 7, 8:
			System.out.println("Esta nota est� classificada como B!");
		break;
		case 9, 10:
			System.out.println("Esta nota est� classificada como A!");
		break;
		default:
			System.out.println("Esta nota � inv�lida!");
		}

	}

}
