import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int codigo = 1;
		int cmAlto = 0;
		int cmBaixo = 0;
		int cmMagro = 0;
		int cmGordo = 0;
		
		float altura = 0;
		float amAlto = 0;
		float amBaixo = 0;
		float amMagro = 0;
		float amGordo = 0;
		
		float peso = 0;
		float pmAlto = 0;
		float pmBaixo = 0;
		float pmMagro = 0;
		float pmGordo = 0;
		
		float sPeso = 0;
		float sAltura = 0;
		int cont = 1;
		
		System.out.print("Código: ");
		codigo = entrada.nextInt();
		while (codigo != 0) {
			System.out.print("Altura: ");
			altura = entrada.nextFloat();
			
			System.out.print("Peso: ");
			peso = entrada.nextFloat();
			
			if (cont == 1) {
				cmAlto = codigo;
				cmBaixo = codigo;
				cmMagro = codigo;
				cmGordo = codigo;
				
				amAlto = altura;
				amBaixo = altura;
				amMagro = altura;
				amGordo = altura;
				
				pmAlto = peso;
				pmBaixo = peso;
				pmMagro = peso;
				pmGordo = peso;
				
			} else {
				if (altura > amAlto) {
					cmAlto = codigo;
					amAlto = altura;
					pmAlto = peso;
				} else if (altura < amBaixo) {
					cmBaixo = codigo;
					amBaixo = altura;
					pmBaixo = peso;
				} else if (peso > pmGordo) {
					cmGordo = codigo;
					amGordo = altura;
					pmGordo = peso;
				} else if (peso < pmMagro) {
					cmMagro = codigo;
					amMagro = altura;
					pmMagro = peso;
				} 
			}
			
			sPeso = sPeso + peso;
			sAltura = sAltura + altura;
			cont++;
			
			System.out.print("Código: ");
			codigo = entrada.nextInt();
						
		}
		float mAlt = sAltura/cont;
		float mPeso = sPeso/cont;
		System.out.println("Mais Gordo: "+cmGordo+", altura: "+amGordo+", peso: "+pmGordo);
		System.out.println("Mais Magro: "+cmMagro+", altura: "+amMagro+", peso: "+pmMagro);
		System.out.println("Mais Alto: "+cmAlto+", altura: "+amAlto+", peso: "+pmAlto);
		System.out.println("Mais Baixo: "+cmBaixo+", altura: "+amBaixo+", peso: "+pmBaixo);
		System.out.println("Média altura: "+mAlt);
		System.out.println("Média peso: "+mPeso);
		
		entrada.close();
		
	}

}
