package exemplo_Proa;

public class ComSobrecargaMetodo {
// Usando Sobrecarga de método
	public static int sobrecargaSoma(int num1, int num2) {
		return num1 + num2;
	}
	public static double sobrecargaSoma(double num1,double num2) {
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		
		int meuInteiro = sobrecargaSoma(8,3);
		double meuReal = sobrecargaSoma(4.6,9.3);
		
		System.out.println("Inteiro: " + meuInteiro);
		System.out.println("Inteiro: " + meuReal);

	}

}
