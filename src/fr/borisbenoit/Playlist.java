package fr.borisbenoit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Playlist {

	String nom;
	List<Musique> listMusique = new ArrayList<>();
	Musique musiquePlaying;

	public Playlist(String nom) {
		this.nom = nom;
	}

	public void addMusique(Musique musique) {
		listMusique.add(musique);
	}

	public void removeMusique(Musique musique) {

		Iterator<Musique> it = listMusique.iterator();
		while (it.hasNext()) {
			if (it.equals(musique))
				it.remove();
		}
	}

	public Musique getMusiquePlaying() {
		if (musiquePlaying == null && listMusique.size() != 0)
			return listMusique.get(0);
		return null;
	}

	public void nextMusique() {

		if (rechercheMusique(musiquePlaying)+1<listMusique.size())
			musiquePlaying=listMusique.get(rechercheMusique(musiquePlaying)+1);
		else
			musiquePlaying=listMusique.get(0);
	}

	public void previousMusique() {
		if (rechercheMusique(musiquePlaying)-1>0)
			musiquePlaying=listMusique.get(rechercheMusique(musiquePlaying)-1);
		else
			musiquePlaying=listMusique.get(0);
	}
	
	public void afficherMusique() {
		for (Musique musique : listMusique) {
			System.out.println(musique);
		}
	}
	private int rechercheMusique(Musique musique) {
		for (int i=0;i<listMusique.size();i++) {
			if (listMusique.get(i).equals(musique))
				return i;
		}
		return 0;
	}

}
