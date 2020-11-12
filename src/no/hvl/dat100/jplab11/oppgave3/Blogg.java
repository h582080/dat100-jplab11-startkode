package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	
	private Innlegg[] innlegtabell;	
	private int nesteledige;
	

	

	public Blogg() {
		this.nesteledige = 20;
		this.innlegtabell = new Innlegg[20];
		
	}

	public Blogg(int lengde) {
		innlegtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return this.nesteledige;
	}
	
	public Innlegg[] getSamling() {
		return this.innlegtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		boolean funnet = false;
		int pos = 0;
		while (pos<nesteledige && !funnet) {
			if (innlegtabell[pos].erLik(innlegg)){
			    funnet = true;	
			} else {
				pos++;
			}
			
		}
		if (funnet) {
			return pos;
		}
		else {		
		    return -1;	
		}
		
	}

	public boolean finnes(Innlegg innlegg) {
		boolean funnet = false;
		int pos = 0;
		while(pos<nesteledige && !funnet) {
			if (innlegtabell[pos].getId() == innlegg.getId()) {
				funnet = true;
			}
			else {
				pos++;
			}
			
		}
		
		if (funnet) {
			return true;
		} else {
			return false;
		}
	}

	public boolean ledigPlass() {
		
	   boolean funnet = false;
			
		while (nesteledige < innlegtabell.length) {
			    if (innlegtabell[nesteledige] == null) {
			    	funnet = true;
			    	
			    } else {
			        funnet = false;
			    }
		
	    } 
		
		if (funnet) {
			return true;
		}
		else {
			return false;
		}
			
    }

	
	public boolean leggTil(Innlegg innlegg) {

		boolean ledig = false;
		
		while (nesteledige < innlegtabell.length) {
			if (innlegtabell[nesteledige] == null) {
				ledig = true;
			} else {
				ledig = false;
			}
		}
		
		if (ledig) {
			innlegtabell[nesteledige] = new Innlegg(innlegg);
			return true;
		} else {
			return false;
		}
	}

		
	
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}