package modulo01_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);

			int diferenca;
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int D = sc.nextInt();

			diferenca = (A * B - C * D);

			System.out.println("A diferença é: " + diferenca);

			sc.close();

		}
	}
