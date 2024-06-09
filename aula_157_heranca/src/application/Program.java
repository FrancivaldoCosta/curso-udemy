package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		/* EXERCICIO ORIGINAL 
		 * Account x = new Account(1023, "Alex", 1000.0); Account y = new
		 * SavingsAccount(1023, "Maria", 1000.0, 0.01);
		 * 
		 * x.withdraw(50.0); y.withdraw(50.0);
		 * 
		 * System.out.println(x.getBalance()); System.out.println(y.getBalance());
		 */
		
		
		
		/*
		 * //EXERCICIO AULA 164 CLASSES ABSTRATAS Account acc1 = new Account(1001,
		 * "Alex", 1000.0); //DA UM ERRO NA CHASSE ACCOUNT POR SER ABSTRATA NÃO PODE SER
		 * INSTANCIADA Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		 * Account acc3 = new BusinessAccount(1003, ""Bob, 1000.0, 500.0);
		 */
		
		//SEGUNDO EXERCICIO DA AULA 164
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
			
			
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (Account acc : list) {
			acc.deposit(10.0);
		}
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
	}

}