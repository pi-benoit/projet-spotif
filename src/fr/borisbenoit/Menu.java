package fr.borisbenoit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

	static List<Playlist> listPlaylist = new ArrayList<>();
	private String menu = new String();
	private Scanner scan = new Scanner(System.in);
	Playlist playlist;
	private int choix = 0;

	public Menu() {
		this.playlist=listPlaylist.get(0);
		affichageMenu();
	}

	public void affichageMenu() {
		menu = String.format(
				"Le nom de la Playlist courante est %s \nVous ecoutez %s \n1-Quitter\n2-Chanson suivante\n3-Chanson Précédente\n4-Rejouer chason\n5-Afficher les differentes playlist\n6-Afficher les musiques de la playlist\n7-Playlist Suivante\n8-PlaylistPrecedente\n9-Afficher la liste des albums",
				playlist.getNom(),playlist.getMusiquePlaying());

		choix=-1;
		System.out.println(menu);
		while (choix<1||choix>9)
			choix = scan.nextInt();
		
		switch (choix) {
		case 1:
			quitter();
			break;
		case 2:
			chansonSuivante();
			break;
		case 3:
			chansonPrecedente();
			break;
		case 4:
			rejouerChanson();
			break;
		case 5:
			afficherPlaylist();
			break;
		case 6:
			afficherListMusique();
			break;
		case 7:
			playlistSuivante();
			break;
		case 8:
			playlistPrecedente();
			break;
		case 9:
			afficherListAlbum();
			break;
		}
		affichageMenu();
	}

	private void afficherListAlbum() {
		System.out.println(this.playlist.getMusiquePlaying().getAlbum().listAlbums);
		
	}

	private void playlistPrecedente() {
		if(this.playlist.getNumero()-1>=0) 
			this.playlist=listPlaylist.get(playlist.getNumero()-1);
		
	}

	private void playlistSuivante() {
		if(this.playlist.getNumero()+1<listPlaylist.size()) 
			this.playlist=listPlaylist.get(playlist.getNumero()+1);
		

		
	}

	public void afficherListMusique() {
		for (Musique musique : this.playlist.getListMusique()) {
			System.out.println(musique);
		}
	}


	private void afficherPlaylist() {

		for (Playlist playlist : listPlaylist) {
			System.out.println(playlist);
		}
	}


	private void rejouerChanson() {
		this.playlist.rejouerMusique();
	}

	private void chansonPrecedente() {
		this.playlist.previousMusique();
	}

	private void chansonSuivante() {
		this.playlist.nextMusique();
	}

	private void quitter() {
		System.exit(0);
	}

	public static void addPlaylist(Playlist pl) {
		listPlaylist.add(pl);
	}

}
