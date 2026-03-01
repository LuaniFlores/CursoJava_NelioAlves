package conversao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2026-02-17");
		LocalDateTime d02 = LocalDateTime.parse("2026-02-17T16:01:26");
		Instant d03 = Instant.parse("2026-02-17T01:30:26Z"); // fuso de los angeles
		
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault()); // fuso local
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal")); // fuso portugal
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());// fuso local
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal")); // fuso portugal
		
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		System.out.println("dia = " + d01.getDayOfMonth());// imprimir somente o dia
		System.out.println("mês = " + d01.getMonthValue());// imprimir somente o mês
		System.out.println("ano = " + d01.getYear());// imprimir somente o ano
		
		System.out.println("hora = " + d02.getHour());// imprimir somente o hora
		System.out.println("minuto = " + d02.getMinute());// imprimir somente o minuto
		
	}

}
