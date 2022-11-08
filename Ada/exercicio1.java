import java.util.Scanner;

public class exercicio1 {

	static final double FATOR_1 = 1.8;
	static final int FATOR_2 = 32;
	static double celsius1, celsius2;
	
	static double fahrenheit(double celsius) {
		return (celsius*FATOR_1)+FATOR_2;
	}

	public static void main(String[] args) {
		
		System.out.println(FATOR_1);
		System.out.println(FATOR_2);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira temperatura em Celsius: ");
		celsius1 = sc.nextDouble();
		System.out.println("A primeira temperatura em Fahrenheit é: " + fahrenheit(celsius1));
		System.out.print("Digite a segunda temperatura em Celsius: ");
		celsius2 = sc.nextDouble();
		System.out.print("A segunda temperatura em Fahrenheit é: " + fahrenheit(celsius2));
	}	
}

