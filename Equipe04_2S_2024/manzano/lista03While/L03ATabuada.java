package lista03While;

import java.util.Scanner;

public class L03ATabuada {
// Exerc�cio 1
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira um n�mero para visualizar sua tabuada: ");
		
		int numero = scan.nextInt();
		
		System.out.println("Tabuada do n�mero " + numero);
		
		int contador = 0;
		
		
		while (contador < 11) {
			System.out.println(numero + " X " + contador + " = " + numero * contador);
			contador++;
		}

		scan.close();
	}

}
