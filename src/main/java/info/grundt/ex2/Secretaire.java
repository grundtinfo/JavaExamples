package info.grundt.ex2;

public class Secretaire {
	private String statut = "en-cours";
	
	public Dossier verifier(Dossier d) {
		System.out.println("Sercrétaire passe le dossier de " + d.getState() + " à " + statut + ".");
		d.setState(statut);
		return d;
	}
}
