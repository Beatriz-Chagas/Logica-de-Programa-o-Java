package operadoresLogicos1_11;

import java.util.Scanner;
//Exerc�cio 5.1
public class Antecessor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira um valor qualquer: ");
		int numero = scan.nextInt();
		int resultado = numero - 1;

		System.out.println("O n�mero antecessor de " + numero + " � " + resultado);

	}

}