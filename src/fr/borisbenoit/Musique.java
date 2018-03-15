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
