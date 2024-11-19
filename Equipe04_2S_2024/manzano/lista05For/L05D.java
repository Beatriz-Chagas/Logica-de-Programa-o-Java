package lista05For;
 
public class L05D {
	 
	public static void main(String[] args) {
		int soma = 0;
		for (int contador = 0; contador < 501; contador++) {
			
			if (contador % 2 == 0) {
				soma += contador;
			}
		}
		System.out.println("A soma do números pares entre 1 e 500 são: " + soma);
	}
 
}