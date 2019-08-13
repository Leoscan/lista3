import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		float valor = 0;
		System.out.print("Valor da divida: ");
		valor = entrada.nextFloat();
		
		int pJuros3 = 10;
		int pJuros6 = 15;
		int pJuros9 = 20;
		int pJuros12 = 25;
		int contJuros = 1;
		
		float vlJuros = 0;
		float tPagar = 0;
		float vFrac = 0;
		
		System.out.println("Valor da Dívida Valor dos Juros Quantidade de Parcelas  Valor da Parcela");
		
			if (contJuros == 1) {
				System.out.println("R$: "+valor+"   "+vlJuros+"      "+contJuros+"      R$: "+valor);
				contJuros = 3;
			}
			if (contJuros == 3) {
				vlJuros = ((valor/100)*pJuros3);
				vFrac = valor+vlJuros;
				tPagar = (valor+vlJuros)/3;
				System.out.println("R$: "+vFrac+"   "+vlJuros+"    "+contJuros+"      R$: "+tPagar);
				contJuros = 6;
			}
			if (contJuros == 6) {
				vlJuros = ((valor/100)*pJuros6);
				vFrac = valor+vlJuros;
				tPagar = (valor+vlJuros)/6;
				System.out.println("R$: "+vFrac+"   "+vlJuros+"    "+contJuros+"      R$: "+tPagar);
				contJuros = 9;
			}
			if (contJuros == 9) {
				vlJuros = ((valor/100)*pJuros9);
				vFrac = valor+vlJuros;
				tPagar = (valor+vlJuros)/9;
				System.out.println("R$: "+vFrac+"   "+vlJuros+"    "+contJuros+"      R$: "+tPagar);
				contJuros = 12;
			}
			if (contJuros == 12) {
				vlJuros = ((valor/100)*pJuros12);
				vFrac = valor+vlJuros;
				tPagar = (valor+vlJuros)/12;
				System.out.println("R$: "+vFrac+"   "+vlJuros+"    "+contJuros+"      R$: "+tPagar);
			}
			
			entrada.close();
	}

}
