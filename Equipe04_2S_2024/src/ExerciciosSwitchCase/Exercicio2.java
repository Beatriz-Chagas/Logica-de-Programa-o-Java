package ExerciciosSwitchCase;

import java.util.Scanner;

public class Exercicio2 {
	//Opera��es Aritm�ticas 
	//Crie um programa que leia dois n�meros e um operador (+, -, *, /), e ent�o execute a opera��o correspondente.
	//Se o operador for inv�lido, mostre uma mensagem de erro. 

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira dois n�meros: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("Escolha um operador:");
		System.out.println("Soma: + ");
		System.out.println("Subtra��o: - ");
		System.out.println("Multiplica�ao: *");
		System.out.println("Divis�o: /");
		String operador = scan.next();
		
		int resultado = 0;
		
		switch (operador) {
		case "+":
			 resultado = num1 + num2;
			break;
		case "-":
			 resultado = num1 - num2;
			break;
		case "*":
			 resultado = num1 * num2;
			break;
		case "/":
			 resultado = num1 / num2;
			break;
		}
			System.out.println("O resultado da opera��o �: " + resultado);
		

	}

}
