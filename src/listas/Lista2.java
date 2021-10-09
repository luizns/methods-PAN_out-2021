package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("João da Silva");
		lista.add("Antonio Sousa");
		lista.add("Lúcia Ferreira");
		lista.add("Marcelo");
		lista.remove("Lúcia Ferreira");
		
		System.out.println(lista.size());
		lista.forEach(System.out::println);

		System.out.println("------------------------------");
		List<Integer> itens = Arrays.asList(11, 10, 16, 5, 85);
		itens.stream().filter(i -> i > 16).forEach(System.out::println);
	}

}
