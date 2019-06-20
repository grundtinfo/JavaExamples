package info.grundt.ex1;

public class SecondClass {
	
	public static void main(String[] args) {
		Car[] cars;
		
		cars = new Car[] {
				new Car(),
				new Car("Blair", "Renault", 11999.99f)
		};
		
		for (Car car : cars) {
			System.out.println("voiture : " + car + ".");
			System.out.println("couleur : " + car.couleur);
			System.out.println("marque : " + car.marque);
			System.out.println("prix : " + car.GetPrix());
			System.out.println();
		}
		
	}

}
