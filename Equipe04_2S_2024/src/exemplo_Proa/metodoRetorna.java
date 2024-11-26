package exemplo_Proa;

import java.util.Scanner;

public class metodoRetorna {

	
	public static int soma(int num, int num2) {
		// return soma + 5;
		return num + num2;
	}
	public static void main(String[] args) {
		// System.out.println("A soma dos valores é: "+ soma(36));
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira dois numeros: ");
		int num = scan.nextInt();
		int num1 = scan.nextInt();
		
		System.out.println("A soma dos números é: " + soma(num,num1));
	}

}
