package operadoresLogicos1_11;

import java.util.Scanner;

public class Quadrado {
	// Exerc�cio 6.2
	public static void main (String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira o valor de um lado do quadrado: ");
		float lado = scan.nextFloat();
		float area = lado * 4;
		
		System.out.println("O valor da �rea do quadrado �: "+ area);
		
		
	}
}