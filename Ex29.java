import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = 0;
		System.out.print("Montar a tabuada de: ");
		n = entrada.nextInt();
		
		int c = 0;
		System.out.print("Começar por: ");
		c = entrada.nextInt();
		
		int t = 0;
		do {
			System.out.print("Terminar em: ");
			t = entrada.nextInt();
		} while (t <= c);
		
		int mult = 0;
		
		while (c != t+1) {
			mult = n*c;
			System.out.println(n+" x "+c+" = "+mult);
			c++;

		}
		
		entrada.close();

	}

}
