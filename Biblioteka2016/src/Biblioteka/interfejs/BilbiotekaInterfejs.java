package Biblioteka.interfejs;

import java.util.LinkedList;

import Biblioteka.Autor;
import Biblioteka.Knjiga;

public interface BilbiotekaInterfejs {
	 public void dodajKnjigu(Knjiga knjiga);
	 public void obrisiKnjigu(Knjiga knjiga);
	 public LinkedList<Knjiga> vratiSveKnjige();
	 public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, long ISBN, String naslov, String izdavac);
	 
}
