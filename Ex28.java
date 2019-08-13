import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int continua = 1;
		float temp = 0;
		float mTemp = 0;
		float nTemp = 0;
		float soma = 0;
		float media = 0;
		int cont = 1;
		
		while(continua == 1) {
			System.out.print("Informe a "+cont+" temperatura: ");
			temp = entrada.nextFloat();
			if (cont == 1) {
				mTemp = temp;
				nTemp = temp;
			} else {
				if (temp > mTemp) {
					mTemp = temp;
				}
				if (temp < nTemp) {
					nTemp = temp;
				}
			}
			soma = soma+temp;
			
			do {
			System.out.print("continua? (1-sim; 2-não): ");
			continua = entrada.nextInt();
			} while(!(continua == 1 || continua == 2));
			
			cont++;
		}
		
		System.out.println("Maior temperatura :"+mTemp);
		System.out.println("Maior temperatura :"+nTemp);
		media = soma/(cont-1);
		System.out.println("Média :"+media);
		
		entrada.close();
	}
	

}
