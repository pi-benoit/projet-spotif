package fr.borisbenoit;

public class PlaylistByBenoit extends Playlist {

	public PlaylistByBenoit(String nom) {
		super(nom);
		Menu.addPlaylist(this);
	}

	public int rechercheIndexMusique(String musique) {
		int index = -1;
		for(Musique val : this.listMusique) {
			if (val.getNom().equals(musique)) {
				index = this.listMusique.indexOf(val);
			}
		}
		return index;
	}

}
