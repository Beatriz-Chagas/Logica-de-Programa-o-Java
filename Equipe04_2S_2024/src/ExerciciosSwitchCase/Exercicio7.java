package ExerciciosSwitchCase;

import java.util.Scanner;

public class Exercicio7 {
// Calculadora de Impostos 

//Implemente uma calculadora simples que calcula o imposto baseado na faixa salarial do usuário. As faixas são: 

//Até R$1.500,00: Imposto de 5% 
//De R$1.501,00 a R$3.000,00: Imposto de 10% 
//Acima de R$3.000,00: Imposto de 15% 
//Peça o valor do salário e calcule o imposto. 

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira o valor da faixa salarial para o calculo: ");
		double salario = scan.nextDouble();
		
		int taxa = 0;
		double resultado = 0;

		if (salario < 1500.00) {
			taxa = 1;
		}

		if (salario >= 1501.00 & salario <= 3000.00) {
			taxa = 2;
		}

		if (salario > 3000.00) {
			taxa = 3;
		}

		switch (taxa) {
		case 1:
			resultado = salario * 0.05;
			break;
		case 2:
			resultado = salario * 0.1;
			break;
		case 3:
			resultado = salario * 0.15;
		};

		System.out.println("O valor do calculo do imposto é: R$" + resultado);
	}

}
