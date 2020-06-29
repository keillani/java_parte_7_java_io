package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//Serializacao - objeto em fluxo binario
//		String nome = "Keillani Kida";
//		
//		ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oss.writeObject(nome);
//		oss.close();
	
		
//Desserializacao - transformacao de um fluxo binario em um objeto	
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nome = (String)ois.readObject();
		ois.close();
		System.out.println(nome);
	}
}
