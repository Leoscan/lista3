import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int c = 0;
		String nome = null;
		
		do {
			if (c != 0) {
				System.out.print("O nome deve ser maior que 3 caracteres, ");
			} 
			System.out.print("Informe um nome: ");
			nome = entrada.nextLine();
		
			c++;
		} while ((nome.length() <= 3));
		
		
		float idade = 0;
		c = 0;
		
		do {
			if (c != 0) {
				System.out.print("Idade inválida, ");
			} 
			System.out.print("Informe uma Idade: ");
			idade = entrada.nextFloat();
			c++;
		} while (!(idade <= 150 && idade >= 0));
		
		float salario = 0;
		c = 0;
		
		do {
			if (c != 0) {
				System.out.print("Salário deve ser maior que zero, ");
			} 
			System.out.print("Informe seu Salário: ");
			salario = entrada.nextFloat();
			c++;
		} while ((salario <= 0));
		
	
		String sexo = null;
		c = 0;
		entrada.nextLine();
		do {
			if (c != 0) {
				System.out.print("Use M ou F, ");
			} 
		
			System.out.print("Informe um sexo: ");
			sexo = entrada.nextLine();
		
			c++;
		} while (!(sexo.equals("m") || sexo.equals("f") || sexo.equals("M") || sexo.equals("F")));
		
	
		String eCivil = null;
		c = 0;
		
		do {
			if (c != 0) {
				System.out.print("Use s ou c ou v ou d, ");
			} 
		
			System.out.print("Informe um estado civil (s,c,v,d): ");
			eCivil = entrada.nextLine();
		
			c++;
		} while (!(eCivil.equals("s") || eCivil.equals("c") || eCivil.equals("d") || eCivil.equals("v") || eCivil.equals("S") || eCivil.equals("C") || eCivil.equals("D") || eCivil.equals("V")));
		
		
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Salário: "+salario);
		System.out.println("Sexo: "+sexo);
		System.out.println("Estado Civil: "+eCivil);
		
		entrada.close();

	}

}
