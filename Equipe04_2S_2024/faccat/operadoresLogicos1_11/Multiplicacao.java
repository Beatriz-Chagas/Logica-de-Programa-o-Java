package operadoresLogicos1_11;

import java.util.Scanner;

public class Multiplicacao {
	// Exerc�cio 3
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira um valor: ");
		int numero = scan.nextInt();
		System.out.println("Insira outro valor: ");
		int numero2 = scan.nextInt();
		int multiplicacao = numero * numero2;

		System.out.println("A multiplicacao dos valores �: " + multiplicacao);

	}

}
