package modulo01_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario;
		int numero = sc.nextInt();
		int horaTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();

		salario = horaTrabalhadas * valorHora;

		System.out.println("Numero: " + numero);
		System.out.printf("O seu salário é: R$ %.2f%n", salario);

		sc.close();

	}

}
