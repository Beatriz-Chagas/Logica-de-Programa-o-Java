package ExerciciosSwitchCase;

import java.util.Scanner;

public class Exercicio1 {
// Dia da Semana 
// Pe�a ao usu�rio para digitar um	n�mero de 1 a 7 e, em seguida, imprima o nome do dia correspondente (1 = "Domingo", 2 = "Segunda-feira", etc.). 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira um n�mero de 1 a 7: ");
		int numero = scan.nextInt();

		switch (numero) {
		case 1:
			System.out.println("O dia 1 da semana � domingo!");
			break;
		case 2:
			System.out.println("O dia 2 da semana � segunda!");
			break;
		case 3:
			System.out.println("O dia 3 da semana � ter�a!");
			break;
		case 4:
			System.out.println("O dia 4 da semana � quarto!");
			break;
		case 5:
			System.out.println("O dia 5 da semana � quinta!");
			break;
		case 6:
			System.out.println("O dia 6 da semana � sexta!");
			break;
		case 7:
			System.out.println("O dia 7 da semana � s�bado!");
		default:
			System.out.println("Dia inv�lido.");
			break;
		}

	}

}
