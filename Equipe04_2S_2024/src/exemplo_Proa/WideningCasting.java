package exemplo_Proa;

public class WideningCasting {

	public static void main(String[] args) {
		int myInt = 9;
		
		double myDouble = myInt;
		float myFloat = myInt;
		
		System.out.println("Número inteiro: "+ myInt);
		System.out.println("Número real em double: "+ myDouble);
		System.out.println("Número real em float: "+ myFloat);
	}

}
