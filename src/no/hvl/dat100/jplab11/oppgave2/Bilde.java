package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	
	private String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.tekst = tekst;
		this.url = url;
		
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		this.tekst = tekst;
		this.url = url;
		
	}
	
	public String getUrl() {
		return this.url;

	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		String strBilde = "BILDE" + "\n" + this.id + "\n" + this.bruker + "\n" + this.dato + "\n" + this.likes + "\n" + this.tekst + "\n" + 
                this.url + "\n";
        return strBilde;

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
