package exemplo_Proa;

public class ExemploMedia {

	public static void main (String [] args) {
		int valores[] = {55, 42, 96, 20, 13, 40, 74,33};
		
		float media, soma = 0;
		
		int quantia = valores.length;
		
		for (int valor : valores) {
			soma += valor;
		}
		
		media = soma / quantia;
		
		System.out.println("A media dos valores é: " + media);
	}
}
