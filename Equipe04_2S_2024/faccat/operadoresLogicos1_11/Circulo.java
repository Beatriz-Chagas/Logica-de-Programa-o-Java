package operadoresLogicos1_11;

import java.util.Scanner;

public class Circulo {
	// Exerc�cio 6.3
	public static void main (String [] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira o valor do raio: ");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2) ; 
		
		System.out.println("A �rea do circulo �: "+ area);
	}
}