package exemplo_Proa;

public class WideningCasting {

	public static void main(String[] args) {
		int myInt = 9;
		
		double myDouble = myInt;
		float myFloat = myInt;
		
		System.out.println("N�mero inteiro: "+ myInt);
		System.out.println("N�mero real em double: "+ myDouble);
		System.out.println("N�mero real em float: "+ myFloat);
	}

}
