package exemplo_Proa;

public class pontuacaoJogo {

	public static void main (String [] args) {
		int pontuacaoMax = 500;
		
		int pontuacaoAtual = 423;
		
		float porcentagem = (float) pontuacaoAtual / pontuacaoMax * 100.0f;
		
		System.out.println("A pontuação deste jogador é: " + porcentagem + "% do valor máximo.");
	}
}
