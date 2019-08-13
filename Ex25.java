import java.text.DecimalFormat;

public class Ex25 {

	public static void main(String[] args) {
		System.out.println("Loja Quase Dois - Tabela de Preços");
		DecimalFormat df = new DecimalFormat("#0.00");

		float preco = (float) 1.99;

		for (int i = 1; i <= 50; i++) {
			System.out.println(i+" - "+df.format(preco));
			preco = (float) (preco + 1.99);
		}
	}

}
