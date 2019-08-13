import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		boolean continua = true;		
		String[] esps = new String[50];
		int[] cods = new int[50];
		float[] precos = new float[50];
		int cont = 0;
		int qq = 0;
		
		while(continua == true) {
			System.out.print("Código (se invalido para o programa): ");
			int cod = entrada.nextInt();

			if (cod >= 100 && cod <= 105 ) {
				if(cod == 100) {
					System.out.print("Quantidade: ");
					qq = entrada.nextInt();
					esps[cont] = "Cachorro Quente";
					precos[cont] = (float) (1.20*qq);
					cods[cont] = cod;
					cont++;
				} else if(cod == 101) {
					System.out.print("Quantidade: ");
					qq = entrada.nextInt();
					esps[cont] = "Bauru Simples";
					precos[cont] = (float) (1.30*qq);
					cods[cont] = cod;
					cont++;
				} else if(cod == 102) {
					System.out.print("Quantidade: ");
					qq = entrada.nextInt();
					esps[cont] = "Bauru com Ovo";
					precos[cont] = (float) (1.50*qq);
					cods[cont] = cod;
					cont++;
				} else if(cod == 103) {
					System.out.print("Quantidade: ");
					qq = entrada.nextInt();
					esps[cont] = "Hambúrguer";
					precos[cont] = (float) (1.20*qq);
					cods[cont] = cod;
					cont++;
				} else if(cod == 104) {
					System.out.print("Quantidade: ");
					qq = entrada.nextInt();
					esps[cont] = "Cheeseburguer";
					precos[cont] = (float) (1.30*qq);
					cods[cont] = cod;
					cont++;
				} else if(cod == 105) {
					System.out.print("Quantidade: ");
					qq = entrada.nextInt();
					esps[cont] = "Refrigerante";
					precos[cont] = (float) (1.00*qq);
					cods[cont] = cod;
					cont++;
				}
				continua = true;
			} else {
				System.out.println("Parando o programa..."); 
				continua = false;
			}
		}
		
		System.out.println("Especificação   Código   Preço");
		for (int h = 0; h < cont; h++) {
			System.out.println(esps[h]+"   "+cods[h]+"     R$:"+precos[h]);
		}
		
		entrada.close();
	}

}
