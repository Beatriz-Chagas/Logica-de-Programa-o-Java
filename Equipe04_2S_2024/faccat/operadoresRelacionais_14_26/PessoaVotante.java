package operadoresRelacionais_14_26;

import java.util.Scanner;

public class PessoaVotante {
	// Exercício 18

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira o seu ano de nascimento e em seguida o ano atual: ");
		int anoNascimento = scan.nextInt();
		int anoAtual = scan.nextInt();

		int idade = anoAtual - anoNascimento;

		if (idade < 16) {
			System.out.println("Essa pessoa não pode votar ainda, pois tem " + idade + " anos.");
		} else if (idade < 18) {
			System.out.println("Essa pessoa pode votar, mas não é obrigatório.");
		} else {
			System.out.println("Essa pessoa tem que votar obrigatoriamente, pois tem " + idade + " anos.");

		}
	}
}
