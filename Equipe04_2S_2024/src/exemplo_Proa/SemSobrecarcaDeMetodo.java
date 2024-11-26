package exemplo_Proa;

public class SemSobrecarcaDeMetodo {
// metodos
	
	public static int somaInt(int num1, int num2) {
		return num1 + num2;
	}
	public static double somaDob(double num1, double num2) {
		return num1 + num2;
	}
	////////////////////////////////////////////////////////////////////
	
	
	public static void main(String[] args) {
		int somaInteiro = somaInt(12,34);
		double somaDouble = somaDob(36.4,53.6);
		
		System.out.println("A soma dos valores inteiros é: "+ somaInteiro);
		System.out.println("A soma dos valores reais é: "+ somaDouble);

	}

}
