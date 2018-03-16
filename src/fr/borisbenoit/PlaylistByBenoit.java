package fr.borisbenoit;

public class PlaylistByBenoit extends Playlist {

	public PlaylistByBenoit(String nom) {
		super(nom);
		Menu.addPlaylist(this);
	}

	private int rechercheIndexMusique(String musique) {
		int index = -1;
		for(Musique val : this.listMusique) {
			if (val.getNom().equals(musique)) {
				index = this.listMusique.indexOf(val);
			}
		}
		return index;
	}

	public void nextMusique() {
		if (musiquePlaying == null)
			initMusique();

		if (rechercheIndexMusique(musiquePlaying.getNom()) <= this.listMusique.size() ) {
// @todo
//			this.musiquePlaying = musiquePlaying.getNom();
		} else {
// @todo
//			this.musiquePlaying = listMusique.getFirst();
		}

	}

// @todo previousMusique()

}
