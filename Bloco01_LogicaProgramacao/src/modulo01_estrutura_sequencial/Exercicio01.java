package modulo01_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int soma;
		int x = sc.nextInt();
		int y = sc.nextInt();

		soma = x + y;

		System.out.println("A soma dos dois números são: " + soma);

		sc.close();
	}

}
