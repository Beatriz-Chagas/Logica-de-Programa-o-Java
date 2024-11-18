package lista05For;

import java.util.Scanner;
 
public class L05B {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira um número qualquer para obter a tabuada até 10: ");
		int numero = scan.nextInt();
		System.out.println("Tabuada do número "+ numero);
		for(int contador = 0; contador <11; contador++ ) {
			
			System.out.println(contador+" X "+numero +" = "+ contador * numero);
		}
	}
 
}