package demonstracao;

import java.util.Scanner;

public class LeituraDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite algo:");
		
		Scanner entrada = new Scanner(System.in);
		String msg = entrada.nextLine();
		
		System.out.println("--------------");
		
		System.out.println("Voce escreveu '" + msg + "'");
		
		entrada.close();
	}
}