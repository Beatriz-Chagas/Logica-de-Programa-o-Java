package exemplo_Proa;

import java.util.Scanner;

public class MetodoParametros {

	static void checarIdade(int idade) {
		
		if (idade < 18) {
			System.out.println("Acesso negado - Voc� � jovem demais!");
		} else {
			System.out.println("Acesso permitido - Voc� tem a idade necess�ria!");
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Insia a idade para verifica��o: ");
		int idade = scan.nextInt();
		
		checarIdade(idade);

	}

}
