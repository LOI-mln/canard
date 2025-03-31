package canard.model;

public class Mandarin extends Canard{
	public String afficher() {
		return super.afficher() + " Je suis un vrai mandarin";
	}
	public Mandarin(String nom) {
		super(nom);
	}
}
