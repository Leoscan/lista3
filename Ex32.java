import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cCidade = 0;
		int cCarro = 0;
		int cAcidente = 0;
		
		int maiAcidente = 0;
		int meiAcidente = 0;
		int maiCodigo = 0;
		int meiCodigo = 0;
		
		int somaCar = 0;
		int somaCar2 = 0;
		int contCity = 0;
		
		int cont = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Codigo da cidade: ");
			cCidade = entrada.nextInt();
			
			System.out.print("Número de veículos de passeio (1999): ");
			cCarro = entrada.nextInt();
			
			System.out.print("Número de acidentes de trânsito com vítimas (1999): ");
			cAcidente = entrada.nextInt();
			
			somaCar = somaCar + cCarro;
			
			if (cCarro < 2000) {
				contCity++;
				somaCar2 = somaCar + cAcidente;
			}
			
			if (cont == 0) {
				maiCodigo = cCidade;
				meiCodigo = cCidade;
				maiAcidente = cAcidente;
				meiAcidente = cAcidente;
			} else {
				if (cAcidente > maiAcidente) {
					maiCodigo = cCidade;
					maiAcidente = cAcidente;
				} else if (cAcidente < meiAcidente) {
					meiCodigo = cCidade;
					meiAcidente = cAcidente;
				}
			}
			cont++;
		}
		
		float mediaCar = somaCar/5;
		float mediaCar2 = somaCar2/contCity;
		
		System.out.println("maior índice de acidentes de transito: "+maiAcidente+", a que cidade pertence(cod): "+maiCodigo);
		System.out.println("menor índice de acidentes de transito: "+meiAcidente+", a que cidade pertence(cod): "+meiCodigo);
		
		System.out.println("média de veículos nas cinco cidades juntas: "+mediaCar);
		System.out.println("média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: "+mediaCar2);
		
		entrada.close();
	}

}
