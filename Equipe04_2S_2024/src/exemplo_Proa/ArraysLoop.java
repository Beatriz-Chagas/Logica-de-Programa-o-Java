package exemplo_Proa;

public class ArraysLoop {

	public static void main(String[] args) {
		String [] tang = { "Morango", "Manga", "Abacaxi", "Uva", "Laranja"};
		
		for (String i : tang) {
			System.out.println("O sabores s�o: " + i);
		}
		
		double[] preco = {2.5, 1.3, 0.9, 3.0, 2.2};
		for (double j : preco) {
			System.out.println("Os pre�os s�o: "+ j);
		}
		
		System.out.println("O vetor selecionado � ocupado pelo sabor: " + tang[4]);

	}

}
