package canard.model;

import canard.model.cancan.Cancan;
import canard.model.vol.VolAvecDesAiles;

public class Mandarin extends Canard{
	public String afficher() {
		return super.afficher() + " Je suis un vrai mandarin";
	}
	public Mandarin(String nom) {
		super(nom,new VolAvecDesAiles(),new Cancan());
	}
}
