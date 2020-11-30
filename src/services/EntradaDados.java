package services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EntradaDados {
	
	private static Scanner input;
	
	private Boolean confirmacao;

	public static String inputString() {
		input = new Scanner(System.in);
		
		return input.nextLine();
	}
	
	public static int inputInt() {
		input = new Scanner(System.in);
		
		return input.nextInt();
	}
	
	public static LocalDateTime inputDataHora() {
		input = new Scanner(System.in);
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Digite uma data e hora (exemplo: 01/01/2001 18:00): ");
		String inputDate = input.nextLine();
				
		LocalDateTime dateTime = LocalDateTime.parse(inputDate, dateFormat);		
		
		return dateTime;
	}
	
}
