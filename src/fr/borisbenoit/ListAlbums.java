package fr.borisbenoit;

import java.util.ArrayList;
import java.util.List;

public class ListAlbums {

	private List<Album> lesAlbums = new ArrayList<>();

	public ListAlbums() {
		super();
	}

	public void addAlbum(Album alb) {
		if (!this.lesAlbums.contains(alb)) {
			this.lesAlbums.add(alb);
		} else {
			System.err.println("Cet album "+ alb +" appartient déjà à la liste d'albums");
		}
	}

	@Override
	public String toString() {
		String str ="Liste des albums =\n";
		for(Album name : this.lesAlbums) {
			str += name.getNom() + "\n";
		}
		return str;
	}

	public List<Album> getLesAlbums() {
		return lesAlbums;
	}

	public void setLesAlbums(List<Album> lesAlbums) {
		this.lesAlbums = lesAlbums;
	}

}
