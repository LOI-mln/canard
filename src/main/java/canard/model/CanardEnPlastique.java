package canard.model;


import canard.model.cancan.Coincoin;
import canard.model.vol.NePasVoler;

public class CanardEnPlastique extends Canard{
	public String afficher() {
		return super.afficher() + "Je suis un canard en plastique";
	}
	public CanardEnPlastique(String nom) {
		super(nom, new NePasVoler(), new Coincoin());
	}
}
