package fr.borisbenoit;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {

	String nom;
	LinkedList<Musique> listMusique = new LinkedList<>();
	Musique musiquePlaying;

	public Playlist(String nom) {
		this.nom = nom;
	}

	public void addMusique(Musique musique) {
		listMusique.push(musique);
	}

	public void removeMusique(Musique musique) {

		ListIterator<Musique> it = listMusique.listIterator();
		while (it.hasNext()) {
			if (it.next().equals(musique))
				it.remove();
		}
	}

	public Musique getMusiquePlaying() {
		if (musiquePlaying == null && listMusique.size() != 0)
			return listMusique.getFirst();
		return null;
	}

	public void rejouerMusique() {

	}
	public void nextMusique() {
		Iterator<Musique> it =listMusique.iterator();
		if(rechercheMusique(musiquePlaying).hasNext())
			musiquePlaying=it.next();
		else
			musiquePlaying=listMusique.getFirst();
	}

	public void previousMusique() {
		ListIterator<Musique> it =listMusique.listIterator();
		if(rechercheMusique(musiquePlaying).hasPrevious())
			musiquePlaying=it.next();
		else
			musiquePlaying=listMusique.getLast();
	}
	
	public void afficherToutesMusique() {
		for (Musique musique : listMusique) {
			System.out.println(musique);
		}
	}
	public void afficherMusiquePlaying() {
		System.out.println(musiquePlaying);
	}
	
	private ListIterator<Musique> rechercheMusique(Musique musique) {
		ListIterator<Musique> it=listMusique.listIterator();
		while (it.hasNext())
			if (it.next().equals(musique))
				return it;
		return null;
		
	}

	@Override
	public String toString() {
		return "Playlist :" + nom ;
	}

	
}
