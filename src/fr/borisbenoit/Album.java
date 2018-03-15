package fr.borisbenoit;

import java.util.List;

public class Album {

	private String nom;
	private List<Musique> musique;

	public void addMusique(Musique mus) {
		
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
