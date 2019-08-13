import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Panificadora Pão de Ontem - Tabela de Preços");
		
		float preco = 0;
		System.out.print("Preço do Pão: ");
		preco = entrada.nextFloat();
		
		float pPagar = preco;
		
		DecimalFormat df = new DecimalFormat("#0.00");
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i+" - "+df.format(pPagar));
			pPagar = (float) (pPagar + preco);
		}
		
		entrada.close();
	}

}
