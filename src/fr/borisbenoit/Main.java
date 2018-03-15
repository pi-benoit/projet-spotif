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
		
		System.out.println(alb1);

		Playlist pl = new Playlist("Test");
		pl.addMusique(mus1);
		pl.addMusique(mus2);
		pl.addMusique(mus3);


		pl.afficherToutesMusique();
		pl.afficherMusiquePlaying();
		pl.nextMusique();
		Musique mus7 = new Musique("Eating", alb1);
		pl.addMusique(mus7);
		pl.nextMusique();
		pl.afficherToutesMusique();
		pl.afficherMusiquePlaying();

		Album alb2 = new Album("Album Number deux");
		Musique mus40 = new Musique("Summer", alb2);
		Musique mus50 = new Musique("Automn", alb2);
		Musique mus60 = new Musique("Ending", alb2);

		System.out.println(alb2);

		pl.addMusique(mus40);
		pl.addMusique(mus50);
		pl.addMusique(mus60);

		pl.afficherToutesMusique();
		pl.nextMusique();
		pl.nextMusique();
		pl.nextMusique();
		pl.afficherToutesMusique();

		new Menu();

	}

}
