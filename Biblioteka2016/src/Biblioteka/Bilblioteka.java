package Biblioteka;

import java.util.LinkedList;

import Biblioteka.interfejs.BilbiotekaInterfejs;

public class Bilblioteka implements BilbiotekaInterfejs {
	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();
	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		// TODO Auto-generated method stub
		if(knjiga == null || knjige.contains(knjiga)) throw new RuntimeException("Greska pri unosu knjige.");
		knjige.add(knjiga);
	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		// TODO Auto-generated method stub
		if(knjiga == null || !knjige.contains(knjiga)) throw new RuntimeException("Greska pri unosu knjige.");
		knjige.remove(knjiga);

	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		// TODO Auto-generated method stub
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, long ISBN, String naslov, String izdavac) {
		// TODO Auto-generated method stub
		if(naslov == null || naslov.isEmpty()) throw new RuntimeException("Greska pri unosu naslova.");
		LinkedList<Knjiga> rezultat = new LinkedList<Knjiga>();
		
		for (int i = 0; i < knjige.size(); i++) {
			if(knjige.get(i).getNaslov().contains(naslov)) rezultat.add(knjige.get(i));
		}
		return rezultat;
	}

}
