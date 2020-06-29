package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Cliente cliente = new Cliente();
//		cliente.setNome("Keillani");
//		cliente.setProfissao("dev");
//		cliente.setCpf("321654987");
		
//		ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oss.writeObject(cliente);
//		oss.close();
	
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cliente.getCpf());
	}
}
