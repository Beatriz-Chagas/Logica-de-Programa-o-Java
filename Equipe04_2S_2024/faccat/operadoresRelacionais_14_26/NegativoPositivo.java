package operadoresRelacionais_14_26;

import java.util.Scanner;

public class NegativoPositivo {
	// Exerc�cio 15
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira um valor para saber se � positivo ou negativo: ");
		float numero = scan.nextFloat();

		if (numero < 0) {
			System.out.println("Este n�mero � negativo!");
		} else {
			System.out.println("Este n�mero � positivo!");
		}
		;

	}
}
