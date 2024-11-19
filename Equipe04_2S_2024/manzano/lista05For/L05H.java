package lista05For;

import java.util.Scanner;

public class L05H {

	public static void main (String [] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira o valor da base da potência: ");
		int base = scan.nextInt();
		System.out.println("Insira o valor do expoente da potência: ");
		int expoente = scan.nextInt();
		
		float resultado = (float) Math.pow(base, expoente);
		
		System.out.println("A potencia de "+ base +" ^ "+ expoente+" = "+ resultado);
	}
}
