import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escreva um número: ");
		int inverte = entrada.nextInt();
		String inverter = Integer.toString(inverte);
		
		StringBuffer string = new StringBuffer(inverter);
		System.out.println(string.reverse().toString());
		
		entrada.close();
	}

}
