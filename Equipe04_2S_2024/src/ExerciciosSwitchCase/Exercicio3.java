package ExerciciosSwitchCase;

import java.util.Scanner;

public class Exercicio3 {
	//Classificação de Idade 
	//Crie um programa que leia a idade de uma pessoa e mostre a classificação etária utilizando switch case. As classificações são: 

	//0-12 anos: "Criança" 
	//13-17 anos: "Adolescente" 
	//18-59 anos: "Adulto" 
	//60 ou mais: "Idoso" 
	public static void main(String[] args) {
	
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Digite a sua idade");
	        int idade = scan.nextInt();
	 
	        switch (idade) {
	            case 1,2,3,4,5,6,7,8,9,10,11,12:
	                System.out.println("Criança");
	                break;
	            case 13,14,15,16,17:
	                System.out.println("Adolescente");
	                break;
	            case 18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59:
	                System.out.println("Adulto");
	                break;
	            default:
	                System.out.println("Idoso");
	                break;
	        }
	    }
	}

