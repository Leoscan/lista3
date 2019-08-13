import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		boolean continua = true; 
		
		int v1 = 0;
		int v2 = 0;
		int v3 = 0;
		int v4 = 0;
		
		while (continua) {
			System.out.print("Escreva um Número: ");
			float x = entrada.nextFloat();
			
			if (x < 0) {
				System.out.println("Parando o programa...");
				continua = false;
			} else {
				if (x >= 0 && x <= 25) {
					v1 = v1 +1;
				} else if (x >= 26 && x <= 50) {
					v2 = v2 +1;
				} else if (x >= 51 && x <= 75) {
					v3 = v3 +1;
				} else if (x >= 76 && x <= 100) {
					v4 = v4 +1;
				}
			}
		}
		
		System.out.println("Intervalo [0 e 25]: "+v1);
		System.out.println("Intervalo [26 e 50: "+v2);
		System.out.println("Intervalo [51 e 75]: "+v3);
		System.out.println("Intervalo [76 e 100]: "+v4);
		
		entrada.close();
	}

}
