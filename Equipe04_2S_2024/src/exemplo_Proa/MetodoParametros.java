package exemplo_Proa;

import java.util.Scanner;

public class MetodoParametros {

	static void checarIdade(int idade) {
		
		if (idade < 18) {
			System.out.println("Acesso negado - Você é jovem demais!");
		} else {
			System.out.println("Acesso permitido - Você tem a idade necessária!");
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Insia a idade para verificação: ");
		int idade = scan.nextInt();
		
		checarIdade(idade);

	}

}
