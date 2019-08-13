import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int nAluno = 0;
		int altura = 0;
		
		int mnAlto = 0;
		int maAlto = 0;
		
		int mnBaixo = 0;
		int maBaixo = 0;
		
		int cont = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Escreva o código do aluno: ");
			nAluno = entrada.nextInt();
			
			System.out.print("Escreva a altura do aluno: ");
			altura = entrada.nextInt();
			
			if(cont == 0) {
				mnAlto = nAluno;
				maAlto = altura;
				mnBaixo = nAluno;
				maBaixo = altura;
			} else {
				if (altura < maBaixo) {
					maBaixo = altura;
					mnBaixo = nAluno;
				} else if (altura > maAlto) {					
					mnAlto = nAluno;
					maAlto = altura;
				}
			}
			cont++;
		}
		
		System.out.println("Código do mais baixo: "+mnBaixo+", altura:"+maBaixo);
		System.out.println("Código do mais alto: "+mnAlto+", altura:"+maAlto);
		
		entrada.close();
	}

}
