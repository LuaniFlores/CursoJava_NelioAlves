package calculo;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2026-02-17");
		LocalDateTime d02 = LocalDateTime.parse("2026-02-17T16:01:26");
		Instant d03 = Instant.parse("2026-02-17T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d01.minusDays(7); // 7 dias antes
		LocalDate nextWeekLocalDate = d01.plusDays(7); // 7 dias depois
		
		System.out.println(pastWeekLocalDate);
		System.out.println(nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7); // 7 dias antes
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7); // 7 dias depois
	
		System.out.println(pastWeekLocalDateTime);
		System.out.println(nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS); // 7 dias antes
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS); // 7 dias depois
	
		System.out.println(pastWeekInstant);
		System.out.println(nextWeekInstant);
		
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay()); // quantidade de dias de uma data e outra 
		Duration t2 = Duration.between(pastWeekLocalDateTime, d02); // quantidade de dias de uma data e outra
		Duration t3 = Duration.between(pastWeekInstant, d03); // quantidade de dias de uma data e outra
		Duration t4 = Duration.between(d03, pastWeekInstant); // quantidade de dias de uma data e outra
		
		
		System.out.println(t1.toDays());
		System.out.println(t2.toDays());
		System.out.println(t3.toDays());
		System.out.println(t4.toDays());
	}

}
