import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		System.out.print("Informe um até que número deseja verificar: ");
		num = entrada.nextInt();
		int i = 1;
		int div = 0;
		
		while (i <= num) {
			int cont = 0;
			for (int x = 1; x < i; x++) {
				if (i % x == 0) {
					cont++;
					div++;
				}
			}
		
				if (cont == 1) {
					System.out.print(i+" ");
				}
			i++;
		}
		System.out.println(",");
		System.out.println("Total de divisão: "+div);
		
		entrada.close();
	}

}
