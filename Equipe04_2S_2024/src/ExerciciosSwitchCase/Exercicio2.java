package ExerciciosSwitchCase;

import java.util.Scanner;

public class Exercicio2 {
	//Operações Aritméticas 
	//Crie um programa que leia dois números e um operador (+, -, *, /), e então execute a operação correspondente.
	//Se o operador for inválido, mostre uma mensagem de erro. 

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira dois números: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("Escolha um operador:");
		System.out.println("Soma: + ");
		System.out.println("Subtração: - ");
		System.out.println("Multiplicaçao: *");
		System.out.println("Divisão: /");
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
			System.out.println("O resultado da operação é: " + resultado);
		

	}

}
