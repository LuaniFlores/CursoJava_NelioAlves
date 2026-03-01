package modulo03_estruturas_repetitivas;

import java.util.Scanner;

public class ExercicioFor05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				System.out.println(i);
		}
		
		}
		
		sc.close();
	}
}