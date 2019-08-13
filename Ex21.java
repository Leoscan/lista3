import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = 0;
		System.out.print("Será informada a idade de quantas pessoas? ");
		n = entrada.nextInt();
		int idade = 0;
		int soma = 0;
		for (int x = 1; x <= n; x++) {
			System.out.print("Idade da "+x+" pessoa: ");
			idade = entrada.nextInt();
			soma = soma + idade;
		}
		float media = soma/n;
		
		if (media >= 0 && media < 25) {
			System.out.println("Turma jovem");
		} else if (media >= 25 && media < 60) {
			System.out.println("Turma adulta");
		} else {
			System.out.println("Turma idosa");
		}
				
		entrada.close();
	}

}
