package exemplo_Proa;

public class Escopo {

	public static void main(String[] args) {
		//N�o funciona fora do bloco
		
		{ // funciona no bloco

			int x = 100;
			System.out.println(x);
		}
	}
	//N�o funciona fora do bloco

}
