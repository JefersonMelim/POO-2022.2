package demonstracao;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<>();
		lista.add("Jeferson");
		lista.add("Ellen");
		
		System.out.println("Tamanho = " + lista.size());
		System.out.println("Eh vazia? = " + lista.isEmpty());
		System.out.println("Conteudo de uma soh vez = " + lista.toString());
		
		System.out.println("-----------------");
		
		System.out.println("Exibindo os dados da lista distribuidamente, FORMA 01 [FOR]");
		for (String lst : lista) {
			System.out.println(lst);
		}
		
		System.out.println("-----------------");
		
		System.out.println("Exibindo os dados da lista distribuidamente, FORMA 02 [FOR]"); 
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("-----------------");
		
		System.out.println("Exibindo os dados da lista distribuidamente, FORMA 03 [WHILE]");
		int cont = 0;
		while (cont < lista.size()) {
			System.out.println(lista.get(cont));
			cont++;
		}
	}

}
