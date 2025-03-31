package canard.model;

import canard.model.cancan.CanardMuet;
import canard.model.vol.NePasVoler;

public class Leurre extends Canard {
	public String afficher() {
		return super.afficher() + " Je suis un leurre";
	}
	
	public Leurre(String nom) {
		super(nom, new NePasVoler(), new CanardMuet());
	}
}
