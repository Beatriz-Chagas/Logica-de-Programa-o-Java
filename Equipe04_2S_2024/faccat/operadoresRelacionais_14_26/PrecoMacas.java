package operadoresRelacionais_14_26;

import java.util.Scanner;

public class PrecoMacas {
	// Exerc�cio 16
public static void main (String [] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira o n�mero de ma��s compradas: ");
		int maca = scan.nextInt();
		double preco = 0;
		
		if (maca < 12) {
			 preco = 1.30;
		};
		
		double precoFinal = maca + preco;
		
		System.out.println("O pre�o final da ma�� �: " + precoFinal);
	}
}