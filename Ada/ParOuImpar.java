public class ParOuImpar {
		
	static boolean Par(int numero) {
		return numero % 2 == 0;
	}
	
	public static void main(String[] args ) { 
		int numero = Integer.parseInt(args[0]);
		if (Par(numero)) {
			System.out.println("É par!");
		} else {
			System.out.println("É impar!");
		}
	}
}
