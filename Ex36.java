import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int v1 = 0;
		int v2 = 0;
		int v3 = 0;
		int v4 = 0;
		int v5 = 0;
		int v6 = 0;
			
		System.out.println("informe os candidatos ");
			for (int i = 1; i < 5; i++) {
				System.out.print(i+"-");
				entrada.nextLine();
			}
			System.out.println("5- Voto Nulo ");
			System.out.println("6- Voto Branco ");
			
		int voto = 0;
		boolean continua = true;
			while (continua == true) {
				System.out.print("vote: ");
				voto = entrada.nextInt();
				
				if (voto == 0 ) {
					System.out.println("Parando o programa...");
					continua = false;
				} else if ( voto == 1) {
					v1++;
				} else if ( voto == 2) {
					v2++;
				} else if ( voto == 3) {
					v3++;
				} else if ( voto == 4) {
					v4++;
				} else if ( voto == 5) {
					v5++;
				} else if ( voto == 6) {
					v6++;
				}
				
			}
			float tVotos = v1+v2+v3+v4;
			float vNulo = (tVotos/100)*v5;
			float vBranco = (tVotos/100)*v6;
			
			System.out.println("Votos Para o candidato 1: "+v1);
			System.out.println("Votos Para o candidato 2: "+v2);
			System.out.println("Votos Para o candidato 3: "+v3);
			System.out.println("Votos Para o candidato 4: "+v4);
			System.out.println("Votos Nulos: "+v5);
			System.out.println("Votos Brancos: "+v6);
			System.out.println("A percentagem de votos nulos sobre o total de votos: "+vNulo);
			System.out.println("A percentagem de votos em branco sobre o total de votos: "+vBranco);
			
		entrada.close();
	}

}
