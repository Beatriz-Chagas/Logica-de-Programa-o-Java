package ExerciciosSwitchCase;

import java.util.Scanner;

public class Exercicio1 {
// Dia da Semana 
// Peça ao usuário para digitar um	número de 1 a 7 e, em seguida, imprima o nome do dia correspondente (1 = "Domingo", 2 = "Segunda-feira", etc.). 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira um número de 1 a 7: ");
		int numero = scan.nextInt();

		switch (numero) {
		case 1:
			System.out.println("O dia 1 da semana é domingo!");
			break;
		case 2:
			System.out.println("O dia 2 da semana é segunda!");
			break;
		case 3:
			System.out.println("O dia 3 da semana é terça!");
			break;
		case 4:
			System.out.println("O dia 4 da semana é quarto!");
			break;
		case 5:
			System.out.println("O dia 5 da semana é quinta!");
			break;
		case 6:
			System.out.println("O dia 6 da semana é sexta!");
			break;
		case 7:
			System.out.println("O dia 7 da semana é sábado!");
		default:
			System.out.println("Dia inválido.");
			break;
		}

	}

}
