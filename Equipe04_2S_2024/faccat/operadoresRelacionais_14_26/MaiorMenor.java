package operadoresRelacionais_14_26;

import java.util.Scanner;

public class MaiorMenor {
// Exerc�cio 14
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira um valor para descobrir se � maior ou menor que 10: ");
		float numero = scan.nextFloat();
		
		String mensagem = (numero < 10)?"Este n�mero � menor que o n�mero 10.":(numero ==10)?"Este n�mero � igual o n�mero 10.":"Este n�mero � maior que o n�mero 10.";
			System.out.println(mensagem);
	}
	
}