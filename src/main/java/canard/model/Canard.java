package canard.model;

public class Canard {
	private String nom;
	
	public String nager() {
		return "Tous les canards flottent, meme les leurres !";
	}
	
	public String afficher() {
		return "";
	}
	
	public Canard(String nom) {
		this.nom=nom;
	}

	public String getNom() {
		return this.nom;
	}
	
}
