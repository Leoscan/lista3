import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		boolean continua = true;
		
		int cont = 0;
		
		int sNotas = 0;
		float mNotas = 0;
		
		int almaNota = 0;
		int almeNota = 0;
		
		int nomaNota = 0;
		int nomeNota = 0;
		
		String r1 = null;
		System.out.print("Informe Gabarito da primeira questão: ");
		r1 = entrada.nextLine();
		
		String r2 = null;
		System.out.print("Informe Gabarito da segunda questão: ");
		r2 = entrada.nextLine();
		
		String r3 = null;
		System.out.print("Informe Gabarito da terceira questão: ");
		r3 = entrada.nextLine();
		
		String r4 = null;
		System.out.print("Informe Gabarito da quarta questão: ");
		r4 = entrada.nextLine();
		
		String r5 = null;
		System.out.print("Informe Gabarito da quinta questão: ");
		r5 = entrada.nextLine();
		
		String r6 = null;
		System.out.print("Informe Gabarito da sexta questão: ");
		r6 = entrada.nextLine();
		
		String r7 = null;
		System.out.print("Informe Gabarito da setima questão: ");
		r7 = entrada.nextLine();
		
		String r8 = null;
		System.out.print("Informe Gabarito da oitava questão: ");
		r8 = entrada.nextLine();
		
		String r9 = null;
		System.out.print("Informe Gabarito da nona questão: ");
		r9 = entrada.nextLine();
		
		String r10 = null;
		System.out.print("Informe Gabarito da decima questão: ");
		r10 = entrada.nextLine();

		for (int i = 0; i < 1000; ++i)  
		       System.out.println(); 
		
		while (continua == true) {						
			String q1 = null;
			System.out.print("Informe Resultado da primeira questão: ");
			q1 = entrada.nextLine();
			
			String q2 = null;
			System.out.print("Informe Resultado da segunda questão: ");
			q2 = entrada.nextLine();
			
			String q3 = null;
			System.out.print("Informe Resultado da terceira questão: ");
			q3 = entrada.nextLine();
			
			String q4 = null;
			System.out.print("Informe Resultado da quarta questão: ");
			q4 = entrada.nextLine();
			
			String q5 = null;
			System.out.print("Informe Resultado da quinta questão: ");
			q5 = entrada.nextLine();
			
			String q6 = null;
			System.out.print("Informe Resultado da sexta questão: ");
			q6 = entrada.nextLine();
			
			String q7 = null;
			System.out.print("Informe Resultado da setima questão: ");
			q7 = entrada.nextLine();
			
			String q8 = null;
			System.out.print("Informe Resultado da oitava questão: ");
			q8 = entrada.nextLine();
			
			String q9 = null;
			System.out.print("Informe Resultado da nona questão: ");
			q9 = entrada.nextLine();
			
			String q10 = null;
			System.out.print("Informe Resultado da decima questão: ");
			q10 = entrada.nextLine();
			
			int resultado = 0;
			
			if (q1.equals(r1)) resultado = resultado + 1;
			if (q2.equals(r2)) resultado = resultado + 1;
			if (q3.equals(r3)) resultado = resultado + 1;
			if (q4.equals(r4)) resultado = resultado + 1;
			if (q5.equals(r5)) resultado = resultado + 1;
			if (q6.equals(r6)) resultado = resultado + 1;
			if (q7.equals(r7)) resultado = resultado + 1;
			if (q8.equals(r8)) resultado = resultado + 1;
			if (q9.equals(r9)) resultado = resultado + 1;
			if (q10.equals(r10)) resultado = resultado + 1;
			
			System.out.println("Pontuação Final: "+resultado);
			sNotas = sNotas + resultado;
			
			if (cont == 0) {
				nomaNota = resultado;
				nomeNota = resultado;
				
				almaNota = cont;
				almeNota = cont;
			} else {
				if (resultado > nomaNota) {
					nomaNota = resultado;
					almaNota = cont;
				} if (resultado < nomeNota) {
					nomeNota = resultado;
					almeNota = cont;
				}
			}
			
			cont++;
			System.out.print("Outro Aluno ira Utilizar (True/False): "); 
			continua = entrada.nextBoolean();
			entrada.nextLine();
		}
		
		mNotas = sNotas / cont;
		
		System.out.println("Maior Acerto: "+almaNota+", nota: "+nomaNota);
		System.out.println("Menor Acerto: "+almeNota+", nota: "+nomeNota);
		System.out.println("Total de Alunos que utilizaram o sistema: "+cont);
		System.out.println("A Média das Notas da Turma: "+mNotas);
		entrada.close();
	}

}
