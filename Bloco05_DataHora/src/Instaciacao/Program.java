package Instaciacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDate d01 = LocalDate.now(); // Data de hoje
		LocalDateTime d02 = LocalDateTime.now(); // Data e hora de hoje
		Instant d03 = Instant.now(); // Data e hora GMT - londres

		LocalDate d04 = LocalDate.parse("2026-02-17"); // Texto ISO 8601 local
		LocalDateTime d05 = LocalDateTime.parse("2026-02-17T15:35:59");
		Instant d06 = Instant.parse("2026-02-17T15:35:59Z"); // Texto ISO 8601 global
		Instant d07 = Instant.parse("2026-02-17T15:35:59-03:00"); 

		LocalDate d08 = LocalDate.parse("17/02/2026", fmt1); // Texto formato customizado para ISO 8601
		LocalDateTime d09 = LocalDateTime.parse("17/02/2026 15:45", fmt2); 

		LocalDate d10 = LocalDate.of(2026, 02, 17); // dia, mes e ano
		LocalDateTime d11 = LocalDateTime.of(2026, 02, 17, 15, 54); // dia, mes, ano e hora
		
		
		System.out.println(d01.toString());
		System.out.println(d02.toString());
		System.out.println(d03.toString());
		System.out.println(d04.toString());
		System.out.println(d05.toString());
		System.out.println(d06.toString());
		System.out.println(d07.toString());
		System.out.println(d08.toString());
		System.out.println(d09.toString());
		System.out.println(d10.toString());
		System.out.println(d11.toString());
	}

}
