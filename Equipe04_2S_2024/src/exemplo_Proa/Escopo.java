package exemplo_Proa;

public class Escopo {

	public static void main(String[] args) {
		//Não funciona fora do bloco
		
		{ // funciona no bloco

			int x = 100;
			System.out.println(x);
		}
	}
	//Não funciona fora do bloco

}
