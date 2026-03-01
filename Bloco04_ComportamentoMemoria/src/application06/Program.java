package application06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Listas

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Mario");
		list.add("Bob");
		list.add("Luani");
		list.add("Alex");
		list.add(2, "Carla"); // add elemento na lista
		
		System.out.println(list.size()); // ver o tamanho da lista
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------");
		list.remove("Bob"); // remover esse elemento
		list.removeIf(x -> x.charAt(0) == 'M'); // remove todos que começam com M
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------");
		System.out.println("Index of Alex: " + list.indexOf("Alex")); // posição que o alex está
		System.out.println("Index of Aline: " + list.indexOf("Aline")); // não encontrou esse elemento
		System.out.println("-----------------");
		List<String> result= list.stream().filter(x-> x.charAt(0) == 'L').collect(Collectors.toList()); // imprime apenas nomes com L
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("-----------------");
		String name= list.stream().filter(x-> x.charAt(0) == 'J').findFirst().orElse(null); // não encontrou esse elemento
		System.out.println(name);
	}

}
