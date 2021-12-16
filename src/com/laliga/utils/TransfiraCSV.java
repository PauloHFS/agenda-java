package com.laliga.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TransfiraCSV {
	
	public static ArrayList<String[]> leia(String arquivoCSV) {
		BufferedReader input = null;
		
		ArrayList<String[]> csv = new ArrayList<>();
		
		try {
			input = new BufferedReader(new FileReader(arquivoCSV));

			String linha = null;
			
			while ((linha = input.readLine()) != null) {
				
				csv.add(linha.split(","));
				
				
			}
			
			input.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return csv;
	}
	
}
