import java.util.Scanner;

public class OperMat {
	
	static double A, B;
	static double operacao;
	static String operador;
	static double resultado;
	
	static double soma(double A, double B) {
		return A + B;
	}
	
	static double subtracao (double A, double B) {
		return A - B;
	}
	
	static double multiplicacao (double A, double B) {
		return A * B;
	}
	
	static double divisao (double A, double B) {
		return A / B;
	}
	
	static double operMat(String operador, double A, double B) {
		if (operador == "+") {
			operacao = soma(A,B);
		} else if (operador == "-") {
			operacao = subtracao(A,B);
		} else if (operador == "*") {
			operacao = multiplicacao(A,B);
		} else if (operador == "/"){ 
			operacao = divisao(A,B);
		}
		return operacao;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha dois números: ");
		System.out.print("Digite o primeiro Número: ");
		A = sc.nextDouble();
		System.out.print("Digite o segundo Número: ");
		B = sc.nextDouble();
		System.out.println("Escolha a operação desejada (as opções são '+, -, * ou /' : ");
		operador = sc.next();
		resultado = operMat(operador, A, B);
		System.out.println("O resultado da operação é: " + resultado);
	}
}



