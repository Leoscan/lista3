import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nome = null;
		String senha = null;
		
		int c = 0;
		
		do {
			if (c != 0) {
				System.out.println("Usuário ou senha inválido ");
			} 
			
			System.out.print("Informe um Nome de Usuário: ");
			nome = entrada.nextLine();
			
			System.out.print("Informe uma Senha: ");
			senha = entrada.nextLine();
			
			c++;
		} while ((nome.equals(senha)));
		
		System.out.println("usuario: "+nome);
		System.out.println("senha: "+senha);
		
		entrada.close();

	}

}
