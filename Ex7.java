import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n1 = 0;
		System.out.print("Primeiro número: ");
		n1 = entrada.nextInt();
		
		int n2 = 0;
		System.out.print("Segundo número: ");
		n2 = entrada.nextInt();
		
		while(n1 < n2-1) {
			n1++;
			System.out.print(n1+" ");
		}
		
		entrada.close();	
	}

}
