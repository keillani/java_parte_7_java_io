package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "ç";
		System.out.println(s.codePointAt(0)); //unicode
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName()); //encoding
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length+ " , windows-1252, ");
		String snovo = new String(bytes, "windows-1252");
		System.out.println(snovo);
		
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length+ " , UTF-16, ");
		snovo = new String(bytes, "UTF-16");
		System.out.println(snovo);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length+ " , US_ASCII, ");
		snovo = new String(bytes, StandardCharsets.US_ASCII);
		System.out.println(snovo);

	}

}
