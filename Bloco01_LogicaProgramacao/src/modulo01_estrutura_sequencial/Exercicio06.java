package modulo01_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double total1, total2, total3, total4, total5;
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		total1 = A * C / 2.0;
		total2 = 3.14159 * C * C;
		total3 = (A + B) /2.0 * C;
		total4 = B * B;
		total5 = A * B;
		
		System.out.printf("Triângulo: R$ %.3f%n", total1);
		System.out.printf("Circulo: R$ %.3f%n", total2);
		System.out.printf("Trapezio: R$ %.3f%n", total3);
		System.out.printf("Quadrado: R$ %.3f%n", total4);
		System.out.printf("Retângulo: R$ %.3f%n", total5);
		
		
		
		sc.close();
	}

}
