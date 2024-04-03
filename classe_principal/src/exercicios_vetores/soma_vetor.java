package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double soma, media;

		System.out.print("Quantos numeros voce vai digitar?");
		n = sc.nextInt();

		double[] vet = new double[n];

		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();

		}

		soma = 0;

		for (int i=0; i<n; i++) {
			soma = soma + vet[i];
			
		}
		
		media = soma / n;
		
		System.out.println("VALORES = ");
		
		for (int i=0; i<n; i++) {
			System.out.printf("%.1f ", vet[i]);
			
			
		}
		
		System.out.printf("\nSOMA = %.2f\n", soma);
		System.out.printf("MEDIA = %.2f\n", media);
		
		
		sc.close();
	}

}
