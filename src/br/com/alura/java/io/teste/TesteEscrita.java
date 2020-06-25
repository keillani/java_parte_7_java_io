package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		//fluxo de saida com arquivo
		OutputStream fos = new FileOutputStream("lorem2.txt"); // criando fluxo concreto com arquivo
		Writer osr = new OutputStreamWriter(fos); //melhorando dados binarios para caracteres
		BufferedWriter bw = new BufferedWriter(osr); //leitura de linha
		
		bw.write("teste");
		bw.newLine();
		bw.write("teste 2");
		
		bw.close();
	}

}
