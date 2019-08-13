import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = 0;
		System.out.print("Escreva o numero de notas: ");
		n = entrada.nextInt();
		float nota = 0;
		float media = 0;
		
		for (int x = 0; x < n; x++) {
			System.out.print("Escreva a nota: ");
			nota = entrada.nextFloat();
			media = media + nota;
		}
		media = media/n;
		System.out.println("Media = "+media);
		
		entrada.close();
	}

}
