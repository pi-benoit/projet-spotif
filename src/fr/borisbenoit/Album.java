package fr.borisbenoit;

import java.util.List;

public class Album {

	private String nom;
	private List<Musique> musique;

	public void addMusique(Musique mus) {
		this.addMusique(mus);
	}

	@Override
	public String toString() {
		return "Album [nom=" + nom + ", musique=" + musique + "]";
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
