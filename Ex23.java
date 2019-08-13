import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = 0;
			System.out.print("Informe a quantidade de turmas: ");
		n = entrada.nextInt();
		
		int alunos = 0;
		int soma = 0;
	for (int x = 1; x <= n; x++) {
		do {
			System.out.print("Informe a quantidade de alunos da turma "+x+": ");
			alunos = entrada.nextInt();
		} while (alunos < 1 && alunos > 40);
		soma = soma + alunos;
	}
	System.out.println("A média de alunos por turma é de: "+soma/n+" Alunos.");
	entrada.close();

	}

}
