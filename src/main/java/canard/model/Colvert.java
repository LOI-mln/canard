package canard.model;

import canard.model.cancan.Cancan;
import canard.model.vol.VolAvecDesAiles;

public class Colvert extends Canard{
	
	public String afficher() {
		return super.afficher() + " Je suis un vrai colvert";
	}
	public Colvert(String nom) {
		super(nom, new VolAvecDesAiles(), new Cancan());
	}
}
