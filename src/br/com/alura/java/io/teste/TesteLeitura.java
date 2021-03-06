package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		//stream input stream of bytes
		//reader reading character streams

		//fluxo de entrada com arquivo
		InputStream fis = new FileInputStream("lorem.txt"); // criando fluxo concreto com arquivo
		Reader isr = new InputStreamReader(fis); //melhorando dados binarios para caracteres
//		Reader isr = new InputStreamReader(fis, "UTF-8"); //charset

		BufferedReader br = new BufferedReader(isr); //leitura de linha
		
		String linha = br.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		
		br.close();
	}

}
