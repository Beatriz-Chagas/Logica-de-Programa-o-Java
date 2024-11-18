package operadoresLogicos1_11;

import java.util.Scanner;

public class Retangulo {
	// Exercício 6.1
	public static void main (String [] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira a base e altura do retângulo: ");
		float base = scan.nextFloat();
		float altura = scan.nextFloat();
		
		float area = base * altura;
		
		System.out.println("A área do retângulo é: ");
		
	}
}
