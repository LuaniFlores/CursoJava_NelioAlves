package modulo01_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double total;
		int quantidade1 = sc.nextInt();
		double valor1 = sc.nextDouble();

		int quantidade2 = sc.nextInt();
		double valor2 = sc.nextDouble();

		total = (quantidade1 * valor1) + (quantidade2 * valor2);

		System.out.printf("Valor a pagar: R$ %.2f%n", total);

		sc.close();

	}

}
