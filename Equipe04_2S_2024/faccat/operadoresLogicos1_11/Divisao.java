package operadoresLogicos1_11;

import java.util.Scanner;

public class Divisao {
	// Exercício 4
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira um valor: ");
		float numero = scan.nextFloat();
		System.out.println("Insira outro valor: ");
		float numero2 = scan.nextFloat();
		float divisao = numero / numero2;

		System.out.println("A divisao dos valores é: " + divisao);

	}

}
