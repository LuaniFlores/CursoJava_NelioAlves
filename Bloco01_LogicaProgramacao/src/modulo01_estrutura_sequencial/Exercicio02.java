package modulo01_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double area;
		double raio = sc.nextDouble();
		area = 3.14159 * raio * raio;

		System.out.printf("O valor da área é: %.4f%n", area);

		sc.close();

	}

}
