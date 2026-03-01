package EqualsHashCode;

public class Program {

	public static void main(String[] args) {
		
		// Equals
		
		String a = "Maria";
		String b = "Alex";
		
		System.out.println("Eles são objetos iguais? " + a.equals(b));
		
		// HashCode
		String c = "Luani";
		String d = "Flores";
		
		System.out.println();
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());

		String e = "Carla";
		String f = "Carla";

		System.out.println();
		System.out.println(e.hashCode());
		System.out.println(f.hashCode());
	}
}
