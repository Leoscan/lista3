import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			float nota = 0;
			int c = 0;
			
			do {
				if (c != 0) {
					System.out.print("Nota inválida, ");
				} 
				System.out.print("Informe uma nota: ");
				nota = entrada.nextFloat();
				c++;
			} while (!(nota <= 10 && nota >= 0));
			
			System.out.println("Nota: "+nota);
			
			entrada.close();
	}

}
