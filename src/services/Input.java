package services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Input {
	
	private static Scanner input = new Scanner(System.in);

	public static String inputString() {
		return input.nextLine();
	}
	
	public static int inputInt() {
		return input.nextInt();
	}
	
	public static LocalDateTime inputDataHora() {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		System.out.println("Digite uma data e hora (exemplo: 01/01/2001 18:00): ");
		String inputDate = input.nextLine();
		
		LocalDateTime dateTime = LocalDateTime.parse(inputDate, dateFormat);
		
		return dateTime;
	}
	
}
