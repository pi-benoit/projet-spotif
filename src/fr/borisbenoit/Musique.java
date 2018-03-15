package fr.borisbenoit;

import java.util.List;

public class Musique {

	private String nom;
	private Album album;
	private List<Playlist> playlist;

	public Musique(String nom, Album album) {
		super();
		this.nom = nom;
		this.album = album;
		this.addToAlbum(album);
	}

	private void addToAlbum(Album album) {
		this.album.addMusique(this);
	}

	public void addToPlaylist(Playlist playlist) {
		playlist.addMusique(this);
	}

	@Override
	public String toString() {
		String str = "Musique : "+ this.nom +"\n";
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
		Musique other = (Musique) obj;
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

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public List<Playlist> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(List<Playlist> playlist) {
		this.playlist = playlist;
	}

}
