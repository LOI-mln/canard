package canard.model;

import canard.model.vol.PropulsionAReaction;

public class PrototypeCanard extends Canard{
	public String afficher() {
		return super.afficher() + " Je suis un vrai mandarin";
	}
	public PrototypeCanard(String nom) {
		super(nom,new PropulsionAReaction(),null);
	}
}
