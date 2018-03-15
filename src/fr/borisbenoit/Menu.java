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
				"Playlist %s \nVous ecoutez %s \n1-Quitter\n2-Chanson suivante\n3-Chanson Précédente\n4-Rejouer chason\n5-Afficher les differentes playlist\n6-Afficher les musiques de la playlist\n7-Playlist Suivante\n8-PlaylistPrecedente",
				playlist.getNom(),playlist.getMusiquePlaying());

		choix=-1;
		System.out.println(menu);
		while (choix<1||choix>8)
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
			afficherMusiques();
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
		}
		affichageMenu();
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
		for (Musique musique : listPlaylist.get(0).getListMusique()) {
			System.out.println(musique);
		}
	}

	private void afficherMusiques() {
		listPlaylist.get(0).getMusiquePlaying();
	}

	private void rejouerChanson() {
		listPlaylist.get(0).rejouerMusique();
	}

	private void chansonPrecedente() {
		listPlaylist.get(0).previousMusique();
	}

	private void chansonSuivante() {
		listPlaylist.get(0).nextMusique();
	}

	private void quitter() {
		System.exit(0);
	}

	public static void addPlaylist(Playlist pl) {
		listPlaylist.add(pl);
	}

}
