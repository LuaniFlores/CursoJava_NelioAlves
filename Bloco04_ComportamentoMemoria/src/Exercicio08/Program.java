package Exercicio08;

//Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média 
//aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for 
//digitado, mostrar a mensagem "NENHUM NUMERO PAR" 

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, soma = 0, qtdpar = 0;
		double media;

		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
				qtdpar++;
			}
		}
		
		if (soma == 0) {
			System.out.println("NENHUM NUMERO PAR");

		} else {
			media = (double) soma / qtdpar;
			System.out.printf("MEDIA DOS PARES = %.1f\n", media);
		}

		sc.close();
	}

}
