package jaca;

import java.util.Hashtable;

public class Teste {

	public static void main(String[] args) {
		Hashtable<String, String> h1 = new Hashtable<String, String>();
		Hashtable<String, String> h2 = new Hashtable<String, String>();
		Hashtable<String, String> h3 = new Hashtable<String, String>();
				
		h1.put("salario", "real");
		h1.put("bonus", "real");
		h1.put("calcularSalario", "real");
		
		h2.put("entregador", "_Entregador");
		h2.put("_Entregador", "class");
		h2.put("taLogado", "bool");
		
		h3.put("horas", "real");
		h3.put("tamanho", "real");
		h3.put("area", "real");

		TabelaDeSimbolos ts = new TabelaDeSimbolos();
		ts.add(h1);
		ts.add(h2);
		ts.add(h3);
		
		ts.print();
		
		String value = ts.searchType("horas");
		System.out.println(value);
		System.out.println(ts.search("horas"));
	}

}
