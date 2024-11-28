package ExerciciosSwitchCase;

import java.util.Scanner;

public class Exercicio9 {
// Categoria de Filme 

//Crie um programa que leia a classificação etária de um filme e mostre a faixa etária permitida. As classificações são: 

//G (Livre) 
//PG (Maior de 10 anos) 
//PG-13 (Maior de 13 anos) 
//R (Maior de 18 anos) 
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira a classificação do filme:");
		System.out.println("| G | PG | PG-13 | R |");
		String classificacao = scan.next();

		switch (classificacao) {
		case "G":
			System.out.println("A classificação etária deste filme atende aos telespectadores de todas as idades!");
			break;
		case "PG":
			System.out.println("A classificação etária deste filme atende aos telespectadores maiores de 10 anos!");
			break;
		case "PG-13":
			System.out.println("A classificação etária deste filme atende aos telespectadores maiores de 13 anos!");
			break;
		case "R":
			System.out.println("A classificação etária deste filme atende aos telespectadores maiores de 18 anos!");
			break;
			default:
				System.out.println("Classificação desconhecida.");
		}
	}

}
