import java.util.Locale;
import java.util.Scanner;

public class ex005 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("Digite a temperatura em Celsios; ");
		
		double C = sc.nextDouble();
		double F = (9.0 * C / 5.0) + 32.0;
		
		System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
		System.out.println("Deseja repetir (s/n)? ");*/
		
		//char resp = 's'; FOI APAGADA
		
		//while (resp!= 'n') FOI APAGADA
		
		char resp;
		do {
		
			System.out.print("Digite a temperatura em Celsios; ");
			
			Double C = sc.nextDouble();
			Double F = (9.0 * C / 5.0) + 32.0;
			
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.println("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
			
			
		} while (resp != 'n');
		
		
		sc.close();
	
	}

}
