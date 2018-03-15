package fr.borisbenoit;

import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {

	int numero=-1;
	String nom;
	LinkedList<Musique> listMusique = new LinkedList<>();
	Musique musiquePlaying;

	public Playlist(String nom) {
		this.nom = nom;
		this.numero+=1;
		Menu.addPlaylist(this);
	}

	public void initMusique() {
		this.musiquePlaying = listMusique.getFirst();
	}

	public void addMusique(Musique musique) {
		listMusique.add(musique);
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

		if (rechercheMusiqueNext(musiquePlaying).hasNext()) {
			this.musiquePlaying =rechercheMusiqueNext(musiquePlaying).next() ;
		} else {
			this.musiquePlaying = listMusique.getFirst();
		}

	}

	public void previousMusique() {
		if (musiquePlaying == null)
			initMusique();

				if (rechercheMusiquePrevious(musiquePlaying).hasPrevious()) {
					this.musiquePlaying =rechercheMusiquePrevious(musiquePlaying).previous() ;
				} else {
					this.musiquePlaying = listMusique.getLast();
				}
			
			}

	public void afficherToutesMusique() {
		for (Musique musique : listMusique) {
			System.out.println(musique);
		}
	}

	public void afficherMusiquePlaying() {
		if (musiquePlaying == null)
			initMusique();

		System.out.println("La musique entrain d'etre joué est : " + musiquePlaying);
	}

	private ListIterator<Musique> rechercheMusiqueNext(Musique musique) {
		if (musiquePlaying == null)
			initMusique();

		ListIterator<Musique> it = listMusique.listIterator();
	
		while (it.hasNext()) {
			if (it.next().equals(musique))
				return it;
		}
		return null;

	}

	private ListIterator<Musique> rechercheMusiquePrevious(Musique musique) {

		if (musiquePlaying == null)
			initMusique();

		ListIterator<Musique> it = listMusique.listIterator(listMusique.size());
		
		while (it.hasPrevious()) {
			if (it.previous().equals(musique))
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	
}
