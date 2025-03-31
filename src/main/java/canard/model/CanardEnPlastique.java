package canard.model;

public class CanardEnPlastique extends Canard{
	public String afficher() {
		return super.afficher() + "Je suis un canard en plastique";
	}
	public CanardEnPlastique(String nom) {
		super(nom);
	}
}
