import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
			int n = 0;
				System.out.print("Informe a quantidade de votantes: ");
					n = entrada.nextInt();
			
			int c1 = 0;
			int c2 = 0;
			int c3 = 0;
			int voto = 0;
				
		for (int x = 1; x <= n; x++) {
			do {
				System.out.print("Voto (1 - candidato1; 2- candidato2; 3- candidato3): ");
				voto = entrada.nextInt();
				if (voto > 3 && voto < 1) {
					System.out.println("Voto Inválido");				
				}
			} while (voto > 3 && voto < 1);
			
			if (voto == 1) {
				c1++;
			} else if (voto == 2) {
				c2++;
			} else c3++;	
		}
		
		System.out.println("Votos do primeiro candidato: "+c1);
		System.out.println("Votos do segundo candidato: "+c2);
		System.out.println("Votos do terceiro candidato: "+c3);
		
		entrada.close();
	}

}
