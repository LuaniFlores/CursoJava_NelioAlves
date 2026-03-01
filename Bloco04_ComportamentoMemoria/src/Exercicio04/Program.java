package Exercicio04;

//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na 
//tela todos os números pares, e também a quantidade de números pares. 

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, qtdpares;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		int[] numeros = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite um numero: ", i + 1);
			numeros[i] = sc.nextInt();
		}
		qtdpares = 0;

		System.out.println("\nNUMEROS PARES:");

		for (int i = 0; i < n; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.printf("%d ", numeros[i]);
				qtdpares++;
			}
		}

		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdpares);

		sc.close();
	}
}