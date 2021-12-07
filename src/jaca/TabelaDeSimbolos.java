package jaca;

import java.util.*;

public class TabelaDeSimbolos {
	private Deque<Hashtable<String, String>> tabelaDeSimbolos;

	public TabelaDeSimbolos() {
		this.tabelaDeSimbolos = new ArrayDeque<Hashtable<String, String>>();
	}
	
	public void add(Hashtable<String, String> escopo) {
		this.tabelaDeSimbolos.addFirst(escopo);
	}
	
	public void remove(Hashtable<String, String> escopo) {
		this.tabelaDeSimbolos.removeFirst();
	}
	
	public void print() {
		for(Hashtable<String, String> hash : this.tabelaDeSimbolos) {
			System.out.println(hash);
		}
	}
	
	public boolean search(String key) {
		for(Hashtable<String, String> hash : this.tabelaDeSimbolos) {
			if(hash.containsKey(key)) {
				return true;
			}
		}
		
		return false;
	}
	
	public String searchType(String key) {
		
		for(Hashtable<String, String> hash : this.tabelaDeSimbolos) {
			if(search(key)) {
				return hash.get(key);
			}
		}
		
		return null;
	}
	
	
}
