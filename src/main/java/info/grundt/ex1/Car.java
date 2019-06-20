package info.grundt.ex1;

public class Car {
	
	public String couleur = "Rouge";
	String marque = "BMW";
	private float prix = 80000.05f;
	
	public Car() {
		couleur = "Rouge";
		marque = "BMW";
		prix = 80000.05f;
	}
	
	public Car(String couleur, String marque, float prix) {
		this.couleur = couleur;
		this.marque = marque;
		this.prix = prix;
	}
	
	public float GetPrix() {
		return prix;
	}

}
