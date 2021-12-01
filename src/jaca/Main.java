package jaca;

import java.io.FileReader;
import java.io.PushbackReader;

import jaca.ASTDisplay;
import jaca.node.Start;
import jaca.parser.Parser;
import jaca.lexer.Lexer;
import jaca.node.Token;
import jaca.node.EOF;

public class Main {

	public static void main(String[] args) {
		try {
			String arquivo = "codigo/exemplo.jaca";
			
			Lexer lex = new Lexer(new PushbackReader(new FileReader(arquivo), 1024));
			
			/*Token token;
			while(!((token = lex.next()) instanceof EOF)) {
				System.out.println(token.getClass());
				System.out.println("(" + token.toString() + ")");
			}*/
			
			Parser p = new Parser(lex); 
			   
			   Start tree = p.parse();
			   //Imprime árvore na saída padrão
			   //tree.apply(new ASTPrinter());
			   //Imprime árvore em interface gráfica
			   tree.apply(new ASTDisplay());
			   tree.apply(new Semantico());
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
