package com.laliga;

import java.util.ArrayList;
import java.util.Scanner;

import com.laliga.models.Contato;
import com.laliga.utils.TransfiraCSV;

public class Main {

	private static String textoInicial = "-- Agenda --\n"
			+ "Digite (h) para obter ajuda.\n";
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<String[]> csv = TransfiraCSV.leia("C:\\Users\\paulo\\Desktop\\agenda.csv");
		ArrayList<Contato> contatos = new ArrayList<Contato>();
		
		for (int i = 1; i < csv.size(); i++) {
			contatos.add(new Contato(csv.get(i)[0], csv.get(i)[1]));
		}
		
		System.out.println(textoInicial);
		
		menu: while (true) {
			System.out.print(">");
			String comando = input.nextLine().strip();
			
			switch (comando) {
			case "contatos":
				for (Contato contato: contatos) {
					System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone());
				}
				break;
			case "sair": {
				break menu;
			}
			default:
				System.out.println("\tComando não indentificado: " + comando);
			}
		}
		
		input.close();
	}

}
