package info.grundt.ex2;

public class Secretaire {
	private String statut = "en-cours";
	
	public Dossier verifier(Dossier d) {
		System.out.println("Sercr�taire passe le dossier de " + d.getState() + " � " + statut + ".");
		d.setState(statut);
		return d;
	}
}
