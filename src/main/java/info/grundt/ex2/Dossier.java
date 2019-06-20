package info.grundt.ex2;

public class Dossier {
	private int id = 0;
	private String name = "test";
	private int heure = 1;
	private String statut = "init";
	
	public Dossier() {
		
	}
	
	public Dossier(int id, String name, int heure, String statut) {
		this.id = id;
		this.name = name;
		this.heure = heure;
		this.statut = statut;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHeure() {
		return heure;
	}
	
	public void setHeure(int heure) {
		this.heure = heure;
	}
	
	public String getState() {
		return statut;
	}
	
	public void setState(String statut) {
		this.statut = statut;
	}
	
}
