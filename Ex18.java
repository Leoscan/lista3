import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		System.out.print("Informe um numero: ");
		num = entrada.nextInt();
	
		int cont = 0;
		
		if (num == 1) {
			System.out.println("Este número não é primo");
		} else {	
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					cont++;
					System.out.println("divisivel por: "+i);
				}
			}
			
			if (cont == 0) {
				System.out.println("Este número é primo");
			} else System.out.println("Este número não é primo");
		}
		entrada.close();
	}

}
