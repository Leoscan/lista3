import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
		
		int n = 0;
		System.out.print("Informe o N-esimo numero para calcular a fibonacci: ");
		n = entrada.nextInt();
		int f1 = 1;
		int f2 = 1;
		int fb = 0;
		for(int x = 1; x <= n; x++) {
			if (x == 1 || x == 2) {
				System.out.print("1 ");
			} else {
				fb = f1 + f2;
				System.out.print(fb+" ");
				f2 = f1;
				f1 = fb; 
			}			
		}
		
		
		entrada.close();

	}

}
