package exemplo_Proa;

public class metodo {
	static void imprimirNome() {
		System.out.println("Heylo");
	}
	
	static void nomeFilho(String nome, int idade) {
		System.out.println("O nome filho �: "+ nome + ". Sua idade �: "+ idade);
	}
	public static void main(String[] args) {
		imprimirNome();

		nomeFilho("Chagas", 20);
		nomeFilho("Beatriz", 11);
	}
}
