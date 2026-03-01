package formatacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2026-02-17");
		LocalDateTime d02 = LocalDateTime.parse("2026-02-17T16:01:26");
		Instant d03 = Instant.parse("2026-02-17T16:01:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formatando para 00/00/0000
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Formatando para 00/00/0000 00:00
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // Formatando data-hora de GMT para data-hora de onde estou
		
		System.out.println(d01.format(fmt1)); // forma 01
		System.out.println(fmt1.format(d01)); // forma 02
		System.out.println(d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // forma 03
		
		System.out.println(d02.format(fmt2));
		System.out.println(fmt3.format(d03));
	}

}
