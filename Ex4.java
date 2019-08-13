import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		/* antes de modificar
		float a = 80000;
		float b = 200000;
		int anos = 0;
		
		do {
			a = a + ((a/100)*3);
			b = (float) (b + ((b/100)*1.5));
			anos++;
		} while ((a <= b));
		
		System.out.println(anos);*/
		
		//modificado =
		
		float a = 0;
		float b = 0;
		float txa = 0;
		float txb = 0;
		
		do {
		System.out.print("Informe a população da cidade a: ");
		a = entrada.nextFloat();
		
		System.out.print("Informe a população da cidade b: ");
		b = entrada.nextFloat();
		
		System.out.print("Informe a taxa de crescimento população da cidade a: ");
		txa = entrada.nextFloat();
		
		System.out.print("Informe a taxa de crescimento população da cidade b: ");
		txb = entrada.nextFloat();
		} while(a > b || txa < txb);
		
		int anos = 0;
		
		do {
			a = a + ((a/100)*txa);
			b = (float) (b + ((b/100)*txb));
			anos++;
		} while ((a <= b));
		
		System.out.println(anos);
		entrada.close();
		
	}

}
