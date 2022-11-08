import java.util.Scanner;

public class Soma {
	
	static double A, B;
	
	static double soma(double A, double B) {
		return A + B;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		if (args.length == 0) {
			System.out.print("Digite o primeiro Número: ");
			A = sc.nextDouble();
			System.out.print("Digite o segundo Número: ");
			B = sc.nextDouble();
		} else if (args.length == 1) {
			A = Double.parseDouble(args[0]);
			System.out.print("Digite o segundo Número: ");
			B = sc.nextDouble();
		} else if (args.length == 2){
			A = Double.parseDouble(args[0]);
			B = Double.parseDouble(args[1]);
		} else {
			System.out.println("ERRO! QUANTIDADE INVÁLIDA!");
		}
		
		System.out.print("A soma dos números é: " + soma(A, B));	
	}
}
