import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		
		int n = 0;
			System.out.print("Informe a quantidade de Cd's: ");
		n = entrada.nextInt();
		
		float pTotal = 0;
		float cd = 0;
		
		for (int x = 1; x <= n; x++) {
			System.out.print("Informe o Preço do "+x+" Cd: ");
			cd = entrada.nextFloat();
		
			pTotal = pTotal + cd;
		}
		
	System.out.println("O preço total foi de "+pTotal+" Reais.");
	System.out.println("O preço medio por cd foi de "+pTotal/n+" Reais.");
	entrada.close();

	}

}
