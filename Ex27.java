import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Lojas Tabajara");
		
		float preco = 1;
		float pPagar = preco;
		int cont = 1;
		
		DecimalFormat df = new DecimalFormat("#0.00");
	
		while (preco != 0) {
			System.out.print("Produto "+cont+": R$ ");
			preco = entrada.nextFloat();
			
			if (cont == 1) { 
				pPagar = preco;
			} else pPagar = pPagar+preco;
			
			cont++;
		}
		System.out.println("Total: "+df.format(pPagar));
		
		float din = 0;
		System.out.print("Dinheiro: R$ ");
		din = entrada.nextFloat();
		
		float troco = din - pPagar;
		
		if (din == pPagar) {
			System.out.println("Sem troco");	
		} else System.out.println("Troco: R$ "+troco);
		
		
		entrada.close();

	}

}
