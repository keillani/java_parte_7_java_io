package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintStremWriter {

	public static void main(String[] args) throws IOException {

//		OutputStream fos = new FileOutputStream("lorem2.txt"); // criando fluxo concreto com arquivo
//		Writer osr = new OutputStreamWriter(fos); //melhorando dados binarios para caracteres
//		BufferedWriter bw = new BufferedWriter(osr); //leitura de linha
		
//		FileWriter fw = new FileWriter("lorem2.txt");
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
//		PrintStream ps = new PrintStream(new File("lorem2.txt"));
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		ps.println("teste");
//		fw.write(System.lineSeparator());
		ps.println();
		ps.println();
		ps.println("teste 2");
		
		ps.close();
	}

}
