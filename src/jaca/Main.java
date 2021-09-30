package jaca;

import java.io.FileReader;
import java.io.PushbackReader;

import jaca.lexer.Lexer;
import jaca.node.Token;
import jaca.node.EOF;

public class Main {

	public static void main(String[] args) {
		try {
			String arquivo = "codigo/salario.jaca";
			
			Lexer lexer = new Lexer(new PushbackReader(new FileReader(arquivo), 1024));
			
			Token token;
			while(!((token = lexer.next()) instanceof EOF)) {
				System.out.println(token.getClass());
				System.out.println("(" + token.toString() + ")");
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
