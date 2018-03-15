package fr.borisbenoit;

import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {

	String nom;
	LinkedList<Musique> listMusique = new LinkedList<>();
	Musique musiquePlaying;

	public Playlist(String nom) {
		this.nom = nom;

		Menu.addPlaylist(this);

	}

	public void initMusique() {
		this.musiquePlaying = listMusique.getFirst();
	}

	public void addMusique(Musique musique) {
		listMusique.addLast(musique);
	}

	public void removeMusique(Musique musique) {
		if (musiquePlaying == null)
			initMusique();

		ListIterator<Musique> it = listMusique.listIterator();
		while (it.hasNext()) {
			if (it.next().equals(musique))
				it.remove();
		}
	}

	public Musique getMusiquePlaying() {
		if (musiquePlaying == null && listMusique.size() != 0) {
			return listMusique.getFirst();
		} else if (musiquePlaying != null)
			return musiquePlaying;
		return null;
	}

	public void rejouerMusique() {

	}

	public void nextMusique() {
		if (musiquePlaying == null)
			initMusique();
		
		if (rechercheMusique(musiquePlaying).hasNext()) {
			this.musiquePlaying = rechercheMusique(musiquePlaying).next();
		}
		else
			this.musiquePlaying = listMusique.getFirst();

	}

	public void previousMusique() {
		if (musiquePlaying == null)
			initMusique();

		if (rechercheMusique(musiquePlaying).hasPrevious()) {
			this.musiquePlaying = rechercheMusique(musiquePlaying).previous();
		}
		else
			this.musiquePlaying = listMusique.getLast();
	}

	public void afficherToutesMusique() {
		for (Musique musique : listMusique) {
			System.out.println(musique);
		}
	}

	public void afficherMusiquePlaying() {
		if (musiquePlaying == null)
			initMusique();

		System.out.println(musiquePlaying);
	}

	private ListIterator<Musique> rechercheMusique(Musique musique) {
		if (musiquePlaying == null)
			initMusique();

		ListIterator<Musique> it = listMusique.listIterator();
		while (it.hasNext()) {
			if (it.next().equals(musique))
				return it;
		}
		return null;

	}

	@Override
	public String toString() {
		return "Playlist :" + nom;
	}

	public LinkedList<Musique> getListMusique() {
		return listMusique;
	}

	public void setListMusique(LinkedList<Musique> listMusique) {
		this.listMusique = listMusique;
	}

}
