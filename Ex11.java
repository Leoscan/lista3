import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int par = 0;
		int impar = 0;
		int n = 0;
		for(int x = 1; x <= 10; x++) {
			System.out.print("Informe um número: ");
			n = entrada.nextInt();
			
			if (n % 2 == 0) {
				par = par + 1;
			} else {
				impar = impar + 1;
			}
		}
		
		System.out.println("Pares: "+par);
		System.out.println("Ímpares: "+impar);
		
		entrada.close();
	}

}
