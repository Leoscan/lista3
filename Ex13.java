import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = 0;
		System.out.print("Fatorial do número: ");
		n = entrada.nextInt();
		
		int result = 1;
		
		System.out.print(n+"!=");
		while(n != 0) {
			System.out.print(n+".");
			result = result*n;
			n--;
		}
		System.out.print("="+result);
		entrada.close();
	}

}
