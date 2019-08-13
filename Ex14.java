import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int en = 0;
		int n = 1;
		int m = 1;
				
		System.out.print("Quantos termos? ");
		en = entrada.nextInt();
		
		System.out.print("S = ");
		while (n <= en) {
			if ( en - n != 0 ) {
				System.out.print(n+"/"+m+" + ");
			} else System.out.print(n+"/"+m+".");
			n++;
			m = m + 2;
		}
		entrada.close();
	}

}
