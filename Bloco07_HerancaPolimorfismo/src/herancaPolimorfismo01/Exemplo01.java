package herancaPolimorfismo01;

import entities_exemplo01.Account;
import entities_exemplo01.SavingsAccount;

public class Exemplo01 {

	public static void main(String[] args) {
		
		// Polimorfismo
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);
	}

}
