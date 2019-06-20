package info.grundt.ex2;

public class Orchestrator {
	
	public static void main(String[] args) {
		Dossier dossier = new Dossier(1, "Hugo", 45, "Init");
		System.out.println(dossier);
		Secretaire Secretaire = new Secretaire();
		Secretaire.verifier(dossier);
	}
	
}
