package operadoresLogicos1_11;

import java.util.Scanner;

public class Subtracao {
	// Exerc�cio 2
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira um valor: ");
		int numero = scan.nextInt();
		System.out.println("Insira outro valor: ");
		int numero2 = scan.nextInt();
		int subtracao = numero - numero2;

		System.out.println("A subtra��o dos valores �: " + subtracao);

	}

}
