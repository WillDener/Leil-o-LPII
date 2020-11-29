package main;

import java.util.Scanner;

import collections.Clientes;
import database.Database;
import lombok.Getter;
import lombok.Setter;
import screen.TelaInicial;

@Getter
@Setter
public class Main {
	
	private Scanner input = new Scanner(System.in);
	private Database database = new Database();
	
	public static void main(String[] args) {
		
		System.out.println("( ͡° ͜ʖ ͡°) BEM VINDO AO SISTEMA DE LEILÃO\n");
		
		TelaInicial telaInicial = new TelaInicial();
		
		telaInicial.opcoesTelaInicial();
		
		
	}
	
}
