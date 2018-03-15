package fr.borisbenoit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

	List<Playlist> listPlaylist = new ArrayList<>();
	private String menu = new String();
	private Scanner scan = new Scanner(System.in);
	private int choix = 0;

	public Menu() {
		menu = String.format(
				"Vous ecoutez %s \n1-Quitter\n2-Chanson suivante\n3-Chanson Précédente\n4-Rejouer chason\n5-Afficher les musiques de la playlist ",
				"listPlaylist.get(0).getMusiquePlaying()");
		affichageMenu();

	}

	public void affichageMenu() {
		System.out.println(menu);
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
			afficherListPlaylist();
			break;
		}
	}

	public void afficherListPlaylist() {
		for (Playlist playlist : listPlaylist) {
			System.out.println(playlist);
		}
		affichageMenu();
		
	}
	private void afficherMusiques() {

		listPlaylist.get(0).getMusiquePlaying();
		
		 affichageMenu(); 
		
	}

	private void rejouerChanson() {
		listPlaylist.get(0).rejouerMusique();

		 affichageMenu(); 
		
	}

	private void chansonPrecedente() {

		listPlaylist.get(0).previousMusique();
		 affichageMenu(); 
		
	}

	private void chansonSuivante() {
		listPlaylist.get(0).nextMusique();
		 affichageMenu(); 
		
	}

	private void quitter() {
		System.exit(0);
		
	}
}
