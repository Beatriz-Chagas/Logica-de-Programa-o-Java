package operadoresLogicos1_11;

import java.util.Scanner;

public class Sucessor {
	// Exercício 5.2
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira um valor qualquer: ");
		int numero = scan.nextInt();
		int resultado = numero + 1;

		System.out.println("O número sucessor de " + numero + " é " + resultado);

	}

}
