package fr.borisbenoit;

public class Main {

	public static void main(String[] args) {

		Album alb1 = new Album("Album Number One");
		Musique mus1 = new Musique("Intro", alb1);
		Musique mus2 = new Musique("Winter", alb1);
		Musique mus3 = new Musique("Spring", alb1);
		Musique mus4 = new Musique("Summer", alb1);
		Musique mus5 = new Musique("Automn", alb1);
		Musique mus6 = new Musique("Ending", alb1);

		Album alb2 = new Album("Album Number deux");
		Musique mus7 = new Musique("Cold", alb2);
		Musique mus8 = new Musique("Hot", alb2);
		Musique mus9 = new Musique("Freeze", alb2);


		Playlist pl = new Playlist("Test");
		Playlist pl1=new Playlist("Test 2");
		pl.addMusique(mus1);
		pl.addMusique(mus2);
		pl.addMusique(mus3);

		pl1.addMusique(mus4);
		pl1.addMusique(mus5);
		pl1.addMusique(mus6);

//		pl.afficherToutesMusique();

		new Menu();

	}

}
