package operadoresRelacionais_14_26;

import java.util.Scanner;

public class AprovadoReprovado {
//Exerc�cio 17
	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
 
		System.out.println("Escreva duas notas do aluno: ");
		float nota1 = scan.nextFloat();
		float nota2 = scan.nextFloat();
 
		float media = (nota1 + nota2) / 2;
 
		if (media < 6) {
 
			System.out.println("A m�dia aritm�tica do aluno �: " + media + ". Ele foi reprovado!");
		} else {
			System.out.println("A m�dia aritm�tica do aluno �: " + media + ". Ele foi aprovado!");
 
		};
 
	}
}