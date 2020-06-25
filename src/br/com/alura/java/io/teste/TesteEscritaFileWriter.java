package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

//		OutputStream fos = new FileOutputStream("lorem2.txt"); // criando fluxo concreto com arquivo
//		Writer osr = new OutputStreamWriter(fos); //melhorando dados binarios para caracteres
//		BufferedWriter bw = new BufferedWriter(osr); //leitura de linha
		
//		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("teste");
//		fw.write(System.lineSeparator());
		bw.newLine();
		bw.newLine();
		bw.write("teste 2");
		
		bw.close();
	}

}
