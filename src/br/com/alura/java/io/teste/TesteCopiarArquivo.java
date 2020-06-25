package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
		//rede
		//Socket s = new Socket();

		//teclado, arquivo e rede
		InputStream fis = System.in; //new FileInputStream("lorem.txt"); //s.getInputStream;
		Reader isr = new InputStreamReader(fis); 
		BufferedReader br = new BufferedReader(isr); 
		
		OutputStream fos = System.out; //new FileOutputStream("lorem2.txt"); //s.getOutputStream;
		Writer osr = new OutputStreamWriter(fos); 
		BufferedWriter bw = new BufferedWriter(osr); 
		
		String linha = br.readLine();
		
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
		
		
		br.close();
		bw.close();
	}

}
