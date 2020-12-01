package main;

import java.util.Scanner;

import database.Database;
import lombok.Getter;
import lombok.Setter;
import screen.TelaInicial;
import services.MonitoraLeiloes;

@Getter
@Setter
public class Main {
	
	private Scanner input = new Scanner(System.in);
	private Database database = new Database();
	
	public static void main(String[] args) {
		
		MonitoraLeiloes.AtualizaLeiloes();
		
		System.out.println("( Í¡Â° ÍœÊ– Í¡Â°) BEM VINDO AO SISTEMA DE LEILÃƒO\n");
		
		TelaInicial telaInicial = new TelaInicial();
		
		telaInicial.opcoesTelaInicial();
		
		
	}
	
}
