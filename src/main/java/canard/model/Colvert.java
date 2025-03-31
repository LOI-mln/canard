package canard.model;

public class Colvert extends Canard{
	
	public String afficher() {
		return super.afficher() + " Je suis un vrai colvert";
	}
	public Colvert(String nom) {
		super(nom);
	}
}
