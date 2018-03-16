package fr.borisbenoit;

import java.util.ArrayList;
import java.util.List;

public class Album {

	private String nom;
	private List<Musique> musique = new ArrayList<>();
	public static ListAlbums listAlbums;

	public Album(String nom) {
		this.nom = nom;
		if (listAlbums == null) {
			listAlbums = new ListAlbums();
		}
		listAlbums.addAlbum(this);
	}

	public void addMusique(Musique mus) {
		if (!this.musique.contains(mus)) {
			this.musique.add(mus);
		} else {
			System.err.println("Cette musique "+ mus +" appartient déjà à cet album");
		}
	}

	@Override
	public String toString() {
		String str = "Album : "+ this.nom +"\n";
		for(Musique mus : this.musique) {
			str += mus;
		}
		return str;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Album other = (Album) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Musique> getMusique() {
		return musique;
	}

	public void setMusique(List<Musique> musique) {
		this.musique = musique;
	}

}
