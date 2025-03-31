package canard.model;

public class Leurre extends Canard {
	public String afficher() {
		return super.afficher() + " Je suis un leurre";
	}
	
	public Leurre(String nom) {
		super(nom);
	}
}
