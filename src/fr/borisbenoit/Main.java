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
		System.out.println(mus1);

	}

}
