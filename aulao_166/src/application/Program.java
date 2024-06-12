package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<TaxPayer>();
		
		System.out.print("Enter the number of taxpayers: ");
		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			System.out.println("Taxpayer #" + i + " data: ");
			System.out.println("Individual or company (i/c) ");
			char type = sc.next().charAt(0);
			System.out.println("Name: ");
			String name = sc.next();//SO VAI ACEITAR UMA PALAVRA SEM ESPAÇO
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			if (type == 'i') {
				System.out.println("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				Individual x = new Individual(name, anualIncome, healthExpenditures);
				list.add(x);
				
			}
			else {
				System.out.print("Number of employees: ");
				Integer numberOfInteger = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfInteger)); //OUTRO METODO DE IMPLEMENTAÇÃO
				
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (TaxPayer tp : list) {
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
			
			
		}
		System.out.println();
		double sum = 0.0;
		for (TaxPayer tp : list) {
			sum += tp.tax();
			
		}
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}

}
