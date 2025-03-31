package canard.model;

import canard.model.cancan.ComportementCancan;
import canard.model.vol.ComportementVol;

public class Canard {
	private String nom;
	protected ComportementVol comportementVol;
	protected ComportementCancan comportementCancan;
	
	public String nager() {
		return "Tous les canards flottent, meme les leurres !";
	}
	
	public String afficher() {
		return "";
	}
	
	public Canard(String nom, ComportementVol comportementVol,ComportementCancan comportementCancan) {
		this.nom=nom;
		this.comportementCancan = comportementCancan;
		this.comportementVol = comportementVol;
	}

	public String getNom() {
		return this.nom;
	}
	
	public String effectuerVol() {
		return comportementVol.voler();
	}
	
	public String effectuerCancan() {
		return comportementCancan.cancaner();
	}
	
}
