package operadoresRelacionais_14_26;

import java.util.Scanner;

public class MaiorValor {
	// Exerc�cio 19

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira dois valores inteiros: ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();

		int maior = Math.max(n1, n2);

		System.out.println("O maior n�mero �: " + maior);
	}
}